package demon;

import java.io.File;

import javax.swing.JFileChooser;

public class MoveFile {
	protected static File file;
	public static JFileChooser fc;

	public static File docFile() throws Exception {
		try {
			fc = new JFileChooser();
			fc.setCurrentDirectory(new File("C:\\Users\\thang\\Desktop\\files\\G"));// dat_vi_tri_mac_dinh_de_mo
			fc.setDialogTitle("chon file chua do thi.");
			fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			fc.setAcceptAllFileFilterUsed(false);
			if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				String selOpen = fc.getSelectedFile().getAbsolutePath();// lay_duong_dan_file
				file = new File(selOpen);
			} else {
				System.out.println("No file selection");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;
	}

	public static void moveFF(File oldFF, File newFF) {
		// kiem tra coi duong dan co phai la thu muc do
		if (oldFF.isDirectory()) {
			try {
				File[] files = oldFF.listFiles();
				for (int i = 0; i < files.length; i++) {
					if ((oldFF.renameTo(new File(newFF +"\\" + oldFF.getName()))) && (files[i]
							.renameTo(new File("D:\\soft\\" + oldFF.getName() + "\\" + files[i].getName())))) {
						System.out.println("The Forder was moved successfully to the new folder");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		// kiem tra coi neu duong dan khong phai thu muc
		else /* if (!oldFF.isDirectory()) */ {
			try {
				if (oldFF.renameTo(new File(newFF +"\\" + oldFF.getName()))) {
					System.out.println("The file was moved successfully to the new folder");
				} else {
					System.out.println("The File was not moved.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		//File oldFF = /*new File("D:\\toan")*/ MoveFile.docFile();
		File oldFF = new File("D:\\toanNew\\daf"), newFF = new File("D:\\soft");
		moveFF(oldFF, newFF);
	}

}
