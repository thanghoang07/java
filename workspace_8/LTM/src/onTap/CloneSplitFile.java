package onTap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CloneSplitFile {
	public boolean splitFile(String source, String dest) throws IOException {
		byte[] data = new byte[102400];
		int i, count = 0, countFile = 1;
		File file = new File(source);
		if (file.exists() && file.isFile()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(dest + "\\" + file.getName() + countFile));
			while ((i = in.read(data)) != -1) {
				count += i;
				out.write(data, 0, i);
				if (count >= 10240000) {
					count = 0;
					out.flush();
					out.close();
					countFile++;
					out = new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName() + countFile));
				}
			}
			in.close();
			out.flush();
			out.close();
			return true;
		} else {
			return false;
		}
	}

	public boolean spliFile2(String source, String dest, int numberFile) throws IOException {
		byte[] data = new byte[102400];
		int i, count = 0, countFile = 1;
		File file = new File(source);
		long sizeNumberFile = file.length() / numberFile;
		if (file.exists() && file.isFile()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(dest + "\\" + file.getName() + countFile));
			while ((i = in.read(data)) != -1) {
				count += i;
				out.write(data, 0, i);
				if (count >= sizeNumberFile) {
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
