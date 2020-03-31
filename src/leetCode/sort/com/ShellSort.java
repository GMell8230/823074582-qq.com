/**
　 * Title: ShellSort.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月31日下午11:30:18
*/
package leetCode.sort.com;

public class ShellSort <T extends Comparable<T>> extends Sort<T>{

	/*
	 * 对于大规模的数据，插入排序很慢，因为它只能交换相邻元素，每次将逆序的数量减少1，
	 * 在待排数据基本有序时候，直接插入排序的效率可以大大提高，
	 * 
	 * 希尔排序使用插入排序对间隔h的序列排序，通过不断的减少h，最后使h=1.则可使整个
	 * 数组是有序的
	 */
	@Override
	public void sort(T[] nums) {
		int N = nums.length;
		int h = 1;
		while (h < N / 3) {
			h = h*3+1;
		}
		while (h > 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(nums[j], nums[j-h]); j-=h) {
					swap(nums, j, j-h);
				}
			}
			h = h/3;
		}
	}

}
