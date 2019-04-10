package dog;

public class Rottweiler extends Dog {

	public Rottweiler() {
		super(DogType.ROTTWEILER);
		speak();
	}

	@Override
	public void speak() {
		System.out.println("The Rottweiler says (in a very deep voice) \"WOOF!\"");
	}

}
