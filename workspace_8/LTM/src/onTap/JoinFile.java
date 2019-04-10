package onTap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JoinFile {
	public void joinFile2(String source, String dest) throws IOException {
		byte[] data = new byte[102400];
		int i;
		File file = new File(source);
		File[] listFiles = file.listFiles();
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
		for (File f : listFiles) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
			}
			in.close();
		}
		out.flush();
		out.close();
	}

	public void joinFile(String source, String dest, int soFile) throws IOException {
		byte[] data = new byte[102400];
		int i, count = 0;
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
		for (int j = 1; j <= soFile; j++) {
			File file = new File(source.substring(0, source.length() - 1) + j);
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
				count += i;
			}
			in.close();
		}
		out.flush();
		out.close();
	}

}
