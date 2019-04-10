package clockTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		//
		Date today = new Date(System.currentTimeMillis());
		//
		SimpleDateFormat timehh = new SimpleDateFormat("hh");
		SimpleDateFormat timemm = new SimpleDateFormat("mm");
		SimpleDateFormat timess = new SimpleDateFormat("ss");
		//
		double s1 = Double.parseDouble(timehh.format(today.getTime()));
		double s2 = Double.parseDouble(timemm.format(today.getTime()));
		double s3 = Double.parseDouble(timess.format(today.getTime()));
		//
		Clock clk = new Clock();
		//
		Digital dg = new Digital(clk);
		Analog an = new Analog(clk);
		ThemMotDongHoMoi wen = new ThemMotDongHoMoi(clk);
		//
		clk.setMeasurements(s1, s2, s3);
	} 
}
