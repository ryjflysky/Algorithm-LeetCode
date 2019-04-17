
package leetcode.sequence1To50;

import org.junit.Test;

public class Solution8Test {
	
	@Test
	public void testSolution8() {
		Solution8 solution8 = new Solution8();
		System.out.println(solution8.myAtoi("   -123"));
		System.out.println(solution8.myAtoi("w2   123"));
		System.out.println(solution8.myAtoi("   +123urewiruewo"));
		System.out.println(solution8.myAtoi("4193 with words"));
		System.out.println(solution8.myAtoi("-91283472332"));
		System.out.println(solution8.myAtoi("91283472332"));
		System.out.println(solution8.myAtoi("0"));
		System.out.println(solution8.myAtoi("6 7 8"));
		System.out.println(solution8.myAtoi("-6 7 9"));
		System.out.println(solution8.myAtoi("1234567"));
	}
}
