package lab5_by_thanh_hai;

import java.util.Scanner;

public class Bai2 {
	private static Scanner nhapVao;

	public static int[] revArray(int[] a) {
		ArrayStack<Integer> arrInts = new ArrayStack<Integer>(10);
		for (int i = 0; i < a.length; i++) {
			arrInts.push(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = arrInts.pop();
		}
		return a;
	}

	public static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print("[" + a[i] + "]" + " ");
		}
	}

	public static void main(String[] args) {
		CharStack stack = new CharStack(80);
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap xau ki tu (s): ");
		String str = nhapVao.next(); // Tao ra 1 xau ky tu
		int leng = str.length();
		System.out.println("-Day ky tu dao nguoc: ");
		for (int k = 0; k < leng; k++) // dua vao stack
			stack.push(str.charAt(k));
		while (!stack.isEmpty()) // Lay ra tu stack theo thu tu dao nguoc
			System.out.print(stack.pop());
		System.out.print("\n-------------------------------------------");

		ArrayStack<Integer> arrStack = new ArrayStack<Integer>(10);
		System.out.print("\n-Nhap so phan tu cua mang(n): ");
		int n = nhapVao.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] =", i);
			arr[i] = nhapVao.nextInt();
		}
		System.out.print("\nMang vua tao: ");
		printArr(arr);
		revArray(arr);
		System.out.print("\nMang sau khi dao: ");
		printArr(arr);
	}

}
