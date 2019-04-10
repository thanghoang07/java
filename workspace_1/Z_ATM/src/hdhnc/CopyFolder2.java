package hdhnc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFolder2 {
	public static void copy(File sourceLocation, File targetLocation) throws IOException {
		if (sourceLocation.isDirectory()) {
			copyDirectory(sourceLocation, targetLocation);
		} else {
			copyFile(sourceLocation, targetLocation);
		}
	}

	private static void copyDirectory(File source, File target) throws IOException {
		if (!target.exists()) {
			target.mkdir();
		}
		//System.out.println("done");
		for (String f : source.list()) {
			copy(new File(source, f), new File(target, f));
		}
	}

	private static void copyFile(File source, File target) throws IOException {
		try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(target)) {
			byte[] buf = new byte[1024];
			int length;
			while ((length = in.read(buf)) > 0) {
				out.write(buf, 0, length);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File srcDir = new File("D:\\toan\\fqnew.txt");
		File destDir = new File("D:\\soft");
		//copyDirectory(srcDir, destDir);
		copyFile(srcDir, destDir);
	}
}