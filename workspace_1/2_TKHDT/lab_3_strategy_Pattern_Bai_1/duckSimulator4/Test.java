package duckSimulator4;

public class Test {
	public static void main(String[] args) {
		FlyWithWings fw = new FlyWithWings();
		FlyNoWay fn = new FlyNoWay();
		FlyRocketPower fr = new FlyRocketPower();

		Quack qu = new Quack();
		Squick sq = new Squick();
		MuteQuack mu = new MuteQuack();

		Duck mallardDuck = new MallarDuck(fw, qu);
		Duck redHeadDuck = new RedHeadDuck(fw, qu);
		Duck rubberDuck = new RubberDuck(fn, sq);
		Duck decoyDuck = new DecoyDuck(fn, mu);

		System.out.println("MallarDuck");
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.swim();
		// gan lai cach bay khac
		mallardDuck.setFlyBehavior(fr);
		mallardDuck.performFly();
		// gan lai cach keu khac
		mallardDuck.setQuackBehavior(sq);
		mallardDuck.performQuack();

		System.out.println("\nRedHeadDuck");
		redHeadDuck.display();
		redHeadDuck.performFly();
		redHeadDuck.performQuack();
		redHeadDuck.swim();
		// gan lai cach bay khac
		redHeadDuck.setFlyBehavior(fn);
		redHeadDuck.performFly();
		// gan lai cach keu khac
		redHeadDuck.setQuackBehavior(sq);
		redHeadDuck.performQuack();

		System.out.println("\nRubberDuck");
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		rubberDuck.swim();
		// gan lai cach bay khac
		rubberDuck.setFlyBehavior(fr);
		rubberDuck.performFly();
		// gan lai cach keu khac
		rubberDuck.setQuackBehavior(sq);
		rubberDuck.performQuack();

		System.out.println("\nDecoyDuck");
		decoyDuck.display();
		decoyDuck.performFly();
		decoyDuck.performQuack();
		decoyDuck.swim();
		// gan lai cach bay khac
		decoyDuck.setFlyBehavior(fr);
		decoyDuck.performFly();
		// gan lai cach keu khac
		decoyDuck.setQuackBehavior(sq);
		decoyDuck.performQuack();
	}

}
