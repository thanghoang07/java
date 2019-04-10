package khac;

import java.io.*;
import java.util.*;

import lab9.ArraySet;

public class Bai3_1 {
	private static Scanner docFile;

	public static void main(String[] args) {
		File file = new File("lab9_bai2_in.txt");
		int dem = 0;
		try {
			docFile = new Scanner(file);
			ArraySet<String> data = new ArraySet<>();
			String[] tokens = docFile.nextLine().split(" ");
			for (String token : tokens) {
				data.add(token);
			}
			Iterator<String> itr = data.iterator();
			for (int i = 0; i < tokens.length; i++) {
				while (itr.hasNext()) {
					if (itr.next().equals(tokens[i])) {
						dem++;
					}
				}
				System.out.println("tu " + itr.next() + "\t dem(dem): " + dem);
				dem = 0;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
