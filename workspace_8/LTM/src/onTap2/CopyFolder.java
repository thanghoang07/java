package onTap2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFolder {
	public void copyFolder(String source, String dest) throws IOException {
		byte[] data = new byte[10240];
		int i;
		File file = new File(source);
		String fileName = file.getName();
		dest += "\\" + fileName;
		if (file.isFile()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
			}
			in.close();
			out.close();
		} else if (file.isDirectory()) {
			File folder = new File(dest);
			folder.mkdirs();
			File[] listFile = folder.listFiles();
			for (File f : listFile) {
				copyFolder(f.getAbsolutePath(), dest);
			}
		}
	}
}
