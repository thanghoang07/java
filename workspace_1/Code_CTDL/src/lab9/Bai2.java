package lab9;

import java.io.*;
import java.util.*;

public class Bai2 {
	private static Scanner docFile;

	public static void main(String[] args) throws IOException {
		File file = new File("lab9_bai2_in.txt");
		try {
			docFile = new Scanner(file);
			ArraySet<String> set1 = new ArraySet<>();
			String[] mangStr = docFile.nextLine().split(" ");
			for (String word : mangStr) {
				set1.add(word);
				System.out.print(word + "  ");
			}
			// System.out.println("\nsize: " + mangStr.length + "|" +
			// set1.size() + "\n" + set1);
			savaFile(set1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void savaFile(SetADT<String> set1) {
		try {
			PrintWriter inRaFile = new PrintWriter("lab9_bai2_out.txt");
			Iterator<String> itr = set1.iterator();
			while (itr.hasNext()) {
				inRaFile.print(itr.next() + " ");
			}
			System.out.println("\nda in ra file!");
			inRaFile.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
