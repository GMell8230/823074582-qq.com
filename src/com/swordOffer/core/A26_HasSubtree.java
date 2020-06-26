package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年6月24日 下午5:17:14
* @describe
*/
public class A26_HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) {
			return false;
		}
        return dfs(root1, root2)|| dfs(root1.left, root2)|| dfs(root1.right, root2);
    }

	private boolean dfs(TreeNode root1, TreeNode root2) {
		if (root2 == null) {
			return true;
		}
		if (root1 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}else {
			return dfs(root1.right, root2.right) && dfs(root1.left, root2.left);
		}
		
	}
}
