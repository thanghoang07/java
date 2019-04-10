package lab8_by_Van_Toan;

public class LinkedlistSearch<T extends Comparable<T>> {
	public Node<T> head;
	private int nElems;
	public int count;

	public LinkedlistSearch() {
		head = null;
		nElems = 0;
	}

	public int size() {
		return nElems;
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data, head);
		head = newNode;
		nElems++;
	}

	public void add(T data) {
		if (head == null)
			addFirst(data);
		else {
			Node<T> newNode = new Node<T>(data);
			Node<T> tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
			nElems++;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int sequentialSearch(T data) {
		Node<T> tmp = head;
		while (tmp != null && tmp.getData() != data) {
			count++;
			if (tmp.getData() == data)
				return 1;
			tmp = tmp.next;
		}
		return -1;
	}

	public Node<T> binarySearch(T data) {
		Node<T> startNode = head;
		Node<T> endNode = null;
		
		do {
			Node<T> middle = middleNode(startNode, endNode);
			System.out.println(middle);
			if(middle == null) 
				return null;
			if(middle.getData() == data) {
				return middle;
			}else if(middle.getData().compareTo(data) < 0) {
				startNode = middle.next;
			} else
				endNode = middle;
		} while (endNode == null || endNode.next != startNode);
		
		return null;
	}

	public Node<T> middleNode(Node<T> startNode, Node<T> endNode) {
		if (isEmpty())
			return null;

		Node<T> slowPoint = startNode;
		Node<T> fastPoint = startNode.next;

		while (fastPoint != endNode) {
			fastPoint = fastPoint.next.next;
			slowPoint = slowPoint.next;
			if (fastPoint != endNode) {
				
				fastPoint = fastPoint.next;
			}
		}
		return slowPoint;
	}
	
	public Node<T> findMiddleNode() {
	    Node n1 = head;
	    Node n2 = head;
	    while(n2.getNext() != null && n2.getNext().getNext()!= null) {
	        n1 = n1.getNext();
	        n2 = n2.getNext().getNext();
	    }
	    return n1;
	}


	@Override
	public String toString() {
		StringBuilder output = new StringBuilder(nElems);
		Node<T> cur = head;
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
