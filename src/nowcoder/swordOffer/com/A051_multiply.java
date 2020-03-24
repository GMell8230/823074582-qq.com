/**
　 * Title: A051_multiply.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月7日下午7:11:57
*/
package nowcoder.swordOffer.com;

public class A051_multiply {
    public int[] multiply(int[] A) {
    	int []B = new int[A.length];
    	int temp = 1;
    	for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (j != i) {
					temp *= A[j];
				}
			}
			B[i] = temp;
			temp = 1;
		}
    	return B;
    }
}
