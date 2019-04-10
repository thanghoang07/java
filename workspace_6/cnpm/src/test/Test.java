package test;

import java.util.ArrayList;

import modul.Date;
import people.GiaoVien;
import people.HocSinh;
import people.Person;
import people.PhuHuynh;
import school.HocKy;
import school.LopHoc;
import school.MonHoc;

public class Test {
	public static void main(String[] args) {
		//
		Person gv1 = new GiaoVien("Nga", "abc@gamil.com", "abcdef", "0998786786", "TP.HCM", "TP.HCM",
				new Date(8, 05, 1985), "GV1");
		Person gv2 = new GiaoVien("Tai", "abc@gamil.com", "abcdef", "0998786786", "TP.HCM", "TP.HCM",
				new Date(8, 05, 1985), "GV2");
		Person gv3 = new GiaoVien("Tue", "abc@gamil.com", "abcdef", "0998786786", "TP.HCM", "TP.HCM",
				new Date(8, 05, 1985), "GV3");
		Person gv4 = new GiaoVien("Tan", "abc@gamil.com", "abcdef", "0998786786", "TP.HCM", "TP.HCM",
				new Date(8, 05, 1985), "GV4");
		//
		Date nam16 = new Date(2016);
		//
		HocKy hk116 = new HocKy("HK116", "Hoc Ky 1", nam16);
		//
		// ArrayList<MonHoc> dsMonDay1 = new ArrayList<MonHoc>();
		// ArrayList<MonHoc> dsMonDay2 = new ArrayList<MonHoc>();
		// ArrayList<MonHoc> dsMonDay3 = new ArrayList<MonHoc>();
		// ArrayList<MonHoc> dsMonDay4 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
		//
		MonHoc toan = new MonHoc("Toan", "Toan", hk116, nam16, gv1);
		MonHoc van = new MonHoc("Van", "Van", hk116, nam16, gv2);
		MonHoc hoa = new MonHoc("Hoa", "Hoa", hk116, nam16, gv3);
		MonHoc ly = new MonHoc("Ly", "Ly", hk116, nam16, gv4);
		//
		dsMonHoc.add(ly);
		dsMonHoc.add(van);
		dsMonHoc.add(toan);
		dsMonHoc.add(hoa);
		// //
		// dsMonDay1.add(ly);
		// dsMonDay1.add(toan);
		// //
		// dsMonDay2.add(van);
		// //
		// dsMonDay3.add(ly);
		// dsMonDay3.add(hoa);
		// dsMonDay3.add(toan);
		// //
		// dsMonDay4.add(toan);
		//
		Person ph1 = new PhuHuynh("Thang", "thanghoang07@outlook.com", "abcdef", "09324123", "TP.HCM", "TP.HCM",
				new Date(03, 01, 1995), "PH1");
		Person ph2 = new PhuHuynh("Huy", "vohuy1956@outlook.com", "abcdef", "09324123", "TP.HCM", "TP.HCM",
				new Date(30, 11, 1995), "PH2");
		Person ph3 = new PhuHuynh("Toan", "vantoan310@outlook.com", "abcdef", "09324123", "TP.HCM", "TP.HCM",
				new Date(03, 10, 1995), "PH3");
		Person ph4 = new PhuHuynh("Hai", "haithanh310@outlook.com", "abcdef", "09324123", "TP.HCM", "TP.HCM",
				new Date(03, 10, 1995), "PH4");
		//
		ArrayList<Person> dsHocSinh1 = new ArrayList<Person>();
		ArrayList<Person> dsHocSinh2 = new ArrayList<Person>();
		//
		Person hs1 = new HocSinh("Hoc", "hoc@gmail.com", "abcdef", "09783682916", "TP.HCM", "TP.HCM",
				new Date(04, 05, 1998), "HS01", ph1, dsMonHoc);
		Person hs2 = new HocSinh("Hao", "hao@gmail.com", "abcdef", "09783682916", "TP.HCM", "TP.HCM",
				new Date(05, 05, 1998), "HS02", ph2, dsMonHoc);
		Person hs3 = new HocSinh("Hoa", "hoa@gmail.com", "abcdef", "09783682916", "TP.HCM", "TP.HCM",
				new Date(06, 05, 1998), "HS03", ph3, dsMonHoc);
		Person hs4 = new HocSinh("Hue", "hue@gmail.com", "abcdef", "09783682916", "TP.HCM", "TP.HCM",
				new Date(07, 05, 1998), "HS04", ph4, dsMonHoc);
		Person hs5 = new HocSinh("Hoc", "hoc@gmail.com", "abcdef", "09783682916", "TP.HCM", "TP.HCM",
				new Date(04, 05, 1998), "HS01", ph1, dsMonHoc);
		Person hs6 = new HocSinh("Hao", "hao@gmail.com", "abcdef", "09783682916", "TP.HCM", "TP.HCM",
				new Date(05, 05, 1998), "HS02", ph2, dsMonHoc);
		Person hs7 = new HocSinh("Hoa", "hoa@gmail.com", "abcdef", "09783682916", "TP.HCM", "TP.HCM",
				new Date(06, 05, 1998), "HS03", ph3, dsMonHoc);
		Person hs8 = new HocSinh("Hue", "hue@gmail.com", "abcdef", "09783682916", "TP.HCM", "TP.HCM",
				new Date(07, 05, 1998), "HS04", ph4, dsMonHoc);
		//
		dsHocSinh1.add(hs1);
		dsHocSinh1.add(hs2);
		dsHocSinh1.add(hs3);
		dsHocSinh1.add(hs4);
		//
		dsHocSinh2.add(hs5);
		dsHocSinh2.add(hs7);
		dsHocSinh2.add(hs6);
		dsHocSinh2.add(hs8);
		//
		ArrayList<LopHoc> dsLopDay = new ArrayList<LopHoc>();
		//
		LopHoc lop1 = new LopHoc("lop1_16", "2016 - 2017", "Lop 1", 45, gv1, dsHocSinh1);
		LopHoc lop2 = new LopHoc("lop2_16", "2016 - 2017", "Lop 1", 45, gv2, dsHocSinh2);		
		//
		System.out.println("||||||||||||||||||||||||||||||");
		System.out.println("Lop 1: ");
		System.out.println(lop1.getGiaoVienChuNhiem().toString());
		System.out.println(lop1.getSiSo());
		System.out.println(lop1.getDsHocSinh().size());
		System.out.println("==============================");
		for (int i = 0; i < lop1.getDsHocSinh().size(); i++) {
			System.out.println(lop1.getDsHocSinh().get(i).toString());
			System.out.println("==============================");
		}
		System.out.println("||||||||||||||||||||||||||||||");
		//
		System.out.println("Lop 2: ");
		System.out.println(lop2.getGiaoVienChuNhiem().toString());
		System.out.println(lop2.getSiSo());
		System.out.println(lop2.getDsHocSinh().size());
		System.out.println("==============================");
		for (int i = 0; i < lop2.getDsHocSinh().size(); i++) {
			System.out.println(lop2.getDsHocSinh().get(i).toString());
			System.out.println("==============================");
		}
		System.out.println("||||||||||||||||||||||||||||||");
		//
		for (int i = 0; i < dsMonHoc.size(); i++) {
			System.out.println(dsMonHoc.get(i).toString());
			System.out.println("==============================");
		}
	}
}
