package tuan6;

public abstract class PriceStrategy {
	public static final PriceStrategy CHILDRENS = new ChildrensPrice();
	public static final PriceStrategy REGULAR = new RegularPrice();
	public static final PriceStrategy NEW_RELEASE = new NewReleasePrice();

	abstract public double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
