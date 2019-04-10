package khac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

import lab9.*;

public class Bai3 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("dict1.txt");
		Scanner sc = new Scanner(file);
		int count = 0;

		ArraySet<String> data = new ArraySet<>();
		String[] tokens = sc.nextLine().split(":");
		for (String token : tokens) {
			data.add(token);
		}
		Iterator<String> itr = data.iterator();
		while (itr.hasNext()) {
			String word = itr.next();
			for (int j = 0; j < tokens.length; j++) {
				if (word.equals(tokens[j])) {
					count++;
				}
			}
			System.out.println(word + "\t" + count + " lan");
			count = 0;

		}
	}
}
