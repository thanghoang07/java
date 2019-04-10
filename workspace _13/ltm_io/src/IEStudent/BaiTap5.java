package IEStudent;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import studenRAF.BaiTap4;
import studenRAF.ISinhVien;

public class BaiTap5 {

	public void importStudents(List<Student> list, String parthSrc) throws IOException {
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(parthSrc)));
		for (Student s : list) {
			pw.println(s.getId() + "\t" + s.getName() + "\t" + s.getWhere() + "\t" + s.getGpa());
		}
		pw.close();
	}
	
	public void importStudents(String parthSrc) throws IOException {
		
	}

	public void exportStudents(String parthSrc, String parthDest) throws IOException {
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(parthDest), "UTF-8"));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(parthSrc), "UTF-8"));
		String data;
		while ((data = br.readLine()) != null) {
			pw.println(data);
		}
		pw.close();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 7; i++) {
			list.add(new Student("a" + i, "Thắng Hoàng �?ức", 8.0));
		}
		//
		String pathSrc = "D:\\OneDrive\\Documents\\workspace _12\\lmt_io\\src\\IEStudent\\st.txt";
		String pathDest = "D:\\OneDrive\\Documents\\workspace _12\\lmt_io\\src\\IEStudent\\sta.txt";
		//
		BaiTap5 bt5 = new BaiTap5();
		bt5.importStudents(list, pathSrc);
		bt5.exportStudents(pathSrc, pathDest);
		//
		ISinhVien bt4 = new BaiTap4();
		bt4.readStudent(pathDest);

	}
}
