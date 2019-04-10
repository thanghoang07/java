package tuan4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class PackFile {

	public void packFile2(String fileName, DataOutputStream dos) throws IOException {
		File fi = new File(fileName);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fi));
		dos.writeUTF(fi.getPath());
		System.out.println("duong dan " + fi.getPath());
		dos.writeLong(fi.length());
		System.out.println("size file " + fi.length());
		while (true) {
			byte[] buffer = new byte[1024];
			int read = bis.read(buffer);
			if (read == -1) {
				break;
			}
			dos.write(buffer, 0, read);
			dos.flush();
		}
		bis.close();
	}

	public void packDir(String dirName, DataOutputStream dos) throws IOException {
		File src = new File(dirName);

		File[] files = src.listFiles();
		if (src.listFiles().length == 0) {
			dos.writeUTF(src.getPath());
			dos.writeLong(src.length());
			dos.flush();
		} else {
			for (File fi : files) {
				if (fi.isFile()) {
					packFile2(fi.getPath(), dos);
				} else {
					packDir(fi.getPath(), dos);
				}
			}
		}
	}

	public void pack(String source, String dest) throws IOException {
		File src = new File(source);
		if (src.exists()) {
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));

			File[] files = src.listFiles();
			for (File fi : files) {
				if (fi.isFile()) {
					packFile2(fi.getPath(), dos);
				} else {
					packDir(fi.getPath(), dos);
				}
			}
		} else {
			System.out.println("src không tồn tại, vui lòng kiểm tra lại");
		}
	}

	public static void main(String[] args) throws IOException {
		String source = "E:\\thanghoang";
		String dest = "D:\\thanghoang\\abcde.pack";

		PackFile pf = new PackFile();
		pf.pack(source, dest);
	}
}
