package lab6_queue_by_thang_hoang;

public interface QueueInterface<T>
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
