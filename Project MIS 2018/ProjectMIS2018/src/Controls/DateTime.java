package Controls;

public class DateTime {
	public int Ngay, Thang, Nam;

	public DateTime(int ngay, int thang, int nam) {
		super();
		Ngay = ngay;
		Thang = thang;
		Nam = nam;
	}

	@Override
	public String toString() {
		return "DateTime [Ngay=" + Ngay + ", Thang=" + Thang + ", Nam=" + Nam + "]";
	}

	public int getNgay() {
		return Ngay;
	}

	public void setNgay(int ngay) {
		Ngay = ngay;
	}

	public int getThang() {
		return Thang;
	}

	public void setThang(int thang) {
		Thang = thang;
	}

	public int getNam() {
		return Nam;
	}

	public void setNam(int nam) {
		Nam = nam;
	}

}
