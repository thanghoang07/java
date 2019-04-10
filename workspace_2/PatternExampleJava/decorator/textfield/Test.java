package textfield;

public class Test {
	public static void main(String[] args) {
		Widget wi = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(12, 112))));
		System.out.println("in ra ket qua");
		wi.draw();
	}
}
