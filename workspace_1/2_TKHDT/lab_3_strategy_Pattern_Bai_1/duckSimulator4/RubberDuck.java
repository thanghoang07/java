package duckSimulator4;

public class RubberDuck extends Duck {

	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("I'm a Rubber duck");
	}

}
