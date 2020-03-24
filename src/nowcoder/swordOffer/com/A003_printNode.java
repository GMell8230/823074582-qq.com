/**
　 * Title: A3_printNode.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月29日下午5:56:48
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.Stack;

public class A003_printNode {

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		while(listNode != null) {
			st.add(listNode.val);
			listNode = listNode.next;
		}
		
		while (!st.empty()) {
			res.add(st.pop());
		}
		return res;
	}
}
