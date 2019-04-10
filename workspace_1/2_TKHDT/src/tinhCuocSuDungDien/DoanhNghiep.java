package tinhCuocSuDungDien;

import java.util.ArrayList;
import java.util.List;

public class DoanhNghiep extends NguoiDung {
	private String maSoTaiKhoan;
	private ArrayList<DienSanXuat> ghiChiSo;

	public DoanhNghiep(String ID, String ten, String diaChi, String maSoTaiKhoan) {
		super(ID, ten, diaChi);
		this.maSoTaiKhoan = maSoTaiKhoan;
		ghiChiSo = new ArrayList<DienSanXuat>();
	}

	@Override
	public List<DienSanXuat> getNgayGhi() {
		return ghiChiSo;
	}

	public void themChiSo(DienSanXuat chiSo) {
		getNgayGhi().add(chiSo);
	}

	public String getMaSoTaiKhoan() {
		return maSoTaiKhoan;
	}

	/*
	 * Gia tien dien cho khach hang san xuat: Gio binh thuong (tu 4h - 18h): gia
	 * 895 Gio cao diem (tu 18h - 22h): gia 1480 Gio thap diem (tu 22h - 4h hom
	 * sau) : gia 505
	 */
	public long luongDienDungCD(DienSanXuat chiSoCu, DienSanXuat chiSoMoi) {
		return chiSoMoi.chiSoLucCD() - chiSoCu.chiSoLucCD();
	}

	public long luongDienDungTD(DienSanXuat chiSoCu, DienSanXuat chiSoMoi) {
		return chiSoMoi.chiSoLucTD() - chiSoCu.chiSoLucTD();
	}

	private long luongDienDungBT(DienSanXuat chiSoCu, DienSanXuat chiSoMoi) {
		return chiSoMoi.chiSoDien() - chiSoCu.chiSoDien() - luongDienDungCD(chiSoCu, chiSoMoi)
				- luongDienDungTD(chiSoCu, chiSoMoi);
	}

	public double tinhTienDien() {
		DienSanXuat chiSoCu = (DienSanXuat) getChiSoCu();
		DienSanXuat chiSoMoi = (DienSanXuat) getChiSoMoi();
		double tien = luongDienDungBT(chiSoCu, chiSoMoi) * 895 + luongDienDungTD(chiSoCu, chiSoMoi) * 505
				+ luongDienDungCD(chiSoCu, chiSoMoi) * 1480;
		// tinh thue
		tien += tien * VAT;
		return tien;
	}

	public void inHoaDon() {
		DienSanXuat chiSoCu = (DienSanXuat) getChiSoCu();
		DienSanXuat chiSoMoi = (DienSanXuat) getChiSoMoi();
		long luongDung = chiSoMoi.chiSoDien() - chiSoCu.chiSoDien();
		System.out.printf("ID: \t\t\t%s \nTen Nha SX: \t\t%s \nDia chi: \t\t%s \nSo tai khoan: \t\t%s\n", getID(), getTen(),
				getDiaChi(), getMaSoTaiKhoan());
		System.out.print("---------------------------------");
		System.out.println("\nChi So Cu: \t\t" + Math.round(chiSoCu.chiSoDien()) + "\nChi so moi: \t\t"
				+ Math.round(chiSoMoi.chiSoDien()) + "\nDien nang tieu thu: \t" + luongDung + "\nGio binh thuong: \t"
				+ Math.round(luongDienDungBT(chiSoCu, chiSoMoi)) + "\nGio cao diem: \t\t"
				+ Math.round(luongDienDungCD(chiSoCu, chiSoMoi)) + "\nGio thap diem: \t\t"
				+ Math.round(luongDienDungTD(chiSoCu, chiSoMoi)));
		System.out.print("---------------------------------");
		System.out.println("\nThanh tien(10%VAT): \t" + Math.round(tinhTienDien()));
	}
}
