package tuan11;

public class LinkedList<T> implements InterfaceLinkedList<T> {
	protected Node<T> head;
	protected int size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	@Override
	public T get(int index) {
		if ((index < 0 || index > size()))
			System.out.printf("\nVị trí %d không thuộc danh sách", index);
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
		Node<T> newNode = new Node<T>(data, head);
		head = newNode;
		size++;
	}

	@Override
	public void addLast(T data) {
		if (head == null)
			addFirst(data);
		else {
			Node<T> newNode = new Node<T>(data, null);
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
			Node<T> newNode = new Node<T>(data);
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
			// duyệt danh sách
			Node<T> prev = head;
			for (int i = 1; i < index; i++) {
				prev = prev.next;
			}
			// tạo 1 node và next() của prev sẽ tham chiếu tới tmp
			Node<T> tmp = prev.next;
			// gán một cái node mới tới prev.next()
			prev.next = new Node<T>(data, null);
			// sau đó gán next của prev.next() cho tmp
			(prev.next).next = tmp;
			size++;
		}

	}

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

	public void divideAt(LinkedList<T> otherList, T key) {
		Node<T> curr = head;
		while ((curr.next != null) && (!curr.next.getData().equals(key)))
			curr = curr.next;
		Node<T> tmp = curr.next;
		if (tmp.getData().equals(key))
			curr.setNext(null);
		while (tmp != null) {
			otherList.addLast(tmp.getData());
			tmp = tmp.next;
		}
	}

	/*public static SinhVien find(LinkedList<SinhVien> list, String name) {
		Node<SinhVien> tmp = list.head;
		while (tmp != null) {
			if (tmp.getData().getHoTen().equals(name)) {
				return tmp.getData();
			}
			tmp = tmp.next;
		}
		return null;
	}*/

}
