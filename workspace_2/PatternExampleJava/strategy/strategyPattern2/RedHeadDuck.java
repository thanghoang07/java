package strategyPattern2;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		fly = new FlyWithWings();
		quack = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Red head duck");
	}

}
