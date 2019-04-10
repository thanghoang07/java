package lab01;

import static org.junit.Assert.*;

import org.junit.Test;

public class ABook_TTTTest {

	@Test
	public void test() {
//		
		 Date_TTT dat1 = 
				 new Date_TTT(23, 04, 1978);
//		
		 Author_TTT at1 = 
				 new Author_TTT("PVA", dat1);
//		 
		 ABook_TTT ab1 = 
				 new ABook_TTT("abnd", 30D, 2017, at1);
	}

}
