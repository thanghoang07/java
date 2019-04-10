package demo_1;

public class Solution<T extends Comparable<T>> {
	public ListNode<T> insertionSortList(ListNode<T> head) {
		if (head == null)
			return null;
		ListNode<T> sentinel = new ListNode(0);
		ListNode<T> pre = sentinel;
		ListNode<T> cur = head;
		while (cur != null) {
			ListNode<T> next = cur.next;
			pre = sentinel;
			while (cur.next != null && cur.next.getData().compareTo(pre.getData()) < 0) {
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;
			cur = next;
		}
		return sentinel.next;
	}

	public static void main(String[] args) {

	}
}