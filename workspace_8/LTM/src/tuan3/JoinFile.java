package tuan3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JoinFile {
	public static void noiFile(String source, String dest, int soFile) throws IOException {
		int i = 0, count = 0;
		byte[] data = new byte[102400];
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

	public static void main(String[] args) throws IOException {
		String source4 = "D:\\LTM\\abc\\test.txt1";
		String dest4 = "D:\\LTM\\test.txt";
		noiFile(source4, dest4, 15);
	}
}
