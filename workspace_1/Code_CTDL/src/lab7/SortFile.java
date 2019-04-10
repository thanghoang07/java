package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortFile {
	private Scanner input;

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
		arrInts.bubbleSortNew();
		// arrInts.mergeSort(0, arrInts.size() - 1);
		System.out.println(arrInts);
	}
}
