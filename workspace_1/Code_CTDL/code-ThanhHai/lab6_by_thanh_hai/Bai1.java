package lab6_by_thanh_hai;

//import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) throws QueueException {
		// test ArrayQueue
		ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayQueue.enqueue(i);
		}
		// arrayQueue.clear();
		System.out.print("\nMang A la: " + arrayQueue.toString());
		System.out.print("\nsize:" + arrayQueue.size());
		System.out.print("\n-Sau khi lay phan tu thi: ");
		for (int j = 0; j < 5; j++) {
			arrayQueue.dequeue();
		}
		System.out.print("\nMang A la: " + arrayQueue.toString());
		System.out.print("\nsize:" + arrayQueue.size());

		// System.out.print("\nsize:" + arrayQueue.size());

		// test ListQueue
		ListQueue<String> listQueue = new ListQueue<String>();
		listQueue.enqueue("Google");
		listQueue.enqueue("Facebook");
		listQueue.enqueue("Zalo");
		listQueue.enqueue("FireFox");
		listQueue.enqueue("Gmail");
		System.out.print("\nDanhSach: " + listQueue.toString());
		System.out.print("\nSize: " + listQueue.size);
		for (int i = 0; i < 3; i++) {
			listQueue.dequeue();
		}
		System.out.print("\n-Sau khi lay phan tu trong danh sach thi: ");
		System.out.print("\nDanhSach: " + listQueue.toString());
		System.out.print("\nSize: " + listQueue.size);

	}
}
