/**
　 * Title: A022_PrintFromTopToBottom.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月1日下午6:51:16
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class A022_PrintFromTopToBottom {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	//二叉树层次遍历
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	if (root == null) {
			return list;
		}
    	Queue<TreeNode> qu = new LinkedList<A022_PrintFromTopToBottom.TreeNode>();
    	qu.offer(root);
    	while (!qu.isEmpty()) {
			TreeNode node = qu.poll();
			if (node.left != null) {
				qu.offer(node.left);
			}
			if (node.right != null) {
				qu.offer(node.right);
			}
			list.add(node.val);
		}
    	return list;
    }
}
