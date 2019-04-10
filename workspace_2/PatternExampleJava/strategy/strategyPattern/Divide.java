package strategyPattern;

public class Divide implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		if (num1 == 0) {
			System.out.println("Loi chia cho '0'");
			return 0;
		}
		return num1 / num2;
	}

}
