package lab6_by_thanh_hai;

import lab6_by_thanh_hai.Node;
import lab6_by_thanh_hai.QueueException;

public class ListQueue<T> implements QueueInterface<T> {
	private Node<T> front;
	private Node<T> rear;
	protected int size;

	public ListQueue() {
		front = rear = null;
		size = 0;
	}

	public boolean isEmpty() {

		return (front == null);
	}

	public T dequeue() throws QueueException {
		T info = null;
		if (isEmpty()) {
			throw new QueueException("Queue is empty");
		} else {
			info = front.data;
			front = front.next;
			size--;
		}
		return info;

	}

	public T getFront() throws QueueException {
		T info = null;
		if (isEmpty()) {
			throw new QueueException("Queue is empty");
		} else {
			info = front.data;
		}
		return info;

	}

	public void enqueue(T e) {
		Node<T> node = new Node<T>(e);
		if (isEmpty()) {
			front = node;
			rear = node;
			size++;

		} else {
			rear.next = node;
			rear = node;
			size++;

		}
	}

	public void clear() {
		front = rear = null;
		size = 0;
	}

	public int size() {

		return size;
	}

	// phuong thuc di chuyen phan tu thu n cua Queue toi phia truoc
	public void moveNthFront(int index) {
		Node<T> prev = null;
		Node<T> curr = this.front;
		// gia su index hop le
		// kiem tra dieu kien biet dc so node
		if (index <= size) {
			int i = 0;
			// lap index-1 lan, vi nut can tim tai vi tri nay
			while (i < index - 1) {
				prev = curr;
				curr = curr.next;
				i++;
			}
			if (prev != null) { // tranh truong hop queue co 1 node
				prev.next = curr.next;
				curr.next = this.front;
				this.front = curr;
			}
		} else {
			System.out.println(" <> Vi tri khong hop le");
		}

	}

	public String toString() {
		StringBuilder stb = new StringBuilder("[");
		if (isEmpty()) {
			stb.append("Queue is Empty");
		} else {
			Node<T> rest = front;
			stb.append(rest.data);
			rest = rest.next;
			for (; rest != null; rest = rest.next) {
				stb.append(", " + rest.data);
			}
		}
		stb.append("]");
		return stb.toString();

	}

	public String print() {
		StringBuilder stb = new StringBuilder("{");
		Node<T> rest = front;
		stb.append(rest.data);
		rest = rest.next;
		for (; rest != null; rest = rest.next) {
			stb.append(", " + rest.data);
		}
		stb.append("}");
		return stb.toString();
	}

}
