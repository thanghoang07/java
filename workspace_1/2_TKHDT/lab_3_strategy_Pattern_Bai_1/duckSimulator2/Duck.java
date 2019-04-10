package duckSimulator2;

public abstract class Duck {
	public void swim() {
		System.out.println("I'm swimming");
	}

	public void quack() {
		System.out.println("Quack, quack ... ");
	}

	public void fly() {
		System.out.println("I am flying");
	}

	public abstract void display();
}
