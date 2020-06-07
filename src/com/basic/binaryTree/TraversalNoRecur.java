package com.basic.binaryTree;

import java.util.ArrayList;
import java.util.Stack;

import com.swordOffer.core.ListNode;
import com.swordOffer.core.TreeNode;

/**
* @author GMell
* @version 创建时间：2020年6月3日 上午10:29:31
* @describe
*/
public class TraversalNoRecur {
	//1.前序
		public ArrayList<Integer> preTraversal2(TreeNode root) {
			ArrayList<Integer> res = new ArrayList<>();
			if (root == null) {
				return res;
			}
			Stack<TreeNode> st = new Stack<TreeNode>();
			TreeNode cur = root;
			while (cur != null || !(st.empty())) {
				while(cur != null) {
					st.push(cur);
					res.add(cur.val);
					cur = cur.left;
				}
				//弹出节点
				cur = st.pop();
				//转向
				cur = cur.right;
			}
			return res;
		}
	//2中序
	public ArrayList<Integer> inTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Stack<TreeNode> st = new Stack<>();
		TreeNode cur = root;
		while(cur != null || !(st.empty())) {
			while(cur != null) {
				st.push(cur);
				cur = cur.left;
			}
			cur = st.pop();
			res.add(cur.val);
			cur = cur.right;
		}
		return res;
	}
	//3后序
	public ArrayList<Integer> endTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Stack<TreeNode> st = new Stack<>();
		TreeNode cur = root;
		TreeNode last = null;
		while(cur != null || !(st.empty())) {
			while(cur != null) {
				st.push(cur);
				cur = cur.left;
			}
			cur = st.peek();
			//要保证当前节点的左右子树都已经访问了才能访问当前节点
			if (cur.right == null || cur.right == last) {
				res.add(cur.val);
			    // 记录上一个访问的节点
	            // 用于判断“访问根节点之前，右子树是否已访问过”
				st.pop();
				last = cur;
				// 表示不需要转向，继续弹栈
				cur = null;
			}else {
				cur = cur.right;
			}
		}
		return res;
	}
}
