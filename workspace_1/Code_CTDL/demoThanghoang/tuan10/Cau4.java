package tuan10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Cau4 implements Comparable<Cau4> {
	public static void main(String[] args) throws IOException {
		ArrayList<SinhVien> danhSach = new ArrayList<SinhVien>(10);

		danhSach.add(new SinhVien(01, "Hoang", "Thang", 7.9, 8.6, 7.4));
		danhSach.add(new SinhVien(03, "Trinh", "Toan", 9.0, 8.0, 8.5));
		danhSach.add(new SinhVien(02, "Vo", "Huy", 10, 9.5, 9.75));
		danhSach.add(new SinhVien(05, "Nguyen", "Chuyen", 7.4, 8.9, 7));
		danhSach.add(new SinhVien(04, "Tran", "Kim", 6.8, 6.0, 7));
		danhSach.add(new SinhVien(07, "Truong", "Nam", 8.0, 5.2, 6.7));
		danhSach.add(new SinhVien(06, "Phan", "Nam", 8.0, 5.2, 7.9));

		Cau4 bai4 = new Cau4();
		System.out.println("In ra danh sach sinh vien: \n" + danhSach.toString());

		System.out.println("ghi danh sach ra file: \n");
		bai4.ghiFile(danhSach);
		System.out.println("Sap xep danh sach sinh vien theo ten: \n");
		bai4.bubbleSortTen(danhSach);
		System.out.println("In ra danh sach sinh vien: \n" + danhSach.toString());
		System.out.println("\nSap xep danh sach sinh vien theo diem trung binh: \n");
		bai4.bubbleSortDiemTrungBinh(danhSach);
		System.out.println("In ra danh sach sinh vien: \n" + danhSach.toString());
		
	}

	public void bubbleSortDiemTrungBinh(ArrayList<SinhVien> sinhV) {

		SinhVien tmp = null;
		for (int i = sinhV.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sinhV.get(j).getDiemTrungBinh() < (sinhV.get(j + 1).getDiemTrungBinh())) {
					tmp = sinhV.get(j);
					sinhV.set(j, sinhV.get(j + 1));
					sinhV.set(j + 1, tmp);
				}
			}
		}
	}

	public void bubbleSortTen(ArrayList<SinhVien> sinhV) {

		SinhVien tmp = null;
		for (int i = sinhV.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sinhV.get(j).getTen().compareTo(sinhV.get(j + 1).getTen()) > 0) {
					tmp = sinhV.get(j);
					sinhV.set(j, sinhV.get(j + 1));
					sinhV.set(j + 1, tmp);
				} else if (sinhV.get(j).getHo().compareTo(sinhV.get(j + 1).getHo()) > 0) {
					tmp = sinhV.get(j);
					sinhV.set(j, sinhV.get(j + 1));
					sinhV.set(j + 1, tmp);
				}
			}
		}
	}

	@Override
	public int compareTo(Cau4 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void ghiFile(ArrayList<SinhVien> sinhV) throws IOException {
		FileOutputStream fos = new FileOutputStream("danhSachSinhVien.txt");
		PrintWriter pw = new PrintWriter(fos);

		for (int i = 0; i < sinhV.size(); i++) {
			if (sinhV.get(i) != null) {
				pw.println("\nSinh Vien thu: " + (i + 1) + "\n" + sinhV.get(i) + "\n");
			} else {
				pw.println("");
			}
		}
		pw.close();
		fos.flush();
		fos.close();
	}
	
}
