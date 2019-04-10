package lab01;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseTest {

	@Test
	public void test() {
//		
		Address a1 = new Address(15, "Nam ky khoi nghia"
				 , "Tp.HCM Quan 1");
		House h1 = new House("ABC", 500, 300000, a1);
//		
		Address a2 = new Address(17, "Nguyen Thi Minh Khai"
				 , "Tp.HCM Quan 1");
		House h2 = new House("ABE", 300, 210000, a2);
//		
		Address a3 = new Address(19, "Nguyen Thi Minh Khai"
				 , "Tp.HCM Quan 1");
		House h3 = new House("ASR", 60, 150000, a3);
	}

}
