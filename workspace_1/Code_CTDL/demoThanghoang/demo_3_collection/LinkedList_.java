package demo_3_collection;

public class LinkedList_ {
	private ListNode firstNode;
	private ListNode lastNode;

	public LinkedList_() {
		firstNode = lastNode = null;
	}

	public void insertAtFront(int insertItem) {
		if (isEmpty())
			firstNode = lastNode = new ListNode(insertItem);
		else
			firstNode = new ListNode(insertItem, firstNode);
	}

	public void insertAtBack(int insertItem) {
		if (isEmpty())
			firstNode = lastNode = new ListNode(insertItem);
		else
			lastNode = new ListNode(insertItem, lastNode);
	}

	public int removeFromFront() {
		int removeItem = -1;
		if (!isEmpty()) {
			removeItem = firstNode.data;
			if (firstNode == lastNode)
				firstNode = lastNode = null;
			else
				firstNode = firstNode.nextNode;
		}
		return removeItem;
	}

	public int removeFromBack() {
		int removeItem = -1;
		if (!isEmpty()) {
			removeItem = lastNode.data;
			if (firstNode == lastNode)
				firstNode = lastNode = null;
			else {
				ListNode current = firstNode;
				while (current.nextNode != lastNode)
					current = current.nextNode;
				lastNode = current;
				current.nextNode = null;
			}
		}
		return removeItem;
	}

	public boolean isEmpty() {
		return (firstNode == null);
	}

	public void print() {
		ListNode node = firstNode;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.nextNode;
		}
		System.out.println("\n");
	}
	
}
