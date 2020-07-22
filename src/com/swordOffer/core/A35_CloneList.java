package com.swordOffer.core;

/**
 * @author GMell
 * @version ����ʱ�䣺2020��7��4�� ����10:30:57
 * @describe
 */
public class A35_CloneList {
	public RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null) {
			return null;
		}
		// ����ڵ�
		RandomListNode cur = pHead;
		while (cur != null) {
			RandomListNode clone = new RandomListNode(cur.label);
			clone.next = cur.next;
			cur.next = clone;
			cur = clone.next;
		}
		
		// ����random����
		cur = pHead;
		while (cur != null) {
			RandomListNode clone = cur.next;
			if (cur.random != null) {
				clone.random = cur.random.next;
			}
			cur = clone.next;
		}
		
		//��
		cur = pHead;
		RandomListNode pClone = cur.next;
		while (cur.next != null) {
			RandomListNode next = cur.next;
			cur.next = next.next;
			cur = next;
		}
		return pClone;
	}
}
