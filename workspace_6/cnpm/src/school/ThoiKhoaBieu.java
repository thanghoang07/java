package school;

import java.util.ArrayList;

import modul.Date;

public class ThoiKhoaBieu {
	public String thu, tuan, buoi;
	public HocKy hocKy;
	public ArrayList<MonHoc> dsMonHoc;
	public Date namHoc;
	
		public ThoiKhoaBieu(String thu, String tuan, String buoi, HocKy hocKy, ArrayList<MonHoc> dsMonHoc, Date namHoc) {
			super();
			this.thu = thu;
			this.tuan = tuan;
			this.buoi = buoi;
			this.hocKy = hocKy;
			this.dsMonHoc = dsMonHoc;
			this.namHoc = namHoc;
		}
	
		public String getThu() {
			return thu;
		}
	
		public void setThu(String thu) {
			this.thu = thu;
		}
	
		public String getTuan() {
			return tuan;
		}
	
		public void setTuan(String tuan) {
			this.tuan = tuan;
		}
	
		public String getBuoi() {
			return buoi;
		}
	
		public void setBuoi(String buoi) {
			this.buoi = buoi;
		}
	
		public HocKy getHocKy() {
			return hocKy;
		}
	
		public void setHocKy(HocKy hocKy) {
			this.hocKy = hocKy;
		}
	
		public ArrayList<MonHoc> getDsMonHoc() {
			return dsMonHoc;
		}
	
		public void setDsMonHoc(ArrayList<MonHoc> dsMonHoc) {
			this.dsMonHoc = dsMonHoc;
		}
	
		public Date getNamHoc() {
			return namHoc;
		}
	
		public void setNamHoc(Date namHoc) {
			this.namHoc = namHoc;
		}
	
		@Override
		public String toString() {
			return "ThoiKhoaBieu [thu=" + thu + ", tuan=" + tuan + ", buoi=" + buoi + ", hocKy=" + hocKy + ", dsMonHoc="
					+ dsMonHoc + ", namHoc=" + namHoc + "]";
		}

}
