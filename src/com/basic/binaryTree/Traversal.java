package com.basic.binaryTree;

import com.swordOffer.core.TreeNode;

/**
* @author GMell
* @version 创建时间：2020年6月3日 上午10:19:35
* @describe
*/
public class Traversal {
	//1.前序
	public void preTraversal(TreeNode root) {
		if (root != null) {
			int val = root.val;
			System.out.println(val);
			preTraversal(root.left);
			preTraversal(root.right);
		}
	}
	//2.中序
	public void inTraversal(TreeNode root) {
		if (root != null) {
			preTraversal(root.left);
			int val = root.val;
			System.out.println(val);
			preTraversal(root.right);
		}
	}
	//3.后序
	public void postTraversal(TreeNode root) {
		if (root != null) {
			preTraversal(root.left);
			preTraversal(root.right);
			int val = root.val;
			System.out.println(val);
		}
	}
}
