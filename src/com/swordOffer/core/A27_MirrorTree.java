package com.swordOffer.core;

import java.util.LinkedList;
import java.util.Queue;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
* @author GMell
* @version 创建时间：2020年6月24日 下午5:24:10
* @describe
*/
public class A27_MirrorTree {
    public void Mirror(TreeNode root) {
    	if (root == null) {
			return;
		}
        Queue<TreeNode> qu= new LinkedList<TreeNode>();
        qu.add(root);
        while (!qu.isEmpty()) {
			int nodeNums = qu.size();
			for (int i = 0; i < nodeNums; i++) {
				TreeNode cur = qu.poll();
				if (cur.left != null) {
					qu.add(cur.left);
				}
				if (cur.right != null) {
					qu.add(cur.right);
				}
				TreeNode temp = cur.left;
				cur.left = cur.right;
				cur.right = temp;
			}
		}
    }
    public void Mirror1(TreeNode root) {
        if (root == null) {
			return;
		}
        TreeNode right = root.right;
        TreeNode left = root.left;
        swap(right, left);
        Mirror1(right);
        Mirror1(left);
    }
	private void swap(TreeNode right, TreeNode left) {
		// TODO Auto-generated method stub
		TreeNode temp = left;
		left = right;
		right = temp;
	}
    
}
