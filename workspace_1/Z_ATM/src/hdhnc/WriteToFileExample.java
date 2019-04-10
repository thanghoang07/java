package hdhnc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
	public static void main(String[] args) {
		System.out.println("ghi");
		ghiFile();
	}

	public static void ghiFile() {
		try {
			String content = "This is the content to write into file";
			File file = new File("D:\\laptrinh_vn.txt");
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
