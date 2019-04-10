package demo_0;

import java.io.*;
import java.util.*;
import java.util.Map.*;

public class Dictionary {
	Hashtable<Integer, HashMap<String, String>> dict;
	public static Scanner sc;
	File file;

	public Dictionary() throws FileNotFoundException {
		dict = new Hashtable<>();
		for (int i = 0; i < 26; i++) {
			dict.put(i, new HashMap<>());
		}
		init();
	}

	public int indexAddress(String key) {
		return key.charAt(0) - 'a';
	}

	public void init() throws FileNotFoundException {
		file = new File("D:\\dictionary.txt");
		sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String[] token = sc.nextLine().toLowerCase().split(":");
			put(token[0], token[1]);
		}
		sc.close();
	}

	public void put(String key, String value) {
		try {
			int index = indexAddress(key);
			dict.get(index).put(key, value);
		} catch (Exception e) {
			System.out.println("khong the them vao");
		}
	}

	public void searchFirst(String key) {
		for (Map.Entry m : dict.entrySet()) {
			if (m.getKey().equals(indexAddress(key)))
				System.out.println(m.getValue() + "\n");
		}
	}

	public void viewAll() {
		for (Map.Entry m : dict.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public void search(String key) throws IOException {
		int tmp = indexAddress(key);
		if (dict.get(tmp).get(key) != null) {
			System.out.println("Nghia cua tu la:" + dict.get(tmp).get(key));
		} else {
			System.out.println("Chua co");
			System.out.printf("Ban hay nhap y nghia cua tu %s: ", key);
			String value = sc.nextLine();
			put(key, value);
			FileWriter fw = new FileWriter("D:\\dictionary.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\n" + key + ": " + value);
			bw.close();
		}

	}

	public void remove(String key) throws IOException {
		int tmp = indexAddress(key);
		if (dict.get(tmp).get(key) != null) {
			dict.get(tmp).remove(key);
			System.out.printf("Da xoa tu %s", key);
			FileWriter fw = new FileWriter("D:\\dictionary.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(toStringForFile());
			bw.close();
		}
	}

	public void removeAll() {
		dict = null;

	}

	public String toStringForFile() {
		// in ra tu dien
		StringBuilder stb = new StringBuilder();
		if (dict != null) {
			for (Entry<Integer, HashMap<String, String>> e : dict.entrySet()) {
				// lay ra 1 hashMap
				Set set = e.getValue().entrySet();
				// Lay mot iterator
				Iterator itr = set.iterator();
				// Hien thi cac phan tu
				while (itr.hasNext()) {
					Map.Entry map = (Map.Entry) itr.next();
					stb.append(map.getKey() + ":" + map.getValue() + "\r\n");
				}
			}
		}
		return stb.toString();
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (Map.Entry m : dict.entrySet()) {
			s.append(m.getKey() + " " + m.getValue() + "\n");
		}
		return s.toString();
	}

	public static void main(String[] args) throws IOException {
		Dictionary test = new Dictionary();
		sc = new Scanner(System.in);
		System.out.print("Nhap tu cam kiem tra: ");
		String key = sc.nextLine();

		test.remove(key);
	}

}
