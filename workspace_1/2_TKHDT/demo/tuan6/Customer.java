package tuan6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
	private String name;
	private List<RentItem> rentals = new ArrayList<RentItem>();

	public Customer(String name) {
		this.name = name;
	};

	public String getName() {
		return name;
	};

	public List<RentItem> getRentals() {
		return rentals;
	}

	// tính tổng số phim mượn
	public boolean rent(Movie movie, Date startDate) {
		RentItem rental = new RentItem(movie, startDate);
		if (rentals.size() < 5) {
			rentals.add(rental);
			rental.getMovie().setAvailable(false);
			return true;
		} else
			return false;
	}

	// trả phim mượn
	public boolean returnMovie(String title) {
		RentItem r = null;
		for (RentItem rental : rentals) {
			// lấy tên của phim rồi đem đi so sánh với tên truyền vào
			if (rental.getMovie().getTitle().equals(title)) {
				r = rental;
				break;
			}
		}
		// nếu tên không rổng thì xóa khỏi danh sách mượn
		if (r != null) {
			rentals.remove(r);
			r.getMovie().setAvailable(true);
			return true;
		} else
			return false;
	}

	// kiểu giống như in hóa đơn
	public String statement() {
		StringBuffer result = new StringBuffer();
		result.append("Hoa don cua " + getName() + "\n");
		for (RentItem each : rentals) {
			result.append("\t" + each.getMovie().getTitle() + "\t" + Math.round(each.getCharge()) + "\n");
		}
		result.append("Tien tra " + Math.round(getTotalCharge()) + "\n");
		result.append("Diem thuong " + Math.round(getTotalFrequentRenterPoints()));
		return result.toString();
	}

	// tính tổng tiền trả
	private double getTotalCharge() {
		double result = 0;
		for (RentItem each : rentals) {
			result += each.getCharge();
		}
		return result;
	}

	// tính tổng điểm thưởng
	private double getTotalFrequentRenterPoints() {
		double result = 0;
		for (RentItem each : rentals) {
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}
