package leetcode.sequence001To100;

import java.util.ArrayList;
import java.util.List;

// 46.全排列
//给定一个没有重复数字的序列，返回其所有可能的全排列。
//
//示例:
//
//输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]

public class Solution46 {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>(); // 存放结果
		ArrayList<Integer> sub = new ArrayList<>();  // 满足条件的子排序
		boolean[] flag = new boolean[nums.length];   // 该元素是否被使用
		allCase(nums, flag, sub, res, 0);            // 生成满级条件的排序   
		return res;
    }
	/*
	   *  采用回溯算法实现
	 */
	public void allCase(int[] nums, boolean[] flag, List<Integer> sub, List<List<Integer>> res, int dept) {
		if (dept == nums.length) {
			res.add(new ArrayList<Integer>(sub));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (flag[i]) {
				continue;
			}
			sub.add(nums[i]);
			flag[i] = true;
			allCase(nums, flag, sub, res, dept + 1);
			flag[i] = false;
			sub.remove(sub.size() - 1);
		}
	}
	public static void main(String[] args) {
		Solution46 s = new Solution46();
		int[] nums = new int[] {1, 2, 3};
		List<List<Integer>> res = s.permute(nums);
		for (int i = 0, len = res.size(); i < len; i++) {
			System.out.println(res.get(i));
		}
	}
}
