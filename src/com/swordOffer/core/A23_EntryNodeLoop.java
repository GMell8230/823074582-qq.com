package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年6月24日 上午11:30:52
* @describe
*/
public class A23_EntryNodeLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
    	if(pHead == null || pHead.next == null) {
    		return null;
    	}
    	
        ListNode fast = pHead.next;
        ListNode slow = pHead;
        boolean hasLoop = false;
        while (fast != null ) {
        	if (slow == fast) {
        		hasLoop = true;
				break;
			}
        	fast = fast.next.next;
        	slow = slow.next;
		}
        if (!hasLoop) {
			return null;
		}
        
        fast = pHead;
        while (slow != fast) {
        	slow = slow.next;
        	fast = fast.next;
		}
        return slow;
    }
}
