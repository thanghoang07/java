package lab5_stack_by_thang_hoang;

public interface StackInterface<T> 
{
	public int size();
	public boolean isEmpty();  
	public T top() throws StackException;  
	public void push(T element);  
	public T pop() throws StackException;  
	public void clear();  
}
