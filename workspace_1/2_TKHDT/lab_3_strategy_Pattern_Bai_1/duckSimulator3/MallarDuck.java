package duckSimulator3;

public class MallarDuck extends Duck implements Flyable, Quackable {

	@Override
	public void display() {
		System.out.println("I'm a Mallar duck");
	}

	@Override
	public void quack() {
		System.out.println("Quack, quack ... ");
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

}