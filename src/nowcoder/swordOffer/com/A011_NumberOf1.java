/**
　 * Title: A11_NumberOf1.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月30日下午10:41:57
*/
package nowcoder.swordOffer.com;

public class A011_NumberOf1 {
	 public static int NumberOf1(int n) {
		 return 0;
    }
	 public static void main(String[] args) {
		 int n = 7;
		 int count = 0;
		 while (n!=0) {
			count++;
			n = n & (n-1);
		}
	}
}
