package weatherStation1;

public class Test {
	public static void main(String[] args) {
		// weatherData chứa 3 yếu tố, suy ra không nên dùng cách trực tiếp để
		// update 3 yếu tố đó
		WeatherData wtd = new WeatherData();
		ManHinhHienTai mhht = new ManHinhHienTai(wtd);
		ManHinhThongKe mhtk = new ManHinhThongKe(wtd);
		ManHinhDuBao mhdb = new ManHinhDuBao(wtd);

		mhht.capNhatThongTin(10, 20, 30);
		mhht.capNhatThongTin(19, 134, 324);
		// wtd.setMensurements(41, 10, 45);
		// wtd.setMensurements(29, 25, 60);
	}
}
