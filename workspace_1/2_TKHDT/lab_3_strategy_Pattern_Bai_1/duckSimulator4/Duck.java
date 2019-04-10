package duckSimulator4;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	public Duck() {

	}

	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super();
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	/**
	 * @return the flyBehavior
	 */
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	/**
	 * @param flyBehavior
	 *            the flyBehavior to set
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	/**
	 * @return the quackBehavior
	 */
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	/**
	 * @param quackBehavior
	 *            the quackBehavior to set
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void swim() {
		System.out.println("I'm swimming");
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public abstract void display();
}
