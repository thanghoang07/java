package lab7;

import java.io.IOException;
import java.util.ArrayList;

public class Bai5 {
	public static void main(String[] args) throws IOException {
		ArrayList<SinhVien> danhSach = new ArrayList<SinhVien>(10);

		danhSach.add(new SinhVien(01, "Hoang", "Duc", "Thang", 7.9, 8.6, 7.4));
		danhSach.add(new SinhVien(03, "Trinh", "Van","Toan", 9.0, 8.0, 8.5));
		danhSach.add(new SinhVien(02, "Vo", "Quoc","Huy", 10, 9.5, 9.75));
		danhSach.add(new SinhVien(05, "Nguyen", "Thanh","Trung", 7.4, 8.9, 7));
		danhSach.add(new SinhVien(04, "Tran", "Thi","Kim", 6.8, 6.0, 7));
		danhSach.add(new SinhVien(07, "Truong", "Hoang","Nam", 8.0, 5.2, 6.7));
		danhSach.add(new SinhVien(06, "Phan", "The","Nam", 8.0, 5.2, 7.9));

		SortSinhVien bai4 = new SortSinhVien();
		System.out.println("In ra danh sach sinh vien: \n" + danhSach.toString());

		System.out.println("\nGhi danh sach ra file: \n");
		bai4.ghiFile(danhSach);
		System.out.println("Sap xep danh sach sinh vien theo ten: \n");
		bai4.bubbleSortTen(danhSach);
		System.out.println("In ra danh sach sinh vien: \n" + danhSach.toString());
		System.out.println("\nSap xep danh sach sinh vien theo diem trung binh: \n");
		bai4.bubbleSortDiemTrungBinh(danhSach);
		System.out.println("In ra danh sach sinh vien: \n" + danhSach.toString());

	}
}
