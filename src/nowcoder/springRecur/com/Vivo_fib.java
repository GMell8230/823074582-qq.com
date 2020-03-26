/**
　 * Title: Vivo_fib.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月26日下午10:45:21
*/
package nowcoder.springRecur.com;

public class Vivo_fib {
	public static void main(String[] args) {
		System.out.println(solution(11));
	}
    public static int solution (int n) {
    	int[] product = new int[10000];
    	int val = 1;
    	int cur_step = 1;
    	int step = 1;
    	int res = 0;
    	for (int i = 1; i <= n; i++) {
			if (step > 0) {
				step --;
			}else {
				step = cur_step + 1;
				cur_step = step;
				val = cur_step;
				step --;
			}
    		product[i] = val;
			res += product[i];

		}
    	return res;
    }
}
