package deleteFile;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\thang\\Desktop\\files\\destfile1.txt");
			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Delete operation is failed.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}