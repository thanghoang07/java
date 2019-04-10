package modul;

public class Date {
	public int ngay, thang, nam;

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public Date() {
		super();
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public Date(int nam) {
		super();
		this.nam = nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public Date(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	@Override
	public String toString() {
		return "[" + ngay + "/" + thang + "/" + nam + "]";
	}

}
