package lab6_by_thanh_hai;

public interface QueueInterface<E> {
	// test if the queue isEmpty
	public boolean isEmpty();

	// Removes and returns the front item
	public E dequeue() throws QueueException;

	// Returns the front item without its removal
	public E getFront() throws QueueException;

	// Inserts an item to the back
	public void enqueue(E e);

	// Removes all items from the Queue
	public void clear();

	// size
	public int size();
}
