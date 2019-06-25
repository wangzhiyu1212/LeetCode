package leetcode;

public class Partition {
	public ListNode partition(ListNode head, int x) {
		ListNode lessDummy = new ListNode(0);
		ListNode greatDummy = new ListNode(0);
		ListNode less = lessDummy, great = greatDummy;
		while (head != null) {
			if (head.val < x) {
				less.next = new ListNode(head.val);
				less = less.next;
			} else {
				great.next = new ListNode(head.val);
				great = great.next;
			}
			head = head.next;
		}
		less.next = greatDummy.next;
		return lessDummy.next;
    }
}
/*
public static void main(String[] args) {
ListNode l1 = new ListNode(1);
l1.next = new ListNode(4);
l1.next.next = new ListNode(3);
l1.next.next.next = new ListNode(2);
l1.next.next.next.next = new ListNode(5);
l1.next.next.next.next.next = new ListNode(2);
Partition t = new Partition();
ListNode l2 = t.partition(l1, 0);
while (l2 != null) {
	System.out.print(l2.val+"->");
	l2 = l2.next;
}
}
*/