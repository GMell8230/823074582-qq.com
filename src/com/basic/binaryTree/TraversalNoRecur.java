package com.basic.binaryTree;

import java.util.ArrayList;
import java.util.Stack;

import com.swordOffer.core.ListNode;
import com.swordOffer.core.TreeNode;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��3�� ����10:29:31
* @describe
*/
public class TraversalNoRecur {
	//1.ǰ��
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
				//�����ڵ�
				cur = st.pop();
				//ת��
				cur = cur.right;
			}
			return res;
		}
	//2����
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
	//3����
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
			//Ҫ��֤��ǰ�ڵ�������������Ѿ������˲��ܷ��ʵ�ǰ�ڵ�
			if (cur.right == null || cur.right == last) {
				res.add(cur.val);
			    // ��¼��һ�����ʵĽڵ�
	            // �����жϡ����ʸ��ڵ�֮ǰ���������Ƿ��ѷ��ʹ���
				st.pop();
				last = cur;
				// ��ʾ����Ҫת�򣬼�����ջ
				cur = null;
			}else {
				cur = cur.right;
			}
		}
		return res;
	}
}
