package com.swordOffer.core;

/**
 * @author GMell
 * @version ����ʱ�䣺2020��6��8�� ����10:18:43
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
