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
public class A0213_HouseRobber2 {
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
    	//不偷最后一个房子
    	dp[0] = nums[0];
    	dp[1] = Math.max(nums[0], nums[1]);
    	if (len == 2) {
			return dp[1];
		}
    	for (int i = 2; i < len-1; i++) {
    		// 若要此号位则上一位必须空出来,也即是从i-2算起:dp[i-2]+nums[i]
    		// 若不要此号位则当前的最大值与上一个值是相同的;
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
    	int res = dp[len-2];
    	//不偷第一个房子
    	dp[1] = nums[1];
    	dp[2] = Math.max(nums[1], nums[2]);
    	for (int i = 3; i < len; i++) {
    		// 若要此号位则上一位必须空出来,也即是从i-2算起:dp[i-2]+nums[i]
    		// 若不要此号位则当前的最大值与上一个值是相同的;
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
    	res = res > dp[len-1] ? res: dp[len-1];
    	return res;
    }
}
