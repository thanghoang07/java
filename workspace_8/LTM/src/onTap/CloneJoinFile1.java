package onTap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CloneJoinFile1 {
	public void joinFile(String source, String dest) throws IOException {
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
}
