package lab3_linked_list_by_thang_hoang;

public class Node<T> 
{
	private T data;
	Node<T> next;
	
	public Node(T data)
	{
		this.data = data;
	}
	
	public Node(T data, Node<T> next)
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

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	public void display() {
		System.out.print(data + " ");
	}
}
