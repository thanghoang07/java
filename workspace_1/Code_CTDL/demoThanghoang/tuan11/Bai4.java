package tuan11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 implements Comparable<Bai4> {
	private static Scanner nhapVao;

	public static void main(String[] args) throws IOException {
		ArrayList<SinhVien> danhSach = new ArrayList<SinhVien>();

		danhSach.add(new SinhVien(101, "Hoang", "Thang", 7.9, 8.6, 7.4));
		danhSach.add(new SinhVien(103, "Trinh", "Toan", 9.0, 8.0, 8.5));
		danhSach.add(new SinhVien(102, "Vo", "Huy", 10, 9.5, 9.75));
		danhSach.add(new SinhVien(105, "Nguyen", "Chuyen", 7.4, 8.9, 7));
		danhSach.add(new SinhVien(104, "Tran", "Kim", 6.8, 6.0, 7));
		danhSach.add(new SinhVien(107, "Truong", "Nam", 8.0, 5.2, 6.7));
		danhSach.add(new SinhVien(106, "Phan", "Nam", 8.0, 5.2, 7.9));

		System.out.println("In ra danh sach sinh vien: \n" + danhSach.toString());
		Bai4 bai4 = new Bai4();

		bai4.ghiFile(danhSach);
		System.out.println("\nSap xep: \n");
		bai4.bubbleSortMSV(danhSach);
		System.out.println(danhSach.toString());
		System.out.println("\nTim kiem: \n");
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao ma sinh vien can tim: ");
		int searchKey = nhapVao.nextInt();
		if (bai4.binarySearch(danhSach, searchKey, 0, 6) == -1) {
			System.out.println("Khong tim thay ma sinh vien " + searchKey + " o trong danh sach sinh vien!!");
		} else {
			System.out.println("Tim thay ma sinh vien " + searchKey + " o vi tri so: "
					+ bai4.binarySearch(danhSach, searchKey, 0, 6));
		}

	}

	@Override
	public int compareTo(Bai4 o) {
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
}
