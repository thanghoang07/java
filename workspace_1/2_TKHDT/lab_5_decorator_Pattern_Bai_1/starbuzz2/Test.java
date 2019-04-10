 package starbuzz2;

public class Test {
	public static void main(String[] args) {
		Beverage be1 = new Milk(new Mocha(new Mocha(new Espresso())));
		System.out.printf("%s\n%d\n", be1.getDes(), be1.cost());
		
		Beverage be2 = new Milk(new Mocha(new Mocha(new Whip(new DarkRoast()))));
		System.out.printf("%s\n%d\n", be2.getDes(), be2.cost());
	}
}
         