package leetcode.sequence001To100;

// 33.搜索旋转排序数组
/*
假设按照升序排序的数组在预先未知的某个点上进行了旋转。

( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

你可以假设数组中不存在重复的元素。

你的算法时间复杂度必须是 O(log n) 级别。

示例 1:

输入: nums = [4,5,6,7,0,1,2], target = 0
输出: 4

示例 2:

输入: nums = [4,5,6,7,0,1,2], target = 3
输出: -1
 */
public class Solution33 {
	public int search(int[] nums, int target) {
		if (null == nums || nums.length <= 0) {
            return -1;
        }
        int i = 0, j = nums.length - 1;
        if (nums[i] > target) {
        	while(i <= j) {
        		if (nums[j] == target) {
        			return j;
        		}
        		j--;
        	}
        } else if (nums[i] < target) {
        	while (i <= j) {
        		if (nums[i] == target) {
        			return i;
        		}
        		i++;
        	}
        } else {
        	return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		Solution33 s = new Solution33();
		int[] nums = new int[] {1, 3};
		System.out.println(s.search(nums, 3));
	}
}
