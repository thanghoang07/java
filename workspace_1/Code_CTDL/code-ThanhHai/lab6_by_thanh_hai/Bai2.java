package lab6_by_thanh_hai;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		ListQueue<Integer> listQueueInteger = new ListQueue<Integer>();
		Scanner sc = new Scanner(System.in);

		listQueueInteger.enqueue(5);
		listQueueInteger.enqueue(11);
		listQueueInteger.enqueue(34);
		listQueueInteger.enqueue(67);
		listQueueInteger.enqueue(43);
		listQueueInteger.enqueue(55);

		System.out.print("-Queue ban dau:");
		System.out.print("\n queue = " + listQueueInteger.print());
		System.out.print("\n-Nhap vi tri phan tu can chuyen: ");
		int n = sc.nextInt();
		listQueueInteger.moveNthFront(n);
		System.out.println("-Queue sau khi di chuyen phan tu vi tri thu " + n
				+ " thi:");
		System.out.println(" queue = " + listQueueInteger.print());
	}
}
