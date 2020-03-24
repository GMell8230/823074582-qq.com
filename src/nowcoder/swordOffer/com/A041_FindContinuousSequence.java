/**
　 * Title: A041_FindContinuousSequence.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月6日下午2:54:09
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;

public class A041_FindContinuousSequence {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		int low = 1, high = 2;
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(); 
		while (low < high) {

			int curVal = (low+high)*(high+1-low)/2;
			if (curVal == sum) {
				ArrayList<Integer> sol = new ArrayList<Integer>();
				for (int i = low; i <= high; i++) {
					sol.add(i);
				}
				res.add(sol);
				low++;
			}else if (curVal < sum) {
				high++;
			}else {
				low++;
			}
		}
    	return res;
        
    }
}
