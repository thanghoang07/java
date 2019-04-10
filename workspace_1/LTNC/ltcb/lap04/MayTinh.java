package lap04;
//Xây dựng một chương trình Java 
//hỗ trợ quản lý thông tin máy tính của một cửa hàng điện máy.
//Máy tính có những thông tin như:
//Hãng sản xuất, ngày sản xuất, giá bán, thời gian bảo hành.
//Hãng sản xuất bao gồm thông tin tên và quốc gia,
//ngày sản xuất bao gồm thông tin
//ngày, tháng ,năm mà máy tính được lắp ráp.
//a. Viết phương thức kiểm tra xem
//một máy tính có giá bán rẽ hơn một máy tính khác hay không.
//b. Viết phương thức cho biết tên quốc gia sản xuất máy tính.
public class MayTinh {
	private HangSanXuat hangSanXuat;
	private NgaySanXuat ngaySanXuat;
	private double giaBan;
	private int thoiGianBaoHanh;
	
	public MayTinh(
			
			HangSanXuat hangSanXuat,
			NgaySanXuat ngaySanXuat,
			double giaBan,
			int thoiGianBaoHanh
			
			) {
		
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		
	}

}
