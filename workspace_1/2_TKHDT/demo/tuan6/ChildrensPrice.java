package tuan6;

public class ChildrensPrice extends PriceStrategy {
	public double getCharge(int daysRented) {
		double result = 2500;
	      if (daysRented > 3)
	         result += (daysRented - 3) * 1500;
	      return result;
	}
}
