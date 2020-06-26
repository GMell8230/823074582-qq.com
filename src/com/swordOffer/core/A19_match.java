package com.swordOffer.core;

import com.sun.org.apache.regexp.internal.recompile;

/**
* @author GMell
* @version 创建时间：2020年6月9日 下午8:08:44
* @describe
*/
public class A19_match {
	
	public static void main(String[] args) {
		char []str = "".toCharArray();
		char []pattern = ".".toCharArray();
		A19_match sol = new A19_match();
		System.out.println(sol.match(str, pattern));
	}
    public boolean match(char[] str, char[] pattern)
    {
        boolean res = solution(str,0, pattern,0);
		return res;
    }

	private boolean solution(char[] str, int i, char[] pattern, int j) {
		//终止条件 1.两个串都匹配到了边界
		if (i == str.length && j == pattern.length) {
			return true;
			//2.模式串为空到了边界，但未能匹配完；（若字符串到了边界，模式串为空，因为有*字符的存在，所以是有可能通过去除最终能够匹配）
		}else if(j == pattern.length){
			return false;
		}
		// 模式串下一个字符是'*'
		boolean isNextSym = (j+1 < pattern.length && pattern[j+1] == '*');
		if (isNextSym) {
			if (i < str.length && (pattern[j] == '.' || pattern[j] == str[i])) {
				return solution(str, i+1, pattern, j) || solution(str, i, pattern, j+2);
			}else {
				// 已经到了str的最后一个元素，移动pattern
				return solution(str, i, pattern, j+2);
			}
			
		}else {
			if (i<str.length &&(pattern[j] == '.' || pattern[j] == str[i])) {
				return solution(str, i+1, pattern, j+1);
			}else {
				return false;
			}
		}
				
	}
	// dp的方法
    public boolean match_dp(char[] str, char[] pattern)
    {
    	int sLen = str.length, pLen = pattern.length;
    	boolean[][] dp = new boolean[sLen+1][pLen+1];
    	
    	dp[0][0] = true;
    	for (int i = 1; i <= pLen; i++) {
    		if (pattern[i-1] == '*') {
				dp[0][i] = dp[0][i-2];
			}
		}
    	
    	for (int i = 1; i <= sLen; i++) {
    		for(int j = 1; j <=pLen; j++) {
    			if (str[i-1] == pattern[j-1] || pattern[j-1] == '.') {
					dp[i][j] = dp[i-1][j-1];
				}else if (pattern[j-1] == '*') {
					if (pattern[j-2] == str[i-1] || pattern[j-2] == '.') {
	                    dp[i][j] |= dp[i][j - 1]; // a* counts as single a
	                    dp[i][j] |= dp[i - 1][j]; // a* counts as multiple a
	                    dp[i][j] |= dp[i][j - 2]; // a* counts as empty
					}else {
						dp[i][j] =dp[i][j - 2];
					}
				}
    		}
		}
    	return dp[sLen][pLen];
    }
}
