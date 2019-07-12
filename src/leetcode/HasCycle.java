package leetcode;

public class HasCycle {
	/** 快慢指针，空间复杂度O(1) */
	public boolean hasCycle(ListNode head) {
		if (head == null) return false;
        ListNode fast = head;
        ListNode low = head;
        while (fast != null && fast.next != null) {
        	fast = fast.next.next;
        	low = low.next;
        	if (fast == low)
        		return true;
        }
        return false;
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = l1.next;
		HasCycle c = new HasCycle();
		System.out.println(c.hasCycle(l1));
	}
}
