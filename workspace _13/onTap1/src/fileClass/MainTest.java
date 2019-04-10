package fileClass;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//String path = "D:\\Test\\aaaa.txt";
		String path = "D:\\Test\\A";
		Bai1 delete = new Bai1();
		//delete.deleteFile(path);
		delete.delete(path);
	}

}
