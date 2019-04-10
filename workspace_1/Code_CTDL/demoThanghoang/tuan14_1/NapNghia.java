package tuan14_1;

import java.io.*;
import java.util.*;

public class NapNghia {

	private static Scanner nhapVao;
	private static Scanner doc;
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("dictionary1.txt");
		doc = new Scanner(file);
		nhapVao = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		try {
			FileOutputStream fos = new FileOutputStream("output1.txt");
			PrintWriter pw = new PrintWriter(fos);
			
			while (doc.hasNextLine()) {
				String[] new1 = doc.nextLine().split(":");
				map.put(new1[0], new1[1]);
				pw.print(doc.next());
				System.out.println(doc.next());
				System.out.print("Nhap y nghia: ");
				String value = ": " + nhapVao.nextLine();
				pw.println(value);
			}
			
			pw.close();
			doc.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
