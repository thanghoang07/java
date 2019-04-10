package lab3_by_Van_Toan;

public interface InterfaceLinkedList<T> {
	public T get(int index);

	public void set(int index, T data);

	public void addFirst(T data);

	public void addLast(T data);

	public void add(T data);

	public void add(int index, T data);

	public void remove(T data);

	public int size();

	public int count(T data);

	public String toString();
}
