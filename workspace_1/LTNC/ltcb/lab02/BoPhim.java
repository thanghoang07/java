package lab02;

//Xây dựng chương trình Java quản lý Các bộ phim tại một Rạp chiếu phim. 
//Một bộ phim bao gồm các thông tin:
//tên phim, năm sản xuất, hãng sản xuất, giá vé, ngày chiếu. 
//Hãng sản xuất bao gồm tên hãng sản xuất, quốc gia.
//Ngày chiếu bao gồm thông tin ngày, tháng, năm.
//a. Kiểm tra xem giá vé của một phim bất kỳ 
//có rẽ hơn giá vé của một phim khác hay không?
//b. Cho biết tên của hãng sản xuất phim.
//c. Cho biết giá vé của phim khi có khuyến mãi 
//(ví dụ như sau khi khuyến mãi 10%, 20%, ….), số tiền
//khuyến mãi đuợc giảm trừ theo % giá bán.

public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private NgayChieu ngayChieu;
	
	public BoPhim(
			String tenPhim,
			int namSanXuat,
			HangSanXuat hangSanXuat,
			double giaVe,
			NgayChieu ngayChieu
			
			) {
		
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
		
		}
	
	public boolean kiemTraReHon(BoPhim bp) {
		return this.giaVe < bp.giaVe;	
		
	}
	
	public String getTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
			
	}
	
	public double giamGia(int tyle) {
		double type = 0;
		return this.giaVe - this.giaVe*type / 100 ;
		
	}
	
}
