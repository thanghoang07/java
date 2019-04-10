package lab02;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class BoPhimTest {

	@Test
	public void test() {
//		
		NgayChieu n1 = new NgayChieu(29, 11, 1995);
		HangSanXuat h1 = new HangSanXuat("Huy", "Quoc");
		BoPhim b1 = new BoPhim("Ham", 1995, h1, 10, n1);		
//		
		NgayChieu n2 = new NgayChieu(29, 02, 2015);
		HangSanXuat h2 = new HangSanXuat("Hang phim tre", "VietNam");
		BoPhim b2 = new BoPhim("Con tim day mau", 1995, h2, 20, n2);
//		
		NgayChieu n3 = new NgayChieu(10, 05, 1995);
		HangSanXuat h3 = new HangSanXuat("Huy", "Quoc");
		BoPhim b3 = new BoPhim("tom and jerry", 1995, h3, 30, n3);
//		
		Assert.assertTrue(b1.kiemTraReHon(b2));
		Assert.assertEquals(20, b2.giamGia(20), 0);
		Assert.assertEquals(b2.getTenHangSanXuat(), "Hang phim tre");
		
	}

}
