package copyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile2 {
	public static void main(String[] args) throws InterruptedException,	IOException {
		File source = new File("C:\\Users\\thang\\Desktop\\files\\sourcefile1.txt");
		File dest = new File("C:\\Users\\thang\\Desktop\\files\\files2\\destfile1.txt");
		copyFileUsingFileStreams(source, dest);
	}

	private static void copyFileUsingFileStreams(File source, File dest)throws IOException {
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(source);
			output = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
		} finally {
			input.close();
			output.close();
		}
	}
}
