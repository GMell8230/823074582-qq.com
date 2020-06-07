package com.swordOffer.core;

import java.util.ArrayList;
import java.util.Stack;

/**
* @author GMell
* @version 创建时间：2020年6月3日 上午9:41:07
* @describe
*/
public class A06_printArr {
	//	1.用栈先进先出
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
    // 2递归解法
    ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
        	printListFromTailToHead(listNode.next);
        	res.add(listNode.val);
		}
		return res;
    }
}
