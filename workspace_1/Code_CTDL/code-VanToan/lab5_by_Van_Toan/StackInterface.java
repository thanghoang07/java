package lab5_by_Van_Toan;

import lab6_by_Van_Toan.QueueException;

public interface StackInterface<E> {
	public int size();

	public boolean isEmpty();

	public E top() throws QueueException;

	public void push(E element);

	public E pop() throws QueueException;

	public void clear();
}
