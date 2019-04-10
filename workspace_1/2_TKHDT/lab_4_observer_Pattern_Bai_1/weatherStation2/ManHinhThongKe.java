package weatherStation2;

public class ManHinhThongKe implements Observer, HienThi {
	public double temp, nhietDo, doAm, apXuat, max = 0, min = 15, trungBinh = 0;
	public int count;
	private Subject weatherData;

	public ManHinhThongKe(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public ManHinhThongKe() {
		super();
	}

	@Override
	public void inRa() {
		System.out.println("***********************************");
		System.out.printf(
				"Thong Ke Nhiet Do Trong Ngay: \nNhiet Do: \t%.3f \nNhiet Do Cao Nhat: \t%.3f \nNhiet Do Thap Nhat: \t%.3f \nNhiet Do Trung Binh: \t%.3f",
				temp, max, min, trungBinh);
		System.out.println("\n***********************************");
	}

	@Override
	public void capNhatThongTin(double nhiet, double doAm, double apXuat) {
		this.temp = nhiet;
		nhietDo += nhiet;
		count++;
		if (max < temp) {
			max = temp;
		}
		if (min > temp) {
			min = temp;
		}
		trungBinh = nhietDo / count;
		inRa();
	}
}
