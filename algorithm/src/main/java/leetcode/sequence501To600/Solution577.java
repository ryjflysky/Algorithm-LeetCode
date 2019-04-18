package leetcode.sequence501To600;

// 557.反转字符串中的单词III
/*
给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例 1:

输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc" 

注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。

 */
public class Solution577 {
	// 方法一
	public String reverseWords1(String s) {
		StringBuilder sb = new StringBuilder();
		int index = 0;
		for (int i = 0, len = s.length(); i < len; i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				sb.append(reverseString(s.substring(index, i).toCharArray()) + " ");
				index = i + 1;
			}
		}
		sb.append(reverseString(s.substring(index, s.length()).toCharArray()));
        return sb.toString();
    }
	public String reverseString(char[] s) {
		for (int i = 0, j = s.length - 1; i < j; i++,j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		return new String(s);
	}
	// 方法二
	public String reverseWords(String s) {
		char[] arr = s.toCharArray();
		int index = 0;
		for (int i = 0, len = s.length(); i < len; i++) {
			if (s.charAt(i) == ' ') {
				reverseArray(arr, index, i - 1);
				index = i + 1;
			}
		}
		reverseArray(arr, index, arr.length - 1);
        return new String(arr);
    }
	public void reverseArray(char[] arr, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		Solution577 s = new Solution577();
		System.out.println("\"" + s.reverseWords("Let's take LeetCode contest") + "\"");
	}
}
