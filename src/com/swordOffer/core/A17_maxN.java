package com.swordOffer.core;

import java.util.Arrays;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��8�� ����10:58:40
* @describe
*/
public class A17_maxN {
    public int[] printNumbers(int n) {
    	int maxNum = 9;
    	while (--n != 0) {
			maxNum = maxNum*10+9;
		}
    	int []res = new int[maxNum];
    	for(int i = 1; i < maxNum; i++) {
    		res[i] = i;
    	}
    	return Arrays.copyOfRange(res, 1, maxNum);
    }
}
