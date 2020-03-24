/**
　 * Title: A028_MoreThanHalfNum_Solution.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月1日下午10:25:30
*/
package nowcoder.swordOffer.com;

import java.util.HashMap;

public class A028_MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
    	if (array.length == 0) {
			return 0;
		}
    	if (array.length == 1) {
			return array[0];
		}
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int len =  (int) Math.floor(array.length / 2);
    	for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				int count = 0;
				map.put(array[i], count);
			}else {
				int count = (int)map.get(array[i]);
				count++;
				if (count >= len) {
					return array[i];
				}
				map.put(array[i], count);
			}
		}
    	return 0;
    }
}
