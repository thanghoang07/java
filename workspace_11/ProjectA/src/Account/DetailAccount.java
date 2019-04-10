package Account;

import Controls.Datetime;

public class DetailAccount {
	private String idAccount, name, address, district, city;
	private int phoneNumber, homePhone;
	private boolean gender;
	private Datetime DoB;
	private StatusAccount statusAccount;
	private Datetime startDateRegister;
	private String image;

	public DetailAccount(String idAccount, String name, String address, String district, String city, int phoneNumber,
			int homePhone, boolean gender, Datetime doB, StatusAccount statusAccount, Datetime startDateRegister,
			String image) {
		super();
		this.idAccount = idAccount;
		this.name = name;
		this.address = address;
		this.district = district;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.homePhone = homePhone;
		this.gender = gender;
		DoB = doB;
		this.statusAccount = statusAccount;
		this.startDateRegister = startDateRegister;
		this.image = image;
	}

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(int homePhone) {
		this.homePhone = homePhone;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Datetime getDoB() {
		return DoB;
	}

	public void setDoB(Datetime doB) {
		DoB = doB;
	}

	public StatusAccount getStatusAccount() {
		return statusAccount;
	}

	public void setStatusAccount(StatusAccount statusAccount) {
		this.statusAccount = statusAccount;
	}

	public Datetime getStartDateRegister() {
		return startDateRegister;
	}

	public void setStartDateRegister(Datetime startDateRegister) {
		this.startDateRegister = startDateRegister;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "DetailAccount [idAccount=" + idAccount + ", name=" + name + ", address=" + address + ", district="
				+ district + ", city=" + city + ", phoneNumber=" + phoneNumber + ", homePhone=" + homePhone
				+ ", gender=" + gender + ", DoB=" + DoB + ", statusAccount=" + statusAccount + ", startDateRegister="
				+ startDateRegister + ", image=" + image + "]";
	}

}
