package lab3_by_thanh_hai;

public class DoublyLinkedList<T> implements DoublyLinkedListInterface<T> {
	protected DoubleNode<T> head;

	public DoublyLinkedList() {
		head = null;
	}

	public void create() {
		DoublyLinkedList<T> doublyLinkedList = new DoublyLinkedList<>();

	}

	public T get(int index) {
		DoubleNode<T> current = head;
		if (index > 0) {
			for (int i = 0; i < index; i++) {
				if (current.getNext() != null)
					current = current.next;
			}
		}
		return current.data;

	}

	public void set(T object, int index) {
		DoubleNode<T> curr = head;
		if (index > size())
			throw new RuntimeException(
					"Vi tri can thay doi lon hon so voi kich thuoc cua danh sach");
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		curr.data = object;

	}

	public void addFirst(T item) {
		DoubleNode<T> newNode = new DoubleNode<T>(item, null, null);
		if (head == null) {
			head = newNode;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}

	public void addLast(T item) {
		DoubleNode<T> newNode = new DoubleNode<T>(item);
		if (head == null) {
			addFirst(item);
		} else {
			DoubleNode<T> tmp = head;
			while (tmp.next != null)
				tmp = tmp.next;
			tmp.next = newNode;
			newNode.prev = tmp;
		}
	}

	public void addNode(T item, int index) {
		DoubleNode<T> curr = head;
		if (index > size())
			throw new RuntimeException(
					"Vị trí muốn thêm vào nằm ngoài danh sách");
		if (index == 0) {
			head = new DoubleNode<T>(item, head, null);
		} else {
			for (int i = 0; i < index - 1; i++) {
				curr = curr.next;
			}
			DoubleNode<T> newNode = new DoubleNode<T>(item, null, null);
			newNode.prev = curr;
			newNode.next = curr.next;
			curr.next.prev = newNode;
			curr.next = newNode;
		}
	}

	public void remove(T key) {
		DoubleNode<T> curr = head;
		while (curr.next != null && !curr.next.getData().equals(key)) {
			curr = curr.getNext();
		}
		DoubleNode<T> newNode = new DoubleNode<T>(key, null, null);
		newNode = curr.next;
		curr.next = newNode.next;
		newNode.prev = curr;
	}

	public int size() {
		DoubleNode<T> tmp = head;
		int count = 0;
		while (tmp != null) {
			count++;
			tmp = tmp.next;
		}
		return count;
	}

	public int count(T x) {
		int count = 0;
		DoubleNode<T> tmp = head;
		while (tmp != null) {
			if (tmp.getData().equals(x) && (tmp != null))
				count++;
			tmp = tmp.next;

		}
		return count;
	}

	public String toString() {
		if (head == null)
			return "[ ]";
		else {
			String result = "[" + head.data;
			DoubleNode<T> curr = head.next;
			while (curr != null) {
				result += ", " + curr.data;
				curr = curr.next;
			}
			result += "]";
			return result;
		}
	}

}
