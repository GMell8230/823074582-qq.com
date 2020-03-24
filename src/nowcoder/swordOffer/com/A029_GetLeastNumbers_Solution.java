/**
　 * Title: A029_GetLeastNumbers_Solution.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月1日下午10:37:16
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.Collections;

public class A029_GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	if (input.length < k) {
			return res;
		}
    	for (int i = 0; i < input.length; i++) {
			res.add(input[i]);
		}
    	Collections.sort(res);
    	ArrayList<Integer> topK = new ArrayList<Integer>();
    	for (int i = 0; i < k; i++) {
			topK.add(res.get(i));
		}
    	return topK;
    }
}
