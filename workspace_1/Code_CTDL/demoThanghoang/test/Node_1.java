package test;

public class Node_1<T> {
	private T data;
	Node_1<T> next;
	
	public Node_1(T data)
	{
		this.data = data;
	}
	
	public Node_1(T data, Node_1<T> next)
	{
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node_1<T> getNext() {
		return next;
	}

	public void setNext(Node_1<T> next) {
		this.next = next;
	}
	public void display() {
		System.out.print(data + " ");
	}

}
