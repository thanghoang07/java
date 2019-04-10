/*package tuan14_2;

import java.io.*;
import java.util.*;

import book.MyMap.Entry;

public class CountWords_v2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("input.txt")));
		String inputLine = null;
		LinkedHashMap<String, Integer> dictionary = new LinkedHashMap<String, Integer>();

		while ((inputLine = reader.readLine()) != null) {
			// Split the input line.
			String[] words = inputLine.split("\\s+");

			// Ignore empty lines.
			if (inputLine.equals(""))
				continue;

			for (String word : words) {
				// Remove any commas and dots.
				word = word.replace(".", "");
				word = word.replace(",", "");

				if (dictionary.containsKey(word)) {
					Integer val = dictionary.get(word);
					dictionary.put(word, val + 1);
				} else
					dictionary.put(word, 1);
			}
		}

		// Printing all words stored in the map.
		Set<Entry<String, Integer>> entries = dictionary.entrySet();
		Iterator<Entry<String, Integer>> iter = entries.iterator();

		while (iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		reader.close();
	}
}*/