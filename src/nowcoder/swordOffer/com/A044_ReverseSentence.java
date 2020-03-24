/**
　 * Title: A044_ReverseSentence.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月6日下午10:33:22
*/
package nowcoder.swordOffer.com;

import java.util.Stack;

public class A044_ReverseSentence {
	public static void main(String[] args) {
		String str = "student. a am I";
		System.out.println(ReverseSentence(str)); 
	}
    public static String ReverseSentence(String str) {
        int strlen = str.length();
        if (strlen == 0) {
			return str;
		}
        String res = "";
        Stack<String> word = new Stack<String>();
        String temp = "";
        for (int i = 0; i < strlen; i++) {
			if (str.charAt(i) != ' ') {
				temp += str.charAt(i);
			}else {
				word.add(temp);
				temp = "";
			}
		}
		word.add(temp);
        while(!word.isEmpty()) {
        	res += word.pop()+" ";
        }
        
        int len = res.length();
    	return res.substring(0, len-1);
    }
}
