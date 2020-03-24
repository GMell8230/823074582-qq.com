/**
　 * Title: A31_NumberOf1.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月1日下午11:37:50
*/
package nowcoder.swordOffer.com;

public class A031_NumberOf1 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        for(int i = 1; i <= n;i++){
            String num = ""+i;
            int count = find(num);
            res +=  count;
        }
        return res;
    }

	private int find(String num) {
		int count = 0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '1') {
				count++;
			}
		}
		// TODO Auto-generated method stub
		return count;
	}
}
