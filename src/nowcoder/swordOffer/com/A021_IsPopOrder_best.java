/**
　 * Title: A021_IsPopOrder_best.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月1日下午6:25:50
*/
package nowcoder.swordOffer.com;

import java.util.Stack;

public class A021_IsPopOrder_best {
	public static void main(String[] args) {
		int [] pushA = {1};
		int [] popA = {1};
		System.out.println(IsPopOrder(pushA, popA));
	}
	
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
//        辅助栈
    	if (pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
			return false;
		}
    	Stack<Integer> st = new Stack<Integer>();
    	int pos = 0;
    	int peak = popA[pos];
    	for (int i = 0; i < pushA.length; i++) {
			if (pushA[i] != peak ) {
				st.push(pushA[i]);
			}else {
				pos++;
				if (pos >= popA.length) {
					break;
				}
				peak = popA[pos]; 
			}
		}
    	while (!st.empty()) {
			if (popA[pos++] != st.pop()) {
				return false;
			}
		}
    	return true;
    }
}
