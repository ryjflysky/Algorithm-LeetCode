package leetcode.sequence1To50;

//1.两数之和

//给定一个整数数组nums和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//
//示例:
//
//给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]

public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length <=1) {
            return result; //给定数组长度小于2，则没有答案直接返回
        }
        // 数组是无序的,所以用暴力遍历找到第一个满足的答案,直接返回
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
