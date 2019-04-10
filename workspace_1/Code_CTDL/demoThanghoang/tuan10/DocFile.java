package tuan10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFile {
	private Scanner input;
	private static Scanner input2;

	public void sortFile(String url) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("" + url);
		input = new Scanner(fis);
		ArraySort<Integer> arrInts = new ArraySort<>(20);
		while (input.hasNext()) {
			if (input.hasNextInt()) {
				arrInts.intsert(input.nextInt());
			}
		}
		System.out.println(arrInts);
		//arrInts.bubbleSortNew();
		arrInts.mergeSort(0, arrInts.size() - 1);
		System.out.println(arrInts);		
	}

	public static void main(String[] args) throws FileNotFoundException {
		input2 = new Scanner(System.in);
		System.out.print("Nhap duong dan file: ");
		String url = input2.nextLine();
		DocFile test = new DocFile();
		test.sortFile(url);		
	}
}