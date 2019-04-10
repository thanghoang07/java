package car;

public class CarDecorator implements Car1 {
	protected Car1 car;
	
	public CarDecorator(Car1 car) {
		super();
		this.car = car;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

}
