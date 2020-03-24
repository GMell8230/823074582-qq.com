/**
　 * Title: A20_Stack.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月31日下午9:47:58
*/
package nowcoder.swordOffer.com;

import java.util.Stack;

public class A020_Stack {
	
	private static Stack<Integer> stAll  = new Stack<Integer>(); 
	private static Stack<Integer> stMin  = new Stack<Integer>();
    private static Integer minEle = Integer.MIN_VALUE;
	public void push(int node) {
		stAll.add(node);
		if (stMin.empty()) {
			minEle = node;
			stMin.push(minEle);
		}else {
			if(stMin.peek() > node) {
				minEle = node;
				stMin.push(minEle);
			}else {
				stMin.push(minEle);
			}
		}
    }
    
    public void pop() {
        stAll.pop();
        stMin.pop();
    }
    
    public int top() {
		return stAll.peek();
        
    }
    
    public int min() {
		return stMin.peek();
        
    }
}
