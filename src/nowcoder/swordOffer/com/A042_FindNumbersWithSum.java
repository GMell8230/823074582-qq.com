/**
　 * Title: A042_FindNumbersWithSum.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月6日下午9:22:32
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class A042_FindNumbersWithSum {
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		int low = 0, high = array.length - 1;
		ArrayList<Integer> res = new ArrayList<Integer>();
		while (low < high) {
			if (array[low] + array[high] == sum) {
				res.add(array[low]);
				res.add(array[high]);
				break;
			}
			while (low < high && array[low] + array[high] < sum) {low++;}
			while (low < high && array[low] + array[high] > sum) {high--;}
		}
		return res;
	}
}
