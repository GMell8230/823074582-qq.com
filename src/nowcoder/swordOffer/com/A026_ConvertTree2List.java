/**
　 * Title: A026.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月2日下午12:08:39
*/
package nowcoder.swordOffer.com;

import nowcoder.swordOffer.com.A022_PrintFromTopToBottom.TreeNode;

public class A026_ConvertTree2List {
	TreeNode head = null;
	TreeNode realHead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
    	CounverSub(pRootOfTree);
    	return realHead;
    }
	private void CounverSub(TreeNode pRootOfTree) {
		// TODO Auto-generated method stub
		if (pRootOfTree == null) {
			return;
		}
		CounverSub(pRootOfTree.left);
		if (head == null) {
			head = pRootOfTree;
			realHead = pRootOfTree;
		}else {
			head.right = pRootOfTree;
			pRootOfTree.left = head;
			head = pRootOfTree;
		}
		Convert(pRootOfTree.right);
	}
}
