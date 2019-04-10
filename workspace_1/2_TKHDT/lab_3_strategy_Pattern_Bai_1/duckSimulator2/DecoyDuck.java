package duckSimulator2;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a Decoy duck");
	}

	public void quack() {
		System.out.println("Nothing");
	}
	
	public void fly(){
		System.out.println("Nothing");
	}
}
