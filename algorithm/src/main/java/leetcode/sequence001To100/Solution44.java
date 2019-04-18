package leetcode.sequence001To100;

import java.util.ArrayList;

// 44.通配符匹配
//给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
//
//'?' 可以匹配任何单个字符。
//'*' 可以匹配任意字符串（包括空字符串）。
//
//两个字符串完全匹配才算匹配成功。
//
//说明:
//    s 可能为空，且只包含从 a-z 的小写字母。
//    p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。
//
//示例 1:
//
//输入:
//s = "aa"
//p = "a"
//输出: false
//解释: "a" 无法匹配 "aa" 整个字符串。
//
//示例 2:
//
//输入:
//s = "aa"
//p = "*"
//输出: true
//解释: '*' 可以匹配任意字符串。
//
//示例 3:
//
//输入:
//s = "cb"
//p = "?a"
//输出: false
//解释: '?' 可以匹配 'c', 但第二个 'a' 无法匹配 'b'。
//
//示例 4:
//
//输入:
//s = "adceb"
//p = "*a*b"
//输出: true
//解释: 第一个 '*' 可以匹配空字符串, 第二个 '*' 可以匹配字符串 "dce".
//
//示例 5:
//
//输入:
//s = "acdcb"
//p = "a*c?b"
//输入: false
//

public class Solution44 {
	public static void main(String[] args) {
	}
	public boolean isMatch(String s, String p) {
        if (!p.contains("*") && !p.contains("?")) {
        	return p.equals(s);
        }
        ArrayList<Character> chs = new ArrayList<>();
        // 找出所有的*和?的位置
        for (int i = 0, len = p.length(); i < len; i++) {
        	char op = p.charAt(i);
        	if (op == '*' || op == '?') {
        		chs.add(new Character(op, i));
        	}
        }
        // 对每个*/?进行匹配
        
		return true;
    }
	public static class Character {
		private char ch;
		private int p;
		public Character(char ch, int p) {
			this.ch = ch;
			this.p = p;
		}
		public char getCh() {
			return ch;
		}
		public void setCh(char ch) {
			this.ch = ch;
		}
		public int getP() {
			return p;
		}
		public void setP(int p) {
			this.p = p;
		}
		@Override
		public String toString() {
			return "Character [ch=" + ch + ", p=" + p + "]";
		}
	}
}
