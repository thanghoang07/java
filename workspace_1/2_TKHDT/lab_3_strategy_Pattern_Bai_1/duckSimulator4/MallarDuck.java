package duckSimulator4;

public class MallarDuck extends Duck {

	public MallarDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("I'm a Mallar duck");
	}

}
