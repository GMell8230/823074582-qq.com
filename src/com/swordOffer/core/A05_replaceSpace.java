package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年6月1日 下午10:32:51
* @describe
*/

import java.lang.annotation.Retention;

public class A05_replaceSpace {
    public String replaceSpace(StringBuffer str) {
    	int p1 = str.length() - 1;
    	for (int i = 0; i <= p1; i++) {
			if (str.charAt(i) == ' ') {
				str.append("  ");
			}
		}
    	int p2 = str.length() - 1;
    	while (p1 >= 0 && p2 > p1) {
    		char c = str.charAt(p1--);
    		if (c == ' ') {
				str.setCharAt(p2--, '0');
				str.setCharAt(p2--, '2');
				str.setCharAt(p2--, '%');
			}else {
				str.setCharAt(p2--, c);
			}
		}
    	return str.toString();
    }
    
}
