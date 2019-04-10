package weatherStation2;

public class ManHinhHienTai implements Observer, HienThi {
	public double nhietDo, doAm, apXuat;
	private Subject weatherData;

	public ManHinhHienTai() {
		super();
	}

	public ManHinhHienTai(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void inRa() {
		System.out.println("***********************************");
		System.out.printf("\tThoi Tiet Hien Tai: \nNhiet Do: \t%.3f \nDo Am: \t\t%.3f \nAp Xuat: \t%.3f", nhietDo, doAm,
				apXuat);
		System.out.println("\n***********************************");
	}

	@Override
	public void capNhatThongTin(double nhietDo, double doAm, double apXuat) {
		this.nhietDo = nhietDo;
		this.doAm = doAm;
		this.apXuat = apXuat;
		inRa();
	}

}
