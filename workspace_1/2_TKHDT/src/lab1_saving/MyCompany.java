package lab1_saving;

import java.util.ArrayList;
import java.util.List;

public class MyCompany {
	private List<Phong> dsPhong;

	public MyCompany() {
		this.dsPhong = new ArrayList<Phong>();
	}

	public void themPhong(Phong phong) {
		dsPhong.add(phong);
	}

	public void printBangLuong() {
		for (int i = 0; i < dsPhong.size(); i++) {
			System.out.printf("%d. Ten PB: %s\n", i, dsPhong.get(i).getTenPB());
			//dsPhong.get(i).print();
		}
	}
}
