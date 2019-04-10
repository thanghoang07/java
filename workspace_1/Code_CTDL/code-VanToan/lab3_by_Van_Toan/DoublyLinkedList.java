package lab3_by_Van_Toan;

public class DoublyLinkedList<T> implements InterfaceLinkedList<T> {
	protected Node<T> head;
	protected Node<T> trailer;
	int size = 0;

	public DoublyLinkedList() {
		head = null;
		trailer = null;
		size = 0;
	}

	@Override
	public T get(int index) {
		Node<T> tmp = head;
		for (int i = 0; i < index; i++) {
			tmp = tmp.next;
		}
		return tmp.getData();
	}

	@Override
	public void set(int index, T data) {
		if ((index < 0 || index > size()))
			System.out.println("Không thuộc danh sách");
		else {
			Node<T> tmp = head;
			for (int i = 0; i < index; i++) {
				tmp = tmp.next;
			}
			tmp.setData(data);
		}
	}

	@Override
	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data, head, null);
		head = newNode;
		size++;
	}

	@Override
	public void addLast(T data) {
		if (head == null)
			addFirst(data);
		else {
			Node<T> newNode = new Node<T>(data, null, trailer);
			Node<T> tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
			size++;
		}

	}

	@Override
	public void add(T data) {
		if (head == null)
			addFirst(data);
		else {
			Node<T> newNode = new Node<T>(data, null, trailer);
			Node<T> tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
			size++;
		}
	}

	@Override
	public void add(int index, T data) {
		if (index <= 0)
			addFirst(data);
		else if (index >= size)
			addLast(data);
		else {
			Node<T> tmp = head;
			Node<T> newNode = new Node<T>(data, null, null);
			for (int i = 1; i < index; i++) {
				tmp = tmp.next;
			}
			newNode.setNext(tmp.getNext());
			tmp.next.setPrev(newNode);
			newNode.setPrev(tmp);
			tmp.setPrev(newNode);
			size++;
		}

	}

	@Override
	public void remove(T data) {
		System.out.println("Danh sách liên kết sau khi xóa: ");
		if (head == null)
			throw new RuntimeException("Không thể xóa");
		if (head.getData().equals(data)) {
			head = head.next;
			return;
		}
		Node<T> cur = head;
		Node<T> prev = null;

		while (cur != null && !cur.getData().equals(data)) {
			prev = cur;
			cur = cur.next;
		}
		if (cur == null)
			throw new RuntimeException("Không thể xóa");
		prev.next = cur.next;
		size--;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int count(T data) {
		int count = 0;
		Node<T> tmp = head;
		while (tmp != null) {
			if (tmp.getData().equals(data))
				count++;
			tmp = tmp.next;
		}
		return count;
	}

	public String toString() {
		Node<T> newNode = head;

		String output = "[";
		while (newNode != null) {
			output += newNode.getData() + " ";
			newNode = newNode.getNext();
		}
		return output + "]";
	}

	private class Node<T> {
		private T data;
		public Node<T> next;
		public Node<T> prev;

		public Node(T data, Node<T> next, Node<T> prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}

	}

}
