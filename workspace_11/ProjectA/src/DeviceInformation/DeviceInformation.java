package DeviceInformation;

import Account.Account;
import Controls.Datetime;
import Device.Device;

public abstract class DeviceInformation implements IDeviceInformation {

	private String idDeviceInformation;
	private Account account;
	private Device device;
	private Datetime time;
	private float value;
	private String location;

	public DeviceInformation(String idDeviceInformation, Account account, Device device, Datetime time, float value,
			String location) {
		super();
		this.idDeviceInformation = idDeviceInformation;
		this.account = account;
		this.device = device;
		this.time = time;
		this.value = value;
		this.location = location;
	}

	@Override
	public String toString() {
		return "DeviceInformation [idDeviceInformation=" + idDeviceInformation + ", account=" + account
				+ ", device=" + device + ", time=" + time + ", value=" + value + ", location=" + location + "]";
	}

	public String getIdDeviceInformation() {
		return idDeviceInformation;
	}

	public void setIdDeviceInformation(String idDeviceInformation) {
		this.idDeviceInformation = idDeviceInformation;
	}

	public Account getIdAccount() {
		return account;
	}

	public void setIdAccount(Account account) {
		this.account = account;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public Datetime getTime() {
		return time;
	}

	public void setTime(Datetime time) {
		this.time = time;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public void getAllinformationDevice(String idAccount, String idDevice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getInformationDeviceFollowTime(String idAccount, String idDevice, Datetime datetime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getInformationHour() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getInformationDay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getInformationMonth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getInformationYear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionForValueHight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionForValueLow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionByUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selfTimerByUser() {
		// TODO Auto-generated method stub

	}

}
