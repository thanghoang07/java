package clockTime;

public class ThemMotDongHoMoi implements Observer, HienThi {
	public Subject clock;
	public double gio, phut, giay;

	public ThemMotDongHoMoi(Subject clock) {
		super();
		this.clock = clock;
		clock.registerObserver(this);
	}

	@Override
	public void inRa() {
		System.out.println("***********************************");
		System.out.println("Dong Ho Analog");
		System.out.printf("%.0f:%.0f:%.0f\n", gio, phut, giay);
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println("Dong Ho Digital");
		System.out.printf("%.0f:%.0f:%.0f\n", gio, phut, giay);
		System.out.println("***********************************");

	}

	@Override
	public void update(double gio, double phut, double giay) {
		this.giay = giay;
		this.phut = phut;
		this.gio = gio + 3;
		inRa();
	}

}
