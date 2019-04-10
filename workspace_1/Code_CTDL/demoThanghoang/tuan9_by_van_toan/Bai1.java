package tuan9_by_van_toan;

import java.util.Scanner;
import javax.print.attribute.Size2DSyntax;

public class Bai1 {
	public static void main(String[] args) {

		System.out.println("<<ARRAY QUEUE>>");
		ArrayQueue<Integer> queueInt = new ArrayQueue<Integer>();

		queueInt.enqueue(5);
		queueInt.enqueue(1);
		queueInt.enqueue(4);
		queueInt.enqueue(1);
		queueInt.enqueue(3);
		queueInt.enqueue(2);

		System.out.println(queueInt.toString());
		System.out.println("1. Mảng số nguyên: ");
		System.out.println(queueInt.isEmpty() ? "\tMang trống" : "\tMảng không trống");
		System.out.println("\tFront là: " + queueInt.getFront());
		System.out.println("\tLấy ra Front và xóa Front : " + queueInt.dequeue());
		queueInt.clear();
		System.out.println("Mảng sau khi xóa : " + queueInt.toString());

		ArrayQueue<String> queueString = new ArrayQueue<String>();

		queueString.enqueue("toan");
		queueString.enqueue("khoa");
		queueString.enqueue("dh14dtb");
		queueString.enqueue("hoc");
		queueString.enqueue("hanh");
		queueString.enqueue("thang");
		queueString.enqueue("thien");
		queueString.enqueue("thao");

		System.out.println("2. Mảng String: ");
		System.out.println(queueString.toString());
		System.out.println(queueString.isEmpty() ? "\tMang trống" : "\tMảng không trống");
		System.out.println("\tFront là: " + queueString.getFront());
		System.out.println("\tLấy ra Front và xóa Front : " + queueString.dequeue());
		queueString.clear();
		System.out.println("Mảng sau khi xóa : " + queueInt.toString());

		ArrayQueue<Double> queueDouble = new ArrayQueue<Double>();

		queueDouble.enqueue(5.2);
		queueDouble.enqueue(1.8);
		queueDouble.enqueue(4.7);
		queueDouble.enqueue(1.4);
		queueDouble.enqueue(3.1);
		queueDouble.enqueue(2.9);
		queueDouble.enqueue(10.0);

		System.out.println("3. Mảng số thực: ");
		System.out.println(queueDouble.toString());
		System.out.println(queueDouble.isEmpty() ? "\tMang trống" : "\tMảng không trống");
		System.out.println("\tFront là: " + queueDouble.getFront());
		System.out.println("\tLấy ra Front và xóa Front : " + queueDouble.dequeue());
		queueDouble.clear();
		System.out.println("Mảng sau khi xóa : " + queueInt.toString());

		System.out.println("<<LINKEDLIST QUEUE>>");
		LinkedListQueue<Integer> linkedListInt = new LinkedListQueue<Integer>();

		linkedListInt.enqueue(5);
		linkedListInt.enqueue(1);
		linkedListInt.enqueue(4);
		linkedListInt.enqueue(1);
		linkedListInt.enqueue(3);
		linkedListInt.enqueue(2);

		System.out.println("1. Danh sách liên kết số nguyên: ");
		System.out.println(linkedListInt.toString());
		System.out.println(linkedListInt.isEmpty() ? "\tDanh sách liên kết trống" : "\tDanh sách liên kết không trống");
		System.out.println("\tFront là: " + linkedListInt.getFront());
		System.out.println("\tLấy ra Front và xóa Front : " + linkedListInt.dequeue());
		System.out.println(linkedListInt.toString());
		linkedListInt.clear();
		System.out.println(linkedListInt.toString());

		LinkedListQueue<String> linkedListString = new LinkedListQueue<String>();

		linkedListString.enqueue("toan");
		linkedListString.enqueue("khoa");
		linkedListString.enqueue("dh14dtb");
		linkedListString.enqueue("hoc");
		linkedListString.enqueue("hanh");
		linkedListString.enqueue("thang");
		linkedListString.enqueue("thien");
		linkedListString.enqueue("thao");

		System.out.println("2. Danh sách liên kết String: ");
		System.out.println(linkedListString.toString());
		System.out.println(
				linkedListString.isEmpty() ? "\tDanh sách liên kết trống" : "\tDanh sách liên kết không trống");
		System.out.println("\tFront là: " + linkedListString.getFront());
		System.out.println("\tLấy ra Front và xóa Front : " + linkedListString.dequeue());
		System.out.println(linkedListString.toString());
		linkedListString.clear();
		System.out.println(linkedListString.toString());

		LinkedListQueue<Double> linkedListDouble = new LinkedListQueue<Double>();

		linkedListDouble.enqueue(5.2);
		linkedListDouble.enqueue(1.8);
		linkedListDouble.enqueue(4.7);
		linkedListDouble.enqueue(1.4);
		linkedListDouble.enqueue(3.1);
		linkedListDouble.enqueue(2.9);
		linkedListDouble.enqueue(10.0);

		
		System.out.println("3. Danh sách liên kết số thực: ");
		System.out.println(linkedListDouble.toString());
		System.out.println(
				linkedListDouble.isEmpty() ? "\tDanh sách liên kết trống" : "\tDanh sách liên kết không trống");
		System.out.println("\tFront là: " + linkedListDouble.getFront());
		System.out.println("\tLấy ra Front và xóa Front : " + linkedListDouble.dequeue());
		System.out.println(linkedListDouble.toString());
		linkedListDouble.clear();
		System.out.println(linkedListDouble.toString());
	}
}
