package thongKeCacTuTrongVanBan;

import java.io.*;
import java.util.*;

public class CreateIdxFile {
	HashMap<String, ArrayList<Integer>> ds;

	public CreateIdxFile() {
		ds = new HashMap<String, ArrayList<Integer>>();
	}

	public void CreateIndex(String sourceFile, String indexFile) {
		try {
			Scanner sc = new Scanner(new FileInputStream(sourceFile), "UTF-8");
			String line = "";
			int lineNo = 0;
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				lineNo++;
				StringTokenizer tk = new StringTokenizer(line, " ");
				while (tk.hasMoreTokens()) {
					String w = tk.nextToken();
					xuly(w, lineNo);
				}
			}
			// Đưa ra file index
			Put2File(indexFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void xuly(String key, int lineNo) {
		// chưa có từ thì tạo 1 mục mới
		if (!ds.containsKey(key)) {
			ArrayList<Integer> lst = new ArrayList<Integer>();
			lst.add(new Integer(lineNo));
			ds.put(key, lst);
		} else // đã có từ trong danh sách
		{
			ArrayList<Integer> lst = ds.get(key);
			lst.add(new Integer(lineNo));
		}
	}

	public void Put2File(String indexFile) {
		try {
			PrintWriter out = new PrintWriter(indexFile, "UTF-8");
			Set<String> setKey = ds.keySet();
			Iterator<String> it = setKey.iterator();
			while (it.hasNext()) {
				String key = it.next();
				ArrayList<Integer> arr = ds.get(key);
				String idx = "";
				for (Integer i : arr)
					idx += i.toString() + ",";
				out.println(key + " " + idx);
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		File file = new File("output.txt");
		CreateIdxFile cif = new CreateIdxFile();
		System.out.println("sadsfaas");
		cif.CreateIndex("in.txt", "output.txt");
	}
}
