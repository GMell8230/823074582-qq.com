/**
　 * Title: A0198_HouseRobber.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月24日下午8:34:09
*/
package leetCode.dp.com;
/*
 * dp问题与Interview_017_016_TheMasseuseLCCI相同
 */
public class A0198_HouseRobber1 {
	/*
	 * dp
	 */
    public int rob(int[] nums) {
    	int len = nums.length;
    	if (len == 0) {
			return 0;
		}
    	if (len == 1) {
			return nums[0];
		}
    	int []dp = new int [len];
    	dp[0] = nums[0];
    	dp[1] = Math.max(nums[0], nums[1]);
    	for (int i = 2; i < len; i++) {
    		// 若要此号位则上一位必须空出来,也即是从i-2算起:dp[i-2]+nums[i]
    		// 若不要此号位则当前的最大值与上一个值是相同的;
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
    	return dp[len-1];
    }
}
