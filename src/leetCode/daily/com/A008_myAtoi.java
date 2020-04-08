/**
　 * Title: A008_myAtoi.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年4月3日下午11:41:07
*/
package leetCode.daily.com;

import com.sun.corba.se.spi.orbutil.fsm.State;

public class A008_myAtoi {
	public static void main(String[] args) {
		System.out.println( myAtoi(" -42"));
	}
    public static int myAtoi(String str) {
    	//1.处理空格
    	str = str.trim();
    	if (str.length() == 0) {
			return 0;
		}
    	if (!Character.isDigit(str.charAt(0)) && str.charAt(0)!='-' && str.charAt(0)!='+') {
			return 0;
		}
    	long ans = 0l;
    	boolean negetive = str.charAt(0) == '-';
    	int i = !Character.isDigit(str.charAt(0)) ? 1 : 0;
    	while (i < str.length() && Character.isDigit(str.charAt(i))) {
    		ans = ans*10 + (str.charAt(i++) -'0');
    		if (!negetive && ans > Integer.MAX_VALUE) {
				ans = Integer.MAX_VALUE;
				break;
			}
    		
            if (negetive && ans > 1L + Integer.MAX_VALUE) {
                ans = 1L + Integer.MAX_VALUE;
                break;
            }
		}
    	return negetive ? (int) -ans : (int) ans;  
    }
}
