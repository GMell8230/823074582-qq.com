package com.swordOffer.core;

import java.util.Arrays;

/**
* @author GMell
* @version 创建时间：2020年6月7日 下午10:43:58
* @describe
*/
public class A14_cuttingRope {
    public int cuttingRope(int n) {
    	if (n == 2) {
			return 1;
		}
    	if (n == 3) {
			return 2;
		}
    	int count3 = n / 3;
    	int remain = n % 3;
    	if (remain == 0) {
			return (int)Math.pow(3, count3);
		}else if (remain == 1) {
			return (int)Math.pow(3, count3-1) * 2 * 2;
		}else {
			return (int)Math.pow(3, count3) * 2;
		}
    }
    
    public int cuttingRope_dp(int n) {
    	if (n <= 3) {
			return n-1;
		}
    	int []dp = new int[n+1];
    	dp[2] = 1;
    	for (int i = 3; i <= n; i++) {
			for (int j = 1; j < i; j++) {
			}
		}
    	return dp[n];
    }
}

