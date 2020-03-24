/**
　 * Title: A13_ReorderArr.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月31日下午5:28:25
*/
package nowcoder.swordOffer.com;

public class A013_ReorderArr {
	
	public static void main(String[] args) {
		int []array = {2,4,6,8,9,7,1};
		reOrderArray(array);
	}
	//case2 不开空间 冒泡
	public static void reOrderArray(int [] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
			}else {
				if (count != 0) {
					changePos(array, i-count, i);
				}
			}
			System.out.println("i:"+ i);
			for (int a: array) {
				System.out.print(a);
			}
			System.out.println();

		}
	}
	private static void changePos(int[] array, int start, int end) {
		int temp = array[end];
		for (int i = end; i > start; i--) {
			array[i] = array[i-1];
		}
		array[start] = temp;
	}
	//case1 开空间
    public void reOrderArray1(int [] array) {
        int len = array.length;
        int[] reArr = new int[len];
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				reArr[pos++] = array[i];
			}
		}
        for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				reArr[pos++] = array[i];
			}
		}
        for (int i = 0; i < array.length; i++) {
			array[i] = reArr[i];
		}
    }
}
