package tuan14_1;

import java.io.*;
import java.util.*;

public class AnagramsSolver {
	private static Scanner docFile;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("dictionary.txt");
		docFile = new Scanner(file);
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		int i = 0;
		while (docFile.hasNextLine()) {
			String word = docFile.nextLine();
			String sortedWord = sortString(word); // this is a key
			ArrayList<String> anagrams = map.get(sortedWord); // this is a value
			if (map.get(sortedWord) != null) {
				System.out.println(
						i + "\t word = " + word + " \n\t key  = " + sortedWord + " \n\t get  = " + map.get(sortedWord));
				i++;
			}
			if (anagrams == null)
				anagrams = new ArrayList<String>();
			anagrams.add(word);
			map.put(sortedWord, anagrams);
		}
		// System.out.println(map.get(sortString("bread"))); // testing }
	}

	private static String sortString(String w) {
		char[] ch = w.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
}
