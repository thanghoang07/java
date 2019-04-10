package people;

import modul.Date;

public class GiaoVien extends Person {
	public String maGiaoVien;

	public GiaoVien(String name, String email, String pass, String sdt, String diaChi, String thanhPho,
			Date ngayThanhNamSinh, String maGiaoVien) {
		super(name, email, pass, sdt, diaChi, thanhPho, ngayThanhNamSinh);
		this.maGiaoVien = maGiaoVien;
	}

	public String getMaGiaoVien() {
		return maGiaoVien;
	}

	public void setMaGiaoVien(String maGiaoVien) {
		this.maGiaoVien = maGiaoVien;
	}

	@Override
	public String toString() {
		return "GiaoVien [maGiaoVien=" + maGiaoVien + "]";
	}

	@Override
	public void xemDiemHK() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemDiemMonHoc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemHocPhi() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemLichThi() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemSoBaoBai() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemLichHoc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemKetQuaCK() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemChuyenCan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemSuKien() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemLopHoc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemDanhSachBan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xemMonHoc() {
		// TODO Auto-generated method stub

	}

}
