package tuan6_linked_list;

public class Node
{
	protected int data;
	protected Node link;
	
	public Node()
	{
		link = null;
		data = 0;		
	}
	public Node(int d, Node n)
	{
		data = d;
		link = n;
	}
	public void setLink(Node n)
	{
		link = n;
	}
	public void setData(int d)
	{
		data = d;
	}
	public Node getLink()
	{
		return link;
	}
	public int getData()
	{
		return data;
	}
}
