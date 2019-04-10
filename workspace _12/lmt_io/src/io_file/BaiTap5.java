package io_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BaiTap5 {
	public Boolean copyFile(String source, String dest, boolean move) throws IOException {
		File file = new File(source);
		if (!file.exists()) {
			System.out.println("ko ton tai");
			return false;
		} else {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
			byte[] data = new byte[1024 * 1000];
			int i, h = 0;
			long beginTime = System.currentTimeMillis();
			while ((i = bis.read(data)) != -1) {
				bos.write(data, 0, i);
				h++;
				System.out.println(h);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Coppy time: " + (endTime - beginTime) + " ms ");
			bis.close();
			bos.close();
			System.out.println("done");
			if (move) {
				System.out.println("xoa file sau khi copy");
				file.delete();
			}
			return true;
		}
	}

	public Boolean copyFile2(String source, String dest, boolean move, int number) throws IOException {
		File file = new File(source);
		if (!file.exists()) {
			System.out.println("ko ton tai");
			return false;
		} else {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
			byte[] data = new byte[1024 * number];
			int i, h = 0;
			long beginTime = System.currentTimeMillis();
			while ((i = bis.read(data)) != -1) {
				bos.write(data, 0, i);
				h++;
				System.out.println(h);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Coppy time: " + (endTime - beginTime) + " ms ");
			bis.close();
			bos.close();
			System.out.println("done");
			if (move) {
				System.out.println("xoa file sau khi copy");
				file.delete();
			}
			return true;
		}
	}

	public static void main(String[] args) throws IOException {
		String source = "E:\\[4].rar";
		String dest = "D:\\tmp\\a.docx";
		BaiTap5 bt5 = new BaiTap5();
		bt5.copyFile2(source, dest, false, 10000);
	}
}
