package leetcode.sequence001To100;

import leetcode.ListNode;

// 61.旋转链表
public class Solution61 {
	public ListNode rotateRight(ListNode head, int k) {
		if (k <= 0 || null == head || head.next == null) {
			return head;
		}
		int len = 1;
		ListNode p = head;
		while (p.next != null) {
			len++;
			p = p.next;
		}
		k = k % len;
		if (k == 0) {
			return head;
		}
		ListNode q = head;
		for (int i = 1; i < len - k; i++) {
			q = q.next;
		}
		p.next = head;
		head = q.next;
		q.next = null;
		forEach(head);
		return head;
    }
	public void forEach(ListNode head) {
		ListNode p = head;
		while (p != null) {
			System.out.print(p.val + "->" + (p.next == null ? "NULL" : ""));
			p = p.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		Solution61 s = new Solution61();
		s.rotateRight(node1, 9);
		
	}
}
