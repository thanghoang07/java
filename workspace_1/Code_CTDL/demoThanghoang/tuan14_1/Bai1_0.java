package tuan14_1;
//ban cu
import java.io.*;
import java.util.*;

public class Bai1_0 {
	private static Scanner docFile;
	private static Scanner nhapVao;
	private static Scanner nhapVao1;

	public static void main(String[] args) throws IOException {
		nhapVao1 = new Scanner(System.in);
		System.out.print("1: tra tu trong tu dien, ko co thi them vao: " + "\n2: xoa tu trong tu dien: "
				+ "\n3: in toan bo tu dien: " + "\nnhap vao mot so: ");
		int so = nhapVao1.nextInt();
		File file = new File("dictionary1.txt");
		docFile = new Scanner(file);

		HashMap<String, String> map = new HashMap<String, String>();

		while (docFile.hasNextLine()) {
			String[] tokens = docFile.nextLine().split("[:]");
			map.put(tokens[0], tokens[1]);
		}

		switch (so) {
		case 1:
			nhapVao = new Scanner(System.in);
			System.out.print("nhap vao tu can dich: ");
			String word = nhapVao.nextLine();
			String value = map.get(word);

			FileOutputStream fos = new FileOutputStream("output.txt");
			PrintWriter pw = new PrintWriter(fos);

			if (map.containsKey(word) && value.equals("null") != true) {
				System.out.println();
				System.out.print("word: " + word + "\n\tnghia cua tu: " + value);
			} else if (map.containsKey(word) && value.equals("null") == true) {
				System.out.println("word: " + word + "\n\tchua co phien dich trong tu dien!!!");
				System.out.print("nhap vao nghia cua tu: ");
				String key2 = nhapVao.nextLine();
				map.put(word, key2);
				pw.println(word + ":" + key2);
				System.out.println("da them vao tu dien!!!!");
			} else {
				System.out.println("chua co trong tu dien!!!");
				System.out.print("nhap vao nghia cua tu: ");
				String key2 = nhapVao.nextLine();
				map.put(word, key2);
				pw.println(word + ":" + key2);
				System.out.println("da them vao tu dien!!!!");
			}

			pw.close();
			fos.flush();
			fos.close();
			docFile.close();
			break;
		case 2:
			System.out.println("xoa mot tu trong tu dien: ");
			nhapVao = new Scanner(System.in);
			System.out.print("nhap vao tu xoa: ");
			String word1 = nhapVao.nextLine();
			String value1 = map.get(word1);
			if (map.containsKey(word1) == true) {
				map.remove(word1, value1);
			} else {
				System.out.println("tu " + word1 + " khong co trong tu dien");
			}
			break;
		case 3:
			System.out.println("in toan bo tu dien: ");
			int i = 0;
			for (Map.Entry m : map.entrySet()) {
				i++;
				System.out.println(i + "\t-> " + m.getKey() + ": " + m.getValue());
			}
			break;
		case 4:
			System.out.println();
			nhapVao = new Scanner(System.in);
			System.out.println("nhap vao ky tu dau: ");
			String word2 = nhapVao.nextLine();
			//map.get();
			break;
		default:
			System.out.println("loi........!!!");
			break;
		}
		docFile.close();
	}
}