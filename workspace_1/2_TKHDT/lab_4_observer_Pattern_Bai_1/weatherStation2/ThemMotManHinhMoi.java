package weatherStation2;

public class ThemMotManHinhMoi implements Observer, HienThi {
	public ManHinhHienTai mhht;
	public ManHinhDuBao mhdb;
	public ManHinhThongKe mhtk;
	public Subject weatherData;

	public ThemMotManHinhMoi() {
		super();
	}

	public ThemMotManHinhMoi(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void inRa() {
		System.out.println("Weather");
		
	}

	@Override
	public void capNhatThongTin(double nhietDo, double doAm, double apXuat) {
		inRa();
	}
}
