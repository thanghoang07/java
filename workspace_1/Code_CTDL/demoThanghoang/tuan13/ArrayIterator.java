package tuan13;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
	private int count;// the number of elements in the collection
	private int current;// the current position in the iteration
	private T[] items;

	// Sets up this iterator using the specified items.
	public ArrayIterator(T[] collection, int size) {
		items = collection;
		count = size;
		current = 0;
	}

	// Returns true if this iterator has at least one more
	// element to deliver in the iteraion.
	public boolean hasNext() {
		return (current < count);
	}

	// Returns the next element in the iteration. If there
	// are no more elements in this iteration,
	// a NoSuchElementException is thrown
	public T next() {
		if (!hasNext())
			throw new NoSuchElementException();
		current++;
		return items[current - 1];
	}

	// The remove operation is not supported in this collection.
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
}
