package com.swordOffer.core;
/**
* @author GMell
* @version ����ʱ�䣺2020��7��6�� ����11:01:40
* @describe
*/
public class A44_findNthDigit {
	public static void main(String[] args) {
		System.out.println(findNthDigit(19));
	}
    public static int findNthDigit(int n) {
    	int digit = 1;
    	long start = 1;
    	long count = 9;
    	while (n > count) {
			n -= count;
			digit ++;
			start *= 10;
			count = 9 * digit * start; 
		}
    	long num = start + (n - 1)/digit;
    	return Long.toString(num).charAt((n-1) % digit) - '0';
    }
}
