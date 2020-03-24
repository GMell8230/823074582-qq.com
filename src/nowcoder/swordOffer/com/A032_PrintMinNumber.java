/**
　 * Title: A032_PrintMinNumber.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月1日下午11:46:08
*/
package nowcoder.swordOffer.com;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class A032_PrintMinNumber {
	public static void main(String[] args) {
		int []numbers = {3334,3,3333332};
		System.out.println(PrintMinNumber(numbers));
	}
	public static String PrintMinNumber(int[] numbers) {
		String str = "";
		if (numbers.length == 0) {
			return str;
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length-1; j++) {
				int temp = numbers[j];
				String s1 = numbers[j] + "" + numbers[j+1];
				String s2 = numbers[j+1] + "" + numbers[j];
				Long val1 = Long.valueOf(s1);
				Long val2 = Long.valueOf(s2);
				if (val1 > val2) {
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			str += ""+numbers[i];
		}
		return str;
	}
	
	
	public String PrintMinNumber_Case1(int[] numbers) {
		String res = "";
		if (numbers.length == 0) {
			return res;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = numbers.length;
		for (int i = 0; i < n; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>() {

			public int compare(Integer str1, Integer str2) {
				String s1 = str1 + "" + str2;
				String s2 = str2 + "" + str1;
				return s1.compareTo(s2);
			}
		});

		for (int j : list) {
			res += j;
		}
		return res;

	}
}
