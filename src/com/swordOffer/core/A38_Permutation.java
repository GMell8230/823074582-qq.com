package com.swordOffer.core;

import java.util.ArrayList;
import java.util.Arrays;


/**
* @author GMell
* @version 创建时间：2020年7月5日 下午4:53:21
* @describe
*/
public class A38_Permutation {
	ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
    	if (str.length() < 1) {
			return res;
		}
    	char []arr = str.toCharArray();
    	Arrays.sort(arr);
    	
		PermRecur(arr, new boolean[arr.length], new StringBuilder());
    	return res;
    }
	private void PermRecur(char[] arr, boolean[] hasUsed, StringBuilder s) {
		if (s.length() == arr.length) {
			res.add(s.toString());
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (hasUsed[i]) {
				continue;
			}
			//若i不是第一个元素，且i与前一个元素相同，且前一个元素已经用于交换
			if (i != 0 && arr[i] == arr[i-1] && !hasUsed[i-1]) {
				continue;
			}
			
			hasUsed[i] = true;
			s.append(arr[i]);
			PermRecur(arr, hasUsed, s);
			s.deleteCharAt(s.length()-1);
			hasUsed[i] = false;
		}
	}
}
