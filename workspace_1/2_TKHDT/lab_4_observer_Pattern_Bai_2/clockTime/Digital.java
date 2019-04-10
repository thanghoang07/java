package clockTime;

public class Digital implements Observer, HienThi {
	public double gio, phut, giay;
	private Subject clock;

	public Digital() {
		super();
	}

	public Digital(Subject clock) {
		super();
		this.clock = clock;
		clock.registerObserver(this);
	}
	
	@Override
	public void inRa() {
		System.out.println("***********************************");
		System.out.println("Dong Ho Digital");
		System.out.printf("%.0f:%.0f:%.0f\n", gio, phut, giay);
		System.out.println("***********************************");
	}

	@Override
	public void update(double gio, double phut, double giay) {
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
		inRa();
	}
}
