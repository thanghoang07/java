package theAdapterPattern;

public class Test {
	public static void main(String[] args) {
		Duck ma = new MallarDuck();
		Turkey tu = new WildTurkey();				
		Turkey maTu = new DuckAdapter(ma);		
		//
		System.out.println("1");
		tu.gobble();
		tu.fly();
		//
		System.out.println("2");
		maTu.gobble();
		maTu.fly();
	}
}
