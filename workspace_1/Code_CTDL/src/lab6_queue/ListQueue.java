package lab6_queue;

import java.util.Scanner;

public class ListQueue<T> implements QueueInterface<T>
{
	protected Node<T> front;
	protected Node<T> back;
	protected static int count;
	private static Scanner nhapVao;

	public ListQueue()
	{
		front = null;
		back = null;
		count = 0;
	}
	@Override
	public boolean isEmpty()
	{
		return front == null;
	}
	@Override
	public void enqueue(T e)
	{
		Node<T> oldTail = back;
		back = new Node<T>(e, null);
		if (isEmpty())
			front = back;
		else
			oldTail.next = back;
		count++;
	}
	@Override
	public T getFront() throws QueueException 
	{
		if (isEmpty())
			throw new QueueException(".....");
		return front.getData();
	}
	@Override
	public T dequeue() throws QueueException
	{
		if (isEmpty())
			throw new QueueException(".....");
		T data = front.getData();
		front = front.next;
		count--;
		return data;
	}
	@Override
	public void clear()
	{
		front = back = null;
		count = 0;

	}
	@Override
	public String toString()
	{
		StringBuilder output = new StringBuilder(count);
		Node<T> cur = front;
		if (isEmpty())
			return "||";
		output.append("|");
		while (cur != null)
		{
			output.append("|" + cur.getData() + "|");
			cur = cur.getNext();
		}
		return output + "|";
	}
	@Override
	public int size() {
		return count;
	}
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void doubleSize() {
		// TODO Auto-generated method stub
		
	}
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
