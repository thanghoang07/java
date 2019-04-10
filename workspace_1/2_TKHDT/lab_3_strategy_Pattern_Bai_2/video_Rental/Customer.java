package video_Rental;

import java.util.ArrayList;
import java.util.List;

// người dùng - khách hàng
public class Customer {
	private String name;
	// danh sách hàng(phim) cho thuê
	private List<RentItem> danhSachPhimThue = new ArrayList<RentItem>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RentItem> getRentItem() {
		return danhSachPhimThue;
	}

	public void setRentltem(List<RentItem> rentltem) {
		this.danhSachPhimThue = rentltem;
	}

	/*
	 * thuê, cho mượn phim không quá 5 phim đc cho thuê
	 */
	public boolean muonPhim(Movie movie, Date startDate) {
		RentItem rental = new RentItem(movie, startDate);
		// nếu lớn hơn 5 thì không cho mượn nữa
		if (danhSachPhimThue.size() > 5) {
			return false;
		} else {
			// ngược lại thì tiếp tục cho mượn
			danhSachPhimThue.add(rental);
			// thiết lập lai trạng thái cho phim đc mượn
			rental.getMovie().setTrangThai(false);
			return true;
		}
	}

	// trả lại phim
	public boolean traLai(String tenPhimTra) {
		RentItem rental = null;
		for (RentItem rentItem : danhSachPhimThue) {
			// lấy tên của phim rồi đem đi so sánh với tên truyền vào
			if (rentItem.getMovie().getTenPhim().equals(tenPhimTra)) {
				rental = rentItem;
				// dừng
				break;
			}
		}
		// nếu tên không rổng thì xóa khỏi danh sách mượn
		if (rental != null) {
			danhSachPhimThue.remove(rental);
			rental.getMovie().setTrangThai(true);
			return true;
		} else
			return false;
	}

	// in hoa don
	public void inHoaDon() {
		System.out.println("*********************************");
		System.out.printf("\tHoa don cua %s\n", getName());
		System.out.println("=================================");
		for (RentItem rentItem : danhSachPhimThue) {
			System.out.println(".................................");
			System.out.printf("Ten phim thue: %s\nHang: %s\nGia thue: %d\n", rentItem.getMovie().getTenPhim(),
					rentItem.getMovie().getHangSanXuat(), Math.round(rentItem.tinhTien()));
			System.out.println("Ngay thue: " + rentItem.getStartDate());
			System.out.println(".................................");
		}
		System.out.println("---------------------------------");
		System.out.printf("Tong tien tra: %d\nDiem Thuong: %d\n", Math.round(tinhTien()), Math.round(tinhDiemThuong()));
		System.out.println("=================================");
	}

	// tinh tiên phải trả
	public double tinhTien() {
		double tien = 0;
		for (RentItem rentItem : danhSachPhimThue) {
			tien += rentItem.tinhTien();
		}
		return tien;
	}

	// tinh điểm thưởng
	public double tinhDiemThuong() {
		double thuong = 0;
		for (RentItem rentItem : danhSachPhimThue) {
			thuong += rentItem.tinhThuong();
		}
		return thuong;
	}
}
