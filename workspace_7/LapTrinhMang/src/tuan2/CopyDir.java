package tuan2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDir {
	public static void copyDir(String source, String dest) {
		File file = new File(source);
		String fileName = file.getName();
		System.out.println("File: " + fileName);
		dest += "\\" + fileName;
		System.out.println(dest);
		try {
			if (file.isFile()) {
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
				byte[] data = new byte[102400];
				int c;
				while ((c = bis.read(data)) != -1)
					bos.write(data, 0, c);
				bis.close();
				bos.close();
			} else if (file.isDirectory()) {
				File fileDest = new File(dest);
				fileDest.mkdir();// tạo cây thư mục(nếu không có cấp cha thì dùng mkdir cây thư mục sẽ không đk
									// tạo còn dùng mkdirs thì luôn luôn đk tạo)
				File[] listFile = file.listFiles();
				for (File f : listFile) {
					copyDir(f.getAbsolutePath(), dest);
				}
				//				
				System.out.println("\n-----------------------");
				System.out.println(source);
				String paths[] = file.list();
				for (String path : paths) {
					System.out.println(path);
				}
				//
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Lỗi");
		}
	}

	public static boolean CheckFile(String dest) {
		File file = new File(dest);
		return file.isDirectory();
	}

	public static void main(String[] args) {
		String source = "E:\\thanghoang";
		String dest = "D:\\thanghoang";
		// kiểm tra thư mục
		if (CheckFile(dest)) {
			copyDir(source, dest);
			System.out.println("\nSuccess");
		} else {
			System.out.println(dest + " không phải là đường dẫn!!!");
		}
	}
}