/**
　 * Title: A058_isSymmetrical.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月17日下午9:36:48
*/
package nowcoder.swordOffer.com;

public class A058_isSymmetrical {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
    
	boolean isSymmetrical(TreeNode pRoot)
    {
		if (pRoot == null) {
			return true;
		}
		return search(pRoot.right, pRoot.left);
    }

	private boolean search(TreeNode right, TreeNode left) {
		// TODO Auto-generated method stub
		if (right == null && left == null) {
			return true;
		}
		if (left == null || right == null) {
			return false;			
		}
		
		if (right.val == left.val) {
			return search(right.right,left.left) && search(left.right,right.left);
		}else {
			return false;
		}
		
	}
}
