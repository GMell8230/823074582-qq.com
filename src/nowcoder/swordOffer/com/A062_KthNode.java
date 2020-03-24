/**
　 * Title: A062_KthNode.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月17日下午11:18:39
*/
package nowcoder.swordOffer.com;

import java.util.Stack;

public class A062_KthNode {
	public static Stack<TreeNode> st = new Stack<TreeNode>();
    TreeNode KthNode(TreeNode pRoot, int k)
    {
    	if (pRoot == null || k == 0) {
			return null;
		}
    	int count = 0;
    	Stack<TreeNode> st = new Stack<TreeNode>();
    	while (pRoot != null || !st.isEmpty()) {
    		while (pRoot != null) {
				st.push(pRoot);
				pRoot = pRoot.left;
			}
    		pRoot = st.pop();
    		count++;
    		if (count == k) {
				return pRoot;
			}
    		pRoot = pRoot.right;
		}
    	return null;
    }
}
