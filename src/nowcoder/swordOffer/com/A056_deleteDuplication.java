/**
　 * Title: A056_deleteDuplication.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月7日下午11:23:41
*/
package nowcoder.swordOffer.com;


public class A056_deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead)
    {
    	if (pHead == null || pHead.next == null) {
			return pHead;
		}
    	ListNode Head = new ListNode(0);
    	Head.next = pHead;
    	ListNode pre = Head;
    	ListNode last = Head.next;
    	while (last != null) {
			if (last.next != null && last.val == last.next.val) {
				while (last.next !=null && last.val == last.next.val) {
					last = last.next;
				}
				pre.next = last.next;
				last = last.next;
			}else {
				pre = pre.next;
				last = last.next;
			}
		}
    	
    	return Head.next;
    	

    }
}
