package tuan1;

public interface Buffer<E> {
	// producere call this method
	public void insert(E item);
	// consumers call this method
	public E remote();
}
