/**
　 * Title: Baidu_gcd.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月29日下午7:35:23
*/
package nowcoder.springRecur.com;

import java.util.Scanner;

public class Baidu_01gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n*(n-1)-1);
	}
}
