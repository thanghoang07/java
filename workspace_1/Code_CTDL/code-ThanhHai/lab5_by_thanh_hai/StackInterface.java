package lab5_by_thanh_hai;

public interface StackInterface<E> {
	public int size();
	public boolean isEmpty();
	public E top() throws StackException;
	public void push(E element);
	public E peek();
	public E pop() throws StackException;
	public void clear();
}
