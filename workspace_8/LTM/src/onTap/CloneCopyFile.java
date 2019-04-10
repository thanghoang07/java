package onTap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CloneCopyFile {
	public void copyFile(String source, String dest) throws IOException {
		byte[] data = new byte[10240];
		int i;
		File file = new File(source);
		if (file.exists()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
			}
			in.close();
			out.close();
		}
	}
}
