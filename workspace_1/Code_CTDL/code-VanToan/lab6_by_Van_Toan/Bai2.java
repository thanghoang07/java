package lab6_by_Van_Toan;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vi tri thu n can chuyen: ");
		int n = in.nextInt();
		ArrayQueue<Integer> test = new ArrayQueue<>();
		test.enqueue(5);
		test.enqueue(11);
		test.enqueue(34);
		test.enqueue(67);
		test.enqueue(43);
		test.enqueue(55);

		// Phuong thuc moveNthFront viet tren array
		System.out.println("Truoc: " + test);
		test.moveNthFront(n);
		System.out.println("Sau: " + test);
		System.out.println("-----------------");
		
		LinkedListQueue<Integer> test1 = new LinkedListQueue<>();
		test1.enqueue(5);
		test1.enqueue(11);
		test1.enqueue(34);
		test1.enqueue(67);
		test1.enqueue(43);
		test1.enqueue(55);
		// Phuong thuc moveNthFront viet tren linkedlist
		System.out.println("Truoc: " +test1);
		test1.moveNthFront(test1, n);
		System.out.println("Sau: " + test1);
	}
}
