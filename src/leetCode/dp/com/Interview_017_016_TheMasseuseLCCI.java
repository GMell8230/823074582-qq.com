/**
　 * Title: Interview_17_16_TheMasseuseLCCI.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月24日下午6:25:36
*/
package leetCode.dp.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Interview_017_016_TheMasseuseLCCI {
	int MAX_RES = 0;
	public static void main(String[] args) {
    	int[] nums = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,
    			236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,
    			67,205,94,205,169,241,202,144,240};
    	Interview_017_016_TheMasseuseLCCI test = new Interview_017_016_TheMasseuseLCCI();
    	System.out.println(test.massage(nums));
	}
	public int massage(int[] nums) {
    	if (nums.length == 0) {
			return 0;
		}
    	int pos = 0;
    	int cur_sum = 0;
    	recur(nums,pos,nums.length-1, cur_sum);
    	return MAX_RES;
    }

	private void recur(int[] nums, int pos, int length, int cur_sum) {
		if (pos > length) {
			MAX_RES = MAX_RES > cur_sum ? MAX_RES : cur_sum;
			return;
		}
		//只使用递归超时
		//接本号位预约
		cur_sum += nums[pos];
		recur(nums, pos+2, length, cur_sum);
		//不接本号位预约
		cur_sum -= nums[pos];
		recur(nums, pos+1, length, cur_sum);
	}
	
	public int massage1(int[] nums) {
		int len = nums.length;
		if(len == 0) {
			return 0;
		}
		if (len == 1) {
			return 1;
		}
		int dp[] = new int[len];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < len; i++) {
			dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
		}
		return dp[len-1];
    }
}
