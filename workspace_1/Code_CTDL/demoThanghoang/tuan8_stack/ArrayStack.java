package tuan8_stack;

public class ArrayStack<T> 
 	implements StackInterface<T>
{
	private static final int ASD = 15;
	private int top;
	private T[] A;
	
	public ArrayStack(int capacity)
	{
		if(capacity <= 0)
			A = (T[]) new Object[ASD];
		else
			A = (T[]) new Object[capacity];
		top = -1;
	}
	@Override
	public int size() 
	{
		return(top + 1);
	}

	@Override
	public boolean isEmpty()
	{
		return top == -1;
	}

	@Override
	public T top() throws StackException 
	{
		if(isEmpty())  
			throw new StackException(".....");  
		return A[top]; 
	}

	@Override
	public void push(T e)
	{
		if(top == A.length)
			throw new StackException(".....");
		top++;
		A[top] = e;
		
	}
	public T peek()
	{
		if(isEmpty())
			throw new StackException(".....");
		return A[top];
	}
	@Override
	public T pop() throws StackException {
		
		T x = peek();
		A[top] = null; // make sure the object is destroyed  
		top--;  
		return x; 
	}

	@Override
	public void clear() {
		for(int i = 0; i <= top; i++)
			A[i] = null;
		top = -1;
	}
	public String toString()
	{
		String in = "";
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] != null)
				in += "|" +A[i] +"|";
		}
		return "[" + in + "]";
	}
}
