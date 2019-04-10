package lab01;

public class WeatherRecord_TT {
	private Date_TT date;
	private TemperatureRange_TT today;
	private TemperatureRange_TT normal;
	private TemperatureRange_TT record;
	private double precipitation;
	
	public WeatherRecord_TT( 
			Date_TT date,
			TemperatureRange_TT today,
			TemperatureRange_TT normal,
			TemperatureRange_TT record,
			double precipitation
			) {
		
		this.date = date;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
		
	}
		
}
