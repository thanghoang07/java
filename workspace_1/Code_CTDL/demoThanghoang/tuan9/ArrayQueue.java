package tuan9;

import java.util.Scanner;

public class ArrayQueue<T> implements QueueInterfaceArray<T> {
	private static final int ADS = 10;
	private int maxQueueSize, count = 0;
	protected int queueFront, queueRear;
	private T[] Mang;
	private static Scanner nhapVao;

	public ArrayQueue() {
		maxQueueSize = ADS;
		Mang = (T[]) new Object[ADS];
		queueRear = -1;
		queueFront = 0;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public boolean isFull() {
		return count == maxQueueSize;
	}

	@Override
	public void clear() {
		for (int i = 0; i < maxQueueSize; i++) {
			Mang[i] = null;
		}
		count = 0;
		queueRear = -1;
		queueFront = 0;
	}

	@Override
	public void enqueue(T value) {
		if (isFull())
			doubleSize();
		queueRear++;
		Mang[queueRear % maxQueueSize] = value;
		count++;
	}

	public void doubleSize() {
		Mang = (T[]) new Object[2 * ADS];
	}

	@Override
	public T dequeue() throws QueueException {
		T e = getFront();
		Mang[queueFront % maxQueueSize] = null;
		queueFront++;
		count--;
		return e;
	}

	public T getFront() throws QueueException {
		if (isEmpty())
			return null;
		return Mang[0];
	}

	public String toString() {
		StringBuilder out = new StringBuilder();
		if (isEmpty())
			out.append("||");
		for (int i = 0; i < maxQueueSize; i++) {
			if (Mang[i] != null)
				out.append("|" + Mang[i] + "|");
		}
		return "|" + out.toString() + "|";
	}	
	/*public static void move(int[] mang, int key)
	{
		int i, tem;
		for (i = 0; i < mang.length; i++)
		{
			key = mang[i];			
		}
		mang[q]
	}*/
	public void move1(int n)
	{
		T tam = Mang[n- 1];
		for (int i = n - 1; i > queueFront; i--)
		{
			Mang[i] = Mang[i - 1];
		}
		Mang[queueFront] = tam;
	}
	public static void main(String[] args)
	{
		ArrayQueue<Integer> bai2 = new ArrayQueue<>();
		bai2.enqueue(5);
		bai2.enqueue(11);
		bai2.enqueue(34);
		bai2.enqueue(67);
		bai2.enqueue(43);
		bai2.enqueue(55);
		System.out.println("nhap vao vi tri can chuyen: ");
		nhapVao = new Scanner(System.in);
		int a = nhapVao.nextInt();
		System.out.println(bai2);
		bai2.move1(a);
		System.out.println(bai2);		
	}
}
