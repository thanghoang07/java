package theAdapterPattern2;

public class Test {
	public static void main(String[] args) {
		Light li = new Light();
		Switchable lab = new LightAdapter(li);
		Button bu = new Button(lab);
		
		System.out.println("1");
		bu.press();
		System.out.println("2");
		bu.press();
	}
}
