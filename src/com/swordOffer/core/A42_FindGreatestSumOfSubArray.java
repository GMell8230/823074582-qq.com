package com.swordOffer.core;

import java.util.LinkedList;
import java.util.Queue;

/**
* @author GMell
* @version 创建时间：2020年7月5日 下午9:53:43
* @describe
*/
public class A42_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0 || array == null) {
        	return 0;
		}
    	int max = Integer.MIN_VALUE;
    	int sum = 0;
    	for (int val: array) {
    		if (sum <= 0) {
				sum = val; // sum已经是负数，记录当前值
			}else {
				sum += val;//sum 为正，加当前值
			}
    		max = Math.max(max,sum);
		}
    	return max;
    }
}
