package lab5_by_thanh_hai;

public class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(T data){
		this(data, null);
	}
	public Node(T data, Node<T> n) {
		this.data = data;
		this.next = n;
	}
	
	
}
