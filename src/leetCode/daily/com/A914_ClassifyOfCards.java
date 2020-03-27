/**
　 * Title: A914_ClassifyOfCards.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月27日下午9:56:51
*/
package leetCode.daily.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.org.apache.regexp.internal.recompile;

public class A914_ClassifyOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
    	if (deck.length < 2) {
			return false;
		}
    	HashMap<Integer, Integer> poke  = new HashMap<Integer, Integer>();
    	for (int i : deck) {
			if (poke.get(i) != null) {
				poke.put(i, poke.get(i)+1);
			}else {
				poke.put(i, 1);
			}
		}
    	int min = Integer.MAX_VALUE;
    	for (Integer val: poke.values()) {
    		min = Math.min(min, val);
			if (val < 2) {
				return false;
			}
		}
    	//寻找最小牌组大于2的公约数
    	Set<Integer> conNum = new HashSet<Integer>();
    	for (int i = 2; i <= min; i++) {
			if (min % i == 0) {
				conNum.add(i);
			}
		}
    	int eleCount = poke.size();
    	for (Integer con_i : conNum) {
    		int count = 0;
			for (Integer val: poke.values())  {
				if (val % con_i != 0) {
					break;
				}
				count++;
			}
			if (count == eleCount) {
				return true;
			}
		}
    
    	return false;
    }
    
    public boolean hasGroupsSizeX1(int[] deck) {
    	if (deck.length < 2) {
			return false;
		}
    	
    	//使用数组计数 10000，依照提示
    	int []cnt = new int [10000];
    	for (int num : deck) {
			cnt[num]++;
		}
    	
        // 先得到第 1 个数的个数，以避免在循环中赋值
    	int x = cnt[deck[0]];
    	
    	for (int i = 0; i < 10000; i++) {
			if (cnt[i] == 1) {
				return false;
			}
			if (cnt[i] > 1) {
				x = gcd(x, cnt[i]);
				// x = 1,即两个牌堆公共序列为1，即不满足x>=2
				if (x == 1) {
					return false;
				}
			}
		}
    	return true;
    }

	private int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
    
}
