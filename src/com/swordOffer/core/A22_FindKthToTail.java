package com.swordOffer.core;
/**
* @author GMell
* @version ����ʱ�䣺2020��6��24�� ����11:25:27
* @describe
*/
public class A22_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
    	ListNode fast = head;
    	ListNode res = head;
    	int count = 0;
    	while (fast != null) {
    		if (count == k) {
				break;
			}
    		fast = fast.next;
    		count++;
		}
    	if (count < k) {
			return null;
		}
    	while (fast != null) {
			fast = fast.next;
			res = res.next;
		}
    	return res;
    }
}
