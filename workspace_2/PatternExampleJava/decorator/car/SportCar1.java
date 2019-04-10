package car;

public class SportCar1 extends CarDecorator  {

	public SportCar1(Car1 car) {
		super(car);
		assemble();
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sport Car..");
	}
	
	
}
