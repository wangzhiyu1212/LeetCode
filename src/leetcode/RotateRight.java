package leetcode;

public class RotateRight {
	public ListNode rotateRight(ListNode head, int k) {
		int length = 0;
		if (head == null) return null;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode node = dummy;
        while (node.next != null) {
        	length++;
        	node = node.next;
        }
        int offset = (k-k/length*length == 0)? 0:length-(k-k/length*length);
        node = dummy;
        while (node.next != null) {
        	if (offset == 0) {
        		if (node != dummy) {
        			ListNode last = node;
        			while (last.next != null) {
        				last = last.next;
        			}
        			last.next = dummy.next;
        			dummy.next = node.next;
            		node.next = null;
        		}
        		break;
        	}
        	node = node.next;
        	offset--;
        }
        return dummy.next;
    }
}
/**
ListNode l1 = new ListNode(1);
l1.next = new ListNode(2);
l1.next.next = new ListNode(3);
l1.next.next.next = new ListNode(4);
l1.next.next.next.next = new ListNode(5);
RotateRight t = new RotateRight();
l1 = t.rotateRight(l1, 5);
while(l1 != null) {
	System.out.print(l1.val+"->");
	l1 = l1.next;
}
*/