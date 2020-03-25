/**
　 * Title: A0152_MaximumProductSubarray.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月24日下午8:41:35
*/
package leetCode.dp.com;
//最大的连续子数组;
public class A0152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
    	int max = Integer.MIN_VALUE, imax = 1, imin = 1;
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				int temp = imax;
				imax = imin;
				imin = imax;
			}
			imax = Math.max(imax*nums[i], nums[i]);
			imin = Math.min(imin*nums[i], nums[i]);
			max = Math.max(imax, imin);
		}
    	return max;
    }
}
