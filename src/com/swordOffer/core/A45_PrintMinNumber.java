package com.swordOffer.core;

import java.util.Arrays;

/**
* @author GMell
* @version 创建时间：2020年7月7日 下午9:02:27
* @describe
*/
public class A45_PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
    	String res = "";
    	if (numbers == null || numbers.length == 0) {
			return res;
		}
    	String nums[] = new String[numbers.length];
    	int i = 0;
    	for (int val : numbers) {
			nums[i++] = val+"";
		}
    	Arrays.sort(nums, (o1,o2)->(o1+o2).compareTo(o2+o1));
    	for (String string : nums) {
			res += string;
		}
    	return res;
    }
}
