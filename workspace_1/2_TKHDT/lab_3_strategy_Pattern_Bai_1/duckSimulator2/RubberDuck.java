package duckSimulator2;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a Rubber duck");
	}

	public void quack() {
		System.out.println("Squick, Squick ... ");
	}

	public void fly() {
		System.out.println("Nothing");
	}
}
