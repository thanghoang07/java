package strategyPattern2;

public class Test {

	public static void main(String[] args) {
		Duck ma = new MallardDuck();
		// in ra con vit co nhung gi
		ma.display();
		ma.swim();
		ma.performFly();
		ma.performQuack();
		// set lai trang thai khac
		System.out.println("------");
		ma.setFlyBehavior(new FlyNoWay());
		ma.setQuackBehavior(new MuteQuack());
		ma.performFly();
		ma.performQuack();
	}

}
