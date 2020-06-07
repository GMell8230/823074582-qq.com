package com.swordOffer.core;

import java.util.Stack;

/**
* @author GMell
* @version 创建时间：2020年6月7日 下午5:23:05
* @describe
*/
public class A09_Stack2Queue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.add(node);
    }
    
    public int pop() throws Exception {
    	while (!stack1.empty()) {
			stack2.add(stack1.pop());
		}
    	int peek = stack2.pop();
    	while (!stack2.empty()) {
    		stack1.add(stack2.pop());
    	}
        if (stack2.isEmpty())
            throw new Exception("queue is empty");
    	return peek;
    }
    public static void main(String[] args) {
    	A09_Stack2Queue sol = new A09_Stack2Queue();
    	sol.push(1);
    	sol.push(2);
    	sol.push(3);
    	try {
			System.out.println(sol.pop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

