package school;

import modul.Date;

public class HocKy {
	public String maHocKy, tenHocKy;
	public Date namHoc;

	public HocKy(String maHocKy, String tenHocKy, Date namHoc) {
		super();
		this.maHocKy = maHocKy;
		this.tenHocKy = tenHocKy;
		this.namHoc = namHoc;
	}

	public String getMaHocKy() {
		return maHocKy;
	}

	public void setMaHocKy(String maHocKy) {
		this.maHocKy = maHocKy;
	}

	public String getTenHocKy() {
		return tenHocKy;
	}

	public void setTenHocKy(String tenHocKy) {
		this.tenHocKy = tenHocKy;
	}

	public Date getNamHoc() {
		return namHoc;
	}

	public void setNamHoc(Date namHoc) {
		this.namHoc = namHoc;
	}

	@Override
	public String toString() {
		return "HocKy [maHocKy=" + maHocKy + ", tenHocKy=" + tenHocKy + ", namHoc=" + namHoc + "]";
	}

}
