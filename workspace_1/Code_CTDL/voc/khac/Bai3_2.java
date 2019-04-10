package khac;

import java.io.*;
import java.util.*;

import lab9.ArraySet;

public class Bai3_2 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("lab9_bai2_in.txt");
		Scanner sc = new Scanner(file);
		int count = 0;

		ArraySet<String> data = new ArraySet<>();
		String[] tokens = sc.nextLine().split(" ");
		for (String token : tokens) {
			data.add(token);
		}
		Iterator<String> itr = data.iterator();
		while (itr.hasNext()) {
			for (int j = 0; j < tokens.length; j++) {
				if (itr.next().equals(tokens[j])) {
					count++;
				}
			}
			System.out.println("Tu " + itr.next() + " xuat hien " + count + " lan");
			count = 0;
		}
	}
}
