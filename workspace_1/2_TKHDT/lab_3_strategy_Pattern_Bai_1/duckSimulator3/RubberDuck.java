package duckSimulator3;

public class RubberDuck extends Duck implements Quackable {

	@Override
	public void display() {
		System.out.println("I'm a Rubber duck");
	}

	@Override
	public void quack() {
		System.out.println("Squack, squack ... ");
	}

}
