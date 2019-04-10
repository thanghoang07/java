package modul;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
	public boolean checkMaHocSinh(String maHocSinh) {
		return false;
	}

	public boolean checkTruongHoc(String tenTruong) {
		return false;
	}

	public boolean checkLopHoc(String tenLop) {
		return false;
	}

	public boolean checkSDT(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

	public boolean checkMail(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		Pattern p = Pattern.compile(ePattern);
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
	
}
