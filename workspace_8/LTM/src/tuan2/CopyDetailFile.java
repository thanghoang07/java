package tuan2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileSystemView;

public class CopyDetailFile {

	public static void copy(String srouceFile, String destFile) throws IOException {
		File file = new File(srouceFile);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srouceFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		long size = file.length();
		long end = 0;
		int data;
		long beginTime = System.currentTimeMillis();
		while (end != size) {
			data = bis.read();
			bos.write(data);
			end++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Coppy time: " + (endTime - beginTime) + " ms ");
		bis.close();
		bos.flush();
		bos.close();
	}

	public static void main(String[] args) throws IOException {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		String srouce = "";
		String dest = "";

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle("Chọn File nguồn: ");

		int returnValue = jfc.showDialog(null, "Save");
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			srouce = (jfc.getSelectedFile().getPath());
		}

		System.out.println("File nguồn: " + srouce);

		JFileChooser jfc1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle("Chọn File đích: ");

		int returnValue1 = jfc1.showDialog(null, "Save");
		if (returnValue1 == JFileChooser.APPROVE_OPTION) {
			dest = (jfc1.getSelectedFile().getPath());
		}

		System.out.println("File đích: " + dest);
		
		if (dest.length() == 0 && srouce.length() == 0 || dest.length() == 0 || srouce.length() == 0) {
			System.out.println("Đường dẫn rỗng");
		} else {
			copy(srouce, dest);
		}
	}

}
