package QuanLyThuVien;

import junit.framework.TestCase;

public class LibraryItemTest extends TestCase {
	public void testConstructor(){
		LibraryItem l1  = new Book(102, "How  to design class hirarchies", 5, "Tin hoc", "Matthias Fellesen", 2004);
		LibraryItem l2 = new CD(1023, "Pearl", 40, "JJ");
		LibraryItem l3 = new Magazine(143, "MW", 3, 20, 4);
		
		
		
		assertEquals(l1.smallerThan(l2), true);
		assertEquals(l2.smallerThan(l3), false);
		assertEquals(l1.smallerThan(l3), true);
		
		
		assertEquals(l1.overdueDays(10), 5);
		assertEquals(l2.overdueDays(100), 60);
		assertEquals(l3.overdueDays(5), 2);
		
	}
}
