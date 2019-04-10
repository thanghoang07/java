package khac;

import java.io.File;

public class DeleteFileExample {
	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Deleteation is failed.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}