package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bai5 implements IIO {

	@Override
	public boolean fileCopy(String sourceFile, String destFile, boolean moved)
			throws IOException, FileNotFoundException {
		File file = new File(sourceFile);
		if (!file.exists()) {
			System.out.println("file not found");
			return false;
		} else {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
			//
			byte[] data = new byte[1024];
			int i;
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
			}
			out.flush();
			in.close();
			out.close();
			System.out.println("copy done");
			if (moved) {
				System.out.println("delete into moved");
				file.delete();
			}
			return true;
		}
	}

	@Override
	public boolean folderCopy(String sourceFolder, String destFolder, boolean moved)
			throws IOException, FileNotFoundException {
		File folder = new File(sourceFolder);
		String fileName = folder.getName();
		destFolder += "\\" + fileName;
		System.out.println(destFolder);
		if (!folder.exists()) {
			System.out.println("not found");
			return false;
		} else if (folder.isDirectory()) {
			File folderDest = new File(destFolder);
			File[] listFile = folder.listFiles();
			folderDest.mkdirs();
			for (File file : listFile) {
				folderCopy(file.getAbsolutePath(), destFolder, moved);
			}
			System.out.println("copy folder done");
			return true;
		} else if (folder.isFile()) {
			File file = new File(destFolder);
			if (file.exists()) {
				file.createNewFile();
			} else {
				BufferedInputStream in = new BufferedInputStream(new FileInputStream(folder));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFolder));
				byte[] data = new byte[1024];
				int i;
				while ((i = in.read(data)) != -1) {
					out.write(data, 0, i);
				}
				System.out.println("copy file done");
				out.flush();
				out.close();
				in.close();
			}
			return true;
		} else {
			return false;
		}
	}

}
