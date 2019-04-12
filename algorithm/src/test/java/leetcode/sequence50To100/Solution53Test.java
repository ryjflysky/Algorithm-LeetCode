package leetcode.sequence50To100;

import org.junit.Test;

import leetcode.sequence51To100.Solution53;

public class Solution53Test {
	
	@Test
	public void testSolution53() {
		Solution53 s = new Solution53();
		int[] nums1 = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2 = new int[] {-2, -1,-3, -4, -1, -2, -1, -5, 4};
		int[] nums3 = new int[] {1, 2, 3, 4, 5};
		int[] nums4 = new int[] {10, -10, -11, 5, 3, -7, -20};
		int[] nums5 = new int[] {-99, 10, -11, 20, 30, -100};
		int[] nums6 = new int[] {-11, -32, -3, -4, -5, -99};
		int[] nums7 = new int[] {1};
		System.out.println(s.maxSubArray(nums1));
		System.out.println(s.maxSubArray(nums2));
		System.out.println(s.maxSubArray(nums3));
		System.out.println(s.maxSubArray(nums4));
		System.out.println(s.maxSubArray(nums5));
		System.out.println(s.maxSubArray(nums6));
		System.out.println(s.maxSubArray(nums7));
	}
}
