/**
　 * Title: A043_LeftRotateString.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月6日下午9:59:56
*/
package nowcoder.swordOffer.com;

public class A043_LeftRotateString {
	public static void main(String[] args) {
		String str = "abcdefg";
		int n = 2;
		System.out.println(LeftRotateString( str, n));
	}
    public static String LeftRotateString(String str,int n) {
    	int len = str.length();
    	if (str.length() == 0 || n % str.length() == 0) {
			return str;
		}
    	str += str;
    	return str.substring(n, n+len);
    }
}
