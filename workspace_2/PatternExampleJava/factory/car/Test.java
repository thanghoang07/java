package car;

public class Test {

	public static void main(String[] args) {
		CarFactory caf = new CarFactory();

		System.out.println(caf.buildCar(CarType.LUXURY));
	}

}
