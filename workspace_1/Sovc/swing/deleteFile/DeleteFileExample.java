package deleteFile;

import java.io.File;

public class DeleteFileExample {

	private static final String FILE_PATH = "C:\\Users\\thang\\Desktop\\files\\files2\\destfile1.txt";

	public static void main(String[] args) {
		if (DeleteFileExample.deleteFile(FILE_PATH)) {
			System.out.println("File is deleted!");
		} else {
			System.err.println("Failed to delete file.");
		}
	}

	public static boolean deleteFile(String filePath) {
		File file = new File(FILE_PATH);
		return file.delete();

	}
}
