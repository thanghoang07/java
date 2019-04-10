package bai3;

public class Person implements Observer {
	private String personName;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Person(String personName) {
		super();
		this.personName = personName;
	}

	@Override
	public void update(String availbility) {
		System.out.printf("Hello %s, Product is now %s on flipkart\n", personName, availbility);

	}

}
