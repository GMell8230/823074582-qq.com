package com.basic.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.swordOffer.core.TreeNode;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��3�� ����4:16:39
* @describe
*/
public class LevelTraversal {
	public List<List<Integer>> LevelTraversal(TreeNode root){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Queue<TreeNode> qu = new LinkedList<>();
		if (root == null) {
			return res;
		}
		qu.add(root);
		while (!qu.isEmpty()) {
			int levelLen = qu.size();
			List<Integer> levelVal = new ArrayList<>();
			for(int i = 0; i < levelLen; i++) {
				TreeNode cur = qu.poll();
				levelVal.add(cur.val);
				if (cur.left != null) {
					qu.add(cur.left);
				}
				if (cur.right != null) {
					qu.add(cur.right);
				}
			}
			res.add(levelVal);
		}
		return res;
	}
}
