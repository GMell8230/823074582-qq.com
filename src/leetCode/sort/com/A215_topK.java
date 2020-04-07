/**
　 * Title: A215_topK.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年4月7日下午11:23:50
*/
package leetCode.sort.com;

import java.util.Arrays;
import java.util.PriorityQueue;

public class A215_topK {
	public int findKthLargest(int[] nums, int k) {
	    Arrays.sort(nums);
	    return nums[nums.length - k];
	}
	//堆排
	public int findKthLargest1(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();//小顶堆
		for (int i : nums) {
			pq.add(i);
			if (pq.size() > k) {
				pq.poll();
			}
		}
		return pq.peek();
	}
	
}
