package bai3;

public class Test {
	public static void main(String[] args) {
		Product p1 = new Product("Samsung", "Mobile", "not available");
		Person pe1 = new Person("A");
		Person pe2 = new Person("B");

		p1.registerObserver(pe1);
		p1.registerObserver(pe2);

		p1.setAvailability("Available");
	}
}
