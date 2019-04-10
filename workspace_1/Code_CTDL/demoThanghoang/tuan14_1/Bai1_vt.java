package tuan14_1;

import java.io.*;
import java.util.*;

public class Bai1_vt {
	public static void main(String[] args) throws IOException {
		File file = new File("output.txt");
		Scanner sc = new Scanner(file);

		HashMap<String, String> dict = new HashMap<String, String>();
		while (sc.hasNextLine()) {
			String[] tokens = sc.nextLine().split(":");
			dict.put(tokens[0], tokens[1]);
		}
		sc.close();
		sc = new Scanner(System.in);
		System.out.print("Nhap tu can tim: ");
		String key = sc.nextLine();
		if (dict.containsKey(key))
			System.out.print(dict.get(key));
		else {
			System.out.println("Chua co");
			System.out.printf("Bạn hãy nhập ý nghia của từ %s: ", key);
			String value = sc.nextLine();
			dict.put(key, value);
			FileWriter fw = new FileWriter(file.getName(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\n" + key + ": " + value);
			bw.close();
		}

		// for (Map.Entry m : dict.entrySet()) {
		// System.out.print(m.getKey() + "\n");
		// }

	}
}
