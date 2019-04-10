package duckSimulator;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a Decoy duck");
	}

	public void quack() {
		System.out.println("Nothing");
	}
	
	
}
