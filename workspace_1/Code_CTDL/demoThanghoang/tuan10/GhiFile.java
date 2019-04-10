package tuan10;

import java.io.*;
import java.util.Scanner;

public class GhiFile {
	private Scanner input;
	private static Scanner input2;
	public void ghiFile(String url) throws IOException {
		FileOutputStream fos = new FileOutputStream("" + url, true);
		PrintWriter pw = new PrintWriter(fos);
		ArraySort<SinhVien> mangSinhVien = new ArraySort<SinhVien>(10);
		pw.println();
		pw.close();
		fos.flush();
		fos.close();
	}

	public static void main(String[] args) throws IOException {
		input2 = new Scanner(System.in);
		System.out.print("Nhap duong dan file: ");
		String url = input2.nextLine();
		
		GhiFile xl = new GhiFile();
		xl.ghiFile(url);
		System.out.println("da ghi!!");
	}
}
