package docFileCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class ReadCVS {
	protected static File file;
	public static JFileChooser fc;
	String[] author = null;
	String[] book = null;

	public static File docFile() throws Exception {
		try {
			fc = new JFileChooser();
			fc.setCurrentDirectory(new File("C:\\Users\\thang\\Desktop\\files"));// dat_vi_tri_mac_dinh_de_mo
			fc.setDialogTitle("Chon file csv");
			fc.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
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

	public String[] readAuthorCSV(File file) throws Exception {
		BufferedReader br = null;
		String line;
		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				author = line.split(",");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return author;
	}

	public String[] readBookCSV(File file) throws Exception {
		BufferedReader br = null;
		String line;
		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				book = line.split(",");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return book;
	}

	public void printAuthor(String[] string) {

		for (int i = 0; i < string.length; i++) {
			System.out.println("====================================");
			System.out.println("Author: " + string[0] + "\nDate: " + string[1] + ", " + string[2] + ", " + string[3]);
			System.out.println("====================================");
		}
	}

	public void printBook(String[] string) {
		for (int i = 0; i < string.length; i++) {
			System.out.println("====================================");
			System.out.print("Book: " + string[0] + "\nAuthor: " + string[1] + "\nNha xuat ban: " + string[2]
					+ "\nNgay xuat ban: " + string[3] + ", " + string[4] + ", " + string[5] + "\nNgay nhap ve: "
					+ string[6] + ", " + string[7] + ", " + string[8] + "\nGia tien: " + string[9] + "\nMa so: "
					+ string[10] + "\nSo luong nhap ve: " + string[11]);
			System.out.println();
			System.out.println("====================================");
		}
	}
}
