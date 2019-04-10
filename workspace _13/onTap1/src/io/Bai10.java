package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bai10 {
	public boolean splitFile(String sourceFile, String destFolder, int numberFIle) throws IOException {
		File file = new File(sourceFile);
		long sizeFile = file.length() / numberFIle;
		if (file.exists() && file.isFile()) {
			int i, count = 0, countFile = 1;
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(destFolder + "\\" + file.getName() + countFile));
			byte[] data = new byte[1024 * 1000];
			while ((i = in.read(data)) != -1) {
				count += i;
				out.write(data, 0, i);
				if (count >= sizeFile) {
					count = 0;
					countFile++;
					out.flush();
					out.close();
					out = new BufferedOutputStream(
							new FileOutputStream(destFolder + "\\" + file.getName() + countFile));
					System.out.println(countFile);
				}
			}
			out.flush();
			out.close();
			in.close();
			System.out.println("done");
			return true;
		} else {
			System.out.println("xxxxxxxx");
			return false;
		}
	}
}
