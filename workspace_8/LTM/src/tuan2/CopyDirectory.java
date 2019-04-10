package tuan2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirectory {

	public void copy(String source, String dest) {
		File file = new File(source);
		String fileName = file.getName();
		System.out.println(fileName);
		dest += "\\" + fileName;
		System.out.println(dest);

		try {
			if (file.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
				byte[] data = new byte[102400];
				int a;
				//
				long beginTime = System.currentTimeMillis();
				//
				while ((a = bis.read(data)) != -1) {
					bos.write(data, 0, a);
				}
				//
				long endTime = System.currentTimeMillis();
				System.out.println("\nCoppy time: " + (endTime - beginTime) + " ms ");
				//
				bis.close();
				bos.close();
			} else if (file.isDirectory()) {
				File fileDest = new File(dest);
				fileDest.mkdirs();
				File[] list = file.listFiles();
				for (File f : list) {
					copy(f.getAbsolutePath(), dest);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Lỗi");
		}
	}

	public void copyThuMuc(String source, String dest) throws IOException {
		File file = new File(source);
		dest += "\\" + file.getName();
		if (file.isFile()) {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
			int i;
			byte[] data = new byte[102400];
			//
			long beginTime = System.currentTimeMillis();
			//
			while ((i = bis.read(data)) != -1) {
				bos.write(data, 0, i);
			}
			//
			long endTime = System.currentTimeMillis();
			System.out.println("\nCoppy time: " + (endTime - beginTime) + " ms ");
			//
			bis.close();
			bos.close();
		} else if (file.isDirectory()) {
			File destFile = new File(dest);
			destFile.mkdir();
			File[] listFile = file.listFiles();
			for (File lf : listFile) {
				copyThuMuc(lf.getAbsolutePath(), dest);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// try {
		// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		//
		// String srouce = "";
		// String dest = "";
		//
		// JFileChooser jfc = new
		// JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		// jfc.setDialogTitle("Chọn File nguồn: ");
		//
		// int returnValue = jfc.showDialog(null, "Save");
		// if (returnValue == JFileChooser.APPROVE_OPTION) {
		// srouce = (jfc.getSelectedFile().getPath());
		// }
		//
		// System.out.println("File nguồn: " + srouce);
		//
		// JFileChooser jfc1 = new
		// JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		// jfc.setDialogTitle("Chọn File đích: ");
		//
		// int returnValue1 = jfc1.showDialog(null, "Save");
		// if (returnValue1 == JFileChooser.APPROVE_OPTION) {
		// dest = (jfc1.getSelectedFile().getPath());
		// }
		//
		// System.out.println("File đích: " + dest);
		//
		// if (dest.length() == 0 && srouce.length() == 0 || dest.length() == 0 ||
		// srouce.length() == 0) {
		// System.out.println("Đường dẫn rỗng");
		// } else {
		// CopyDirectory copyFile = new CopyDirectory();
		// copyFile.copy(srouce, dest);
		// }

		//
		String srouce = "E:\\thanghoang";
		String dest = "D:\\thanghoang\\thanghoang";
		System.out.println("Thư mục nguồn: " + srouce);
		System.out.println("Thư mục đích: " + dest);
		//
		CopyDirectory copyFile = new CopyDirectory();
		//copyFile.copy(srouce, dest);
		copyFile.copyThuMuc(srouce, dest);
	}
}
