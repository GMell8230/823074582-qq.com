/**
　 * Title: Selection.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月31日下午10:54:35
*/
package leetCode.sort.com;

import sun.tools.jar.resources.jar;

public class SelectionSort<T extends Comparable<T>> extends Sort<T>{

	/*
	 *  选择排序：从数组中选最小的元素，将它与数组中的第一个元素交换位置，再从
	 *  数组剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置，以此类推；
	 *  
	 *  特点：选择排序需要 ～N*N/2次比较和～N次交换，他的运行时间与输入无关，也即
	 *  对一个已经排序的数组童谣需要这么多比较和交换
	 */
	@Override
	public void sort(T[] nums) {
		int n = nums.length;
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = n+1; j < n ; j++) {
				if (less(nums[j], nums[min])) {
					min = j;
				}
			}
			swap(nums, i, min);
		}
	}

}
