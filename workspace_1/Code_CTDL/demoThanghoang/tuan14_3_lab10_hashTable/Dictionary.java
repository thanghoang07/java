package tuan14_3_lab10_hashTable;

import java.io.*;
import java.util.Map.*;
import java.util.*;

public class Dictionary {
	HashMap<String, String> map;

	public Dictionary() throws FileNotFoundException {
		map = new HashMap<>();
	}

	// đọc từ điển từ file
	public void init() throws FileNotFoundException {
		File file = new File("output.txt");
		Scanner docFile = new Scanner(file);
		while (docFile.hasNextLine()) {
			String s = docFile.nextLine();
			String[] str = s.split(":");
			map.put(str[0], str[1]);
		}
		docFile.close();
	}

	public int count(String key) {
		return key.length();
	}

	public void saveToFile() {
		int n = 100000000;
		BufferedWriter bf = null;
		try {
			bf = new BufferedWriter(new FileWriter("lab10_output.txt"));
			for (int i = 0; i < n; i++) {
				bf.write(i + ":" + i + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (bf != null) {
				try {
					bf.close();
				} catch (Exception e2) {
					System.err.println(e2);
				}
			}
		}
	}

	// tìm với kí tự đầu
	public String findClose(String key) {
		StringBuilder s = new StringBuilder();
		for (Entry e : map.entrySet()) {
			String st = (String) e.getKey();
			String ss = st.substring(0, count(key));
			if (ss.equals(key)) {
				s.append(e.getKey() + " :" + e.getValue() + "\n");
			}
		}
		return s.toString();
	}

	public void find(String key) {
		System.out.println(key + ": " + map.get(key));
	}

	public void remove(String key) {
		for (Entry e : map.entrySet()) {
			if (e.getKey().equals(key))
				map.remove(key);
		}
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (Entry e : map.entrySet()) {
			s.append(e.getKey() + ": " + e.getValue() + "\n");
		}
		return s.toString();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Dictionary dic = new Dictionary();
		System.out.println(dic.toString());
		//dic.find("1");
		//System.out.println(dic.findClose("winning"));
		
	}
}
