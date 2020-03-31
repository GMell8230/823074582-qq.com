/**
　 * Title: Sort.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月31日下午10:45:11
*/
package leetCode.sort.com;

public abstract class Sort<T extends Comparable<T>> {
	public abstract void sort(T[] nums);
	
	protected boolean less(T v, T w) {
		return v.compareTo(w) < 0;
	}
	
	protected void swap(T[]a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
}
