package tuan6_linked_list;

public class Node1
{
	Node1 next;
	Object data;

	public Node1(Object data)
	{
	    this(data, null);
	}
	public Node1(Object data, Node1 next) 
	{
	    this.next = next;
	    this.data = data;
	}
	public Object getData()
	{
	    return this.data;
	}
	public void setData(Object data)
	{
	    this.data = data;
	}
	public Node1 getNext()
	{
	    return this.next;
	}
	public void setNext(Node1 nextNode)
	{
	    this.next = nextNode;
	}

}
