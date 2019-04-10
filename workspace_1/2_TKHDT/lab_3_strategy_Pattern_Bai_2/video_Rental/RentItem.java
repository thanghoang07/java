package video_Rental;

import java.util.Calendar;

// hàng cho thuê
public class RentItem {
	private Movie movie;
	private Date ngayChoThue;

	public RentItem(Movie movie, Date startDate) {
		super();
		this.movie = movie;
		this.ngayChoThue = startDate;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Date getStartDate() {
		return ngayChoThue;
	}

	public void setStartDate(Date startDate) {
		this.ngayChoThue = startDate;
	}

	// tính thời gian thuê // cách tính vẫn tồn tại vấn đề sẽ sửa sau!!!
	public int getRentDays() {
		long thoiGianThue = 0;
		int thang = Calendar.getInstance().get(Calendar.MONTH) + 1, nam = Calendar.getInstance().get(Calendar.YEAR);
		if (ngayChoThue.getThang() == thang && ngayChoThue.getNam() == nam) {
			thoiGianThue = Calendar.getInstance().get(Calendar.DATE) - ngayChoThue.getNgay();
		}
		return (int) thoiGianThue;
	}

	//
	public double tinhTien() {
		return movie.tinhTien(getRentDays());
	}

	//
	public double tinhThuong() {
		return movie.tinhThuong(getRentDays());
	}

}
