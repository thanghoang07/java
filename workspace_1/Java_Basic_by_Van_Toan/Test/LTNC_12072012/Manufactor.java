package LTNC_12072012;

public class Manufactor {
	private String companyName;
	private String country;

	public Manufactor(String companyName, String country) {
		this.companyName = companyName;
		this.country = country;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
