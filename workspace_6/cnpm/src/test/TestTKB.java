package test;

import java.util.ArrayList;

import modul.Date;
import people.GiaoVien;
import people.Person;
import school.HocKy;
import school.MonHoc;
import school.ThoiKhoaBieu;

public class TestTKB {
	public static void main(String[] args) {
		//
		Date nam16 = new Date(2016);
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
		ArrayList<MonHoc> dsMonThu2B1 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu2B2 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu3B1 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu3B2 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu4B1 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu4B2 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu5B1 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu5B2 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu6B1 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu6B2 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu7B1 = new ArrayList<MonHoc>();
		ArrayList<MonHoc> dsMonThu7B2 = new ArrayList<MonHoc>();
		//
		HocKy hk116 = new HocKy("HK1", "Hoc ky 1", nam16);
		//
		MonHoc m1 = new MonHoc("Toan", "Toan", hk116, nam16, gv1);
		MonHoc m2 = new MonHoc("Van", "Van", hk116, nam16, gv2);
		MonHoc m3 = new MonHoc("Hoa", "Hoa", hk116, nam16, gv3);
		MonHoc m4 = new MonHoc("Ly", "Ly", hk116, nam16, gv4);
		MonHoc m5 = new MonHoc("Sinh", "Sinh hoc", hk116, nam16, gv1);
		MonHoc m6 = new MonHoc("Dia", "Dia ly", hk116, nam16, gv2);
		MonHoc m7 = new MonHoc("Su", "Lich Su", hk116, nam16, gv3);
		MonHoc m8 = new MonHoc("GDTC", "GDTC", hk116, nam16, gv4);
		//
		dsMonThu2B1.add(m1);
		dsMonThu2B1.add(m2);
		//
		dsMonThu2B2.add(m3);
		dsMonThu2B2.add(m3);
		//
		dsMonThu3B1.add(m1);
		dsMonThu3B1.add(m1);
		//
		dsMonThu3B2.add(m2);
		dsMonThu3B2.add(m2);
		//
		dsMonThu4B1.add(m5);
		dsMonThu4B1.add(m6);
		//
		dsMonThu4B2.add(m4);
		dsMonThu4B2.add(m3);
		//
		dsMonThu5B1.add(m2);
		dsMonThu5B1.add(m3);
		//
		dsMonThu5B2.add(m5);
		dsMonThu5B2.add(m6);
		//
		dsMonThu6B1.add(m7);
		dsMonThu6B1.add(m8);
		//
		dsMonThu6B2.add(m2);
		dsMonThu6B2.add(m7);
		//
		dsMonThu7B1.add(m4);
		dsMonThu7B1.add(m1);
		//
		dsMonThu7B2.add(m1);
		dsMonThu7B2.add(m1);
		//
		ArrayList<ThoiKhoaBieu> thu2 = new ArrayList<ThoiKhoaBieu>();
		//
		ThoiKhoaBieu th2s = new ThoiKhoaBieu("thu2", "1", "sang", hk116, dsMonThu2B1, nam16);
		ThoiKhoaBieu th2c = new ThoiKhoaBieu("thu2", "1", "chieu", hk116, dsMonThu2B1, nam16);
		//
		ThoiKhoaBieu th3s = new ThoiKhoaBieu("thu3", "1", "sang", hk116, dsMonThu3B1, nam16);
		ThoiKhoaBieu th3c = new ThoiKhoaBieu("thu3", "1", "chieu", hk116, dsMonThu3B2, nam16);
		//
		ThoiKhoaBieu th4s = new ThoiKhoaBieu("thu4", "1", "sang", hk116, dsMonThu4B1, nam16);
		ThoiKhoaBieu th4c = new ThoiKhoaBieu("thu4", "1", "chieu", hk116, dsMonThu4B2, nam16);
		//
		ThoiKhoaBieu th5s = new ThoiKhoaBieu("thu5", "1", "sang", hk116, dsMonThu5B1, nam16);
		ThoiKhoaBieu th5c = new ThoiKhoaBieu("thu5", "1", "chieu", hk116, dsMonThu5B2, nam16);
		//
		ThoiKhoaBieu th6s = new ThoiKhoaBieu("thu6", "1", "sang", hk116, dsMonThu6B1, nam16);
		ThoiKhoaBieu th6c = new ThoiKhoaBieu("thu6", "1", "chieu", hk116, dsMonThu6B2, nam16);
		//
		ThoiKhoaBieu th7s = new ThoiKhoaBieu("thu7", "1", "sang", hk116, dsMonThu7B1, nam16);
		ThoiKhoaBieu th7c = new ThoiKhoaBieu("thu7", "1", "chieu", hk116, dsMonThu7B2, nam16);
		//
		thu2.add(th2s);
		thu2.add(th2c);
		//
		System.out.println(th2s.toString());
		//
		System.out.println("thu 2 ===============");
		for (int i = 0; i < thu2.size(); i++) {
			System.out.println(thu2.get(i).getBuoi() + " ||| " + thu2.get(i).dsMonHoc.toString());
			
		}
	}
}
