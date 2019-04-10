package tuan11;

public class ListSearch<T extends Comparable<T>> {
	private Node<T> head;
	private Node<T> last;
	private int middle;
	private int nElems;

	public ListSearch() {
		head = last = null;
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

	public void clear() {
		for (int i = 0; i <= nElems; i++)
			head = null;
		nElems = 0;
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
			nElems++;
			if (tmp.getData() == data)
				return 1;
			tmp = tmp.next;
		}
		return -1;
	}
	
	// tim mot gia tri ko co thi chua dung!!
	public int binarySearch(ListSearch list, T data) {
		int last = list.size() - 1;
		int head = 0;
		// while there are still elements to search through
		while (head <= last) {
			middle = (head + last) / 2;
			// if current middle value is the search target
			if ((list.get(middle)).equals(data)) {
				return middle;
			}
			// if current middle value is less than the search target
			else if ((list.get(middle)).compareTo(data) < 0) {
				head = middle + 1;
			}
			// if current middle value is larger than the search target
			else {
				last = middle - 1;
			}
		}
		return middle;
	}

	public T get(int index) {
		if ((index < 0 || index > size()))
			System.out.printf("\nVi tri %d khong thuoc danh sach", index);
		Node<T> tmp = head;
		for (int i = 0; i < index; i++) {
			tmp = tmp.next;
		}
		return tmp.getData();
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder(nElems);
		Node<T> cur = head;
		if (isEmpty())
			return "||";
		output.append("|");
		while (cur != null) {
			output.append("|" + cur.getData() + "|");
			cur = cur.getNext();
		}
		return output.append("|").toString();
	}
}
