package tuan9;

public class MoveToFront {
	private Node first;

	private static class Node {
		private char item;
		private Node next;

		public Node(char item, Node next) {
			this.item = item;
			this.next = next;
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	// delete node with given item if it exists, and return location
	private Node delete(Node x, char item) {
		if (x == null)
			return null;
		if (x.item == item)
			return x.next;
		x.next = delete(x.next, item);
		return x;
	}

	// return location of item, or 0 if not found
	private int find(char item) {
		int i = 1;
		for (Node x = first; x != null; x = x.next) {
			if (x.item == item)
				return i;
			i++;
		}
		return 0;
	}

	// add item, moving it to the front
	int add(char item) {
		int location = find(item);
		first = delete(first, item);
		first = new Node(item, first);
		return location;
	}

	// a test client
	public static void main(String[] args) {
		MoveToFront mtf = new MoveToFront();
		String s = "123456";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.print(mtf.add(c) + " ");
		}
		System.out.println();
	}

}
