package strategyPattern2;

public abstract class Duck {
	protected FlyBehavior fly;
	protected QuackBehavior quack;

	public Duck() {
		super();
	}

	public abstract void display();

	public void performFly() {
		fly.fly();
	}

	public void performQuack() {
		quack.quack();
	}

	public void swim() {
		System.out.println("Swiming");
	}

	public void setFlyBehavior(FlyBehavior fly) {
		this.fly = fly;
	}

	public void setQuackBehavior(QuackBehavior quack) {
		this.quack = quack;
	}
}
