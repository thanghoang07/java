package FinalExam2014;

import junit.framework.TestCase;

public class LibraryItemTest extends TestCase {
	public void testConstructor(){
		LibraryItem l1 = new Book(102, "How to design class hierarchies", 5, "Tin hoc", "Mathisa Felleisen", 2004);
		LibraryItem l2 = new CD(1023, "Pearl", 40, "JJ");
		LibraryItem l3 = new Magazine(143, "MW", 3, 20, 4);
		
		assertEquals(l1.fine(20), 60000, 0.01);
		assertEquals(l2.fine(42), 4000, 0.01);
		
		LibraryItem[] array = new LibraryItem[10];
		
	}
}
