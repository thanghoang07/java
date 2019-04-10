package tuan6_linked_list;

public class DoubleNode<T>
{	
	private Node value;
	private DoubleNode<T> prev;
	private DoubleNode<T> next;
	//cac phuong thuc khoi dung
	public DoubleNode()
	{
		this.value = value;
		prev = null;
		next = null;
	}
	public DoubleNode(Node value)
	{
		this.value = value;
		prev = null;
		next = null;
	}
	//phuong thuc truy nhap thuoc tinhs value
	public Node getValue() {
		return value;
	}
	public void setValue(Node value) {
		this.value = value;
	}
	//phuong thuc truy nhap thuoc tinh prev
	public DoubleNode<T> getPrev() {
		return prev;
	}
	public void setPrev(DoubleNode<T> newNode) {
		this.prev = newNode;
	}
	//phuong thuc truy nhap thuoc tinh next
	public DoubleNode<T> getNext() {
		return next;
	}
	public void setNext(DoubleNode<T> doubleNode) {
		this.next = doubleNode;
	}
		
}
