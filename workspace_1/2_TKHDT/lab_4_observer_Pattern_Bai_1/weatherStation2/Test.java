package weatherStation2;

public class Test {
	public static void main(String[] args) {
		/*
		 * ManHinhThongKe mhht = new ManHinhThongKe(); mhht.capNhatThongTin(9,
		 * 31, 50); mhht.capNhatThongTin(21, 21, 50); mhht.capNhatThongTin(40,
		 * 41, 50);
		 */
		WeatherData wtd = new WeatherData();
		
		ManHinhHienTai mhht = new ManHinhHienTai(wtd);
		ManHinhDuBao mhdb = new ManHinhDuBao(wtd);
		ManHinhThongKe mhtk = new ManHinhThongKe(wtd);
		ThemMotManHinhMoi alls = new ThemMotManHinhMoi(wtd);
		
		wtd.setMeasurements(9, 31, 0.2);
		wtd.setMeasurements(21, 21, 0.2);
		wtd.setMeasurements(40, 41, 0.2);
	}
}
