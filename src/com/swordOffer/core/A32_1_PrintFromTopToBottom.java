package com.swordOffer.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��26�� ����4:17:45
* @describe
*/
public class A32_1_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
    	if (root == null) {
			return res;
		}
    	Queue<TreeNode> qu = new LinkedList<TreeNode>();
    	qu.add(root);
    	while (!qu.isEmpty()) {
    		int curLen = qu.size();
    		for (int i = 0; i < curLen; i++) {
				TreeNode head = qu.poll();
				if (head.left != null) {
					qu.add(head.left);
				}
				if (head.right != null) {
					qu.add(head.right);
				}
				res.add(head.val);
			}
		}
    	return res;
    	
    }
}
