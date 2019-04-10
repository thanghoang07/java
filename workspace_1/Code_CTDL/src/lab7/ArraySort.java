package lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArraySort<T extends Comparable<T>> {
	public static final int ABC = 20;

	private T[] mang;
	private int num; // number of data items
	private int size;
	public int demSoSanhQuickSort = 0, demHoanViQuickSort = 0, demHoanViBubbleSort = 0, demSoSanhBubbleSort = 0,
			demHoanViInsertionSort = 0, demSoSanhInsertionSort = 0, demSoSanhSequentialSearch;

	public ArraySort(int max) {
		// constructor
		mang = (T[]) new Comparable[max]; // create the array
		num = 0; // no items yet
	}

	// put element into array
	public void intsert(T value) {
		mang[num] = value; // insert it
		num++; // increment size
	}

	public boolean isEmpty() {
		return num == 0;
	}

	public void clear() {
		for (int i = 0; i <= num; i++)
			mang[i] = null;
		num = 0;
	}

	public int size() {
		return size;
	}

	// Bubble Sort
	public void bubbleSort() {
		T tmp = null;
		for (int i = num - 1; i > 1; i--) {
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
		T tam;
		while (swapped) {
			swapped = false;
			demSoSanhBubbleSort++;
			for (int i = 0; i < num - 1; i++) {
				if (mang[i].compareTo(mang[i + 1]) > 0) {
					tam = mang[i];
					mang[i] = mang[i + 1];
					mang[i + 1] = tam;
					swapped = true;
					demHoanViBubbleSort++;
				}
			}
		}
	}

	// Selection Sort
	public void selectionSort() {
		int minIndex;
		for (int i = 0; i < num - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < num; j++) {
				if (mang[j].compareTo(mang[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				T tam = mang[i];
				mang[i] = mang[minIndex];
				mang[minIndex] = tam;
			}
		}
	}

	// insertionSort
	public void insertionSort() {
		int j;
		for (int i = 1; i < num; i++) {
			T tam = mang[i];
			j = i; // start shifts at out
			demSoSanhInsertionSort++;
			while (j > 0 && mang[j - 1].compareTo(tam) > 0) {// until one is
																// smaller
				mang[j] = mang[j - 1]; // shift item right,
				j--; // go left one position
				demHoanViInsertionSort++;
			}
			mang[j] = tam;
			
		} // end for
	}

	// quickSort
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
			while (mang[i].compareTo(pivotElement) < 0) {
				i++;
				demSoSanhQuickSort++;
			}
			while (mang[j].compareTo(pivotElement) > 0) {
				j--;
				demSoSanhQuickSort++;
			}
			if (i <= j) {
				T tmp = mang[i];
				mang[i] = mang[j];
				mang[j] = tmp;
				i++;
				j--;
				demHoanViQuickSort++;
				demSoSanhQuickSort++;
			}
		}
		return i;
	}

	// toString
	public String toString() {
		StringBuilder inRa = new StringBuilder();
		if (mang.length == 0)
			inRa.append("[]");
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] != null)
				inRa.append("|" + mang[i] + "|");
		}
		return inRa.toString();
	}

	// mergeSort
	public void mergeSort(int min, int max) {
		int left, right;
		if (min == max)
			return;
		int size = max - min + 1;
		int pivot = (max + min) / 2;
		T[] tmp = (T[]) new Comparable[size];
		mergeSort(min, pivot);
		mergeSort(pivot + 1, max);
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

	public void ghiFile() throws IOException {
		FileOutputStream fos = new FileOutputStream("danhSachSinhVien.txt");
		PrintWriter pw = new PrintWriter(fos);

		for (int i = 0; i < mang.length; i++) {
			if (mang[i] != null) {
				pw.println("\nSinh Vien thu: " + (i + 1) + "\n" + mang[i] + "\n");
			} else {
				pw.println("");
			}
		}
		pw.close();
		fos.flush();
		fos.close();
	}

	public void docFile() throws IOException {
		FileReader fr = new FileReader("danhSachSinhVien.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
}
