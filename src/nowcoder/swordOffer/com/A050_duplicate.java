/**
　 * Title: A050_duplicate.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月7日下午6:57:42
*/
package nowcoder.swordOffer.com;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class A050_duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length < 2) {
			return false;
		}
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < length; i++) {
        	if (set.contains(numbers[i])) {
				duplication[0] = numbers[i];
				return true;
			}else {
				set.add(numbers[i]);
			}
		}
        
        return false;
    }
}
