package tuan2;

import java.io.*;

public class Copy {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Syntax");
			return;
		}
		try {
			InputStream fileInput = new FileInputStream(args[0]);
			int data = fileInput.read();
			while (data != -1) {
				System.out.write(data);
				data = fileInput.read();
			}
			System.out.flush();
			fileInput.close();
		} catch (IOException e) {
			System.err.println("I/O error - " + e);
		}
	}
}