package demo_2_2;

public class DoubleNode
{	
	private Node value;
	private DoubleNode prev;
	private DoubleNode next;
	//cac phuong thuc khoi dung
	public DoubleNode()
	{
		value = new Node(null);
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
	public DoubleNode getPrev() {
		return prev;
	}
	public void setPrev(DoubleNode newNode) {
		this.prev = newNode;
	}
	//phuong thuc truy nhap thuoc tinh next
	public DoubleNode getNext() {
		return next;
	}
	public void setNext(DoubleNode doubleNode) {
		this.next = doubleNode;
	}
		
}
