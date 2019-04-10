package tuan6;

public class Movie {
	private String title;
	private PriceStrategy price;
	private boolean available;

	public Movie(String title, PriceStrategy price) {
		this.title = title;
		this.price = price;
		available = true;
	}

	public PriceStrategy getPrice() {
		return price;
	}

	public void setPrice(PriceStrategy arg) {
		price = arg;
	}

	public String getTitle() {
		return title;
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String toString() {
		return title + ", State: " + (available ? " available:" : " not available");
	}
}
