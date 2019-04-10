package adapter;

import adaptee.Adaptee;

public class Adapter extends Target{
	private Adaptee obj = new Adaptee();

	public void operation(){
		request();
	}
	
	private void request(){
		obj.specificRequest();
	}
}
