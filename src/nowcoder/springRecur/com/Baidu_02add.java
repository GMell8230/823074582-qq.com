/**
　 * Title: Baidu_Arr.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月29日下午8:08:48
*/
package nowcoder.springRecur.com;

import java.util.Arrays;
import java.util.Scanner;
public class Baidu_02add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long step = 0;
		while (!isVaild(arr)) {
			long max = 0;
			int idx = 0;
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
					idx = i;
				}
			}
			//核心-一次到位
			step += max/n;
			for (int i = 0; i < arr.length; i++) {
				arr[i] += max/n;
			}
			arr[idx] = (int) (max%n);
		}
		System.out.println(step);
	}

	private static boolean isVaild(int[] arr) {
		int n = arr.length;
		for (int i : arr) {
			if (i >= n){
				return false;
			}
		}
		return true;
	}

	private static int opt(int n, int[] arr, int step) {
		//用Arrays.sort不断排序会超时
		Arrays.sort(arr);
		System.out.println("step = " + step);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		if (arr[n-1] < n) {
			return step;
		}else {
			arr[n-1] -= n;
			for (int i = 0; i < n-1; i++) {
				arr[i] += 1;
			}

			return opt(n, arr, step+1) ;
		}
	}
}
