package leetcode;

public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
        	return head;
        ListNode dummy = new ListNode(0);
        ListNode next = head.next.next;
        dummy.next = head.next;
        dummy.next.next = head;
        dummy.next.next.next = swapPairs(next);
        return dummy.next;
    }
}
/**
ListNode l1 = new ListNode(1);
l1.next = new ListNode(2);
l1.next.next = new ListNode(3);
l1.next.next.next = new ListNode(4);
l1.next.next.next.next = new ListNode(5);
SwapPairs s = new SwapPairs();
ListNode l2 = s.swapPairs(l1);
while(l2 != null) {
	System.out.println(l2.val);
	l2 = l2.next;
}
*/