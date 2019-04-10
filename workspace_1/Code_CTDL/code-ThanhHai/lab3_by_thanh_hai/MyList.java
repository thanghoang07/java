package lab3_by_thanh_hai;

public class MyList<T> {
	protected Node<T> head;

	public MyList() {
		head = null;
	}

	public void addFirst(T item) {
		head = new Node(item, head);
	}

	public void addLast(T item) {
		if (head == null) 
			addFirst(item);
		else {
			Node<T> tmp = head;
			while (tmp.next != null) 
				tmp = tmp.next;
				tmp.next = new Node(item, null);
			
		}
	}

	public void addNode(T item, int index) {
		Node<T> tmp = head;
		int i = 1;
		if (head == null || index <= 1)
			addFirst(item);
		else if (index > size())
			addLast(item);
		else
			while (tmp != null) {
				i++;
				if (i == index) {
					Node<T> newNode = new Node(item, tmp.next);
					tmp.next = newNode;
					break;
				}
				tmp = tmp.next;
			}

	}

	public void divideAt(MyList<T> otherList, T item) {
		if (head == null)
			return;
		else {
			Node<T> tmp = head;
			while (tmp != null) {
				if (tmp.next.getData() == item) {
					Node<T> tmp1 = tmp.next;
					while (tmp1 != null) {
						otherList.addNode(tmp1.getData(), size());
						tmp1 = tmp1.next;
					}
					tmp.next = null;
				}
				tmp = tmp.next;
			}
		}
	}

	public String toString() {
		String str = " ";
		Node<T> tmp = head;
		while (tmp != null) {
			str += tmp.getData() + "\t";
			tmp = tmp.next;
		}
		return str;
	}

	public int size() {
		Node<T> tmp = head;
		int count = 0;
		while (tmp != null) {
			count++;
			tmp = tmp.next;
		}
		return count;
	}

}
