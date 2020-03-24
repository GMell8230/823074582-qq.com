/**
　 * Title: A033_GetUglyNumber.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月2日下午5:58:45
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class A033_GetUglyNumber {
	public  void main(String[] args) {
		int index = 1500;
		GetUglyNumber_Solution(index);
	}
	public  int GetUglyNumber_Solution(int index) {
		if (index < 7) {
			return index;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		int p2 = 0, p3 = 0, p5 = 0;
		list.add(1);
		while (list.size() < index) {
			int m2 = list.get(p2) * 2;
			int m3 = list.get(p3) * 3;
			int m5 = list.get(p5) * 5;
			int min = Math.min(m2, Math.min(m3, m5));
			list.add(min);
			if (min == m2) p2++;
			if (min == m3) p3++;
			if (min == m5) p5++;
		}
		return list.get(list.size()-1);
	}

}
