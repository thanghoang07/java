package demo_2;

public class HeaderSimpleNode
{
	private int nodeNumber;
	private SimpleNode header;
	private SimpleNode tailer;
	
	/*phuong thuc khoi dung*/
	public HeaderSimpleNode()
	{
		nodeNumber = 0;
		header = null;
		tailer = null;
	}
	/*phuongg thuc truy nhap thuoc tinh nodeNumber*/
	public int getNodeNumber()
	{
		return nodeNumber;
	}
	public void setNodeNumber(int nodeNumber)
	{
		this.nodeNumber = nodeNumber;
	}
	/*phuong thuc truy nhap thuoc tinh header*/
	public SimpleNode getHeader()
	{
		return header;
	}
	public void setHeader(SimpleNode header)
	{
		this.header = header;
	}
	/*phuong thuc truy nhap thuoc tinh tailer*/
	public SimpleNode getTailer()
	{
		return tailer;
	}
	public void setTailer(SimpleNode tailer)
	{
		this.tailer = tailer;
	}
}
