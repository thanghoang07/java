package tuan14_1;

import java.io.*;
import java.util.*;

public class Bai1_2 {
	public static void main(String[] args) throws FileNotFoundException {
		// URL url = new //
		// URL("http://andrew.cmu.edu/course/15121/dictionary.txt");
		File file = new File("dictionary.txt"); // Scanner sc = new Scanner(
												// url.openStream() );
		Scanner sc = new Scanner(file);
		HashSet<String> dict = new HashSet<String>();
		while (sc.hasNext())
			dict.add(sc.next());
		sc.close();
		sc = new Scanner(new File("Bai1_2.java"));
		while (sc.hasNextLine()) {
			String[] tokens = sc.nextLine().split("\\W");
			// \W: A non-word character
			for (String token : tokens)
				if (token.length() > 1 && !dict.contains(token.toLowerCase()))
					System.out.println(token);
		}
	}
}
