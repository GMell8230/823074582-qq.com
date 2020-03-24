/**
　 * Title: A063_median.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月18日下午9:37:22
*/
package nowcoder.swordOffer.com;

import java.util.LinkedList;
import java.util.List;

public class A063_median {
	public static void main(String[] args) {
		A063_median test = new A063_median();
		test.Insert(5);
		System.out.println("res:"+test.GetMedian());
		test.Insert(2);
		System.out.println("res:"+test.GetMedian());
		test.Insert(3);
		System.out.println("res:"+test.GetMedian());
		test.Insert(4);
		System.out.println("res:"+test.GetMedian());
		test.Insert(1);
		System.out.println("res:"+test.GetMedian());
		test.Insert(6);
		System.out.println("res:"+test.GetMedian());
		test.Insert(7);
		System.out.println("res:"+test.GetMedian());
		test.Insert(0);
		System.out.println("res:"+test.GetMedian());
		test.Insert(8);
		System.out.println("res:"+test.GetMedian());
	}
	
	
	List<Integer> arr = new LinkedList<Integer>();
	public void Insert(Integer num) {
		if (arr.isEmpty()) {
			arr.add(num);
		} else {
			//小于第一个，则插入队首
			if (num <= arr.get(0)) {
				arr.add(0, num);
				return;
			}
			//大于最后一个，插入队尾
			if (num >= arr.get(arr.size()-1)) {
				arr.add(num);
				return;
			}
			for (int i = 0; i < arr.size() - 1; i++) {
				if (num >= arr.get(i) && num <= arr.get(i + 1)) {
					arr.add(i+1, num);
					break;
				}
			}
		}
	}

	public Double GetMedian() {
		for (Integer integer : arr) {
			System.out.print(integer+" ");
		}
		System.out.println();
		if (arr.size() % 2 == 0 ) {
			int idx1 = arr.size() >> 1;
			return (double) ((arr.get(idx1) + arr.get(idx1-1)) / 2.0);
		}else {
			int idx1 = arr.size() >> 1;
			return (double) (arr.get(idx1));
		}
	}
}
