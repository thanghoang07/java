package demo_2_2;

public class HeaderDoubleNode
{
	private int nodeNumber;
	private DoubleNode head;
	private DoubleNode tail;
	//phuong thuc khoi dung
	public HeaderDoubleNode()
	{
		nodeNumber = 0;
		head = null;
		tail = null;
	}
	//phuong thuc truy cap thuoc tinh nodeNumber
	public int getNodeNumber() {
		return nodeNumber;
	}
	public void setNodeNumber(int nodeNumber) {
		this.nodeNumber = nodeNumber;
	}
	//phuong thuc truy cap thuoc tinh head
	public DoubleNode getHead() {
		return head;
	}
	public void setHead(DoubleNode head) {
		this.head = head;
	}
	//phuong thuc truy cap thuoc tinh tail
	public DoubleNode getTail() {
		return tail;
	}
	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}
 }
