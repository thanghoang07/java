package tuan14;

//ban_moi_v18122015
//ban_moi_v19122015
//ban_moi_v20122015
import java.io.*;
import java.util.*;

public class Bai1_2 {
	// thu_voi_size_nho_hon_10
	private static Scanner docFile;
	private static Scanner nhapVaoSo;
	private static Scanner nhapVaoChu;

	public static void main(String[] args) throws IOException {
		nhapVaoSo = new Scanner(System.in);
		nhapVaoChu = new Scanner(System.in);
		System.out.print(
				"1: tra tu trong tu dien, ko co thi them vao(nhap so 1) " + "\n2: xoa tu trong tu dien(nhap so 2) "
						+ "\n3: in toan bo tu dien(nhap so 3) " + "\nnhap vao mot so tuong ung: ");
		int so = nhapVaoSo.nextInt();
		File file = new File("dic0.txt");
		docFile = new Scanner(file);
		HashMap<String, String> map = new HashMap<String, String>();
		while (docFile.hasNextLine()) {
			String[] tokens = docFile.nextLine().split("[:]");
			map.put(tokens[0], tokens[1]);
		}
		FileWriter fw = new FileWriter(file.getName(), true);
		BufferedWriter bw = new BufferedWriter(fw);
		switch (so) {
		case 1:
			// bi_loi_phan_them_vao_danh_sach_tu_dien!!! ==>> xong
			// bi_loi_phan_co_tu_ma_chua_co_nghia_them_vao_nhung_tu_do_van_chua_co_xoa_dc!!
			// ==>>
			System.out.print("nhap vao tu can dich: ");
			String word = nhapVaoChu.nextLine();
			String value = map.get(word);
			String ko = "null";
			if (map.size() == 0) {
				System.out.println("tu dien dang trong, hay them tu vao tu dien:");
				System.out.println("Nhap vao nghia cua tu: ");
				String key0 = nhapVaoChu.nextLine();
				map.put(word, key0);
				bw.write(word + ":" + key0);
				//bw.newLine();
				bw.close();
				System.out.printf("da them tu %s vao tu dien!!!! \n", word);
			} else if (map.size() <= 10) {// co_the_bo
				// size_nho_hon_10_in_ra
				if (map.containsKey(word) && value.equals(ko) != true) {
					System.out.printf("word: %s \n\tnghia cua tu: %s \n", word, value);
					int j = 0;
					for (Map.Entry m : map.entrySet()) {
						j++;
						System.out.println(j + "\t-> " + m.getKey() + ": " + m.getValue());
					}
				} else if (map.containsKey(word) && value.equals(ko)) {
					System.out.printf("word: %s \n\tchua co phien dich trong tu dien!!!", word);
					System.out.printf("nhap vao nghia cua tu %s: ", word);
					String key2 = nhapVaoChu.nextLine();
					map.replace(word, key2);
					map.put(word, key2);
					bw.write("\n" + word + ":" + key2);
					bw.newLine();
					bw.close();
					System.out.printf("da them tu %s vao tu dien!!!! \n", word);
					int j = 0;
					for (Map.Entry m : map.entrySet()) {
						j++;
						System.out.println(j + "\t-> " + m.getKey() + ": " + m.getValue());
					}
				} else {
					// them_vao_mot_tu_moi_hoan_toan_ko_co_trong_tu_dien
					System.out.println("chua co trong tu dien!!!");
					System.out.print("nhap vao nghia cua tu: ");
					String key2 = nhapVaoChu.nextLine();
					map.put(word, key2);
					bw.newLine();
					bw.write(word + ":" + key2);					
					bw.close();
					System.out.printf("da them tu %s vao tu dien!!!! \n", word);
					int j = 0;
					for (Map.Entry m : map.entrySet()) {
						j++;
						System.out.println(j + "\t-> " + m.getKey() + ": " + m.getValue());
					}
				}
			} else {
				// size_nhieu_hon_10_ko_in_ra
				if (map.containsKey(word) && value.equals(ko) != true) {
					System.out.printf("word: %s \n\tnghia cua tu: %s", word, value);
				} else if (map.containsKey(word) && value.equals(ko)) {
					System.out.printf("word: %s \n\tchua co phien dich trong tu dien!!!", word);
					System.out.printf("nhap vao nghia cua tu %s: ", word);
					String key2 = nhapVaoChu.nextLine();
					map.replace(word, key2);
					map.put(word, key2);
					bw.write(word + ":" + key2);
					bw.newLine();
					bw.close();
					System.out.printf("da them tu %s vao tu dien!!!!", word);
				} else {
					// them_vao_mot_tu_moi_hoan_toan_ko_co_trong_tu_dien
					System.out.println("chua co trong tu dien!!!");
					System.out.print("nhap vao nghia cua tu: ");
					String key2 = nhapVaoChu.nextLine();
					map.put(word, key2);
					bw.write(word + ":" + key2);
					bw.newLine();
					bw.close();
					System.out.printf("da them tu %s vao tu dien!!!!", word);
				}
			}
			break;
		case 2:
			// chua_lam_xong
			// tren_man_hinh_thi_xoa_dc_chua_xoa_tren_file_dc ==> xong
			// in_ra_file_phan_da_xoa_dc_con_cai_xoa_file_ban_dau_thi_chua
			System.out.println("1: Xoa mot tu trong tu dien(nhap so 1) \n2:Xoa toan bo tu dien(nhap so 2)");
			System.out.print("nhap vao mot so tuong ung: ");
			int so1 = nhapVaoSo.nextInt();
			switch (so1) {
			case 1:
				System.out.println("xoa mot tu trong tu dien: ");
				System.out.print("nhap vao tu xoa: ");
				String word1 = nhapVaoChu.nextLine();
				String value1 = map.get(word1);
				if (map.containsKey(word1)) {
					map.remove(word1, value1);
					if (map.size() <= 10) {// co_the_bo
						// in ra
						int j = 0;
						bw.newLine();
						for (Map.Entry m : map.entrySet()) {
							j++;
							System.out.println(j + "\t-> " + m.getKey() + ": " + m.getValue());
							// in_ra_man_hinh_nhung_gia_tri_con_lai
							bw.write(m.getKey() + ":" + m.getValue());
							// ghi_vao_file_nhung_gia_tri_con_lai
							bw.newLine();
						}
					} else {
						bw.newLine();
						for (Map.Entry m : map.entrySet()) {
							bw.write(m.getKey() + ":" + m.getValue());
							// ghi_vao_file_nhung_gia_tri_con_lai
							bw.newLine();
						}
					}
				} else {
					System.out.printf("tu %s khong co trong tu dien", word1);
				}
				bw.close();
				break;
			case 2:
				// xoa_toan_bo_tu_dien_chua_in_ra_file_dc
				System.out.println("Xoa toan bo tu dien: ");
				map.clear();
				int i = 0;
				if (map.size() != 0) {
					// dang_thu_neu_file_con_phan_tu_thi_in_ra
					for (Map.Entry m : map.entrySet()) {
						i++;
						System.out.println(i + "\t-> " + m.getKey() + ": " + m.getValue());
					}
				} else {
					// file_ko_con_phan_tu_thi_in_ra
					System.out.println("tu dien dang trong");
				}
				break;
			default:
				System.out.println("loi........!!!");
				break;
			}
			break;
		case 3:
			// ==> xong // in_ra
			System.out.println("in toan bo tu dien: ");
			int i = 0;
			for (Map.Entry m : map.entrySet()) {
				i++;
				System.out.println(i + "\t-> " + m.getKey() + ": " + m.getValue());
			}
			break;
		case 4:
			// chua lam xong
			// cha biet lam nhu the nao nua
			// loc file theo ki tu dau tien
			System.out.print("nhap vao ky tu dau: ");
			String word2 = nhapVaoChu.nextLine();
			// String word3 = docFile.nextLine();
			// word3.charAt(0);
			String word3;
			char im = 0;
			while (docFile.hasNextLine()) {
				String[] tokens = docFile.nextLine().split("[:]");
				map.put(tokens[0], tokens[1]);
				word3 = tokens[0];
				im = word3.charAt(1);

				/*
				 * if (word2.equals(word3)) { if (map.get(word3) != null) {
				 * System.out.println("in ra: " + word3); } else {
				 * System.out.println("in ra: " + word2 + 1); } } else
				 * System.out.println("iiiiiii");
				 */
			}
			System.out.println("word2: " + word2);
			System.out.println("im: " + 1 + im + 1);
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
