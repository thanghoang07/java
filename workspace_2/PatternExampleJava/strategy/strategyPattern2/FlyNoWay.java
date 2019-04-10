package strategyPattern2;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying no way!");
	}

}
