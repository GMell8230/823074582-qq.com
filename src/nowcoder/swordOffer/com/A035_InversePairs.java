/**
　 * Title: A035_InversePairs.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月2日下午9:44:56
*/
package nowcoder.swordOffer.com;

public class A035_InversePairs {
    public int InversePairs(int [] array) {
    	if (array == null || array.length == 0) {
			return 0;
		}
    	int[] copy = new int[array.length];
    	for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
    	int count = Combin(array,copy,0,array.length-1);
    	return count;
    }

	private int Combin(int[] array, int[] copy, int low, int high) {
		// TODO Auto-generated method stub
		if (low == high) {
			return 0;
		}
		int mid = (low + high) / 2;
		int leftCount = Combin(array, copy, low, mid) % 1000000007;
		int rightCount = Combin(array, copy, mid, high) % 1000000007;
		int count = 0;
		int i = mid;
		int j = high;
		int locCopy = high;
		while (i >= low && j <= high) {
			if (array[i] > array[j]) {
				count += j-mid;
			}
		}
		return 0;
	}
}
