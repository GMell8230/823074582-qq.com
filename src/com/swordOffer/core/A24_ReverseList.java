package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年6月24日 下午2:03:06
* @describe
*/
public class A24_ReverseList {
    public ListNode ReverseList(ListNode head) {
    	if (head == null) {
			return null;
		}
    	ListNode pre = null;
    	ListNode next = null;
    	while (head != null) {
    		next = head.next;
    		head.next = pre;
    		pre = head;
    		head = next;
		}
    	return pre;
    }
}
