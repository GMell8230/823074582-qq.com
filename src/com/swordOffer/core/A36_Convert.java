package com.swordOffer.core;

import java.util.Stack;

/**
* @author GMell
* @version ����ʱ�䣺2020��7��5�� ����3:48:24
* @describe
*/
public class A36_Convert {
	private TreeNode head = null;
	private TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }

	private void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		node.left = pre;
		if (pre != null) {
			pre.right = node;
		}
		pre = node;
		if (head == null) {
			head = node;
		}
		inOrder(node.right);
	}
}
