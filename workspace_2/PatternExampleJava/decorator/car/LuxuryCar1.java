package car;

public class LuxuryCar1 extends CarDecorator {

	public LuxuryCar1(Car1 car) {
		super(car);
		assemble();
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Luxury Car..");
	}
	
}
