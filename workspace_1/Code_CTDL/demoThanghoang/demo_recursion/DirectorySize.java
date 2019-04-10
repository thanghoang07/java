package demo_recursion;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		// Prompt the user to enter a directory or a file
		System.out.print("Enter a directory or a file: ");
		nhapVao = new Scanner(System.in);
		String directory = nhapVao.nextLine();
		// Display the size
		System.out.println(getSize(new File(directory)) + " bytes"); // invoke
																		// method
	}

	public static long getSize(File file) {// getSize method
		long size = 0;
		if (file.isDirectory()) {// is directory?
			File[] files = file.listFiles();// All files and subdirectories
			for (int i = 0; i < files.length; i++) {
				size += getSize(files[i]);// Recursive call
			}
		} else {// base case
			size += file.length();
		}
		return size;
	}
}