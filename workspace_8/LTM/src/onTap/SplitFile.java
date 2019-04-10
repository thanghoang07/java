package onTap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitFile {
	public boolean splitFile(String source, String dest) throws IOException {
		byte[] data = new byte[102400];
		int i, count = 0, countFile = 1;
		File file = new File(source);
		if (file.isFile() && file.exists()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(dest + "\\" + file.getName() + countFile));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
				count += i;
				if (count >= 10240000) {
					count = 0;
					out.flush();
					out.close();
					countFile++;
					out = new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName() + countFile));
				}
			}
			out.flush();
			in.close();
			out.close();
			return true;
		} else {
			return false;
		}
	}

	public boolean splitFile2(String source, String dest, int numberFile) throws IOException {
		byte[] data = new byte[10240];
		int i, count = 0, countFile = 1;
		File file = new File(source);
		long sizeSplitFile = file.length() / numberFile;
		if (file.isFile() && file.exists()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(dest + "\\" + file.getName() + countFile));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
				count += i;
				if (count >= sizeSplitFile) {
					count = 0;
					out.flush();
					out.close();
					countFile++;
					out = new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName() + countFile));
				}
			}
			out.flush();
			in.close();
			out.close();
			return true;
		} else {
			return false;
		}
	}
}
