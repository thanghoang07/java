package lab10;

import java.io.*;
import java.util.*;

public class Bai1 {
	private static Scanner nhapVaoChu;
	private static Scanner nhapVaoSo;
	private static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		nhapVaoSo = new Scanner(System.in);
		nhapVaoChu = new Scanner(System.in);
		FileWriter fw = new FileWriter("dic2.txt", true);
		setBw(new BufferedWriter((fw)));
		Dictionary dic = new Dictionary();
		dic.showMenu();
		int so = Integer.parseInt(nhapVaoSo.nextLine());
		switch (so) {
		case 1:
			System.out.print("Nhap vao mot tu: ");
			String key = nhapVaoChu.nextLine();
			dic.search(key);
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
				break;
			case 2:
				System.out.println("Xoa toan bo tu dien: ");
				dic.removeAll();
				System.out.println("Da xoa toan bo tu dien!!");
				FileWriter fw2 = new FileWriter("dic2.txt");
				BufferedWriter bw2 = new BufferedWriter(fw2);
				bw2.write("");
				bw2.close();
				break;
			default:
				System.out.println("loi........!!!");
				break;
			}
			break;
		case 3:
			System.out.println("In toan bo tu dien: \n" + dic);
			break;
		case 4:
			System.out.print("Xem tu dien bang ky tu dau tien: \nNhap vao mot ky tu: ");
			String key2 = nhapVaoChu.nextLine();
			System.out.printf("In ra cac tu co %s dung dau la: \n" + dic.searchFirst(key2), key2.toUpperCase());
			break;
		default:
			System.out.println("loi........!!!");
			break;
		}
		dic.removeAll();
	}

	public static BufferedWriter getBw() {
		return bw;
	}

	public static void setBw(BufferedWriter bw) {
		Bai1.bw = bw;
	}
}
