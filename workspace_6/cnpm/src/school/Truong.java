package school;

import java.util.ArrayList;

import modul.Date;
import people.Person;

public class Truong {
	public String maTruong, tenTruong, diaChi;
	public Date namThanhLap;
	public ArrayList<LopHoc> dsLopHoc;
	public ArrayList<Person> dsGiaoVien;

	public Truong(String maTruong, String tenTruong, String diaChi, Date namThanhLap, ArrayList<LopHoc> dsLopHoc,
			ArrayList<Person> dsGiaoVien) {
		super();
		this.maTruong = maTruong;
		this.tenTruong = tenTruong;
		this.diaChi = diaChi;
		this.namThanhLap = namThanhLap;
		this.dsLopHoc = dsLopHoc;
		this.dsGiaoVien = dsGiaoVien;
	}

	public String getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNamThanhLap() {
		return namThanhLap;
	}

	public void setNamThanhLap(Date namThanhLap) {
		this.namThanhLap = namThanhLap;
	}

	public ArrayList<LopHoc> getDsLopHoc() {
		return dsLopHoc;
	}

	public void setDsLopHoc(ArrayList<LopHoc> dsLopHoc) {
		this.dsLopHoc = dsLopHoc;
	}

	public ArrayList<Person> getDsGiaoVien() {
		return dsGiaoVien;
	}

	public void setDsGiaoVien(ArrayList<Person> dsGiaoVien) {
		this.dsGiaoVien = dsGiaoVien;
	}

	@Override
	public String toString() {
		return "Truong [maTruong=" + maTruong + ", tenTruong=" + tenTruong + ", diaChi=" + diaChi + ", namThanhLap="
				+ namThanhLap + ", dsLopHoc=" + dsLopHoc + ", dsGiaoVien=" + dsGiaoVien + "]";
	}

}
