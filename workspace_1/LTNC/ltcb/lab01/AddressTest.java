package lab01;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressTest {

	@Test
	public void test() {
		 new Address(15, "Nam ky khoi nghia"
				 , "Tp.HCM Quan 1");
		 new Address(17, "Nguyen Thi Minh Khai"
				 , "Tp.HCM Quan 1");
		 new Address(19, "Nguyen Thi Minh Khai"
				 , "Tp.HCM Quan 1");

	}
}