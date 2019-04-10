package lab3_by_thanh_hai;

public class LinkedList<T> implements LinkedListInteface<T> {
	protected Node<T> head;
	private int count;

	public LinkedList() {
		head = null;
	}

	public void create() {
		LinkedList<T> linkedList = new LinkedList<T>();
	}

	public T get(int index) {
		Node<T> current = head;
		count = 1;
		if (head == null) {
			return null;
		} else if (index > size() || index < 0) {
			return null;
		}

		else {
			while (current != null) {
				count++;
				current = current.next;
			}
			return current.getData();
		}
	}

	public int size() {
		Node<T> tmp = head;
		int count = 1;
		while (tmp != null) {
			count++;
			tmp = tmp.next;
		}
		return count;
	}

	public void addFirst(T item) {
		Node<T> newNode = new Node<T>(item, head);
		head = newNode;
	}

	public void addLast(T item) {
		if (head == null) {
			addFirst(item);
		} else {
			Node<T> newNode = new Node<T>(item, null);
			Node<T> tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
				tmp.next = newNode;

			}
		}
	}

	public void addNode(T item, int index) {
		int count = 1;
		Node<T> current = head;
		if (head == null || index <= 1) {
			addFirst(item);
		} else if (index > size()) {
			addLast(item);
		} else
			while (current != null) {
				count++;
				if (count == index) {
					Node<T> newNode = new Node<T>(item, current.next);
					current.next = newNode;
				}

				current = current.next;

			}
	}

	public void set(T obj, int index) {
		Node<T> curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		curr.data = obj;
	}

	public void insertAfter(T key, T toInsert) {
		Node<T> tmp = head;
		while (tmp != null && !tmp.getData().equals(key))
			tmp = tmp.next;
		if (tmp != null) {
			tmp.next = new Node<T>(toInsert, tmp.next);
		}
	}

	public void insertBefore(T key, T toInsert) {
		if (head == null) {
			return;
		}
		if (head.getData().equals(key)) {
			addFirst(toInsert);
			return;
		}
		Node<T> prev = null;
		Node<T> cur = head;
		while (cur != null && !cur.getData().equals(key)) {
			prev = cur;
			cur = cur.next;
		}
		if (cur != null) {
			prev.next = new Node<T>(toInsert, cur);
		}
	}

	public void remove(T key) {
		if (head == null)
			throw new RuntimeException("Cannot delete");
		if (head.getData().equals(key)) {
			head = head.next;
			return;
		}
		Node<T> cur = head;
		Node<T> prev = null;
		while (cur != null && !cur.getData().equals(key)) {
			prev = cur;
			cur = cur.next;
		}
		if (cur == null)
			throw new RuntimeException("Cannot delete");
		prev.next = cur.next;
	}

	// public void remove(T key) {
	// Node<T> preveNode = null;
	// Node<T> currNode = head;
	// if(head.data == key){
	// head = head.next;
	// return;
	// }
	// while(currNode != null && currNode.data != key){
	// preveNode = currNode;
	// currNode=currNode.next;
	// }
	// if(currNode == null){
	// System.out.println("A node with that value does not exist.");
	// }else{
	// preveNode.next = currNode.next;
	// }
	//
	// }

	public int count(T x) {
		int i = 0;
		Node<T> tmp = head;
		while (tmp != null) {
			if (tmp.getData().equals(x) && (tmp != null)) {
				i++;
			}
			tmp = tmp.next;
		}

		return i;
	}

	public String toString() {
		String str = "LinkedList: " + "   ";
		Node<T> test = head;
		while (test != null) {
			str += test.getData() + "; ";
			test = test.getNext();
		}
		return str;
	}
}
