package fileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bai1 implements IFileClass {
	@Override
	public boolean deleteFile(String path) throws IOException, FileNotFoundException {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("file not found");
			return false;
		} else {
			System.out.println("delete file: " + file.getName());
			file.delete();
			return true;
		}
	}

	@Override
	public boolean delete(String path) throws IOException, FileNotFoundException {
		File folder = new File(path);
		if (!folder.exists()) {
			System.out.println("not found");
			return false;
		} else if (!folder.isDirectory()) {
			deleteFile(folder.getAbsolutePath());
			return true;
		} else {
			File[] fileFolders = folder.listFiles();
			if(fileFolders!=null) {
				for (File file : fileFolders) {
					delete(file.getAbsolutePath());	
				}
			}
			return true;
		}
	}
}
