package com.swordOffer.core;

import java.util.ArrayList;

import nowcoder.springRecur.com.Sol;

/**
 * @author GMell
 * @version 创建时间：2020年7月4日 下午9:33:32
 * @describe
 */
public class A34_FindPath {
	
	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		Sol(target,root,new ArrayList<>());
		return res;
	}

	private void Sol(int target, TreeNode root, ArrayList<Integer> oneSol) {
		if (root == null) {
			return;
		}
		oneSol.add(root.val);
		target -= root.val;
		if (target == 0  && root.right == null && root.left == null) {
			res.add(new ArrayList<>(oneSol));
		}else{
			Sol(target, root.right,  oneSol);
			Sol(target, root.left,  oneSol);
		}
		oneSol.remove(oneSol.size() -1);
	}
}
