package tuan6;

public class NewReleasePrice extends PriceStrategy {
	public double getCharge(int daysRented) {
		return daysRented * 4000;
	}

	public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		else
			return 1;
	}
}
