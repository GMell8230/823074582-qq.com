/**
　 * Title: A036_FindFirstCommonNode.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月2日下午11:03:31
*/
package nowcoder.swordOffer.com;



public class A036_FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if (pHead1 == null || pHead2 == null) {
			return null;
		}
    	ListNode p1 = pHead1;
    	ListNode p2 = pHead2;
    	while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
			if (p1 != p2) {
				if (p1 == null) p1 = pHead2;
				if (p2 == null) p2 = pHead1;
			}
		}
    	return p1;
    }
}
