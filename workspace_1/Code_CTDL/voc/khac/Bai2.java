package khac;

import java.io.*;
import java.util.*;
import lab9.*;

public class Bai2 {
	public static void main(String[] args) throws IOException {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Nhap duong dan file(vd: C:\\data.txt): ");
		String link = sc.nextLine();
		File file = new File(link);
		try {
			sc = new Scanner(file);
			ArraySet<String> data = new ArraySet<>();
			String[] tokens = sc.nextLine().split(" ");
			for (String token : tokens) {
				data.add(token);
			}
			System.out.println("da in ra file");
			saveToFile(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void saveToFile(SetADT<String> set) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("D:\\FileOutput.txt"));
			Iterator<String> itr = set.iterator();
			while (itr.hasNext())
				writer.write(itr.next() + " ");
			writer.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
