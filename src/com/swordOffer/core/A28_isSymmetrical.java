package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年6月26日 下午2:32:50
* @describe
*/
public class A28_isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
    	if (pRoot == null) {
			return true;
		}
    	return isSymmetrical(pRoot.right, pRoot.left);
    }

	private boolean isSymmetrical(TreeNode right, TreeNode left) {
		if (right == null && left == null) {
			return true;
		}
		if (right == null || left == null) {
			return false;
		}
		if (right.val != left.val) {
			return false;
		}
		return isSymmetrical(right.left, left.right) && isSymmetrical(right.right, left.left);
	}
}
