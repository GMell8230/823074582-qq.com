/**
　 * Title: BubbleSort.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月31日下午11:01:42
*/
package leetCode.sort.com;

import jdk.nashorn.internal.ir.Flags;

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

	/*
	 * 冒泡排序：从左到右不断交换相邻的元素，在一轮循环后可以让未排序的最大元素上浮到右侧；
	 * 若一轮循环中，没有发生交换，那么表示序列已经有序，可以直接退出；
	 * 
	 * 特点：每轮都至少有一个元素排序正确；
	 */
	
	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		boolean isSorted = false;
		for (int i = N-1; i > 0 && !isSorted; i--) {
			isSorted = true;
			for (int j = 0; j < i; j++) {
				if (less(nums[j], nums[j+1])) {
					isSorted = false;
					swap(nums, j, j+1);
				}
			}
		}
	}
	
}
