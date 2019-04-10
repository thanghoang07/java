package Garden;

import java.util.List;

import Account.Account;
import Device.Device;

public class Garden {
	private String idGarden;
	private Account account;
	private List<Device> listDevice;
	private String locations;

	public String getIdGarden() {
		return idGarden;
	}

	public void setIdGarden(String idGarden) {
		this.idGarden = idGarden;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Device> getListDevice() {
		return listDevice;
	}

	public void setListDevice(List<Device> listDevice) {
		this.listDevice = listDevice;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		return "Garden [idGarden=" + idGarden + ", account=" + account + ", listDevice=" + listDevice + ", locations="
				+ locations + "]";
	}

	public Garden(String idGarden, Account account, List<Device> listDevice, String locations) {
		super();
		this.idGarden = idGarden;
		this.account = account;
		this.listDevice = listDevice;
		this.locations = locations;
	}

}
