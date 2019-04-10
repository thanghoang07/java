package bai2;

public class Test {
	public static void main(String[] args) {
		Newspaper n2 = new Newspaper();
		Internet i2 = new Internet();
		User u2 = new User();

		Loan personalLoan = new Loan("Personal Loan", "Standard Charterd", 12.5f);
		personalLoan.registerObserver(n2);
		personalLoan.registerObserver(i2);
		personalLoan.registerObserver(u2);
		
		
		personalLoan.setInterest(3.5f);
		
		personalLoan.setInterest(10.5f);

	}
}
