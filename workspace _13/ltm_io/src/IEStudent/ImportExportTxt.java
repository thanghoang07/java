package IEStudent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class ImportExportTxt {
	private List<Student2> list = new ArrayList<Student2>();

	public void importTxt(String path, String charset) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(path), charset));
		// BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new
		// FileOutputStream(path), charset));
		//
		String line = "";
		Student2 st = null;
		while ((line = input.readLine()) != null) {
			String[] stline = line.split("" + "\t");
			String id = stline[0];
			String name = stline[1];
			System.out.println(stline[2]);
			int gpa = Integer.valueOf(stline[2]);
			st = new Student2(id, name, gpa);

			list.add(st);
		}
		//
		input.close();
		for (Student2 ste : list) {
			System.out.println(ste.toString());
		}
	}
	public void exportTxt(String path, String charset) throws IOException {
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), charset));
		for (Student2 st : list) {
			output.write(st.getId());
			output.write('\t');
			output.write(st.getName());
			output.write('\t');
			output.write(String.valueOf(st.getGpa()));
			output.write('\n');
		}
		output.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		ImportExportTxt tt = new ImportExportTxt();
		String path = "D:\\OneDrive\\Documents\\workspace _12\\lmt_io\\src\\IEStudent\\staa.txt";
		String charset = "UTF-8";
		tt.importTxt(path, charset);
		tt.exportTxt(path, charset);
	}
}
