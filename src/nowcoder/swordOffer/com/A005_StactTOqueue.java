package nowcoder.swordOffer.com;

import java.util.Stack;

public class A005_StactTOqueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        while(!stack2.empty()){
            stack1.add(stack2.pop());
        }
        stack1.add(node);
    }
    
    public int pop() {

        while(!stack1.empty()){
            stack2.add(stack1.pop());
        }
        return stack2.pop();
    }
}