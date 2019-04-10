package tinhCuocSuDungDien;

import java.util.List;

public abstract class Customer {
	protected static final double TAX_RATE = 0.1;
	private String id;
	private String name;

	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Reading getOldReading() {
		return getReadings().get(getReadings().size() - 2);
	}

	public Reading getNewReading() {
		return getReadings().get(getReadings().size() - 1);
	}

	public abstract List<? extends Reading> getReadings();

	public abstract double charge();

	public abstract String statement();
}
