package tesst;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demon {
	public static void main(String[] args) {
		Date today = new Date(System.currentTimeMillis());
		SimpleDateFormat timehh = new SimpleDateFormat("hh");
		SimpleDateFormat timemm = new SimpleDateFormat("mm");
		SimpleDateFormat timess = new SimpleDateFormat("ss");
		String s1 = timehh.format(today.getTime());
		String s2 = timemm.format(today.getTime());
		String s3 = timess.format(today.getTime());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);		
	}
}
