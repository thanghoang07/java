package demo_1;

public class SortLinkedList {
	private int count;
	private ListNode1 head;
	public static ListNode1 insertionSortList(ListNode1 head) {
		if (head == null || head.next == null)
			return head;
		ListNode1 newHead = new ListNode1(head.val);
		ListNode1 pointer = head.next;
		// loop through each element in the list
		while (pointer != null) {
			// insert this element to the new list
			ListNode1 innerPointer = newHead;
			ListNode1 next = pointer.next;

			if (pointer.val <= newHead.val) {
				ListNode1 oldHead = newHead;
				newHead = pointer;
				newHead.next = oldHead;
			} else {
				while (innerPointer.next != null) {
					if (pointer.val > innerPointer.val && pointer.val <= innerPointer.next.val) {
						ListNode1 oldNext = innerPointer.next;
						innerPointer.next = pointer;
						pointer.next = oldNext;
					}
					innerPointer = innerPointer.next;
				}
				if (innerPointer.next == null && pointer.val > innerPointer.val) {
					innerPointer.next = pointer;
					pointer.next = null;
				}
			}
			// finally
			pointer = next;
		}
		return newHead;
	}

	public static void main(String[] args) {
		ListNode1 n1 = new ListNode1(2);
		ListNode1 n2 = new ListNode1(3);
		ListNode1 n3 = new ListNode1(4);

		ListNode1 n4 = new ListNode1(3);
		ListNode1 n5 = new ListNode1(4);
		ListNode1 n6 = new ListNode1(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;

		n1 = insertionSortList(n1);
		printList(n1);
		
		
	}

	public static void printList(ListNode1 x) {
		if (x != null) {
			System.out.print(x.val + " ");
			while (x.next != null) {
				System.out.print(x.next.val + " ");
				x = x.next;
			}
			System.out.println();
		}
	}
	public boolean isEmpty() {
		return head == null;
	}
	public String toString() {
		StringBuilder output = new StringBuilder(count);
		ListNode1 cur = head;
		if (isEmpty())
			return "[]";
		output.append("[ ");
		while (cur != null) {
			output.append(cur.getData() + " ");
			cur = cur.getNext();
		}
		return output.append(" ]").toString();
	}
}