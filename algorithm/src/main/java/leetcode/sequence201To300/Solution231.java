package leetcode.sequence201To300;

// 231.2的幂
//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
//
//示例 1:
//
//输入: 1
//输出: true
//解释: 20 = 1
public class Solution231 {
	public boolean isPowerOfTwo(int n) {
		// 如果是2的幂，那么在该数的二进制中只有一个1，那么判断 n & n - 1是否为零即可
        return (n & (n - 1)) == 0 && n >= 1 ? true : false;
    }
	public static void main(String[] args) {
		Solution231 s = new Solution231();
		System.out.println(s.isPowerOfTwo(1));
		System.out.println(s.isPowerOfTwo(19));
		System.out.println(s.isPowerOfTwo(16));
		System.out.println(s.isPowerOfTwo(1024));
		System.out.println(s.isPowerOfTwo(7));
		System.out.println(s.isPowerOfTwo(0));
		System.out.println(s.isPowerOfTwo(-8));
	}
}
