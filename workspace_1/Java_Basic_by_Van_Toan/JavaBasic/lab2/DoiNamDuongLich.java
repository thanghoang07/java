package lab2;

import java.util.Scanner;

public class DoiNamDuongLich {
	public static void main(String[] args) {
		// tao Scanner
		Scanner input = new Scanner(System.in);
		// nhập năm cần đổi
		System.out.print("Nhập năm dương lịch cần đổi sang năm âm lịch : ");
		int year = input.nextInt();
		int can = year % 10;
		int chi = year % 12;
		// tinh Can
		String strCan = "";
		switch (can) {
		case 0:
			strCan = "Canh";
			break;
		case 1:
			strCan = "Tân";
			break;
		case 2:
			strCan = "Nhâm";
			break;
		case 3:
			strCan = "Quý";
			break;
		case 4:
			strCan = "Giáp";
			break;
		case 5:
			strCan = "Ất";
			break;
		case 6:
			strCan = "Binh";
			break;
		case 7:
			strCan = "Đinh";
			break;
		case 8:
			strCan = "Mậu";
			break;
		case 9:
			strCan = "Kỷ";
			break;
		}
		// tinh Chi
		String strChi = "";
		switch (chi) {
		case 0:
			strChi = "Thân";
			break;
		case 1:
			strChi = "Dậu";
			break;
		case 2:
			strChi = "Tuất";
			break;
		case 3:
			strChi = "Hợi";
			break;
		case 4:
			strChi = "Tý";
			break;
		case 5:
			strChi = "Sửu";
			break;
		case 6:
			strChi = "Dần";
			break;
		case 7:
			strChi = "Mão";
			break;
		case 8:
			strChi = "Thìn";
			break;
		case 9:
			strChi = "Tỵ";
			break;
		case 10:
			strChi = "Ngọ";
			break;
		case 11:
			strChi = "Mùi";
			break;
		}
		System.out.print("Năm " + year + " là năm " + strCan + " " + strChi);
	}
}
