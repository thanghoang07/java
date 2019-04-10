package strategyPattern2;

public class RubberDuck extends Duck {
	public RubberDuck() {
		fly = new FlyNoWay();
		quack = new Squick();
	}
	@Override
	public void display() {
		System.out.println("Rubber Duck");		
	}

}
