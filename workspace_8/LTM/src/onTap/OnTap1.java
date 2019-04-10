package onTap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OnTap1 {
	public boolean copyFile(String source, String dest) throws IOException {
		byte[] data = new byte[10240];
		int i;
		File file = new File(source);
		if (file.exists()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
			}
			out.close();
			in.close();
			return true;
		} else {
			return false;
		}
	}

	public void copyFolder(String source, String dest) throws IOException {
		byte[] data = new byte[10240];
		int i;
		File file = new File(source);
		dest += "\\" + file.getName();
		if (file.isDirectory()) {
			File fileFolder = new File(dest);
			fileFolder.mkdir();
			File[] listFiles = file.listFiles();
			for (File f : listFiles) {
				copyFolder(f.getAbsolutePath(), dest);
			}
		} else if (file.isFile()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
			}
			out.close();
			in.close();
		}
	}

	public boolean splitFile(String source, String dest) throws IOException {
		byte[] data = new byte[10240];
		int i, count = 0, countFile = 1;
		File file = new File(source);
		if (file.isFile() && file.exists()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(dest + "\\" + file.getName() + countFile));
			while ((i = in.read(data)) != -1) {
				count += i;
				out.write(data, 0, i);
				if (count >= 10240000) {
					count = 0;
					countFile++;
					out.flush();
					out.close();
					out = new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName() + countFile));
				}
			}
			out.flush();
			out.close();
			in.close();
			return true;
		} else {
			return false;
		}
	}

	public boolean splitFile(String source, String dest, int numberFile) throws IOException {
		byte[] data = new byte[10240];
		int i, count = 0, countFile = 1;
		File file = new File(source);
		long sizeFileNumber = file.length() / numberFile;
		if (file.isFile() && file.exists()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(dest + "\\" + file.getName() + countFile));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
				count += i;
				if (count >= sizeFileNumber) {
					count = 0;
					countFile++;
					out.flush();
					out.close();
					out = new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName() + countFile));
				}
			}
			out.flush();
			out.close();
			in.close();
			return true;
		} else {
			return false;
		}
	}
}
