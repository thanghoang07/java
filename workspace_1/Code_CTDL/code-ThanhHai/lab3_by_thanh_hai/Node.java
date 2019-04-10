package lab3_by_thanh_hai;

public class Node<T> {
	T data;
	Node<T> next;

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public String toString() {
		return data + " ";
	}
}
