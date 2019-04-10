package tuan9;

public class _______ListQueue_2222222<T> implements QueueInterfaceArray<T>
{
	private Node1<T> front;
	private Node1<T> back;
	protected int count;
	
	public _______ListQueue_2222222() 
	{
		front = back = null;
		count = 0;
	}	
	public String toString()
	{
		String in = "";
		Node1<T> tmp = front;
		if(isEmpty())
			return "";
		while(tmp != null)
		{
			in += "|" + tmp.getData() + "|";
			tmp = tmp.getNext();
		}
		return "|" + in + "|";
	}


	@Override
	public int size() {
		return count;
	}


	@Override
	public T getFront() {
		if(isEmpty())
			throw new QueueException("....");
		return front.getData();
	}


	@Override
	public boolean isEmpty() {
		return front == null;
	}


	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		front = back = null;
		count = 0;
	}


	@Override
	public void enqueue(T value)
	{		
		Node1<T> newN = back;
		back = new Node1<T>(value, null);
		if(isEmpty())
			back = front;
		else
			newN.next = back;
		count++;
	}


	@Override
	public T dequeue()throws QueueException  {
		if(isEmpty())
			throw new QueueException("....");
		T e = front.getData();
		front = front.next;
		count--;
		return e;
	}


	@Override
	public void doubleSize() {
		// TODO Auto-generated method stub
		
	}
}
