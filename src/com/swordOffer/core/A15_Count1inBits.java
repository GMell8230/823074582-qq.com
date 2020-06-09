package com.swordOffer.core;

/**
 * @author GMell
 * @version 创建时间：2020年6月8日 上午10:18:43
 * @describe
 */
public class A15_Count1inBits {
	public int NumberOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n-1);
		}
		return count;
	}
	
	public int Numberof1_2(int n) {
		return Integer.bitCount(n);
	}
}
