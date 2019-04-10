package car;

public class CarFactory {
	public Car buildCar(CarType model) {
		Car ca = null;
		switch (model) {
		case SMALL:
			ca = new SmallCar();
			break;
		case SEDAN:
			ca = new SedanCar();
			break;
		case LUXURY:
			ca = new LuxuryCar();
			break;

		default:
			break;
		}
		return ca;
	}
}
