package duckSimulator;

public class Test {
	/*
	 * suy ra nếu dùng hệ thống kế thừa thì bị lặp code
	 * 
	 */
	public static void main(String[] args) {
		Duck mallardDuck = new MallarDuck();
		Duck redHeadDuck = new RedHeadDuck();
		Duck rubberDuck = new RubberDuck();
		Duck decoyDuck = new DecoyDuck();

		System.out.println("MallarDuck");
		mallardDuck.display();
		mallardDuck.quack();
		mallardDuck.swim();

		System.out.println("\nRedHeadDuck");
		redHeadDuck.display();
		redHeadDuck.quack();
		redHeadDuck.swim();

		System.out.println("\nRubberDuck");
		rubberDuck.display();
		rubberDuck.quack();
		rubberDuck.swim();

		System.out.println("\nDecoyDuck");
		decoyDuck.display();
		decoyDuck.quack();
		decoyDuck.swim();
	}

}
