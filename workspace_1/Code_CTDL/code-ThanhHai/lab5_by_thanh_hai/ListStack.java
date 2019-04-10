package lab5_by_thanh_hai;

public class ListStack<T> implements StackInterface<T> {
	private Node<T> top;
	protected int size;

	public ListStack() {
		top = null;
		size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public T top() throws StackException {
		if (isEmpty())
			throw new StackException("Stack is empty");
		return top.data;
	}

	public void push(T data) {
		top = new Node<T>(data, top);
		size++;
	}

	public T peek() {
		if (isEmpty())
			throw new StackException("Stack is empty");
		return top.data;
	}

	public T pop() throws StackException {
		if (isEmpty())
			throw new StackException("Stack is empty");
		T data = top.data;
		top = top.next;
		size--;
		return data;

	}

	public void clear() {
		top = null;

	}

	public String toString() {
		StringBuilder stb = new StringBuilder("[");
		int i = size;
		if (isEmpty()) {
			stb.append("Stack rong!");
		} else {
			Node<T> rest = top;
			stb.append(rest.data);
			rest = rest.next;
			for (; rest != null; rest = rest.next) {
				stb.append(" , " + rest.data);
			}
		}
		stb.append("]");
		return stb.toString();
	}

}
