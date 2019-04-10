package tuan8_stack;

public class ListStack<T> implements StackInterface<T>
{
	private Node<T> top;
	protected int size;
	
	public ListStack() 
	{
		top = null;
		size = 0;
	}
	
	@Override
	public int size()
	{
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return top == null;
	}

	@Override
	public T top() throws StackException 
	{
		if (isEmpty())
			throw new StackException("......");  
		return top.data;		
	}

	@Override
	public void push(T data)
	{
		top = new Node<T>(data, top);	
		size++;
	}

	@Override
	public T pop() throws StackException {
		if(isEmpty())
			throw new StackException(".....");
		T data = top.data;
		top = top.next;
		size--;
		return data;
	}

	@Override
	public void clear() 
	{
		top = null;	
		size = 0;
	}
	public T peek()
	{
		if(isEmpty())
			throw new StackException(".....");
		return top.data;
	}
	public String toString()
	{
		String in = "";
		Node<T> tmp = top;
		if(isEmpty())
			return "[]";
		while(tmp != null)
		{
			in += "|" + tmp.getData() + "|";
			tmp = tmp.getNext();
		}
		return "[" + in + "]";
	}
}
