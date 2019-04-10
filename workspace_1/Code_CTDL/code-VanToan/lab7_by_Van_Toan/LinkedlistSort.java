package lab7_by_Van_Toan;

public class LinkedlistSort<T extends Comparable<T>> {
	private Node<T> head;
	private int count;

	public LinkedlistSort() {
		head = null;
		count = 0;
	}

	public int size() {
		return count;
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data, head);
		head = newNode;
		count++;
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
			count++;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void bubbleSort() {
		Node<T> cur = head;
		T tmp;
		while (cur.next != null) {
			while (cur.next != null) {
				if (cur.getData().compareTo(cur.next.getData()) > 0) {
					tmp = cur.getData();
					cur.setData(cur.next.getData());
					cur.next.setData(tmp);
				}
				cur = cur.next;
			}

		}
	}

	public void bubbleSortNew() {
		if (isEmpty()) {
			System.out.println("Cannot sort - the list is empty");
		} else if (count == 1) {
			System.out.println("List sorted");
		} else {
			Node<T> current = head;
			T tempDat;
			boolean swapDone = true;
			while (swapDone) {
				swapDone = false;
				while (current != null) {
					if (current.getNext() != null && current.getData().compareTo(current.getNext().getData()) > 0) {
						tempDat = current.getData();
						current.setData(current.getNext().getData());
						current.getNext().setData(tempDat);
						swapDone = true;
					}
					current = current.getNext();
				}
				current = head;
			}
		}

	}

	public void selectionSort() {
		Node<T> i, j, min;
		for (i = head; i != null; i = i.getNext()) {
			min = i;
			for (j = i.getNext(); j != null; j = j.getNext()) {
				if (j.getData().compareTo(min.getData()) < 0)
					min = j;
			}
			if (min != i) {
				T tmp = min.getData();
				min.setData(i.getData());
				i.setData(tmp);

			}
		}
	}

	public void insertionSort() {
		Node<T> prev = head;
		while(prev != null){
			Node<T> cur = prev;
			while(cur.next != null && cur.next.getData().compareTo(prev.getData()) < 0) {
				cur = cur.next;
			}
			Node<T> tmp = prev.next;
			prev.next = cur.next;
			cur.next = prev;
			prev = tmp;
		}
		prev.getNext();
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder(count);
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
