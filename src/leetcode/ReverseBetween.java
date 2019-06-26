package leetcode;

public class ReverseBetween {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i=1; i<m; i++)
        	pre = pre.next;
        ListNode node = null;
        ListNode cur = pre.next;
    }
}
