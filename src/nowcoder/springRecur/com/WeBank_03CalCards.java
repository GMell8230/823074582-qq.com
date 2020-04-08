/**
　 * Title: WeBank_03CalCards.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年4月8日下午8:28:39
*/
package nowcoder.springRecur.com;

import java.util.PriorityQueue;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.POP2;

public class WeBank_03CalCards {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int [][]arr = new int [k][2];
		for (int i = 0; i < k; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		in.close();
		System.out.println(mostMoney(arr));
	}

	private static int mostMoney(int[][] arr) {
		if (arr.length == 0) {
			return 0;
		}
		//先对步数排序，再对卡的值排序
		  PriorityQueue<Pair> heap =
		            new PriorityQueue<>((Pair p1, Pair p2) ->
		            (p1.num.equals(p2.num)) ? p2.money.compareTo(p1.money) : p2.num.compareTo(p1.num));
		for (int []raw :arr) {
			heap.add(new Pair(raw[0], raw[1]));
		}
		int count = 1, res = 0;
		while (!heap.isEmpty() && count > 0) {
			count--;
			Pair poll = heap.poll();
			res += poll.money;
			count += poll.num;
		}
		return res;
	}
}



