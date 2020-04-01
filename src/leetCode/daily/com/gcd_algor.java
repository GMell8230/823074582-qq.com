/**
　 * Title: gcd.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月27日下午10:45:53
*/
package leetCode.daily.com;

public class gcd_algor {
	public static void main(String[] args) {
		int a = 99,b=33;
		int res = gcd(b,a);
		System.out.println(res);

	}

	private static int gcd(int a,int b) {
		// TODO Auto-generated method stub
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}	
}
