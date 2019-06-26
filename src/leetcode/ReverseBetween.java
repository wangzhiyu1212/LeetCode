package leetcode;

public class ReverseBetween {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i=1; i<m; i++)
        	pre = pre.next;
        ListNode cur = pre.next;
        ListNode node = cur;
        for (int i=0; i<n-m; i++) {
        	ListNode temp = cur; 
        	cur = node.next;
        	node.next = node.next.next;
        	cur.next = temp;
        }
        pre.next = cur;
        return dummy.next;
    }
}
/*
public static void main(String[] args) {
ListNode l1 = new ListNode(1);
l1.next = new ListNode(2);
l1.next.next = new ListNode(3);
l1.next.next.next = new ListNode(4);
l1.next.next.next.next = new ListNode(5);
ReverseBetween t = new ReverseBetween();
t.reverseBetween(l1, 2, 5);
while(l1 != null) {
	System.out.print(l1.val+"->");
	l1 = l1.next;
}
}
*/