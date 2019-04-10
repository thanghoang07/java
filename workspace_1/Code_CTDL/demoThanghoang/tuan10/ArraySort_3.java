package tuan10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ArraySort_3<T extends Comparable<T>> {
	public static final int ASD = 100000000;
	public static final int ABC = 10;
	private T[] mang;
	private int nElems; // number of data items
	private static Scanner nhapVao;

	public ArraySort_3(int max) {
		// constructor
		mang = (T[]) new Comparable[max]; // create the array
		nElems = 0; // no items yet
	}

	// put element into array
	public void intsert(T value) {
		mang[nElems] = value; // insert it
		nElems++; // increment size
	}

	// Bubble Sort
	public void bubbleSort() {
		T tmp = null;
		for (int i = nElems - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (mang[j].compareTo(mang[j + 1]) > 0) {
					tmp = mang[j];
					mang[j] = mang[j + 1];
					mang[j + 1] = tmp;
				}
			}
		}
	}

	public void bubbleSortNew() {
		boolean swapped = true;
		int j = 0;
		T tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < nElems - 1; i++) {
				if (mang[i].compareTo(mang[i + 1]) > 0) {
					tmp = mang[i];
					mang[i] = mang[i + 1];
					mang[i + 1] = tmp;
					swapped = true;
				}
			}
		}

	}

	// Selection Sort
	public void selectionSort() {
		int minIndex;
		for (int i = 0; i < nElems - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < nElems; j++) {
				if (mang[j].compareTo(mang[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				T tmp = mang[i];
				mang[i] = mang[minIndex];
				mang[minIndex] = tmp;
			}
		}
	}

	// Insert Sort
	public void insertionSort() {
		int j;
		for (int i = 1; i < nElems; i++) {
			T temp = mang[i];
			j = i; // start shifts at out
			while (j > 0 && mang[j - 1].compareTo(temp) > 0) {// until one is
																// smaller
				mang[j] = mang[j - 1]; // shift item right,
				j--; // go left one position
			}
			mang[j] = temp;
		} // end for
	}

	// Merga Sort
	public void mergeSort(int min, int max) {
		int left, right;
		// return if the list's lenghth = 1
		if (min == max)
			return;
		// find the length and the midpoint of the list
		int size = max - min + 1;
		int pivot = (max + min) / 2;
		T[] tmp = (T[]) new Comparable[size];
		// sort left half of the list
		mergeSort(min, pivot);
		mergeSort(pivot + 1, max);
		// copy sorted data to workspace
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = mang[min + i];
		}
		left = 0;
		right = pivot - min + 1;
		for (int i = 0; i < tmp.length; i++) {
			if (right <= max - min)
				if (left <= pivot - min)
					if (tmp[left].compareTo(tmp[right]) > 0)
						mang[i + min] = tmp[right++];
					else
						mang[i + min] = tmp[left++];
				else
					mang[i + min] = tmp[right++];
			else
				mang[i + min] = tmp[left++];
		}
	}

	// Quick Sort
	public void quickSort(int left, int right) {
		int index = findParrtition(left, right);
		if (left < index - 1)
			quickSort(left, index - 1);
		if (index < right)
			quickSort(index, right);
	}

	private int findParrtition(int left, int right) {
		int i = left, j = right;
		T pivotElement = mang[(left + right) / 2];
		while (i <= j) {
			while (mang[i].compareTo(pivotElement) < 0)
				i++;
			while (mang[j].compareTo(pivotElement) > 0)
				j--;
			if (i <= j) {
				T tmp = mang[i];
				mang[i] = mang[j];
				mang[j] = tmp;
				i++;
				j--;
			} // end if
		} // end while
		return i;
	}

	// toString
	public String toString() {
		StringBuilder stb = new StringBuilder();
		stb.append("[");
		for (int i = 0; i < nElems; i++) {
			stb.append(mang[i] + "|");
			// if (i < nElems - 1) {
			// stb.append(", ");
			// }
		}
		stb.append(mang[nElems - 1] + "]");
		// stb.append("]");
		return stb.toString();
	}
	public String toString1() {
		StringBuilder output = new StringBuilder();
		if (mang.length == 0)
			output.append("[ ]");
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] != null)
				output.append(mang[i] + " ");
		}
		return output.toString();
	}

	public void saveToFile() {
		BufferedWriter ghiVao = null;
		try {
			ghiVao = new BufferedWriter(new FileWriter("output.txt"));
			for (int i = 0; i < nElems; i++) {
				ghiVao.write(mang[i] + "\n");
			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (ghiVao != null) {
				try {
					ghiVao.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
	}

	public static void main(String[] args) {
		ArraySort_3<Integer> mang1 = new ArraySort_3<Integer>(ASD);

		nhapVao = new Scanner(System.in);
		System.out.print("nhap vao so phan tu cua mang: ");
		int n = nhapVao.nextInt();
		Random abc = new Random();
		int[] mang = new int[n];
		for (int i = 0; i < n; i++) {
			// a[i] = abc.nextInt(99) + 1;
			mang[i] = abc.nextInt(ABC);
			mang1.intsert(mang[i]);
			mang1.intsert(mang[i]);
		}
		/*System.out.print("In mang chua xap xep: \n" + mang1.toString());
		mang1.bubbleSort();
		System.out.print("\nIn mang da xap xep bubble sort: \n" + mang1.toString());
		mang1.saveToFile();*/
		System.out.println();
		System.out.print("In mang chua xap xep: \n" + mang1.toString1());
		mang1.bubbleSort();
		System.out.print("\nIn mang da xap xep bubble sort: \n" + mang1.toString1());
		mang1.saveToFile();
	}
}
