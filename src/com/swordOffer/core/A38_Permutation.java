package com.swordOffer.core;

import java.util.ArrayList;
import java.util.Arrays;


/**
* @author GMell
* @version ����ʱ�䣺2020��7��5�� ����4:53:21
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
			//��i���ǵ�һ��Ԫ�أ���i��ǰһ��Ԫ����ͬ����ǰһ��Ԫ���Ѿ����ڽ���
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
