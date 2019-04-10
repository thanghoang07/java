package tuan9;

public interface QueueInterfaceArray<T>
{
	public int size();	
	public T getFront()throws QueueException;	
	public boolean isEmpty();	
	public boolean isFull();	
	public void clear();	
	public void enqueue(T value);	
	public T dequeue() throws QueueException;	
	public void doubleSize();
}
