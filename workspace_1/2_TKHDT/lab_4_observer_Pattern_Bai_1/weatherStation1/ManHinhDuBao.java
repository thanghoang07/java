package weatherStation1;

public class ManHinhDuBao {
	public double nhietDo;
	public double doAm;
	public double apXuat;
	public WeatherData weatherData;

	public ManHinhDuBao(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
	}

	public void capNhatThongTin(double nhietDo, double doAm, double apXuat) {
		this.nhietDo = nhietDo;
		this.doAm = doAm;
		this.apXuat = apXuat;
		inRa();
	}

	public double duBaoNhietDo(double nhietDo) {
		return nhietDo;

	}

	public double duBaoDoAm(double doAm) {
		return doAm;

	}

	public double duBaoApXuat(double apXuat) {
		return apXuat;

	}

	public void inRa() {
		System.out.printf("du bao: \n nhiet do: %d \n do am: %d \n ap xuat: %d", duBaoNhietDo(nhietDo), duBaoDoAm(doAm),
				duBaoApXuat(apXuat));
	}
}
