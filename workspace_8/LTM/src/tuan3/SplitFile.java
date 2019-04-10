package tuan3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileSystemView;

public class SplitFile {

	public void splitFile(String source, String dest) throws IOException {
		int i, count = 0, countFile = 1;
		byte[] data = new byte[102400];
		File file = new File(source);
		if (file.isFile() && file.exists()) {
			long beginTime = System.currentTimeMillis();
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(dest + "\\" + file.getName() + countFile));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
				count++;
				if (count >= 1024) {
					count = 0;
					out.flush();
					out.close();
					countFile++;
					out = new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName() + countFile));
					System.out.println("dem so lan cat: " + countFile);
				}
			}
			long endTime = System.currentTimeMillis();
			System.out.println("\nCut time: " + (endTime - beginTime) + " ms ");
			out.flush();
			in.close();
			out.close();
		} else {
			System.out.println("file không tồn tại");
		}
	}

	public void splitNumberFile(String source, String dest, int numberFile) {
		File file = new File(source);
		int countFile = 1, i, count = 0;
		long sizeFile = file.length(), sizeSplitFile = sizeFile / numberFile;
		byte[] data = new byte[102400];
		//
		if (file.isFile() && file.exists()) {
			//
			System.out.println("size: " + sizeFile + " | size split: " + sizeSplitFile);
			long beginTime = System.currentTimeMillis();
			//
			try {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(dest + "\\" + file.getName() + countFile));
				while ((i = bis.read(data)) != -1) {
					bos.write(data, 0, i);
					count += i;
					if (count >= sizeSplitFile) {
						count = 0;
						bos.flush();
						bos.close();
						countFile++;
						bos = new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName() + countFile));
						System.out.println("dem so lan cat: " + countFile);
					}
				}
				//
				long endTime = System.currentTimeMillis();
				System.out.println("\nCut time: " + (endTime - beginTime) + " ms ");
				//
				bos.flush();
				bis.close();
				bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("file không tồn tại");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//
		String srouce = "";
		String dest = "D:\\thanghoang\\abc\\";
		//
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle("Chọn File nguồn: ");
		//
		int returnValue = jfc.showDialog(null, "Chọn");
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			srouce = (jfc.getSelectedFile().getPath());
		}
		//
		System.out.println("File nguồn: " + srouce);
		System.out.println("File đích: " + dest);
		//
		if (dest.length() == 0 && srouce.length() == 0 || dest.length() == 0 || srouce.length() == 0) {
			System.out.println("Đường dẫn rỗng");
		} else {
			SplitFile sf = new SplitFile();
			sf.splitFile(srouce, dest);
			// sf.splitNumberFile(srouce, dest, 10);
		}
	}

}
