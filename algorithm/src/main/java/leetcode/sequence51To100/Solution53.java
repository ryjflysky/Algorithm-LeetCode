package leetcode.sequence51To100;

// 53.最大子序和
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//示例:
//
//输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

/**
 *	解题思路：采用动态规划算法
 *	要求连续的子数组的和最大，用一个数来记录当前的最大子数组最大和，当这个数加上下一个数大于等于0
 *	那么这个序列和是呈递增的趋势，如果小于0，那么这个子序数组是呈递减状态。 
 *
 */
public class Solution53 {
	public int maxSubArray(int[] nums) {
		if (null == nums || nums.length == 0) {
			return 0;
		}
		// 记录最大子序列和
		int maxSum = nums[0];
		// 记录当前子序列最大和
		int nowMax = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nowMax + nums[i] >= 0 && nowMax >= 0) {
				nowMax += nums[i];
			} else if (nowMax + nums[i] >= 0 && nowMax < 0) {
				nowMax = nums[i];
			} else {
				nowMax = nums[i];
			}
			// 当前子序列和和最大子序列和进行比较
			if (nowMax > maxSum) {
				maxSum = nowMax;
			}
		}
		return maxSum;
    }
}
