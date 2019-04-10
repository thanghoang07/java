package people;

import modul.Date;

public class PhuHuynh extends Person {
	public String maPhuHuynh;

	public PhuHuynh(String name, String email, String pass, String sdt, String diaChi, String thanhPho,
			Date ngayThanhNamSinh, String maPhuHuynh) {
		super(name, email, pass, sdt, diaChi, thanhPho, ngayThanhNamSinh);
		this.maPhuHuynh = maPhuHuynh;
	}

	@Override
	public String toString() {
		return "Phu Huynh: " + maPhuHuynh;
	}

	public String getMaPhuHuynh() {
		return maPhuHuynh;
	}

	public void setMaPhuHuynh(String maPhuHuynh) {
		this.maPhuHuynh = maPhuHuynh;
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
