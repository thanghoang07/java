package FakeData;

import java.util.ArrayList;
import java.util.List;

import Account.Account;
import Account.AccountType;
import Account.DetailAccount;
import Account.StatusAccount;
import Controls.Datetime;
import Device.DetailDevice;
import Device.Device;
import Device.DeviceType;
import Device.StatusDevice;
import DeviceInformation.DeviceInformation;
import DeviceInformation.Lights;
import Garden.Garden;
import DeviceInformation.Canopy;
import Mode.Mode;
import Mode.ModeType;
import Mode.StatusMode;

public class FakeData {

	public static void main(String[] args) {
		//
		AccountType accType1 = new AccountType(1, "Bình thường");
		AccountType accType2 = new AccountType(2, "VIP");
		AccountType accType3 = new AccountType(3, "Admin");
		//
		StatusAccount sttAcc1 = new StatusAccount(1, "Action");
		StatusAccount sttAcc2 = new StatusAccount(2, "Inaction");
		//
		DetailAccount deAcc1 = new DetailAccount("acc1", "Thang", "KT", "", "", 123456789, 13456789, true,
				new Datetime(03, 01, 1995), sttAcc1, new Datetime(04, 05, 2018), "");
		DetailAccount deAcc2 = new DetailAccount("acc2", "Huy", "KT", "", "", 123456789, 13456789, true,
				new Datetime(29, 11, 1995), sttAcc1, new Datetime(04, 05, 2018), "");
		DetailAccount deAcc3 = new DetailAccount("acc3", "Hoc", "KT", "", "", 123456789, 13456789, true,
				new Datetime(30, 8, 1996), sttAcc1, new Datetime(04, 05, 2018), "");
		//
		Account acc1 = new Account("acc1", "", "", deAcc1, accType3);
		Account acc2 = new Account("acc2", "", "", deAcc2, accType2);
		Account acc3 = new Account("acc3", "", "", deAcc3, accType1);
		// -- acc2
		ModeType moType1 = new ModeType(1, "Binh thuong");
		ModeType moType2 = new ModeType(2, "Tiet kiem");
		//
		StatusMode sttMode1 = new StatusMode(1, "");
		StatusMode sttMode2 = new StatusMode(2, "");
		StatusMode sttMode3 = new StatusMode(3, "");
		//
		DeviceType deType1 = new DeviceType(1, "Sensor");
		DeviceType deType2 = new DeviceType(2, "Controls");
		//
		StatusDevice sttDev1 = new StatusDevice(1, "Active");
		StatusDevice sttDev2 = new StatusDevice(2, "Inactive");
		//
		DetailDevice deDev1 = new DetailDevice("dev1", "", "", 1000, "");
		DetailDevice deDev2 = new DetailDevice("dev2", "", "", 1000, "");
		DetailDevice deDev3 = new DetailDevice("dev3", "", "", 1000, "");
		//
		Device dev1 = new Device("dev1", acc2, "aaaa", deType1, sttDev1, deDev1);
		Device dev2 = new Device("dev2", acc2, "aaaa", deType1, sttDev1, deDev1);
		Device dev3 = new Device("dev3", acc2, "aaaa", deType1, sttDev1, deDev1);
		//
		List<Device> listDevice = new ArrayList<Device>();
		listDevice.add(dev1);
		listDevice.add(dev2);
		listDevice.add(dev3);
		//
		DeviceInformation devI1 = new Canopy("0001", acc2, dev1, new Datetime(07, 05, 2018), 9, "");
		DeviceInformation devI2 = new Lights("0002", acc2, dev1, new Datetime(07, 05, 2018), 0, "");
		//
		Garden gd1 = new Garden("gd1", acc2, listDevice, "");
		Garden gd2 = new Garden("gd2", acc2, listDevice, "");
		//// cho ngay phai la gio phut giay, o day bi nham
		Mode mode1 = new Mode("mode1", moType1, acc2, gd1, sttMode1, new Datetime(07, 05, 2018),
				new Datetime(07, 05, 2018));
		Mode mode2 = new Mode("mode2", moType2, acc2, gd2, sttMode1, new Datetime(07, 05, 2018),
				new Datetime(07, 05, 2018));
		Mode mode3 = new Mode("mode3", moType2, acc2, gd1, sttMode1, new Datetime(07, 05, 2018),
				new Datetime(07, 05, 2018));
		//
		System.out.println(gd1.toString());
		//
		//
		devI1.selfTimerByUser();
	}

}
