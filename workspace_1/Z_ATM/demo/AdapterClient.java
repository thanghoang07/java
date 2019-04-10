import adapter.Adapter;
import adapter.Target;

public class AdapterClient {
	public static Target Create(String str){
		if(str.equals("Target")){
			return new Target();
		}if(str.equals("Adapter")){
			return new Adapter();
		}
		return null;
	}
	public static void main(String[] args) {
		Target g1 = Create("Ta");
		Target g2 = Create("Target");
		Target g3 = Create("Adapter");
		//g1.operation();
		g2.operation();
		g3.operation();
	}
}
