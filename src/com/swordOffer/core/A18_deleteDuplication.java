package com.swordOffer.core;

/**
 * @author GMell
 * @version 创建时间：2020年6月9日 下午7:16:50
 * @describe
 */
public class A18_deleteDuplication {
	public ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null || pHead.next == null) {
			return pHead;
		}
		ListNode next = pHead.next;
		if (pHead.val == next.val) {
			while (next != null && pHead.val == next.val) {
				next = next.next;
			}
			return deleteDuplication(next);
		}else {
			pHead.next = deleteDuplication(pHead.next);
			return pHead;
		}
	}
	
	public ListNode deleteDuplication1(ListNode pHead) {
		if (pHead == null || pHead.next == null) {
			return pHead;
		}
		ListNode Head = new ListNode(0);
		Head.next = pHead;
		ListNode pre = Head;
		ListNode cur = Head.next;
		while (cur !=null) {
			//若节点相同
			if (cur.next != null && cur.val == cur.next.val) {
				//找到最后一个不相同的节点
				while (cur.next != null && cur.next.val == cur.val) {
					cur = cur.next;
				}
				cur = cur.next;
				pre.next = cur;
			}else {
				pre = pre.next;
				cur = cur.next;
			}
		}
		return Head.next;
	}
}
