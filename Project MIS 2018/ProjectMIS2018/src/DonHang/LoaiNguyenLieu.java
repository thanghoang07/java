package DonHang;

public class LoaiNguyenLieu {

	private String ma, ten;

	public LoaiNguyenLieu(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "LoaiNguyenLieu [ma=" + ma + ", ten=" + ten + "]";
	}
	
	
}
