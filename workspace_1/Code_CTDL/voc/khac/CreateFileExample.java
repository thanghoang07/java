package khac;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
	public static void main(String[] args) {
		try {

			File file = new File("c:\\newfile.txt");

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
