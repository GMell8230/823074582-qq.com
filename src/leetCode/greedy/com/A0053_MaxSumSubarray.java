/**
　 * Title: A0053_MaxSumSubarray.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月25日下午4:55:00
*/
package leetCode.greedy.com;

import java.util.Iterator;

public class A0053_MaxSumSubarray {
    public int maxSubArray(int[] nums) {
    	int len = nums.length;
    	if (len == 0) {
			return 0;
		}
    	int ans = nums[0];
    	int sum = 0;
    	for (int val : nums) {
			if (sum > 0) {
				sum  += val;
			}else {
				sum = val;
			}
			ans = Math.max(sum, ans);
		}
    	return ans;
    }
}
