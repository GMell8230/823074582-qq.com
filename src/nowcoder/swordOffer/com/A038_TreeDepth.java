/**
　 * Title: A038_TreeDepth.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月2日下午11:29:33
*/
package nowcoder.swordOffer.com;

import nowcoder.swordOffer.com.A022_PrintFromTopToBottom.TreeNode;

public class A038_TreeDepth {
	static int deep = 0;
    public int TreeDepth(TreeNode root) {
    	if (root == null) {
			return 0;
		}
    	if (root.left == null || root.right == null) {
			return 1;
		}
    	DFS(root, 1);
        return deep;
    }

	private void DFS(TreeNode root, int i) {
		if (root == null) {
			if (deep < i-1) {
				deep = i-1;
			}
			return ;
		}
		DFS(root.right, i+1);
		DFS(root.left, i+1);
	}
}
