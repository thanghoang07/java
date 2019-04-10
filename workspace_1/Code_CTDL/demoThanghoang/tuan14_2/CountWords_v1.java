package tuan14_2;

import java.io.*;
import java.util.*;

public class CountWords_v1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("dictionary1.txt")));
		String inputLine = null;
		Map<String, Integer> dictionary = new HashMap<String, Integer>();
		// Map<String, Integer> dictionary = new Hashtable<String, Integer>();

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
		for (String key : dictionary.keySet())
			System.out.println(key + ": " + dictionary.get(key));

		reader.close();
	}
}
