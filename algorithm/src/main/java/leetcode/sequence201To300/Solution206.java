package leetcode.sequence201To300;

import leetcode.ListNode;

// 206.反转链表
/*
反转一个单链表。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL

进阶:
你可以迭代或递归地反转链表。你能否用两种方法解决这道题？

 */
public class Solution206 {
	public ListNode reverseList(ListNode head) {
		if (null == head || head.next == null) {
			return head;
		}
		ListNode p = head;
		ListNode q = head.next;
		ListNode temp = null;
		while (q != null) {
			temp = q;
			q = q.next;
			temp.next = p;
			if (p == head) {
				p.next = null;
			}
			p = temp;
		}
        return p;
    }
}
