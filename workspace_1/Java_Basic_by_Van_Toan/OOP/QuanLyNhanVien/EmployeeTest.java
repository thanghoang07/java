package QuanLyNhanVien;

import java.util.Collections;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	public void testConstructor() {
		Employee e1 = new SalaryEmployee("Nguyen Hoang", new Date(20, 5, 2001),
				"Long", 50000000, 2500);
		Employee e2 = new HourlyEmployee("Tran Minh", new Date(30, 6, 2005),
				"Quoc", 50000, 45);
		Employee e3 = new Consultant("Le Van", new Date(25, 9, 2004), "Anh",
				012030, 50000000);
		Employee e4 = new SalaryEmployee("Nguyen Hoang", new Date(20, 5, 2001),
				"Bao", 50000000, 2500);

		assertEquals(e1.sameName(e2), false);
		assertEquals(e1.sameName(e4), true);
		assertEquals(e2.sameName(e3), false);

		assertEquals(e1.workYear(2005), 4);

		assertEquals(e1.monthlySalary(), 4666666, 0.01);

	}
}
