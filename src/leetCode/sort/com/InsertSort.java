/**
　 * Title: InsertSort.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月31日下午11:10:56
*/
package leetCode.sort.com;

import java.util.LinkedList;
import java.util.List;

public abstract class InsertSort<T extends Comparable<T>> extends Sort<T>{
	
	/*
	 * 插入排序，每次将当前元素插入到左侧已经排序的数组中，使得插入后左侧数组仍然有序
	 * 
	 * 特点：插入排序需要交换的次数为逆序数量。插入排序的时间复杂度取决于数组的初始顺序
	 */
	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0 && less(nums[j], nums[j-1]); j--) {
				swap(nums, j, j-1);
			}
		}
	}
	
	public void sort2(T[] nums) {
		// TODO Auto-generated method stub
		List<T> arr = new LinkedList<T>();
		for (T i: nums) {
			if (arr.isEmpty()) {
				arr.add(i);
			}else {
				//若末位小于i，则将i追加末尾
				if (less(arr.get(arr.size()-1), i)) {
					arr.add(i);
					continue;
				}
				//若首位小于i，则讲i放到首位
				if (less(i ,arr.get(0))) {
					arr.add(0, i);
					continue;
				}
				for (int idx = 0; idx < arr.size()-1; idx++) {
					//若为有序表查找过程中使用折半查找，效率提升
					if (less(arr.get(idx), i)&& less(i ,arr.get(idx+1))) {
						arr.add(idx+1, i);
						break;
					}
				}
			}
		}
		int pos = 0;
		for (T t : arr) {
			nums[pos++] = t;
		}
	}
	
	
}
