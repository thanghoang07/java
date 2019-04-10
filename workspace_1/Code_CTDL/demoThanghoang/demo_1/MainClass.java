package demo_1;

import javax.swing.JOptionPane;

public class MainClass {
	public static void main(String[] args) {
		try {
			String sFileName = "Test.txt";
			String sContent = "Cộng �?ồng Java Việt Nam";
			// Ghi nội dung xuống file.
			IOMaster.writeUTF8Text(sFileName, sContent);
			// �?�?c nội dung file
			String sRead = IOMaster.readUTF8Text(sFileName);
			// Hiện nội dung
			JOptionPane.showMessageDialog(null, sRead);
			// Nội dung mới
			String sContent222 = "Cai file nam o cho quai nao???";
			// Ghi thêm nội dung mới xuống file
			IOMaster.writeUTF8Text(sFileName, "\r\n" + sContent222, true);
			// �?�?c nội dung file
			sRead = IOMaster.readUTF8Text(sFileName);
			// Hiện nội dung
			JOptionPane.showMessageDialog(null, sRead);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}

}
