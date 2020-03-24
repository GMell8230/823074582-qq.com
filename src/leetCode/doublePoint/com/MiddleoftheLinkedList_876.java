/**
　 * Title: MiddleoftheLinkedList_876.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月23日下午10:40:03
*/
package leetCode.doublePoint.com;

import leetCode.daily.com.ListNode;

public class MiddleoftheLinkedList_876 {
	/*
	 * 数组存储,空间换时间
	 * 时间复杂度:O(n) = n;
	 * 空间复杂度:O(n) = n;
	 */
    public ListNode middleNode(ListNode head) {
    	ListNode []A = new ListNode[101];
    	int t = 0;
    	while (head.next!=null) {
			A[t++] = head;
			head = head.next;
		}
    	return A[t/2];
    }
    /*
     * 遍历;
     * 时间复杂度O(N);
     * 空间复杂度O(1);
     */
    public ListNode middleNode2(ListNode head) {
    	int t = 0;
    	ListNode temp = head;
    	while (temp!=null) {
    		t++;
    		temp = temp.next;
		}
    	int pos = 0;
    	while ( pos < t/2) {
			pos++;
			head = head.next;
		}
    	return head;
    }
    /* 快慢指针
     * 
     */
    public ListNode middleNode3(ListNode head) {
    	ListNode fast = head.next;
    	ListNode slow = head;
    	while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
    	return slow;
    }

}

