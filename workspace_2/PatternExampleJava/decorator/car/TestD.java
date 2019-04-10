package car;

public class TestD {
	public static void main(String[] args) {
		//Car1 sp = new SportCar1(new BasicCar());
		
		Car1 lu = new SportCar1(new LuxuryCar1(new BasicCar()));
	}
}
