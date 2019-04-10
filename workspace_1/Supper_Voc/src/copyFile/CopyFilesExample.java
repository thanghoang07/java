package copyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import org.apache.commons.io.FileUtils;

public class CopyFilesExample {

	public static void main(String[] args) throws InterruptedException,	IOException {
		File source = new File("C:\\Users\\thang\\Desktop\\files\\sourcefile1.txt");
		File dest = new File("C:\\Users\\thang\\Desktop\\files\\files2\\destfile1.txt");
		// copy file using FileStreams
		long start = System.nanoTime();
		long end;
		copyFileUsingFileStreams(source, dest);
		System.out.println("Time taken by FileStreams Copy = " + (System.nanoTime() - start));		
		end = System.nanoTime();
		
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

	private static void copyFileUsingFileChannels(File source, File dest)throws IOException {
		FileChannel inputChannel = null;
		FileChannel outputChannel = null;
		try {
			inputChannel = new FileInputStream(source).getChannel();
			outputChannel = new FileOutputStream(dest).getChannel();
			outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		} finally {
			inputChannel.close();
			outputChannel.close();
		}
	}

	private static void copyFileUsingJava7Files(File source, File dest)throws IOException {
		Files.copy(source.toPath(), dest.toPath());
	}

	private static void copyFileUsingApacheCommonsIO(File source, File dest)throws IOException {
		FileUtils.copyFile(source, dest);
	}

}
