package tuan14;

import java.io.*;
import java.util.*;

public class Bai1_1 {
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
			// bi loi phan them vao danh sach tu dien!!! ==>> xong 
			// bi loi phan co tu ma chua co nghia them vao nhung tu do van chua co xoa dc!! ==>>
			nhapVao = new Scanner(System.in);
			System.out.print("nhap vao tu can dich: ");
			String word = nhapVao.nextLine();
			String value = map.get(word);
			
			FileWriter fw = new FileWriter(file.getName(), true);
			BufferedWriter bw = new BufferedWriter(fw);

			if (map.containsKey(word) && value.equals("null") != true) {
				System.out.println();
				System.out.print("word: " + word + "\n\tnghia cua tu: " + value);
			} else if (map.containsKey(word) && value.equals("null") == true) {
				System.out.println("word: " + word + "\n\tchua co phien dich trong tu dien!!!");
				
				System.out.print("nhap vao nghia cua tu: ");
				String key2 = nhapVao.nextLine();
				map.replace(word, key2);
				//map.put(word, key2);
				bw.write("\n" + word +":" + key2 );
				bw.close();
				System.out.println("da them vao tu dien!!!!");
			} else {
				System.out.println("chua co trong tu dien!!!");
				System.out.print("nhap vao nghia cua tu: ");
				String key2 = nhapVao.nextLine();
				//map.put(word, key2);
				bw.write("\n" + word +":" + key2 );
				bw.close();
				System.out.println("da them vao tu dien!!!!");
			}

			break;
		case 2:// chua lam xong
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
		case 3:// ==> xong
			System.out.println("in toan bo tu dien: ");
			int i = 0;
			for (Map.Entry m : map.entrySet()) {
				i++;
				System.out.println(i + "\t-> " + m.getKey() + ": " + m.getValue());
			}
			break;
		case 4:// chua lam xong
			System.out.println();
			nhapVao = new Scanner(System.in);
			System.out.print("nhap vao ky tu dau: ");
			String word2 = nhapVao.nextLine();
			// String word3 = docFile.nextLine();
			// word3.charAt(0);

			while (docFile.hasNextLine()) {
				String[] tokens = docFile.nextLine().split("[:]");
				map.put(tokens[0], tokens[1]);
				String word3 = tokens[0];

				word3.charAt(0);
				if (word2.equals(word3) == true) {
					if (map.get(word3) != null) {
						System.out.println("in ra: " + word3);
					} else {
						System.out.println("in ra: " + word2 + 1);
					}
				}
				else
					System.out.println("iiiiiii");
			}

			/*
			 * for (Map.Entry m : map.entrySet()) { System.out.println(a +
			 * "\t-> " + m.getKey().equals(word2)); }
			 */
			break;
		default:
			System.out.println("loi........!!!");
			break;
		}
		docFile.close();
	}
}
