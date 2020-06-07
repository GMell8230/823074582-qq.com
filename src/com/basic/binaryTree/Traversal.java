package com.basic.binaryTree;

import com.swordOffer.core.TreeNode;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��3�� ����10:19:35
* @describe
*/
public class Traversal {
	//1.ǰ��
	public void preTraversal(TreeNode root) {
		if (root != null) {
			int val = root.val;
			System.out.println(val);
			preTraversal(root.left);
			preTraversal(root.right);
		}
	}
	//2.����
	public void inTraversal(TreeNode root) {
		if (root != null) {
			preTraversal(root.left);
			int val = root.val;
			System.out.println(val);
			preTraversal(root.right);
		}
	}
	//3.����
	public void postTraversal(TreeNode root) {
		if (root != null) {
			preTraversal(root.left);
			preTraversal(root.right);
			int val = root.val;
			System.out.println(val);
		}
	}
}
