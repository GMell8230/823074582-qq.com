package com.swordOffer.core;

/**
 * @author GMell
 * @version ����ʱ�䣺2020��6��9�� ����7:16:50
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
			//���ڵ���ͬ
			if (cur.next != null && cur.val == cur.next.val) {
				//�ҵ����һ������ͬ�Ľڵ�
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
