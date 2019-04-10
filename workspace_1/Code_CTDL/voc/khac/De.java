package khac;

import java.io.*;
import java.util.*;

public class De {
	private static Scanner nhapVaoChu, docFile1, docFile2;

	public static void main(String[] args) throws IOException {
		File file1 = new File("Test.txt"), file2 = new File("bang_chu_cai.txt");
		docFile1 = new Scanner(file1);
		docFile2 = new Scanner(file2);

		Hashtable<String, String> table1 = new Hashtable<>();
		Hashtable<String, String> table2 = new Hashtable<>();
		Hashtable<Hashtable<String, String>, Hashtable<String, String>> table3 = new Hashtable<>();
		Hashtable<String, Hashtable<String, String>> table = new Hashtable<>();
		System.out.print("nhap vao ky tu bat ky: ");
		nhapVaoChu = new Scanner(System.in);
		String word = nhapVaoChu.nextLine(), word1 = null, word2 = null, word3 = null, word4 = null, word5 = null;
		char im = 0, im1 = 0;

		/*
		 * HashMap<String, String> map = new HashMap<>(); Hashtable<String,
		 * String> tab = new Hashtable<>(); Hashtable<ArrayList<String>,
		 * ArrayList<String>> tab2 = new Hashtable<>(); while
		 * (docFile1.hasNextLine()) { String[] tokens =
		 * docFile1.nextLine().split("[:]"); map.put(tokens[0], tokens[1]); for
		 * (Map.Entry m : map.entrySet()) { word1 = tokens[0]; im =
		 * word1.charAt(0); } if (im == word.charAt(0)) System.out.println(
		 * "im: " + im + "\n" + "word: " + word1 + " co nghia: " +
		 * map.get(word1)); }
		 * 
		 * while (docFile2.hasNextLine()) { String[] tokens1 =
		 * docFile2.nextLine().split(":"); tab.put(tokens1[0], tokens1[1]); for
		 * (Map.Entry m : tab.entrySet()) { word2 = tokens1[1]; im =
		 * word2.charAt(0); } if (im == word.charAt(0)) System.out.println(
		 * "tab in cai chu sau: \n" + word2); }
		 * 
		 * while (docFile1.hasNextLine() && docFile2.hasNextLine()) { String[]
		 * tokens2 = docFile1.nextLine().split(":"), tokens3 =
		 * docFile2.nextLine().split(":"); ArrayList<String> arr1 =
		 * tab2.get(tokens2[1]), arr2 = tab2.get(tokens3[1]); // loc theo ky tu
		 * dau tien System.out.println("arr1: " + arr1); System.out.println(
		 * "arr2: " + arr2); // tab2.put(arr2, arr1);//chua dung
		 * 
		 * for (Map.Entry m : tab2.entrySet()) { word3 = tokens2[1]; im =
		 * word3.charAt(0); } System.out.println("tab2: " + tab2);
		 * 
		 * if (im == word.charAt(0)) System.out.println("tab in cai chu sau: \n"
		 * + word3);
		 * 
		 * } map.clear(); tab.clear();
		 */

		// truyen vao hashtable hai cai hashtable thì sao?? :v // in ra dc // bi
		// han che size!
		while (docFile1.hasNextLine() && docFile2.hasNextLine()) {
			String[] tokens4 = docFile1.nextLine().split(":"), tokens5 = docFile2.nextLine().split(":");
			table1.put(tokens4[0], tokens4[1]);
			table2.put(tokens5[0], tokens5[1]);
			table3.put(table2, table1);// key va gia tri key luon di voi gia tri
			table.put(tokens5[1], table1);
			for (Map.Entry m : table1.entrySet()) {
				word4 = tokens4[0];
				im = word4.charAt(0);// lay chu dau cua tu trong tu dien
			}
			/*
			 * if (im == word.charAt(0)) { System.out.println("table1:   key: "
			 * + im + " | value: " + word4 + " | " + table1.get(word4)); }
			 */

			for (Map.Entry m : table2.entrySet()) {
				word5 = tokens5[1];
				im1 = word5.charAt(0);// lay chu strong bang chu cai nua
			}
			System.out.println(table);
			/*
			 * if (im1 == (word.charAt(0))) { System.out.println(
			 * "table2:   key: " + im1 + " | value: " + word5 + " | " +
			 * table.get(word5)); } else System.out.println("table2:   key: " +
			 * im1 + " | value: khong co value");
			 */
		}
		/*
		 * System.out .println("sau:\ntable: " + table.size() + "\ntable1: " +
		 * table1.size() + "\ntable2: " + table2.size());
		 */
	}
}
