package tuan14_2;

import java.io.*;
import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		int n = 1000000;
		saveToFile(n);// kich co file
		File file = new File("thanghoang.txt");
		Scanner docFile;
		Scanner nhapVaoChu = new Scanner(System.in);
		// String x = "0";//nhap vao tu can tim
		System.out.print("nhap vao tu can tim: ");
		String x = nhapVaoChu.nextLine();
		try {
			docFile = new Scanner(file);
			HashMap<String, String> map = new HashMap<String, String>();
			
			while (docFile.hasNextLine()) {
				String word = docFile.nextLine();
				String[] mangStr = word.split(":");
				map.put(mangStr[0], mangStr[1]);
			} // end while
			System.out.println("kq = " + map.get(x));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void saveToFile(int nElems) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("thanghoang.txt"));
			for (int i = 0; i < nElems; i++) {
				writer.write(i + ": mean " + i);
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
