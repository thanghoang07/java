package weatherStation1;

public class ManHinhHienTai {
	public double nhietDo;
	public double doAm;
	public double apXuat;
	private WeatherData weatherData;
	// dữ liệu thay đổi thì tất cả lớp liên quan thay đổi theo nếu có lớp
	// WeatherData

	public ManHinhHienTai(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.setManHinhHienTai(this);
	}

	public ManHinhHienTai() {
		super();
	}

	public void capNhatThongTin(double nhietDo, double doAm, double apXuat) {
		this.nhietDo = nhietDo;
		this.doAm = doAm;
		this.apXuat = apXuat;
		inRa();
	}

	public void inRa() {

		System.out.printf("\nthoi tiet hien tai: \nnhiet do: %.2f \ndo am: %.2f \nap xuat: %.2f", nhietDo, doAm,
				apXuat);
	}
}
