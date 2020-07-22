package com.swordOffer.core;

/**
 * @author GMell
 * @version 创建时间：2020年7月4日 下午10:30:57
 * @describe
 */
public class A35_CloneList {
	public RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null) {
			return null;
		}
		// 插入节点
		RandomListNode cur = pHead;
		while (cur != null) {
			RandomListNode clone = new RandomListNode(cur.label);
			clone.next = cur.next;
			cur.next = clone;
			cur = clone.next;
		}
		
		// 建立random链接
		cur = pHead;
		while (cur != null) {
			RandomListNode clone = cur.next;
			if (cur.random != null) {
				clone.random = cur.random.next;
			}
			cur = clone.next;
		}
		
		//拆开
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
