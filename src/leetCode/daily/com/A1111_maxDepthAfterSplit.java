/**
　 * Title: A1111_maxDepthAfterSplit.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年4月1日上午10:52:00
*/
package leetCode.daily.com;

import java.util.Stack;

public class A1111_maxDepthAfterSplit {
	
	public static void main(String[] args) {
		int []res = maxDepthAfterSplit("()(())()");
		for (int i : res) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
    public static int[] maxDepthAfterSplit(String seq) {
    	int len = seq.length();
    	if(len < 2) {
    		return null;
    	}
    	int []res = new int[len];
    	int pos = 0;
    	Stack<Character> st = new Stack<Character>();
    	for (char c : seq.toCharArray()) {
			int size = st.size();
    		if (c == '(') {
				st.push(c);
				size = st.size();
			}
    		if (c == ')') {
				st.pop();
			}
    		if (size % 2 == 0) {
    			res[pos++] = 1;
			}else{
				res[pos++] = 0;
			}
    		
		}
    	return res;
    }
}
