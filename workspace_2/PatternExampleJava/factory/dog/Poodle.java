package dog;

public class Poodle extends Dog {

	public Poodle() {
		super(DogType.POODLE);
		speak();
	}

	@Override
	public void speak() {
		System.out.println("The poodle says \"arf\"");
	}

}
