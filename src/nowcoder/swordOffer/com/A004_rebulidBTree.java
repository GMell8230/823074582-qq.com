/**
　 * Title: A4_rebulidBTree.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月29日下午6:02:25
*/
package nowcoder.swordOffer.com;

import java.util.Arrays;

public class A004_rebulidBTree {
	/**
	 * Definition for binary tree
	 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre.length == 0) {
			return null;
		}
		int rootVal = pre[0];
		if (pre.length == 1) {
			return new TreeNode(rootVal);
		}
		TreeNode root = new TreeNode(rootVal);
		int rootIdx = 0;
		for (int i = 0; i < in.length; i++) {
			if (rootVal == in[i]) {
				rootIdx = i;
				break;
			}
		}
		
		root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, rootIdx+1), Arrays.copyOfRange(in, 0, rootIdx));
		root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, rootIdx+1,pre.length), Arrays.copyOfRange(in,rootIdx+1, in.length));
		return root;
	}
}
