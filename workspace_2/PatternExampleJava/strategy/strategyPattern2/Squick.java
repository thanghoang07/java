package strategyPattern2;

public class Squick implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squick squick squick...");
	}

}
