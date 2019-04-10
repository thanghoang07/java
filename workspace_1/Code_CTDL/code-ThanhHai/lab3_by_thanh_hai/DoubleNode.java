package lab3_by_thanh_hai;

public class DoubleNode<T> {
	T data;
	DoubleNode<T> next;
	DoubleNode<T> prev;
	public DoubleNode(T data, DoubleNode<T> next, DoubleNode<T> prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	public DoubleNode(T data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	public T getData(){
		return data;
	}
	public void setData(){
		this.data = data;
	}
	public DoubleNode<T> getNext(){
		return next;
	}
	public void setNext(DoubleNode<T> next){
		this.next = next;
	}
	public void setPrev(DoubleNode<T> prev){
		this.prev = prev;
	}
	public String toString(){
		return data + " ";
	}
}
