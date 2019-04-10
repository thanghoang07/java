package lab3_by_thanh_hai;

public interface DoublyLinkedListInterface<T> {
	public void create();
	public T get(int index);
	public void set(T object, int index);
	public void addNode(T item, int index);
	public void remove(T key);
	public int size();
	public int count(T x);
}
