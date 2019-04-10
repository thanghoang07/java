package lab10;

import java.io.*;
import java.util.*;
import java.util.Map.*;

public class Dictionary {
	private static Scanner docFile;
	private Scanner nhapVaoChu;
	// key la mang dau tien khi doc file dictionary
	// HashMap<String, String> map;
	Hashtable<Integer, HashMap<String, String>> table;

	public Dictionary() throws FileNotFoundException {
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
		File file = new File("dic2.txt");
		docFile = new Scanner(file);
		while (docFile.hasNextLine()) {
			String[] mangStr = docFile.nextLine().toLowerCase().split(":");
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
				// lay ra 1 hashMap roi Lay mot iterator
				Iterator itr = e.getValue().entrySet().iterator();
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

	public void search(String key) throws IOException {
		nhapVaoChu = new Scanner(System.in);
		int tmp = keyHashTable(key);
		if (table.get(tmp).get(key) != null) {
			System.out.printf("Nghia cua tu %s la: " + table.get(tmp).get(key), key);
		} else {
			System.out.printf("Chua co tu %s trong tu dien!!", key);
			System.out.printf("\nBan hay nhap y nghia cua tu %s: ", key);
			String value = nhapVaoChu.nextLine();
			put(key, value);
			FileWriter fw = new FileWriter("dic2.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(key + ": " + value);			
			bw.close();
			System.out.printf("Da them vao tu dien tu %s va nghia %s !!!", key, value);
		}

	}

	public void removeKey(String key) throws IOException {
		// moi co xoa tu tren man hinh con trong file thi chua
		int tmp = keyHashTable(key);
		if (table.get(tmp).get(key) != null) {
			table.get(tmp).remove(key);
			System.out.printf("Da xoa tu %s ra khoi tu dien", key);
			FileWriter fw = new FileWriter("dic2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(toStringForFile());
			bw.close();
		}
	}

	public void removeAll() {
		// xoa toan bo tu dien tren man hinh con tren file thi chua
		table = null;
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("thanghoang.txt"));
			writer.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public String toStringForFile() {
		// in ra tu dien
		StringBuilder stb = new StringBuilder();
		if (table != null) {
			for (Entry<Integer, HashMap<String, String>> e : table.entrySet()) {
				// lay ra 1 hashMap roi Lay mot iterator
				Iterator itr = e.getValue().entrySet().iterator();
				// Hien thi cac phan tu
				while (itr.hasNext()) {
					Map.Entry map = (Map.Entry) itr.next();
					stb.append(map.getKey() + ":" + map.getValue() + "\n");
				}
			}
		}
		return stb.toString();
	}

	public String searchFirst(String key) {
		Integer num = keyHashTable(key);
		// in ra tu dien
		StringBuilder stb = new StringBuilder();
		if (table != null) {
			for (Entry<Integer, HashMap<String, String>> e : table.entrySet()) {
				Integer inte = e.getKey();
				if (inte == num) {
					// lay ra 1 hashMap roi Lay mot iterator
					Iterator itr = e.getValue().entrySet().iterator();
					// Hien thi cac phan tu co cung ky tu dau
					while (itr.hasNext()) {
						Map.Entry map = (Map.Entry) itr.next();
						stb.append(keyHashTable((String) map.getKey()) + ". " + map.getKey() + ":" + map.getValue()
								+ "\n");
					}
				}
			}
		}
		return stb.toString();
	}
	
	public void showMenu(){
		System.out.print("---Tu dien---\n1: Tra tu trong tu dien, ko co thi them vao(nhap so 1) "
				+ "\n2: Xoa tu trong tu dien(nhap so 2) " + "\n3: In toan bo tu dien(nhap so 3) "
				+ "\n4: In tu theo ky tu dau tien(nhap so 4)" + "\nnhap vao mot so tuong ung: ");
	}
}
