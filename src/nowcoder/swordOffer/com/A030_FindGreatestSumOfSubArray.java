/**
　 * Title: A30_FindGreatestSumOfSubArray.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月1日下午10:53:47
*/
package nowcoder.swordOffer.com;

public class A030_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int res = array[0];
        int dp[] = new int[array.length];
    	for (int i = 1; i < array.length; i++) {
			max = Math.max(max+array[i], array[i]);
			res = Math.max(res, max);
		}
    	return res;
        
    }
}
