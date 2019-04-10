package hdhnc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFileTest {
	private static void fileCopyUsingNIOChannelClass(File oldFF, File newFF) throws IOException {
		File fileToCopy = /* new File("D:/toan/fq.txt") */ oldFF;
		FileInputStream inputStream = new FileInputStream(fileToCopy);
		FileChannel inChannel = inputStream.getChannel();
		//
		File newFile = /* new File("D:/soft/fq.txt") */ newFF;
		FileOutputStream outputStream = new FileOutputStream(newFile);
		FileChannel outChannel = outputStream.getChannel();
		//
		inChannel.transferTo(0, fileToCopy.length(), outChannel);
		//
		inputStream.close();
		outputStream.close();
	}

	private static void copyFolder(File sourceFolder, File destinationFolder) throws IOException {
		if (sourceFolder.isDirectory()) {
			if (!destinationFolder.exists()) {
				destinationFolder.mkdir();
			}
			String files[] = sourceFolder.list();

			for (String file : files) {
				File srcFile = new File(sourceFolder, file);
				File destFile = new File(destinationFolder, file);
				copyFolder(srcFile, destFile);
			}
		} else {
			Files.copy(sourceFolder.toPath(), destinationFolder.toPath(), StandardCopyOption.REPLACE_EXISTING);
		}
	}

	

	public static void main(String[] args) throws IOException {
		File oldFF = new File("D:/toan/rt.txt");
		File newFF = new File("D:/soft");
		//fileCopyUsingNIOChannelClass(oldFF, newFF);
	}
}
