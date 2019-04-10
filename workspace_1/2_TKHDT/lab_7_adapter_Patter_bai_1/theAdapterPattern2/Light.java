package theAdapterPattern2;

public class Light {
	public boolean on;
	
	public void on(){
		System.out.println("turn on");
		on = true;
	}
	public void off(){
		System.out.println("turn off");
		on = false;
	}
	public boolean isOn(){
		return on;
	}
}
