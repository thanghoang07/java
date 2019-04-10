package theAdapterPattern2;

import junit.framework.TestCase;

public class AdapterAnonymousTest extends TestCase {
	private Light li = new Light();

	public void test() {
		Switchable swit = new Switchable() {
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				li.on();
			}
		};
		Button bu = new Button(swit);
		bu.press();
		assertTrue(li.isOn());
		bu.press();
		assertTrue(li.isOn());
	}
}
