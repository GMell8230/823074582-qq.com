/**
　 * Title: A7_Fib.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月30日下午9:04:05
*/
package nowcoder.swordOffer.com;

public class A007_Fib {
    public int Fibonacci(int n) {
    	if (n == 0) {
			return 0;
		}else if (n == 1 || n==2) {
			return 1;
		}else {
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
    	
    }
}
