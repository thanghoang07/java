package tuan6;

import java.util.Date;

public class RentItem {
	private Movie movie;
	private Date startDate;

	public RentItem(Movie movie, Date startDate) {
		this.movie = movie;
		this.startDate = startDate;
	}

	public int getRentedDays() {
		Date now = new Date();
		long duration = now.getTime() - startDate.getTime();
		long rentedDays = duration / (24 * 3600000);
		if (duration % (24 * 3600000) > 2 * 3600000)
			rentedDays++;
		return (int) rentedDays;
	}

	public Movie getMovie() {
		return movie;
	}

	public double getCharge() {
		return movie.getCharge(getRentedDays());
	}

	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(getRentedDays());
	}
}
