package com.swordOffer.core;

import java.util.LinkedList;
import java.util.Queue;

/**
* @author GMell
* @version ����ʱ�䣺2020��7��5�� ����9:53:43
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
				sum = val; // sum�Ѿ��Ǹ�������¼��ǰֵ
			}else {
				sum += val;//sum Ϊ�����ӵ�ǰֵ
			}
    		max = Math.max(max,sum);
		}
    	return max;
    }
}
