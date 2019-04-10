package lab8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import lab7.SinhVien;

public class Bai3 implements Comparable<Bai3> {
	private static Scanner nhapVao;

	@Override
	public int compareTo(Bai3 o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void ghiFile(ArrayList<SinhVien> sinhV) throws IOException {
		FileOutputStream fos = new FileOutputStream("danhSachSinhVienLab8.txt");
		PrintWriter pw = new PrintWriter(fos);

		for (int i = 0; i < sinhV.size(); i++) {
			if (sinhV.get(i) != null) {
				pw.println("\n" + (i + 1) + sinhV.get(i) + "\n");
			} else {
				pw.println("");
			}
		}
		pw.close();
		fos.flush();
		fos.close();
	}

	public int binarySearch(ArrayList<SinhVien> sinhV, int searchValue, int left, int right) {
		if (right < left) {
			return -1;
		}
		int mid = (left + right) / 2;
		if ((sinhV.get(mid).getmSV()) < (searchValue)) {
			return binarySearch(sinhV, searchValue, mid + 1, right);
		} else if ((sinhV.get(mid).getmSV()) > (searchValue)) {
			return binarySearch(sinhV, searchValue, left, mid - 1);
		} else {
			return mid;
		}
	}

	public void bubbleSortMSV(ArrayList<SinhVien> sinhV) {
		SinhVien tmp = null;
		for (int i = sinhV.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sinhV.get(j).getmSV() > (sinhV.get(j + 1).getmSV())) {
					tmp = sinhV.get(j);
					sinhV.set(j, sinhV.get(j + 1));
					sinhV.set(j + 1, tmp);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		ArrayList<SinhVien> danhSach = new ArrayList<SinhVien>();

		danhSach.add(new SinhVien(01, "Hoang", "Duc", "Thang", 7.9, 8.6, 7.4));
		danhSach.add(new SinhVien(03, "Trinh", "Van","Toan", 9.0, 8.0, 8.5));
		danhSach.add(new SinhVien(02, "Vo", "Quoc","Huy", 10, 9.5, 9.75));
		danhSach.add(new SinhVien(05, "Nguyen", "Thanh","Trung", 7.4, 8.9, 7));
		danhSach.add(new SinhVien(04, "Tran", "Thi","Kim", 6.8, 6.0, 7));
		danhSach.add(new SinhVien(07, "Truong", "Hoang","Nam", 8.0, 5.2, 6.7));
		danhSach.add(new SinhVien(06, "Phan", "The","Nam", 8.0, 5.2, 7.9));

		System.out.println("In ra danh sach sinh vien: \n" + danhSach.toString());
		Bai3 bai3 = new Bai3();

		bai3.ghiFile(danhSach);
		System.out.println("\nSap xep: \n");
		bai3.bubbleSortMSV(danhSach);
		System.out.println(danhSach.toString());
		System.out.println("\nTim kiem: \n");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao ma sinh vien can tim: ");
		int searchKey = nhapVao.nextInt();
		if (bai3.binarySearch(danhSach, searchKey, 0, 6) == -1) {
			System.out.println("Khong tim thay ma sinh vien " + searchKey + " o trong danh sach sinh vien!!");
		} else {
			System.out.println("Tim thay ma sinh vien " + searchKey + " o vi tri so: "
					+ bai3.binarySearch(danhSach, searchKey, 0, 6));
		}
	}
}
