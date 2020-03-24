/**
　 * Title: A18_MirrorTree.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月31日下午10:36:36
*/
package nowcoder.swordOffer.com;

public class A018_MirrorTree {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	public void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = right;
		root.right = left;
		Mirror(root.left);
		Mirror(root.right);
	}
}
