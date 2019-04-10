package duckSimulator4;

public class DecoyDuck extends Duck {

	public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("I'm a Decoy duck");
	}

}
