package tuan14_3_lab10_hashTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Dictionary2 {
	Hashtable<Integer, HashMap<String, String>> table;

	public Dictionary2() throws FileNotFoundException {
		table = new Hashtable<>();
		for (int i = 0; i < 26; i++) {
			table.put(i, new HashMap<>());
		}
		init();
	}

	public int keyHashTable(String key) {
		return key.charAt(0) - 97;
	}

	// xây dựng từ điển
	public void init() throws FileNotFoundException {
		File file = new File("dictionary2.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			String[] str = s.split(":");
			put(str[0], str[1]);
		}
		sc.close();
	}

	public void put(String key, String value) {
		try {
			int tmp = keyHashTable(key);
			table.get(tmp).put(key, value);
		} catch (Exception e) {
			System.out.println("Can't insert");
		}
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (table != null) {
			for (Entry<Integer, HashMap<String, String>> e : table.entrySet()) {
				Set set = e.getValue().entrySet();// lấy ra 1 hashMap
				// Lay mot iterator
				Iterator itr = set.iterator();
				// Hien thi cac phan tu
				while (itr.hasNext()) {
					Map.Entry me = (Map.Entry) itr.next();
					s.append(keyHashTable((String) me.getKey()) + ". " + me.getKey() + " co nghia la: " + me.getValue()
							+ "\n");
				}
			}
		}
		return s.toString();
	}

	public int count(String key) {
		return key.length();
	}

	public String translate(String key) {
		String result = "chua co tu nay trong tu dien ";
		int tmp = keyHashTable(key);
		if (table.get(tmp).get(key) != null) {
			result = table.get(tmp).get(key);
		}
		return key + " :" + result;

	}

	public void removeKey(String key) {
		int tmp = keyHashTable(key);
		if (table.get(tmp).get(key) != null) {
			table.get(tmp).remove(key);
		}
	}

	public void delete_tuDien() {
		table = null;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Dictionary2 test = new Dictionary2();
		System.out.println(test);
	}

}
