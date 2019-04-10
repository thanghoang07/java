package khac;

import java.io.*;
import java.util.*;
import java.util.Map.*;

public class De_1 {
	private static Scanner docFile;
	String ketQua = "chua co tu nay trong tu dien ";
	// key la mang dau tien khi doc file dictionary
	// HashMap<String, String> map;
	Hashtable<Integer, HashMap<String, String>> table;

	public De_1() throws FileNotFoundException {
		table = new Hashtable<>();
		for (int i = 0; i < 26; i++) {
			// them vao table
			table.put(i, new HashMap<String, String>());
		}
		docTuFile();
	}

	public int keyHashTable(String key) {
		// lay gia tri ky tu dau tien cua tu
		return (int) key.charAt(0) - 97;
	}

	// xay dung tu dien
	public void docTuFile() throws FileNotFoundException {
		File file = new File("dic0.txt");
		docFile = new Scanner(file);
		while (docFile.hasNextLine()) {
			String s = docFile.nextLine();
			String[] mangStr = s.split(":");
			// them vao table
			put(mangStr[0], mangStr[1]);
		}
		docFile.close();
	}

	public void put(String key, String value) {
		// them phan tu tu file vao Hashtable
		try {
			int tmp = keyHashTable(key);
			table.get(tmp).put(key, value);
		} catch (Exception e) {
			System.out.println("khong the chen vo bang");
		}
	}

	@Override
	public String toString() {
		// in ra tu dien
		StringBuilder stb = new StringBuilder();
		if (table != null) {
			for (Entry<Integer, HashMap<String, String>> e : table.entrySet()) {
				// lay ra 1 hashMap
				Set set = e.getValue().entrySet();
				// Lay mot iterator
				Iterator itr = set.iterator();
				// Hien thi cac phan tu
				while (itr.hasNext()) {
					Map.Entry map = (Map.Entry) itr.next();
					stb.append(
							keyHashTable((String) map.getKey()) + ". " + map.getKey() + ": " + map.getValue() + "\n");
				}
			}
		}
		return stb.toString();
	}

	public int count(String key) {
		// dem do dai cua mot tu
		return key.length();
	}

	public String traTu(String key) {
		// tra mot tu trong tu dien
		int tmp = keyHashTable(key);
		if (table.get(tmp).get(key) != null) {
			ketQua = table.get(tmp).get(key);
		}
		return "tu: " + key + ": " + ketQua;
	}

	public void removeKey(String key) {
		// moi co xoa tu tren man hinh con trong file thi chua
		int tmp = keyHashTable(key);
		if (table.get(tmp).get(key) != null) {
			table.get(tmp).remove(key);
		}
	}

	public void delete_tuDien() {
		// xoa toan bo tu dien tren man hinh con tren file thi chua
		table = null;
	}

	public void demoKey(String key) {
		int tmp = keyHashTable(key);
		System.out.println(tmp);
	}

	public String inTuRaFileX() {
		// in ra tu dien
		StringBuilder stb = new StringBuilder();
		if (table != null) {
			for (Entry<Integer, HashMap<String, String>> e : table.entrySet()) {
				// lay ra 1 hashMap
				Set set = e.getValue().entrySet();
				// Lay mot iterator
				Iterator itr = set.iterator();
				// Hien thi cac phan tu
				while (itr.hasNext()) {
					Map.Entry map = (Map.Entry) itr.next();
					stb.append(map.getKey() + ":" + map.getValue() + "\n");
				}
			}
		}
		return stb.toString();
	}

	public String locTuTheoKyTu(String key) {
		Integer num = keyHashTable(key);
		// in ra tu dien
		StringBuilder stb = new StringBuilder();
		if (table != null) {
			for (Entry<Integer, HashMap<String, String>> e : table.entrySet()) {
				Integer inte = e.getKey();
				if (inte == num) {
					// lay ra 1 hashMap
					Set setMap = e.getValue().entrySet();
					// Lay mot iterator
					Iterator itr = setMap.iterator();
					// Hien thi cac phan tu co cung ky tu dau
					while (itr.hasNext()) {
						Map.Entry map = (Map.Entry) itr.next();
						stb.append(map.getKey() + ":" + map.getValue() + "\n");
					}
				}
			}
		}
		return stb.toString();
	}

	public static void main(String[] args) throws FileNotFoundException {
		De_1 test = new De_1();
		System.out.println(test.locTuTheoKyTu("s"));
		// test.demoKey("demo");

	}

}
