package leetcode;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy;
        int l = 0;
        while(node.next != null) {
        	node = node.next;
        	l++;
        }
        node = dummy;
        int i = l - n ;
        while(i>0) {
        	node = node.next;
        	i--;
        }
        node.next = node.next.next;
        return dummy.next;
    }
}
/*
RemoveNthFromEnd r = new RemoveNthFromEnd();
ListNode l1 = new ListNode(2);
l1.next = new ListNode(4);
l1.next.next = new ListNode(3);
l1.next.next.next = new ListNode(4);
l1.next.next.next.next = new ListNode(5);
l1.next.next.next.next.next = new ListNode(6);
ListNode l2 = r.removeNthFromEnd(l1, 2);
while(l2 != null) {
	System.out.println(l2.val);
	l2 = l2.next;
}
*/