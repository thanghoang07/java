package demo_3_collection;

public class Node<T> implements Comparable<T> {

	private T value;

	private Node<T> nextRef;

	public T getValue() {

		return value;

	}

	public void setValue(T value) {

		this.value = value;

	}

	public Node<T> getNextRef() {

		return nextRef;

	}

	public void setNextRef(Node<T> ref) {

		this.nextRef = ref;

	}

	@Override

	public int compareTo(T arg) {

		if (arg == this.value) {

			return 0;

		} else {

			return 1;

		}

	}

}

