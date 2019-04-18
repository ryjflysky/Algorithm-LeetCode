package leetcode.sequence101To200;

import leetcode.ListNode;

// 排序链表
public class Solution148 {
	public ListNode sortList(ListNode head) {
		quickSort(head, null);
		return null;
    }
	public void quickSort(ListNode head, ListNode tail) {
		if (null == head || head == tail) {
			return;
		}
		
		ListNode index = head;
		ListNode p = head, q = head;
		while (q.next != null) {
			
		}
	}
}
