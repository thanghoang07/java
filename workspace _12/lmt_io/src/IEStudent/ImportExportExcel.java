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

public class ImportExportExcel {
	private List<Student2> list = new ArrayList<Student2>();

	public void importExcel(String path, String charset) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(path), charset));
		//
		String line = input.readLine();
		String[] header = line.split(",");
		System.out.println(header[0] + '\t' + header[1] + '\t' + header[2]);
		Student2 st = null;
		while ((line = input.readLine()) != null) {
			String[] stline = line.split(",");
			String id = stline[0];
			String name = stline[1];
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

	public void exportExcel(String path, String charset) throws IOException {
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), charset));
		// ghi cho header
		output.write("ID");
		output.write(",");
		output.write("Name");
		output.write(",");
		output.write("GPA");
		output.write("\n");
		//
		for (Student2 st : list) {
			output.write(st.getId());
			output.write(',');
			output.write(st.getName());
			output.write(',');
			output.write(String.valueOf(st.getGpa()));
			output.write('\n');
		}
		output.close();
	}

	// csv
	public static void main(String[] args) throws IOException {
		ImportExportExcel exc = new ImportExportExcel();
		String path = "D:\\OneDrive\\Documents\\workspace _12\\lmt_io\\src\\IEStudent\\stcsv.csv";
		String path2 = "D:\\OneDrive\\Documents\\workspace _12\\lmt_io\\src\\IEStudent\\st2csv.csv";
		String charset = "UTF-8";
		exc.importExcel(path, charset);
		exc.exportExcel(path2, charset);
	}
}
