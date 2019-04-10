package khac;

import java.io.*;
import java.util.*;

import lab9.*;

public class Bai3_0 {
	private static Scanner docFile;

	public static void main(String[] args) throws IOException {
		File file = new File("lab9_bai2_in.txt");
		int dem = 0;
		try {
			docFile = new Scanner(file);
			ArraySet<String> set1 = new ArraySet<>();
			String[] mangStr = docFile.nextLine().split(" ");
			for (String word : mangStr) {
				set1.add(word);
			}
			Iterator<String> itr = set1.iterator();
			while (itr.hasNext()) {
				char wwo = itr.next().charAt(0);
				for (int i = 0; i < mangStr.length; i++) {
					if (wwo == (mangStr[i].charAt(0))) {
						dem++;
					}
				}
				System.out.println("ki tu: " + wwo + " xuat hien: " + dem + " lan");
				dem = 0;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
