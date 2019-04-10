/*package de2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Xe {
	protected String nhanHieu;
	protected int namSanXuat;
	protected double giaGoc;
	protected HangSanXuat hangSanXuat;

	public Xe(String nhanHieu, int namSanXuat, double giaGoc, HangSanXuat hangSanXuat) {
		this.nhanHieu = nhanHieu;
		this.namSanXuat = namSanXuat;
		this.giaGoc = giaGoc;
		this.hangSanXuat = hangSanXuat;
	}

	// pt khuyến mãi
	public abstract double khuyenMai();

	// tạo danh sách
	public static ArrayList<Xe> taoDanhSach() {
		ArrayList danhSach = new ArrayList<Xe>();
		HangSanXuat hsx1 = new HangSanXuat("Honda", "Japan");
		HangSanXuat hsx2 = new HangSanXuat("Toyota", "Japan");
		HangSanXuat hsx3 = new HangSanXuat("Huyndai", "Korea");
		Xe x1 = new XeDuLich("Civic", 2010, 28000, hsx1, 4, 200, 13);
		Xe x2 = new XeKhach("Hiace", 2011, 35000, hsx2, 12);
		Xe x3 = new XeTai("MIGHTY", 2010, 18000, hsx3, 2.5);
		danhSach.add(x1);
		danhSach.add(x2);
		danhSach.add(x3);
		Collections.sort(danhSach, new Comparator<Xe>() {
			public int compare(Xe o1, Xe o2) {
				return (o1.hangSanXuat.getTenCongTy().compareToIgnoreCase(o2.hangSanXuat.getTenCongTy()));
			}

		});
		return danhSach;
	}

	public abstract String toString();

}
*/