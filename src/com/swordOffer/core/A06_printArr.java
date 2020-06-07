package com.swordOffer.core;

import java.util.ArrayList;
import java.util.Stack;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��3�� ����9:41:07
* @describe
*/
public class A06_printArr {
	//	1.��ջ�Ƚ��ȳ�
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        Stack<Integer> st = new Stack<>();
        while(listNode != null){
            st.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> res  = new ArrayList<>();
        while(!st.empty()){
            res.add(st.pop());
        }
        return res;
    }
    // 2�ݹ�ⷨ
    ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
        	printListFromTailToHead(listNode.next);
        	res.add(listNode.val);
		}
		return res;
    }
}
