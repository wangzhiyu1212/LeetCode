package leetcode;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode p = first;
        while (l1 != null && l2 != null) {
        	if (l1.val <= l2.val) {
        		p.next = l1;
        		p = p.next;
        		l1 = l1.next;
        	} else {
        		p.next = l2;
        		p = p.next;
        		l2 = l2.next;
        	}
        }
        if (l1 == null) 
        	p.next = l2;	
        else if (l2 == null) 
        	p.next = l1;
        return first.next;
    }
}
/*
 * ListNode l1 = new ListNode(1);
    	l1.next = new ListNode(2);
    	l1.next.next = new ListNode(4);
    	ListNode l2 = new ListNode(1);
    	l2.next = new ListNode(3);
    	l2.next.next = new ListNode(4);
    	l2.next.next.next = new ListNode(6);
    	MergeTwoLists a = new MergeTwoLists();
    	ListNode l = a.mergeTwoLists(l1, l2);
    	while (l!=null) {
    		System.out.println(l.val);
    		l = l.next;
    	}
 * @author wangl
 *
 */