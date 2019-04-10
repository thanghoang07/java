package tuan5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws IOException {
		//
		SinhVien svg = new SinhVien();
		String dest = "D:\\thanghoang\\dssv2.txt";
		//
		MonHoc mh1 = new MonHoc(1, "Toan", 7.8);
		MonHoc mh2 = new MonHoc(2, "Hoa", 6.8);
		MonHoc mh3 = new MonHoc(3, "Tin", 8.8);
		MonHoc mh4 = new MonHoc(4, "Van", 5.8);
		MonHoc mh5 = new MonHoc(1, "Toan", 7.8);
		MonHoc mh6 = new MonHoc(2, "Hoa", 7.8);
		MonHoc mh7 = new MonHoc(3, "Tin", 7.8);
		MonHoc mh8 = new MonHoc(4, "Van", 7.8);
		List<MonHoc> lmh1 = new ArrayList<MonHoc>();
		lmh1.add(mh1);
		lmh1.add(mh2);
		lmh1.add(mh3);
		lmh1.add(mh4);
		List<MonHoc> lmh2 = new ArrayList<MonHoc>();
		lmh2.add(mh5);
		lmh2.add(mh6);
		lmh2.add(mh7);
		lmh2.add(mh8);
		List<MonHoc> lmh3 = new ArrayList<MonHoc>();
		lmh3.add(mh5);
		lmh3.add(mh6);
		lmh3.add(mh7);
		lmh3.add(mh8);
		//
		SinhVien sv1 = new SinhVien(001, "Thang", lmh1);
		SinhVien sv2 = new SinhVien(002, "Toan", lmh2);
		SinhVien sv3 = new SinhVien(003, "Huy", lmh3);
		SinhVien sv4 = new SinhVien(004, "Hoc", lmh1);
		SinhVien sv5 = new SinhVien(005, "Van", lmh3);
		SinhVien sv6 = new SinhVien(005, "Trinh", lmh2);
		List<SinhVien> lsv = new ArrayList<SinhVien>();
		lsv.add(sv1);
		lsv.add(sv2);
		lsv.add(sv3);
		lsv.add(sv4);
		lsv.add(sv5);
		lsv.add(sv6);
		//
		svg.writeFile(dest, lsv);
		//
		System.out.println("Lấy 1 sv: \n" + svg.getOneSinhVien(4, dest));
		//
		System.out.println("===: ");
		List<SinhVien> listSV = svg.getListSinhVien(dest);
		for (int i = 0; i < listSV.size(); i++) {
			System.out.println(listSV.get(i).sinhVien());
		}
	}
}
