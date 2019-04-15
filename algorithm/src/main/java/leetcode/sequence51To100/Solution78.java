package leetcode.sequence51To100;

import java.util.ArrayList;
import java.util.List;

// 78.子集

/*
	 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
	
	说明：解集不能包含重复的子集。
	
	示例:
	
	输入: nums = [1,2,3]
	输出:
	[
	  [3],
	  [1],
	  [2],
	  [1,2,3],
	  [1,3],
	  [2,3],
	  [1,2],
	  []
	]
 */

/*
 * 解题思路：利用回溯算法，枚举各种情况
 */
public class Solution78 {
	private ArrayList<List<Integer>> lists = new ArrayList<>();
	public List<List<Integer>> subsets(int[] nums) {
		addSubset(0, nums, 0, new ArrayList<>());
		lists.add(new ArrayList<>());
		return lists;
    }
	public void addSubset(int n, int[] nums, int j, ArrayList<Integer> list) {
		if (n == nums.length) {
			return;
		}
		for (int i = j; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]);
				lists.add(new ArrayList<>(list));
				addSubset(n + 1, nums, i, list);
				list.remove(list.size() - 1);
			}
		}
	}
	public static void main(String[] args) {
		Solution78 s = new Solution78();
		int[] nums = new int[] {1, 2};
		List<List<Integer>> lists = s.subsets(nums);
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
	}
}
