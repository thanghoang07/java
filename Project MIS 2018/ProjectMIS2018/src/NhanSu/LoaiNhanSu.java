package NhanSu;

public class LoaiNhanSu {
	public String loaiNS;
	public String tenNS;
	public float luong;
	
	public LoaiNhanSu(String loaiNS, String tenNS, float luong) {
		super();
		this.loaiNS = loaiNS;
		this.tenNS = tenNS;
		this.luong = luong;
	}
	
	public String getLoaiNS() {
		return loaiNS;
	}
	
	public void setLoaiNS(String loaiNS) {
		this.loaiNS = loaiNS;
	}
	
	public String getTenNS() {
		return tenNS;
	}
	
	public void setTenNS(String tenNS) {
		this.tenNS = tenNS;
	}
	
	public float getLuong() {
		return luong;
	}
	
	public void setLuong(float luong) {
		this.luong = luong;
	}

	@Override
	public String toString() {
		return "LoaiNhanSu [loaiNS=" + loaiNS + ", tenNS=" + tenNS + ", luong=" + luong + "]";
	}

}
