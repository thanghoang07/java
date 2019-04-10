package tuan7;

import java.util.ArrayList;

public class SinhVienDao {
	static ArrayList<SinhVien> list = new ArrayList<>();
	static {
		list.add(new SinhVien("a", "123", 20, 3));
		list.add(new SinhVien("b", "123", 20, 3));
		list.add(new SinhVien("c", "123", 20, 3));
		list.add(new SinhVien("e", "123", 20, 3));
	}

	public static ArrayList<SinhVien> findByName(String name) {
		ArrayList<SinhVien> re = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTen().equalsIgnoreCase(name))
				re.add(list.get(i));
		}
		return re;
	}

	public static ArrayList<SinhVien> findByAge(int old) {
		ArrayList<SinhVien> re = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAge() == old)
				re.add(list.get(i));
		}
		return re;
	}

	public static ArrayList<SinhVien> findByDiem(double d) {
		System.out.println(d);
		ArrayList<SinhVien> re = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (Math.abs(list.get(i).getDiem()) < 0.1)
				re.add(list.get(i));
		}
		return re;
	}
}
