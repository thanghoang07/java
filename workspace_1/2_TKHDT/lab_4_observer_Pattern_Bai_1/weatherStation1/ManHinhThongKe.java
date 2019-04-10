package weatherStation1;

public class ManHinhThongKe {
	public double nhietDo;
	public double doAm;
	public double apXuat;
	public WeatherData weatherData;

	public ManHinhThongKe(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
	}

	public void capNhatThongTin(double nhietDo, double doAm, double apXuat) {
		this.nhietDo = nhietDo;
		this.doAm = doAm;
		this.apXuat = apXuat;
		inRa();
	}

	public double nhietDoTrungBinh(double nhietDo) {
		
		return nhietDo;

	}

	public double nhietDoLonNhat(double nhietDo) {
		return nhietDo;

	}

	public double nhietDoNhoNhat(double nhietDo) {
		return nhietDo;

	}

	public void inRa() {
		System.out.printf("nhiet do trung binh: %d \nnhiet do lon nhat: %d \nnhiet do nho nhat: %d",
				nhietDoTrungBinh(nhietDo), nhietDoLonNhat(nhietDo), nhietDoNhoNhat(nhietDo));
	}
}
