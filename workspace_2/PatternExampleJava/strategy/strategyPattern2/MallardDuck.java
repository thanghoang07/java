package strategyPattern2;

public class MallardDuck extends Duck {
	public MallardDuck() {
		fly = new FlyWithWings();
		quack = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("Mallard Duck");
	}

}
