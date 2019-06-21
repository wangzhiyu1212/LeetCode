package leetcode;

public class DeleteDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode first = head;
        while (head.next != null) {
        	if (head.next.val == head.val)
        		head.next = head.next.next;
        	else
        		head = head.next;
        }
        return first;
    }
}
/*
public static void main(String[] args) {
ListNode l1 = new ListNode(2);
l1.next = new ListNode(2);
l1.next.next = new ListNode(2);
l1.next.next.next = new ListNode(2);
l1.next.next.next.next = new ListNode(2);
DeleteDuplicates t = new DeleteDuplicates();
ListNode l2 = t.deleteDuplicates(l1);
while(l2 != null) {
	System.out.print(l2.val+"->");
	l2 = l2.next;
}
}
*/