/**
　 * Title: A057_GetNext.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月17日下午9:15:25
*/
package nowcoder.swordOffer.com;

public class A057_GetNext {
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		//分析二叉树的下一个节点，一共有以下情况：
		//1.二叉树为空，则返回空；
    	if (pNode == null) {
			return null;
		}


   		//2.节点右孩子存在，则设置一个指针从该节点的右孩子出发
    	//，一直沿着指向左子结点的指针找到的叶子节点即为下一个节点；
    	if(pNode.right != null) {
			pNode = pNode.right;
			while (pNode.left != null) {
				pNode = pNode.left;
			}
			return pNode;
		}
 		//3.节点不是根节点。如果该节点是其父节点的左孩子，则返回父节点；
    	//否则继续向上遍历其父节点的父节点，重复之前的判断，返回结果。
    	while (pNode.next != null) {
			TreeLinkNode rootNode = pNode.next;
			if (rootNode.left == pNode) {
				return rootNode;
			}
			pNode = pNode.next;
		}
    	return null;
    }
	
}
