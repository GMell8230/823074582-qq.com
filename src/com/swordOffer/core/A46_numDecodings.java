package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年7月7日 下午9:22:34
* @describe
*/
public class A46_numDecodings {
	public static void main(String[] args) {
		System.out.println(numDecodings("10"));
	}
    public static int numDecodings(String s) {
    	if (s.length() == 0 || s == null) {
			return 0;
		}
    	int n = s.length();
    	char []arr = s.toCharArray();
    	if (arr[0] == '0') {
			return 0;
		}
    	int []dp = new int[n];
    	dp[0] = 1;
    	for (int i = 1; i < n; i++) {
    		//case1:
    		if (arr[i] == '0') {
    			System.out.println(arr[i-1] );
				if (arr[i-1] != '1' && arr[i-1] != '2') {
					return 0;
				}else {
					if (i > 1) {
						dp[i] = dp[i-2];
					}else {
						dp[i] = 1;
					}
					
				}
			}else if (arr[i-1] == '1' || (arr[i-1] == '2' && arr[i] > '0' && arr[i] < '7')) {
				if (i > 1) {
					dp[i] = dp[i-2] + dp[i-1];
				}else {
					dp[i] = dp[i-1] + 1;
				}
			}else{
				dp[i] = dp[i-1];
			}
		}
    	return dp[n-1];
    }
}
