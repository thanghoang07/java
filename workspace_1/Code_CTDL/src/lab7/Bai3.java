package lab7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai3 {
	private static Scanner input2;

	public static void main(String[] args) throws FileNotFoundException {
		input2 = new Scanner(System.in);
		System.out.print(
				"Nhap duong dan file: \n(Duong dan file co dang nhu sau: \nD:\\OneDrive\\Documents\\workspace\\Code_CTDL\\me\\Test.txt): \nNhap vao duong dan file: ");
		String url = input2.nextLine();

		SortFile test = new SortFile();
		test.sortFile(url);
	}
}