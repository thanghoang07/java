package Device;

import Account.Account;

public class Device implements IDevice {
	private String idDevice;
	private Account account;
	private String name;
	private DeviceType deviceType;
	private StatusDevice statusDevice;
	private DetailDevice detailDevice;

	public Device(String idDevice, Account account, String name, DeviceType deviceType, StatusDevice statusDevice,
			DetailDevice detailDevice) {
		super();
		this.idDevice = idDevice;
		this.account = account;
		this.name = name;
		this.deviceType = deviceType;
		this.statusDevice = statusDevice;
		this.detailDevice = detailDevice;
	}

	@Override
	public String toString() {
		return "Device [idDevice=" + idDevice + ", account=" + account + ", name=" + name + ", deviceType=" + deviceType
				+ ", statusDevice=" + statusDevice + ", detailDevice=" + detailDevice + "]";
	}

	public String getIdDevice() {
		return idDevice;
	}

	public void setIdDevice(String idDevice) {
		this.idDevice = idDevice;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	public StatusDevice getStatusDevice() {
		return statusDevice;
	}

	public void setStatusDevice(StatusDevice statusDevice) {
		this.statusDevice = statusDevice;
	}

	public DetailDevice getDetailDevice() {
		return detailDevice;
	}

	public void setDetailDevice(DetailDevice detailDevice) {
		this.detailDevice = detailDevice;
	}

	@Override
	public void getAllDevice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllDeviceAccount(String idAccount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDevice(String idDevice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void countDeviceAccount(String idAccount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDetailDevice(String idAccount) {
		// TODO Auto-generated method stub

	}

}
