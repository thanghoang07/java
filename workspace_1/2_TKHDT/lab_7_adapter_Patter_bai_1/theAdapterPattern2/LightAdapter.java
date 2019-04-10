package theAdapterPattern2;

public class LightAdapter implements Switchable{
	private Light lig;
	public LightAdapter(Light lig) {
		// TODO Auto-generated constructor stub
		this.lig = lig;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		lig.on();
	}
	
}
