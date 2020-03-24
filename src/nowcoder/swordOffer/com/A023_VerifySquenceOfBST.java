/**
　 * Title: A023_VerifySquenceOfBST.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月1日下午9:03:03
*/
package nowcoder.swordOffer.com;

public class A023_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
    	if (sequence.length == 0 || sequence == null) {
			return false;
		}
    	return isBST(sequence,0,sequence.length-1);
    }

	private boolean isBST(int[] sequence, int start, int end) {
		// TODO Auto-generated method stub
		if (start >= end) {
			return true;
		}
		int rootVal = sequence[end];
		int edge = end;
		boolean hasEdge = false;
		for (int i = start; i <= end; i++) {
			if (!hasEdge) {
				// 第一个比root大的值为左右子树的边界后，此后右子树都应比root大
				if (sequence[i] > rootVal) {
					edge = i;
					hasEdge = true;
				}
			}else {
				// 在找到左右子树的边界后，右子树出现比root小的值,false
				if (sequence[i] < rootVal) {
					return false;
				}
			}
		}
		
		return isBST(sequence, 0, edge-1) && isBST(sequence, edge, end-1);
	}
}
