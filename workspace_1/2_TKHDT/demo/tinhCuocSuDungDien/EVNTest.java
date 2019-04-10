package tinhCuocSuDungDien;

import java.util.Calendar;
import java.util.GregorianCalendar;
import junit.framework.TestCase;

public class EVNTest extends TestCase {
	public void testPrintAllInvoice() {
		EVNComDivision division = new EVNComDivision("TP.HCM");

		ResidentalCustomer r1 = new ResidentalCustomer("01234", "Nguyen Thi Teo");
		BusinessCustomer b1 = new BusinessCustomer("00001", "Binh Thanh Nguyen", "10231223");

		division.register(r1);
		division.register(b1);

		r1.addReading(new OneReading(new GregorianCalendar(2001, Calendar.JANUARY, 15).getTime(), 4551));
		r1.addReading(new OneReading(new GregorianCalendar(2001, Calendar.FEBRUARY, 15).getTime(), 4796));

		b1.addReading(new ThreeReading(new GregorianCalendar(2001, Calendar.JANUARY, 10).getTime(), 20560, 5000, 2000));
		b1.addReading(
				new ThreeReading(new GregorianCalendar(2001, Calendar.FEBRUARY, 10).getTime(), 21796, 5236, 2150));

		assertTrue(r1.statement().indexOf("242880") > 0);
		assertTrue(b1.statement().indexOf("1212123") > 0);
	}
}
