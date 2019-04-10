package duckSimulator4;

public class RedHeadDuck extends Duck {

	
	public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("I'm a Red Head duck");
	}

}
