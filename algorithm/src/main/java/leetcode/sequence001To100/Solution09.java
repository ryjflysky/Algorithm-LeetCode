package leetcode.sequence001To100;

// 9.回文数
public class Solution09 {
	// 判断一个整数是否为回文数
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
        int[] nums = new int[11];
        int number = x;
        int len = 0;
        while (number != 0) {
        	nums[len++] = number % 10;
        	number /= 10;
        }
        for (int i = 0, j = len - 1; i < j; i++, j--) {
        	if (nums[i] != nums[j]) {
        		return false;
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		Solution09 s = new Solution09();
		System.out.println(s.isPalindrome(98));
		System.out.println(s.isPalindrome(101));
		System.out.println(s.isPalindrome(888888));
		System.out.println(s.isPalindrome(-121));
	}
}
