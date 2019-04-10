package tuan14_1;

import java.io.*;
import java.util.*;

public class Bai1_1 {
	private static Scanner docFile;
	private static Scanner nhapVao;

	public static void main(String[] args) throws IOException {
		File file = new File("dictionary1.txt");
		docFile = new Scanner(file);

		HashMap<String, String> map1 = new HashMap<String, String>();

		while (docFile.hasNextLine()) {
			String[] tokens = docFile.nextLine().split(":");
			map1.put(tokens[0], tokens[1]);
		}
		docFile.close();
		nhapVao = new Scanner(System.in);
		System.out.print("nhap vao tu tim: ");
		String word = nhapVao.nextLine();

		if (map1.containsKey(word)) {
			System.out.print("word: " + word + "nghia: " + map1.get(word));
		} else
			System.out.println("ooooooo");
	}
}
