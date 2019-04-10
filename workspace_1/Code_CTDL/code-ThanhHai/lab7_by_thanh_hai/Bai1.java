package lab7_by_thanh_hai;

import java.util.Random;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		ArraySort<Integer> arrSort = new ArraySort<Integer>(90000000);
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap so phan tu mang: ");
		int n = sc.nextInt();
		Random rd = new Random();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i]=rd.nextInt(99)+1;
			arrSort.intsert(a[i]);
		}
//		arrBubbleSort.intsert(5);
//		arrBubbleSort.intsert(2);
//		arrBubbleSort.intsert(6);
//		arrBubbleSort.intsert(0);
//		arrBubbleSort.intsert(8);
//		arrBubbleSort.intsert(7);
//		arrBubbleSort.intsert(9);
//		System.out.println("	---Buble Sort---	");
//		//System.out.println("Array Before Buble Sort");
//		System.out.println(arrBubbleSort.toString());
//		//System.out.print("\nArray After Bubble Sort");
//		arrBubbleSort.bubbleSortNew();
//		System.out.println( arrBubbleSort.toString());
//		System.out.print("\nDa in xong");
//		//System.out.print("\n-------------------------------------------");
		
		/*System.out.print("\nArray Before Selection Sort");
		System.out.print("\n"+ arrBubbleSort.toString());
		System.out.print("\nArray After Selection Sort");
		arrBubbleSort.selectionSort();
		System.out.print("\n"+ arrBubbleSort.toString());*/
		
//		System.out.print("\nArray Before Insert Sort");
//		System.out.print("\n"+ arrBubbleSort.toString());
//		System.out.print("\nArray After Insert Sort");
//		arrBubbleSort.insertionSort();
//		System.out.print("\n"+ arrBubbleSort.toString());
		
		/*System.out.print("\nArray Before Merge Sort");
		System.out.print("\n"+ arrBubbleSort.toString());
		System.out.print("\nArray After Merge Sort");
		arrBubbleSort.mergeSort(0, 6);
		System.out.print("\n"+ arrBubbleSort.toString());*/
		
		System.out.println("Array Before Quick Sort");
		System.out.println(arrSort.toString());
		System.out.println("Array Before Quick Sort");
		arrSort.quickSort(0, 49999999);
		System.out.println( arrSort.toString());
		System.out.println("Da in xong");
	}
}
