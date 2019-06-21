package leetcode;

public class DeleteDuplicates2 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l = dummy;
        ListNode r = dummy.next;
        while (r != null) {
        	while (r.next != null && r.next.val == r.val) r = r.next;
        	if (l.next == r)
        		l = l.next;
        	else
        		l.next = r.next;
        	r = r.next;
        }
        return dummy.next;
    }
}
/*
public static void main(String[] args) {
ListNode l1 = new ListNode(1);
l1.next = new ListNode(1);
l1.next.next = new ListNode(2);
l1.next.next.next = new ListNode(2);
l1.next.next.next.next = new ListNode(3);
DeleteDuplicates2 t = new DeleteDuplicates2();
ListNode l2 = t.deleteDuplicates(l1);
while(l2 != null) {
	System.out.print(l2.val+"->");
	l2 = l2.next;
}
}
*/