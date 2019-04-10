package school;

import modul.Date;
import people.Person;

public class MonHoc {
	public String idMonHoc, tenMonHoc;
	public HocKy hocKy;
	public Date nam;
	public Person giaoVienHuongDan;

	public MonHoc(String idMonHoc, String tenMonHoc, HocKy hocKy, Date nam, Person giaoVienHuongDan) {
		super();
		this.idMonHoc = idMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.hocKy = hocKy;
		this.nam = nam;
		this.giaoVienHuongDan = giaoVienHuongDan;
	}

	public String getIdMonHoc() {
		return idMonHoc;
	}

	public void setIdMonHoc(String idMonHoc) {
		this.idMonHoc = idMonHoc;
	}

	public String getTenMonHoc() {
		return tenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}

	public HocKy getHocKy() {
		return hocKy;
	}

	public void setHocKy(HocKy hocKy) {
		this.hocKy = hocKy;
	}

	public Date getNam() {
		return nam;
	}

	public void setNam(Date nam) {
		this.nam = nam;
	}

	public Person getGiaoVienHuongDan() {
		return giaoVienHuongDan;
	}

	public void setGiaoVienHuongDan(Person giaoVienHuongDan) {
		this.giaoVienHuongDan = giaoVienHuongDan;
	}

	@Override
	public String toString() {
		return "\nMonHoc: " + idMonHoc + " ---- Tên: " + tenMonHoc + "\n HK: "+ hocKy + " --- Nam: " + nam.getNam()
				+ "\n Giao viên: " + giaoVienHuongDan;
	}

}
