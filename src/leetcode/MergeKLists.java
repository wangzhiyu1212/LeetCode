package leetcode;

public class MergeKLists {
	public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
        	return null;
        return merge(lists, 0, lists.length-1);
    }
	public ListNode merge(ListNode[] list, int left, int right) {
		if (left == right) return list[left];
		int mid = left + (right - left)/2;
		ListNode l1 = merge(list, left, mid);
		ListNode l2 = merge(list, mid+1, right);
		return mergeTwoLists(l1,l2);
	}
	
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
MergeKLists a = new MergeKLists();
ListNode l1 = new ListNode(1);
l1.next = new ListNode(2);
l1.next.next = new ListNode(4);
ListNode l2 = new ListNode(1);
l2.next = new ListNode(3);
l2.next.next = new ListNode(4);
l2.next.next.next = new ListNode(6);
ListNode[] list = new ListNode[] {l1,l2};
ListNode l = a.mergeKLists(list);
while (l!=null) {
   System.out.println(l.val);
   l = l.next;
}
 */