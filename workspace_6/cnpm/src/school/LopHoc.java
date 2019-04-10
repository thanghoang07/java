package school;

import java.util.ArrayList;

import people.GiaoVien;
import people.HocSinh;
import people.Person;

public class LopHoc {
	public String idLopHoc, nienKhoa, tenLopHoc;
	public int siSo;
	public Person giaoVienChuNhiem;
	public ArrayList<Person> dsHocSinh;

	public LopHoc(String idLopHoc, String nienKhoa, String tenLopHoc, int siSo, Person giaoVienChuNhiem,
			ArrayList<Person> dsHocSinh) {
		super();
		this.idLopHoc = idLopHoc;
		this.nienKhoa = nienKhoa;
		this.tenLopHoc = tenLopHoc;
		this.siSo = siSo;
		this.giaoVienChuNhiem = giaoVienChuNhiem;
		this.dsHocSinh = dsHocSinh;
	}

	public String getIdLopHoc() {
		return idLopHoc;
	}

	public void setIdLopHoc(String idLopHoc) {
		this.idLopHoc = idLopHoc;
	}

	public String getNienKhoa() {
		return nienKhoa;
	}

	public void setNienKhoa(String nienKhoa) {
		this.nienKhoa = nienKhoa;
	}

	public String getTenLopHoc() {
		return tenLopHoc;
	}

	public void setTenLopHoc(String tenLopHoc) {
		this.tenLopHoc = tenLopHoc;
	}

	public int getSiSo() {
		return siSo;
	}

	public void setSiSo(int siSo) {
		this.siSo = siSo;
	}

	public Person getGiaoVienChuNhiem() {
		return giaoVienChuNhiem;
	}

	public void setGiaoVienChuNhiem(Person giaoVienChuNhiem) {
		this.giaoVienChuNhiem = giaoVienChuNhiem;
	}

	public ArrayList<Person> getDsHocSinh() {
		return dsHocSinh;
	}

	public void setDsHocSinh(ArrayList<Person> dsHocSinh) {
		this.dsHocSinh = dsHocSinh;
	}

	@Override
	public String toString() {
		return "LopHoc [idLopHoc=" + idLopHoc + ", nienKhoa=" + nienKhoa + ", tenLopHoc=" + tenLopHoc + ", siSo=" + siSo
				+ ", giaoVienChuNhiem=" + giaoVienChuNhiem + ", dsHocSinh=" + dsHocSinh + "]";
	}

}
