package io;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*String sourceFile = "D:\\Test\\A\\B\\G\\aa.txt";
		String destFile = "D:\\Test\\A\\ab.txt";
		String sourceFolder = "D:\\Test";
		String destFolder = "D:\\AS";
		Bai5 copy = new Bai5();
		copy.fileCopy(sourceFile, destFile, false);
		copy.folderCopy(sourceFolder, destFolder, false);
		*///
		String sourceFile1 = "F:\\[LinksVIP.Net] en_office_2016_ 16.0.6769.2015_RTM_x86_x64_dvd.iso";
		String destFile1 = "D:\\Test\\split\\";
		Bai10 split = new Bai10();
		split.splitFile(sourceFile1, destFile1, 10);
	}

}
