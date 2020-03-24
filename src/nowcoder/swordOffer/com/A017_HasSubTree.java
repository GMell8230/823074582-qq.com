/**
　 * Title: A17_HasSubTree.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月31日下午7:12:26
*/
package nowcoder.swordOffer.com;

import java.awt.geom.FlatteningPathIterator;

public class A017_HasSubTree {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.val == root2.val) {
			if(equalTree(root1, root2)) {
				return true;
			}
		}
		return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
		
	}

	private boolean equalTree(TreeNode root1, TreeNode root2) {
		if (root2 == null) {
			// root2 已经遍历完毕
			return true;
		}
		if (root1 == null) {
			// root1 遍历完毕仍未返回，故不匹配；
			return false;
		}
		if (root1.val == root2.val) {
			return equalTree(root1.left, root2.left) && equalTree(root1.right, root2.right);
		}else {
			return false;
		}
	}


}
