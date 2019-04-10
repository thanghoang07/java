package tuan9;

import java.util.Scanner;

public class ListQueue<T> implements QueueInterfaceList<T> {
	protected Node<T> front;
	protected Node<T> back;
	protected static int count;
	private static Scanner nhapVao;

	public ListQueue() {
		front = null;
		back = null;
		count = 0;
	}

	@Override
	public boolean isEmpty() {
		return front == null;
	}

	@Override
	public void enqueue(T e) {
		Node<T> oldTail = back;
		back = new Node<T>(e, null);
		if (isEmpty())
			front = back;
		else
			oldTail.next = back;
		count++;
	}

	@Override
	public T getFront() throws QueueException {
		if (isEmpty())
			throw new QueueException(".....");
		return front.getData();
	}

	@Override
	public T dequeue() throws QueueException {
		if (isEmpty())
			throw new QueueException(".....");
		T data = front.getData();
		front = front.next;
		count--;
		return data;
	}

	@Override
	public void clear() {
		front = back = null;
		count = 0;

	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder(count);
		Node<T> cur = front;
		if (isEmpty())
			return "||";
		output.append("|");
		while (cur != null) {
			output.append("|" + cur.getData() + "|");
			cur = cur.getNext();
		}
		return output + "|";
	}

	/*
	 * public void moveNthFront(int index) { Node<T> prev = null; Node<T> curr =
	 * this.front; // gia su index hop le // kiem tra dieu kien biet dc so node
	 * if (index <= size) { int i = 0; // lap index-1 lan, vi nut can tim tai vi
	 * tri nay while (i < index - 1) { prev = curr; curr = curr.next; i++; } if
	 * (prev != null) { // tranh truong hop queue co 1 node prev.next =
	 * curr.next; curr.next = this.front; this.front = curr; } } else {
	 * System.out.println("Vi tri khong hop le"); } }
	 */
	public void moveNthFront(ListQueue<T> list, int n) {
		ListQueue<T> tmp = new ListQueue<>();
		T val = null;
		int count = 1;

		while (!list.isEmpty()) {
			if (count == n) {
				val = (T) list.dequeue();
				count++;
			} else {
				tmp.enqueue(list.dequeue());
				count++;
			}
		}
		list.enqueue(val);

		while (!tmp.isEmpty()) {
			list.enqueue(tmp.dequeue());
		}
	}
	public static void main(String[] args) {
		ListQueue<Integer> bai2_2 = new ListQueue<>();
		bai2_2.enqueue(5);
		bai2_2.enqueue(11);
		bai2_2.enqueue(34);
		bai2_2.enqueue(67);
		bai2_2.enqueue(43);
		bai2_2.enqueue(55);
		System.out.print("nhap vao vi tri can chuyen: ");
		nhapVao = new Scanner(System.in);
		int a = nhapVao.nextInt();
		if (a <= count) {
			System.out.println("danh sach ban dau: \n" + bai2_2);
			bai2_2.moveNthFront(bai2_2, a);
			System.out.println("danh sach sau khi chuyen: \n" + bai2_2);
		} else {
			System.out.println("vi tri khong hop le");
		}
	}
}
