package tuan10;

public class ListSort<T extends Comparable<T>> {
	private Node<T> head;
	private int count;

	public ListSort() {
		head = null;
		count = 0;
	}

	public int size() {
		return count;
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data, head);
		head = newNode;
		count++;
	}

	public void clear() {
		for (int i = 0; i <= count; i++)
			head = null;
		count = 0;
	}

	public void add(T data) {
		if (head == null)
			addFirst(data);
		else {
			Node<T> newNode = new Node<T>(data);
			Node<T> tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
			count++;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void bubbleSort() {
		if (isEmpty())
			System.out.println("\ndanh sach lien ket trong khong the sort");
		else if (head.getNext() == null)
			System.out.println("\ndanh sach lien ket chi co mot phan tu");
		else {
			Node<T> current = head;
			T temp;
			boolean swapDone = true;
			while (swapDone) {
				swapDone = false;
				while (current != null) {
					if (current.getNext() != null && current.getData().compareTo(current.getNext().getData()) > 0) {
						temp = current.getData();
						current.setData(current.getNext().getData());
						current.getNext().setData(temp);
						swapDone = true;
					}
					current = current.getNext();
				}
				current = head;
			} // End swapDone while
		} // End else
	} // End bubbleSort() method

	public void selectionSort() {
		Node<T> i, j, min;
		for (i = head; i != null; i = i.getNext()) {
			min = i;
			for (j = i.getNext(); j != null; j = j.getNext()) {
				if (j.getData().compareTo(min.getData()) < 0)
					min = j;
			}
			if (min != i) {
				T tmp = min.getData();
				min.setData(i.getData());
				i.setData(tmp);

			}
		}
	}
	public Node<T> insertionSortList(Node<T> head) {
		if (head == null)
			return null;
		Node<T> sentinel = new Node(0);
		Node<T> pre = sentinel;
		Node<T> cur = head;
		while (cur != null) {
			Node<T> next = cur.next;
			pre = sentinel;
			while (cur.next != null && cur.next.getData().compareTo(pre.getData()) < 0) {
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;
			cur = next;
		}
		return sentinel.next;
	}

	public String toString() {
		StringBuilder output = new StringBuilder(count);
		Node<T> cur = head;
		if (isEmpty())
			return "[]";
		output.append("[");
		while (cur != null) {
			output.append("|" + cur.getData() + "|");
			cur = cur.getNext();
		}
		return output.append("]").toString();
	}

	public static void main(String[] args) {
		long start = 0, stop = 0, elapsed = 0;
		ListSort<Integer> listInt = new ListSort<>();

		System.out.println("=====bubble Sort=====\n" + "-----------Integer-----------\n"
				+ "Kiem tra danh sach lien ket co rong khong: ");
		System.out.print(listInt.isEmpty() ? "=>danh sach lien ket trong\n" : "=>danh sach lien ket khong trong\n");
		System.out.print("them phan tu vao danh sach lien ket\n");
		listInt.add(-10);
		listInt.add(10000);
		listInt.add(10);
		listInt.add(1000);
		listInt.add(1);
		listInt.addFirst(100);
		System.out.print(listInt.isEmpty() ? "=>danh sach lien ket trong\n" : "=>danh sach lien ket khong trong\n");
		System.out.print("In ra danh sach lien ket ban dau: \n" + listInt.toString());
		start = System.nanoTime();
		
		stop = System.nanoTime();
		System.out.println("\nIn ra danh sach lien ket da xep: \n" + listInt.toString());
		elapsed = stop - start;
		System.out.println(
				"Thoi gian sap xep bubble sort la: " + elapsed + " nanoseconds." + "\nXoa danh sach lien ket tren: ");
		listInt.clear();
		System.out.print(listInt.isEmpty() ? "=>danh sach lien ket trong\n" : "=>danh sach lien ket khong trong\n");
		start = 0;
		stop = 0;
		elapsed = 0;
	}
}
