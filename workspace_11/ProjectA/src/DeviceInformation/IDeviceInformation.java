package DeviceInformation;

import Controls.Datetime;

public interface IDeviceInformation {
	public void getAllinformationDevice(String idAccount, String idDevice);

	public void getInformationDeviceFollowTime(String idAccount, String idDevice, Datetime datetime);

	public void getInformationHour();

	public void getInformationDay();

	public void getInformationMonth();

	public void getInformationYear();

	public void actionForValueHight();

	public void actionForValueLow();

	public void actionByUser();

	public void selfTimerByUser();
}
