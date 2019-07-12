package leetcode;

public class DetectCycle {
	public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        while (fast != null && fast.next != null) {
        	fast = fast.next.next;
        	low = low.next;
        	if (fast == low) {
        		while (fast != head) {
        			fast = fast.next;
        			head = head.next;
        		}
        		return head;
        	}
        }
        return null;
    }
}
