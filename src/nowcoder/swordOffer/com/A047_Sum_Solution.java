/**
　 * Title: A047_Sum_Solution.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月7日下午5:14:42
*/
package nowcoder.swordOffer.com;

public class A047_Sum_Solution {
    public int Sum_Solution(int n) {
    	int sum = n;
    	boolean flag = (sum > 0 )&&((sum += Sum_Solution(n-1))>0);
    	return sum;
    }
}
