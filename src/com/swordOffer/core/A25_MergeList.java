package com.swordOffer.core;

import java.awt.List;

/**
* @author GMell
* @version 创建时间：2020年6月24日 下午4:55:41
* @describe
*/
public class A25_MergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	ListNode head = new ListNode(0);
    	ListNode res = new ListNode(-1);
    	head.next = res;
    	while(list1 != null && list2!=null) {
    		ListNode cur1 = new ListNode(list1.val);
    		ListNode cur2 = new ListNode(list2.val);
    		if (cur1.val == cur2.val) {
				res.next = cur2;
				res = res.next;
				res.next = cur1;
				res = res.next;
				list1 = list1.next;
				list2 = list2.next;
			}else if(cur1.val < cur2.val) {
				res.next = cur1;
				res = res.next;
				list1 = list1.next;
			}else {
				res.next = cur2;
				res = res.next;
				list2 = list2.next;
			}
    	}
    	if (list1 != null) {
    		res.next = list1;
		}
    	if (list2 != null) {
			res.next = list2;
		}
    	return head.next.next;
    }
    
    
    public ListNode Merge1(ListNode list1,ListNode list2) {
        if (list1 == null) {
			return list2;
		}
        if (list2 == null) {
			return list1;
		}
        
        if (list1.val <= list2.val) {
			list1.next = Merge(list1.next, list2);
			return list1;
		}else {
			list2.next = Merge(list1, list2.next);
			return list2;
		}
    }
    
    
    public ListNode Merge2(ListNode list1,ListNode list2) {
        ListNode Head = new ListNode(-1);
        ListNode cur = Head;
        while (list1 != null && list2 != null) {
        	if (list1.val <= list2.val) {
				cur.next = list1;
				list1 = list1.next;
			}else {
				cur.next = list2;
				list2 = list2.next;
			}
        	cur = cur.next;
		}
        if (list1 != null) {
			cur.next = list1;
		}
        if (list2 != null) {
			cur.next = list2;
		}
        return Head.next;
    }
}
