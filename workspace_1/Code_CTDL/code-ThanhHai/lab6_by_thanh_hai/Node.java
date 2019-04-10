package lab6_by_thanh_hai;

public class Node<T> {
	public T data;
	public Node<T> next;

	public Node(T data) {
		this(data, null);
	}

	public Node(T data, Node<T> n) {
		this.data = data;
		this.next = n;
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

}
