package com.swordOffer.core;

import java.util.Stack;


/**
* @author GMell
* @version 创建时间：2020年6月26日 下午3:48:58
* @describe
*/
public class A31_IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	int n = pushA.length;
    	Stack<Integer> st = new Stack<>();
    	for(int pushIdx = 0, popIdx = 0; pushIdx < n; pushIdx++) {
    		st.push(pushA[pushIdx]);
    		while(!st.isEmpty() && popIdx < n && st.peek() == popA[popIdx]) {
				st.pop();
				popIdx++;
			}
    	}
    	
    	if (st.isEmpty()) {
			return true;
		}else {
			return false;
		}
    }
}
