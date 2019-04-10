package onTap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CloneCopyFolder {
	public void copyfolder(String source, String dest) throws IOException {
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
			File fileFolder = new File(dest);
			fileFolder.mkdirs();
			File[] listFiles = file.listFiles();
			for (File f : listFiles) {
				copyfolder(f.getAbsolutePath(), dest);
			}
		}
	}
}