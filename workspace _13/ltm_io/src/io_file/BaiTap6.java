package io_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BaiTap6 {
	public Boolean copyFolder(String source, String dest, boolean move) throws IOException {
		File file = new File(source);
		String fileName = file.getName();
		dest += "\\" + fileName;
		System.out.println(dest);
		if (!file.exists()) {
			System.out.println("ko ton tai");
			return false;
		} else if (file.isFile()) {
			File destFile = new File(dest);
			if (destFile.exists()) {
				destFile.createNewFile();
			} else {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
				byte[] data = new byte[1024 * 1000];
				int i;
				long beginTime = System.currentTimeMillis();
				while ((i = bis.read(data)) != -1) {
					bos.write(data, 0, i);
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Coppy time: " + (endTime - beginTime) + " ms ");
				bis.close();
				bos.close();
				System.out.println("done");
			}
			if (move) {
				System.out.println("xoa file sau khi copy");
				file.delete();
			}
			return true;
		} else if (file.isDirectory()) {
			File folderDest = new File(dest);
			File[] listFile = file.listFiles();
			folderDest.mkdirs();
			for (File fileFolder : listFile) {
				copyFolder(fileFolder.getAbsolutePath(), dest, move);
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		String source = "E:\\[4].rar";
		String dest = "D:\\tmp1";
		BaiTap6 bt6 = new BaiTap6();
		bt6.copyFolder(source, dest, false);
	}
}
