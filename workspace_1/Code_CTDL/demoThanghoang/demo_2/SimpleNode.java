package demo_2;

public class SimpleNode {
	private Node value;//gia tri cua Node la mot doi tuong kieu Node
	private SimpleNode next;//Node tiep theo cua danh sach lien ket
	
	/*cac phuong thuc khoi tao*/
	public SimpleNode(){
		value = new Node();
		next = null;
	}
	public SimpleNode(Node value)
	{
		this.value = value;
		next = null;
	}
	/*phuong thuc truy nhap thuoc tinh value*/
	public Node getValue()
	{
		return value;
	}
	/*phuong thuc truy nhap thuoc tinh next*/
	public SimpleNode getNext()
	{
		return next;
	}
	public void setNext(SimpleNode next)
	{
		this.next = next;
	}
}
