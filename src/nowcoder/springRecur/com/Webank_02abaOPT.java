/**
　 * Title: Webank_02abaOPT.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年4月8日下午8:08:51
*/
package nowcoder.springRecur.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Webank_02abaOPT {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- != 0) {
			String str = in.next();
//			System.out.println("input:"+str);
			int optNums = countOpt(str);
			if (optNums % 2 == 0) {
				System.out.println("Cassidy");
			}else {
				System.out.println("Eleanore");
			}
		}
	
	}

	private static int countOpt(String str) {
		// 计算奇数次字符出现的个数
		Map<Character, Integer> dict = new HashMap<Character, Integer>();
		char []arr = str.toCharArray();
		for (char c : arr) {
			dict.put(c, dict.getOrDefault(c, 0)+1);
		}
		int count = 0;
		for (char c : dict.keySet()) {
			int fre = dict.get(c);
			if (fre % 2 != 0) {
				count++;
			}
		}
		return count-1;
	}
}

