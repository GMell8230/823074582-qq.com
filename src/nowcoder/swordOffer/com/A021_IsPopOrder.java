/**
　 * Title: A021_IsPopOrder.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月31日下午10:43:21
*/
package nowcoder.swordOffer.com;

public class A021_IsPopOrder {
	public static void main(String[] args) {
		int [] pushA = {1};
		int [] popA = {3};
		System.out.println(IsPopOrder(pushA, popA));
	}
	
	
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
    	int []order = new int [pushA.length];
    	int i = 0;
    	for (int ele : popA) {
			int idx = findIdx(ele,pushA);
			if (idx == -1) {
				return false;
			}
			order[i++] = idx;
		}
    	//判断order每个元素是否正确
    	int max = order[0];
    	for (int j = 1; j < order.length; j++) {
			if (order[j] > max) {
				max = order[j];
			}else {
				//小于当前值，看后续的order是否递减序列；
				if (!findHasBigger(max,j,order)) {
					return false;
				}
			}
		}
    	return true;
    }

	private static boolean findHasBigger(int max, int start, int[] order) {
		// TODO Auto-generated method stub
		int end = order.length-1;
//		boolean hasBigger = false;
		for (int i = start; i < order.length; i++) {
			if (order[i] > max) {
				end = i;
//				hasBigger = true;
				break;
			}
		}
//		if (!hasBigger) {
//			return true;
//		}
		int pre = order[start];
		for (int i = start+1; i <= end; i++) {
			if (order[i] > pre) {
				return false;
			}
		}
		return true;
	}

	
	private static int findIdx(int ele, int[] pushA) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pushA.length; i++) {
			if (pushA[i] == ele) {
				return i;
			}
		}
		return -1;
	}
}
