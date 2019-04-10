package demo_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class XuLyFile {
	/*public void saveFile() {
		BufferedWriter ghi = null;
		try {
			ghi = new BufferedWriter(new FileWriter("danhsachSV.txt"));
			for (int i = 0; i < mang.length; i++)
				ghi.write("\nSinh Vien thu: " + (i + 1) + "\n" + mang[i] + "\n");
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (ghi != null) {
				try {
					ghi.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
	}*/

	public void ghiFile() throws IOException {
		FileOutputStream fos = new FileOutputStream("danhSachSinhVien.txt", true);
		PrintWriter pw = new PrintWriter(fos);
		pw.println("hellooo....................." + "019208490237501");
		pw.close();
		fos.flush();
		fos.close();
	}

	public void docFile() throws IOException {
		FileReader fr = new FileReader("danhSachSinhVien.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}

	public static void main(String[] args) throws IOException {
		XuLyFile xl = new XuLyFile();
		xl.ghiFile();
		System.out.println("da ghi!!");

		XuLyFile xl1 = new XuLyFile();
		System.out.println("doc file: \n");
		xl1.docFile();
		System.out.println();
	}
}
