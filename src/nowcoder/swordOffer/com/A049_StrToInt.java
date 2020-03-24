/**
　 * Title: A049_StrToInt.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月7日下午5:52:03
*/
package nowcoder.swordOffer.com;

import java.math.BigInteger;

public class A049_StrToInt {
	public static void main(String[] args) {
		System.out.println(StrToInt("-"));
	}
    public static int StrToInt(String str) {
    	if (str.length() == 0) {
			return 0;
		}
    	int pos = 0;
    	boolean symbol = false;
    	char head = str.charAt(pos);
    	
    	if (head != '-' && head != '+' ) {
    		if (head >= '0' || head <= '9') {
			}else {
				return 0;
			}
		}else {
			//若开头有正负号则从第二位开始
			if (head == '-' || head == '+' ) {
				pos++;
				symbol = true;
			}
		}
    	String res = "";
    	for (; pos < str.length(); pos++) {
			if (str.charAt(pos) <= '9' && str.charAt(pos) >= '0' ) {
				res += str.charAt(pos);
			}else {
				return 0;
			}
		}
    	if (res.isEmpty()) {
			return 0;
		}
//    	System.out.println("res:"+res);
    	BigInteger resVal = new BigInteger(res);
    	BigInteger MAX= new BigInteger(String.valueOf(Integer.MAX_VALUE));
    	BigInteger MIN= new BigInteger(String.valueOf(Integer.MIN_VALUE));
    	if (symbol) {
			if (str.charAt(0) == '-') {
				resVal = resVal.negate();
			}
		}
    	if (resVal.compareTo(MIN) >= 0 && resVal.compareTo(MAX) <= 0) {
    		return resVal.intValue();
			
		}else {
			return 0;
		}
    }
}
