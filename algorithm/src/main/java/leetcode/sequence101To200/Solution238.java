package leetcode.sequence101To200;

// 238.除自身以外组的乘积
public class Solution238 {
	public int[] productExceptSelf(int[] nums) {
		// 测试数组为空或者长度小于等于2直接返回测试数组
		if (null == nums || nums.length <= 1) {
			return nums;
		}
		// 结果数组
		int[] output = new int[nums.length];
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		
		for (int i = 0, j = nums.length - 1; i < nums.length && j >= 0; i++, j--) {
			if (i != 0) {
				left[i] = nums[i] * left[i - 1];
				right[j] = nums[j] * right[j + 1];
				continue;
			}
			left[i] = nums[i];
			right[j] = nums[j];
		}
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				output[i] = right[i + 1];
			} else if (i == nums.length - 1) {
				output[i] = left[i - 1];
			} else {
				output[i] = left[i - 1] * right[i + 1];
			}
		}
		return output;
    }
	public static void main(String[] args) {
		Solution238 s = new Solution238();
		int[] nums = new int[] {1, 2};
		int[] res = s.productExceptSelf(nums);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}
