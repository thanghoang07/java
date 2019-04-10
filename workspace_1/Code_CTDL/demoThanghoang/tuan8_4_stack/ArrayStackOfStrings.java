package tuan8_4_stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStackOfStrings implements Iterable<String> {
	private String[] a; // holds the items
	private int N; // number of items in stack

	public ArrayStackOfStrings(int max) {
		a = new String[max];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public void push(String item) {
		a[N++] = item;
	}

	public String pop() {
		return a[--N];
	}

	public Iterator<String> iterator() {
		return new ArrayIterator();
	}

	public class ArrayIterator implements Iterator<String> {
		private int i = N - 1;

		public boolean hasNext() {
			return i >= 0;
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			return a[i--];
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]);
		ArrayStackOfStrings stack = new ArrayStackOfStrings(max);
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-"))
				stack.push(item);
			else if (stack.isEmpty())
				System.out.println("BAD INPUT");
			else
				System.out.println(stack.pop() + " ");
		}
		System.out.println();

		// print what's left on the stack
		System.out.println("Left on stack: ");
		for (String s : stack) {
			System.out.println(s + " ");
		}
		System.out.println();
	}
}
