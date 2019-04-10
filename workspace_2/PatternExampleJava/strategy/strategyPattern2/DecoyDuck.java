package strategyPattern2;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		fly = new FlyNoWay();
		quack = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("Decoy Duck");
	}

}
