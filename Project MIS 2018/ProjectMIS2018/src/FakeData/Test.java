package FakeData;

import java.util.ArrayList;
import java.util.List;

import Controls.DateTime;
import DonHang.ChiTietDonHang;
import DonHang.DonHang;
import DonHang.LoaiNguyenLieu;
import DonHang.NguyenLieu;
import DonHang.NhaCungCap;
import DonHang.SanPham;
import DonHang.TrangThaiDonHang;
import KhachHang.KhachHang;
import NhanSu.NhanSu;
import NhanSu.NhanVien;
import NhanSu.LoaiNhanSu;
import NhanSu.NhanVienKho;
import NhanSu.QuanLy;

public abstract class Test {
	public static void main(String[] args) {
		LoaiNhanSu l1 = new LoaiNhanSu("l1", "boss", 127364);
		LoaiNhanSu l2 = new LoaiNhanSu("l1", "nhan vien", 127364);
		LoaiNhanSu l3 = new LoaiNhanSu("l1", "nhan vien kho", 127364);
		//
		NhanSu n1 = new QuanLy("01", "AAA", new DateTime(19, 12, 1986), "abcgjsh", true, new DateTime(29, 12, 2009), l1);
		NhanSu n2 = new NhanVien("02", "BBB", new DateTime(01, 10, 1989), "abcgjsh", true, new DateTime(29, 12, 2010), l2);
		NhanSu n3 = new NhanVienKho("03", "CCC", new DateTime(29, 12, 1990), "abcgjsh", true, new DateTime(29, 12, 2011), l3);
		//
		KhachHang k1 = new KhachHang("01", "DDD", "agsdajhg", "asdhgjsa", "Nam", 123456789);
		KhachHang k2 = new KhachHang("02", "EEE", "agsdajhg", "asdhgjsa", "Nu", 123456789);
		KhachHang k3 = new KhachHang("03", "FFF", "agsdajhg", "asdhgjsa", "Nam", 123456789);
		//
		TrangThaiDonHang trdh1= new TrangThaiDonHang("001", "da giao");
		TrangThaiDonHang trdh2= new TrangThaiDonHang("002", "chua giao");
		TrangThaiDonHang trdh3= new TrangThaiDonHang("003", "cham");
		//
		NhaCungCap ncc1 = new NhaCungCap("001", "asd", 123456788, "adfhgsajd", "hfsagdhfdsja");
		NhaCungCap ncc2 = new NhaCungCap("002", "asd", 123456788, "adfhgsajd", "hfsagdhfdsja");
		NhaCungCap ncc3 = new NhaCungCap("003", "asd", 123456788, "adfhgsajd", "hfsagdhfdsja");
		//
		LoaiNguyenLieu lnl1=new LoaiNguyenLieu("001", "Tam");
		LoaiNguyenLieu lnl2=new LoaiNguyenLieu("002", "Thanh");
		LoaiNguyenLieu lnl3=new LoaiNguyenLieu("003", "Vun");
		//
		NguyenLieu nl1 = new NguyenLieu("001", "Go", 1, lnl1, ncc1);
		NguyenLieu nl2 = new NguyenLieu("002", "Go", 1, lnl2, ncc2);
		NguyenLieu nl3 = new NguyenLieu("003", "Go", 1, lnl3, ncc3);
		//
		List<NguyenLieu> danhSachNL = new ArrayList<NguyenLieu>();
		danhSachNL.add(nl1);
		danhSachNL.add(nl2);
		danhSachNL.add(nl3);
		//
		SanPham sp1 = new SanPham("001", "GGG", 1, 122431, "########", danhSachNL);
		SanPham sp2 = new SanPham("002", "HHH", 1, 122431, "########", danhSachNL);
		SanPham sp3 = new SanPham("003", "JJJ", 1, 122431, "########", danhSachNL);
		//
		List<SanPham> listSanPham = new ArrayList<SanPham>();
		listSanPham.add(sp1);
		listSanPham.add(sp2);
		listSanPham.add(sp3);
		//
		ChiTietDonHang ct1 = new ChiTietDonHang("01", listSanPham, 1);
		//
		DonHang d1 = new DonHang("01", n2, new DateTime(11, 04, 2018), new DateTime(16, 04, 2018), 1230000, ct1, k1, trdh1);
		//
		System.out.println(n1.toString());
		System.out.println(n1.tinhLuong());
		//
		System.out.println(d1.toString());
	}
}
