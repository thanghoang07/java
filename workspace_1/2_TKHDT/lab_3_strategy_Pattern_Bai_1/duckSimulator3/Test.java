package duckSimulator3;

public class Test {
	public static void main(String[] args) {
		Duck mallardDuck = new MallarDuck();
		Duck redHeadDuck = new RedHeadDuck();
		Duck rubberDuck = new RubberDuck();
		Duck decoyDuck = new DecoyDuck();

		System.out.println("________");
		mallardDuck.display();
		mallardDuck.swim();
		((Quackable) mallardDuck).quack();
		((Flyable) mallardDuck).fly();
		
		System.out.println("________");
		redHeadDuck.display();
		redHeadDuck.swim();
		((Quackable) redHeadDuck).quack();
		((Flyable) redHeadDuck).fly();
		
		System.out.println("________");
		rubberDuck.display();
		rubberDuck.swim();
		((Quackable) rubberDuck).quack();

		System.out.println("________");
		decoyDuck.display();
		decoyDuck.swim();

	}
}
