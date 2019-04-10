package lab8_by_Van_Toan;

public class Node<T> {
	public T data;
	public Node<T> next;

	public Node() {
		next = null;
		this.data = data;
	}
	
	public Node(T data) {
		next = null;
		this.data = data;
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
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

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
