package lab5_by_Van_Toan;

import java.util.Scanner;
import javax.print.attribute.Size2DSyntax;

public class Bai1 {
	public static void main(String[] args) {
		int cap = 10;
		System.out.println("<<ARRAY STACK>>");
		ArrayStack<Integer> stackInt = new ArrayStack<Integer>(cap);

		stackInt.push(5);
		stackInt.push(1);
		stackInt.push(4);
		stackInt.push(1);
		stackInt.push(3);
		stackInt.push(2);
		
		System.out.println(stackInt.toString());
		System.out.println("1. Mảng số nguyên: ");
//		stackInt.daoMang(stackInt);
		System.out.println(stackInt.toString());
		System.out.println("\tSize : " + stackInt.size());
		System.out.println(stackInt.isEmpty() ? "\tMang trống" : "\tMảng không trống");
		System.out.println("\tTop là: " + stackInt.top());
		System.out.println("\tLấy ra top và xóa top : " + stackInt.pop());
		System.out.println("\t�?ộ dài mảng sau khi xóa top : " + stackInt.size());
		stackInt.clear();
		System.out.println("\t�?ộ dài mảng sau khi clear : " + stackInt.size());

		ArrayStack<String> stackString = new ArrayStack<String>(cap);

		stackString.push("toan");
		stackString.push("khoa");
		stackString.push("dh14dtb");
		stackString.push("hoc");
		stackString.push("hanh");
		stackString.push("thang");
		stackString.push("thien");
		stackString.push("thao");

		System.out.println("2. Mảng String: ");
		System.out.println(stackString.toString());
		System.out.println("\tSize : " + stackString.size());
		System.out.println(stackString.isEmpty() ? "\tMang trống" : "\tMảng không trống");
		System.out.println("\tTop là: " + stackString.top());
		System.out.println("\tLấy ra top và xóa top : " + stackString.pop());
		System.out.println("\t�?ộ dài mảng sau khi xóa top : " + stackString.size());
		stackString.clear();
		System.out.println("\t�?ộ dài mảng sau khi clear : " + stackString.size());

		ArrayStack<Double> stackDouble = new ArrayStack<Double>(cap);

		stackDouble.push(5.2);
		stackDouble.push(1.8);
		stackDouble.push(4.7);
		stackDouble.push(1.4);
		stackDouble.push(3.1);
		stackDouble.push(2.9);
		stackDouble.push(10.0);

		System.out.println("3. Mảng số thực: ");
		System.out.println(stackDouble.toString());
		System.out.println("\tSize : " + stackDouble.size());
		System.out.println(stackDouble.isEmpty() ? "\tMang trống" : "\tMảng không trống");
		System.out.println("\tTop là: " + stackDouble.top());
		System.out.println("\tLấy ra top và xóa top : " + stackDouble.pop());
		System.out.println("\t�?ộ dài mảng sau khi xóa top : " + stackDouble.size());
		stackDouble.clear();
		System.out.println("\t�?ộ dài mảng sau khi clear : " + stackDouble.size());

		System.out.println("<<LINKEDLIST STACK>>");
		LinkedListStack<Integer> linkedListInt = new LinkedListStack<Integer>();

		linkedListInt.push(5);
		linkedListInt.push(1);
		linkedListInt.push(4);
		linkedListInt.push(1);
		linkedListInt.push(3);
		linkedListInt.push(2);

		System.out.println("1. Danh sách liên kết số nguyên: ");
		System.out.println(linkedListInt.toString());
		System.out.println("\tSize : " + linkedListInt.size());
		System.out.println(linkedListInt.isEmpty() ? "\tDanh sách liên kết trống" : "\tDanh sách liên kết không trống");
		System.out.println("\tTop là: " + linkedListInt.top());
		System.out.println("\tLấy ra top và xóa top : " + linkedListInt.pop());
		System.out.println("\t�?ộ dài danh sách liên kết sau khi xóa top : " + linkedListInt.size());
		linkedListInt.clear();
		System.out.println("\t�?ộ dài danh sách liên kết sau khi clear : " + linkedListInt.size());
		// System.out.println(linkedListInt.isEmpty() ? "\tMang trống" : "\tMảng
		// không trống");

		LinkedListStack<String> linkedListString = new LinkedListStack<String>();

		linkedListString.push("toan");
		linkedListString.push("khoa");
		linkedListString.push("dh14dtb");
		linkedListString.push("hoc");
		linkedListString.push("hanh");
		linkedListString.push("thang");
		linkedListString.push("thien");
		linkedListString.push("thao");

		System.out.println("2. Danh sách liên kết String: ");
		System.out.println(linkedListString.toString());
		System.out.println("\tSize : " + linkedListString.size());
		System.out.println(
				linkedListString.isEmpty() ? "\tDanh sách liên kết trống" : "\tDanh sách liên kết không trống");
		System.out.println("\tTop là: " + linkedListString.top());
		System.out.println("\tLấy ra top và xóa top : " + linkedListString.pop());
		System.out.println("\t�?ộ dài danh sách liên kết sau khi xóa top : " + linkedListString.size());
		linkedListString.clear();
		System.out.println("\t�?ộ dài danh sách liên kết sau khi clear : " + linkedListString.size());

		LinkedListStack<Double> linkedListDouble = new LinkedListStack<Double>();

		linkedListDouble.push(5.2);
		linkedListDouble.push(1.8);
		linkedListDouble.push(4.7);
		linkedListDouble.push(1.4);
		linkedListDouble.push(3.1);
		linkedListDouble.push(2.9);
		linkedListDouble.push(10.0);

		System.out.println(linkedListDouble.toString());
		System.out.println("3. Danh sách liên kết số thực: ");
		System.out.println(linkedListDouble.toString());
		System.out.println("\tSize : " + linkedListDouble.size());
		System.out.println(
				linkedListDouble.isEmpty() ? "\tDanh sách liên kết trống" : "\tDanh sách liên kết không trống");
		System.out.println("\tTop là: " + linkedListDouble.top());
		System.out.println("\tLấy ra top và xóa top : " + linkedListDouble.pop());
		System.out.println("\t�?ộ dài danh sách liên kết sau khi xóa top : " + linkedListDouble.size());
		linkedListDouble.clear();
		System.out.println("\t�?ộ dài danh sách liên kết sau khi clear : " + linkedListDouble.size());
	}
}
