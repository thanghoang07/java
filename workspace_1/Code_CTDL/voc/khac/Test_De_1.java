package khac;

import java.io.*;
import java.util.*;

public class Test_De_1 {
	static String ketQua = "chua co tu nay trong tu dien ";
	private static Scanner nhapVaoChu;
	private static Scanner nhapVaoSo;

	public static void main(String[] args) throws IOException {
		nhapVaoSo = new Scanner(System.in);
		nhapVaoChu = new Scanner(System.in);
		FileWriter fw = new FileWriter("dic0.txt", true);
		BufferedWriter bw = new BufferedWriter((fw));
		De_1 dic = new De_1();
		System.out.print("1: Tra tu trong tu dien, ko co thi them vao(nhap so 1) "
				+ "\n2: Xoa tu trong tu dien(nhap so 2) " + "\n3: In toan bo tu dien(nhap so 3) "
				+ "\n4: In tu theo ky tu dau tien(nhap so 4)" + "\nnhap vao mot so tuong ung: ");
		int so = nhapVaoSo.nextInt();
		switch (so) {
		case 1:
			System.out.println("Nhap vao mot tu: ");
			String key = nhapVaoChu.nextLine();
			if (dic.traTu(key).equals("tu: " + key + ": " + ketQua)) {
				System.out.printf(ketQua + "\nNhap vao nghia cua tu %s: ", key);
				String value = nhapVaoChu.nextLine();
				dic.put(key, value);
				bw.write(key + ":" + value);
				bw.newLine();
				bw.close();
				System.out.printf("Da them tu %s vao tu dien!!!! \n", key);
			} else {
				System.out.println(dic.traTu(key));
			}
			break;
		case 2:
			System.out.println("==>1: Xoa mot tu trong tu dien(nhap so 1) \n==>2: Xoa toan bo tu dien(nhap so 2)");
			System.out.print("Nhap vao mot so tuong ung: ");
			int so1 = nhapVaoSo.nextInt();
			switch (so1) {
			case 1:
				System.out.println("Xoa mot tu trong tu dien: ");
				System.out.println("Nhap vao mot tu: ");
				String key1 = nhapVaoChu.nextLine();
				dic.removeKey(key1);
				System.out.printf("Da xoa tu %s ra khoi tu dien!!", key1);
				FileWriter fw1 = new FileWriter("dic0.txt");
				BufferedWriter bw1 = new BufferedWriter(fw1);
				bw1.write(dic.inTuRaFileX());
				bw1.close();
				break;
			case 2:
				System.out.println("Xoa toan bo tu dien: ");
				dic.delete_tuDien();
				System.out.println("Da xoa toan bo tu dien!!");
				FileWriter fw2 = new FileWriter("dic0.txt");
				BufferedWriter bw2 = new BufferedWriter(fw2);
				bw2.write("");
				bw2.close();
				break;
			}
			break;
		case 3:
			System.out.println("In toan bo tu dien: \n" + dic);
			break;
		case 4:
			System.out.print("Xem tu dien bang ky tu dau tien: \nNhap vao mot ky tu: ");
			String key2 = nhapVaoChu.nextLine();
			System.out.printf("In ra cac tu co %s dung dau la: \n" + dic.locTuTheoKyTu(key2), key2);
			break;
		default:
			System.out.println("loi........!!!");
			break;
		}
		dic.delete_tuDien();
	}
}
