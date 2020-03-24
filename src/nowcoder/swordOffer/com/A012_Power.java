/**
　 * Title: A12_Power.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月31日下午5:13:07
*/
package nowcoder.swordOffer.com;

public class A012_Power {
    public double Power(double base, int exponent) {
    	if (base == 0 || base == 1 || exponent == 0) {
			return 1;
		}
    	if (exponent == 1) {
			return base;
		}
    	double res = base;
    	boolean flag = false;
    	if (exponent < 0) {
			flag = true;
			exponent = -exponent;
		}
    	int n = exponent;
    	while (n > 1) {
    		res *= base;
			n--;
		}
    	if (flag) {
			res = 1/res;
		}
		return res;
    	
  }
}
