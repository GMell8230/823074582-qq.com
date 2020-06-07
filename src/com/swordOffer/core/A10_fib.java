package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年6月7日 下午5:30:53
* @describe
*/
public class A10_fib {
	public int fib1(int n) {
		if (n == 1 || n == 0) {
			return n;
		}else {
			return fib1(n-1)+fib1(n-2);
		}
	}
	
	public int fib2(int n) {
		if (n <= 1) {
			return n;
		}
		int []fib = new int[n+1];
		fib[1] = 1;
		for(int i = 2; i <= n; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[n];
	}
	
	public int fib3(int n) {
		if (n <= 1) {
			return n;
		}
		int pre1 = 0, pre2 = 1;
		int res = 0;
		for(int i = 2; i <= n; i++) {
			res = pre1 + pre2;
			pre1 = pre2;
			pre2 = res;
		}
		return res;
	}
	
	public static void main(String[] args) {
		A10_fib sol = new A10_fib();
		System.out.println(sol.fib1(3));
	}
}
