package people;

import java.util.ArrayList;

import modul.Date;
import school.MonHoc;

public class HocSinh extends Person {
	public String maHocSinh;
	public Person phuHuynh;
	public ArrayList<MonHoc> dsMonHoc;

	public HocSinh(String name, String email, String pass, String sdt, String diaChi, String thanhPho,
			Date ngayThanhNamSinh, String maHocSinh, Person phuHuynh, ArrayList<MonHoc> dsMonHoc) {
		super(name, email, pass, sdt, diaChi, thanhPho, ngayThanhNamSinh);
		this.maHocSinh = maHocSinh;
		this.phuHuynh = phuHuynh;
		this.dsMonHoc = dsMonHoc;
	}

	public String getMaHocSinh() {
		return maHocSinh;
	}

	public void setMaHocSinh(String maHocSinh) {
		this.maHocSinh = maHocSinh;
	}

	public Person getPhuHuynh() {
		return phuHuynh;
	}

	public void setPhuHuynh(PhuHuynh phuHuynh) {
		this.phuHuynh = phuHuynh;
	}

	public ArrayList<MonHoc> getDsMonHoc() {
		return dsMonHoc;
	}

	public void setDsMonHoc(ArrayList<MonHoc> dsMonHoc) {
		this.dsMonHoc = dsMonHoc;
	}

	@Override
	public String toString() {
		return "HocSinh: \n Ma hoc sinh: " + maHocSinh + "\n Phu huynh: " + phuHuynh + " --- Tên: " + phuHuynh.name
				+ "\n Danh sach mon: " + dsMonHoc;
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
