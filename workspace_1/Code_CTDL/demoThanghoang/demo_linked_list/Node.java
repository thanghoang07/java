package demo_linked_list;

public class Node<T> implements Comparable<T>
{	
	private T data;
	public Node<T> next;

	public Node(T data, Node<T> next)
	{
		this.data = data;
		this.next = next;
	}
	public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
	public Node<T> getNext() 
	{
		return next;
	}
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	@Override
	public int compareTo(T arg)
	{
		if (arg == this.data)
		{
			return 0;
		} 
		else
		{
			return 1;
		}
	}
}
