package bai2;

public class User implements Observer {

	@Override
	public void update(float interest) {
		System.out.println("User: Interest Rate updated, new Rate is: " + interest);
	}

}
