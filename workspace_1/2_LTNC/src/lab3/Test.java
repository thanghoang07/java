package lab3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Bai 2: \nNhap vao mot so nguyen: ");
		int so = nhapVao.nextInt();
		Bai2 b2 = new Bai2();
		System.out.printf("so nhap vao: %4d \ndem so: %4d \ndao so: %4d", so, Bai2.demSo(so), Bai2.daoSo(so));
		//
		System.out.print("Bai 3: \nNhap vao so tuoi cha: ");
		int tCha = nhapVao.nextInt();
		System.out.print("Nhap vao so tuoi con: ");
		int tCon = nhapVao.nextInt();
		Bai3 b3 = new Bai3();
		System.out.printf("Vay sau %d thi tuoi cha gap doi tuoi con", Bai3.tinhTuoi(tCha, tCon));
		//
		System.out.print("Bai4: \nNhap vao so thu nhat: ");
		int soA = nhapVao.nextInt();
		System.out.print("Nhap vao so thu nhat: ");
		int soB = nhapVao.nextInt();
		Bai4 b4 = new Bai4();
		System.out.printf("Uoc so chung lon nhat cua %d va %d la: %d \nBoi so chung nho nhat cua %d va %d la: %d", soA,
				soB, Bai4.uCLN(soA, soB), soA, soB, Bai4.bCNN(soA, soB));
	}
}
