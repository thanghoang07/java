package lab01;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherRecord_TTTest {

	@Test
	public void test() {
//		
		 Date_TT dt1 = new Date_TT(12, 03, 2015);
		 
//		 
		TemperatureRange_TT tr1 = 
				new TemperatureRange_TT(23, 10);
		TemperatureRange_TT tr2 =
				new TemperatureRange_TT(26, 12);
		TemperatureRange_TT tr3 = 
				new TemperatureRange_TT(30, 27);
//		
		WeatherRecord_TT wr1 = 
				new WeatherRecord_TT(dt1, tr1, tr2, tr3, 5);
		
		 
		}

}
