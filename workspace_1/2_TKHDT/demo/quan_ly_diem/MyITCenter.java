package quan_ly_diem;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class MyITCenter {

	private List<GiangVien> giangVien = new ArrayList<GiangVien>();
	private List<SinhVien> sinhVien = new ArrayList<SinhVien>();
	private List<MonHoc> monHoc = new ArrayList<MonHoc>();

	public MyITCenter() {
		init();
	}

	public void init() {
		GiangVien l1 = new GiangVien("Pham Van Tinh", new GregorianCalendar(1970, 11, 20).getTime(), "PhD");
		GiangVien l2 = new GiangVien("Mai Anh Tho", new GregorianCalendar(1979, 12, 24).getTime(), "MS");
		GiangVien l3 = new GiangVien("Nguyen Duc Cong Song", new GregorianCalendar(1977, 8, 14).getTime(), "MS");
		giangVien.add(l1);
		giangVien.add(l2);
		giangVien.add(l3);

		MonHoc c1 = new MonHoc("Lap trinh co ban", 4, l2);
		MonHoc c2 = new MonHoc("Lap trinh nang cao", 4, l3);
		MonHoc c3 = new MonHoc("Lap trinh mang", 4, l1);
		MonHoc c4 = new MonHoc("Mang may tinh", 4, l1);
		monHoc.add(c1);
		monHoc.add(c2);
		monHoc.add(c3);
		monHoc.add(c4);

		SinhVien s1 = new SinhVien("Nguyen Van Tuan", new GregorianCalendar(1988, 1, 23).getTime());
		SinhVien s2 = new SinhVien("Tran Van Thiet", new GregorianCalendar(1989, 11, 2).getTime());
		SinhVien s3 = new SinhVien("Nguyen Thi Lan", new GregorianCalendar(1988, 6, 20).getTime());
		SinhVien s4 = new SinhVien("Nguyen Thi Truc", new GregorianCalendar(1990, 4, 15).getTime());
		SinhVien s5 = new SinhVien("Vo Tan Doi", new GregorianCalendar(1988, 2, 26).getTime());
		SinhVien s6 = new SinhVien("Do The Sang", new GregorianCalendar(1989, 3, 12).getTime());
		sinhVien.add(s1);
		sinhVien.add(s2);
		sinhVien.add(s3);
		sinhVien.add(s4);
		sinhVien.add(s5);
		sinhVien.add(s6);

		s1.register(c1);
		s1.register(c2);
		s1.register(c3);

		s2.register(c2);
		s2.register(c3);
		s2.register(c4);

		s3.register(c1);
		s3.register(c2);
		s3.register(c3);
		s3.register(c4);

		s4.register(c1);
		s4.register(c3);
		s4.register(c4);

		s5.register(c1);
		s5.register(c2);
		s5.register(c3);
		s5.register(c4);

		s6.register(c1);
		s6.register(c2);

		s1.capNhatLopMonHoc(c1, 6);
		s1.capNhatLopMonHoc(c2, 7);
		s1.capNhatLopMonHoc(c3, 8);

		s2.capNhatLopMonHoc(c2, 8.5f);
		s2.capNhatLopMonHoc(c3, 5);
		s2.capNhatLopMonHoc(c4, 7);

		s3.capNhatLopMonHoc(c1, 4);
		s3.capNhatLopMonHoc(c2, 7.5f);
		s3.capNhatLopMonHoc(c3, 8);
		s3.capNhatLopMonHoc(c4, 10);

		s4.capNhatLopMonHoc(c1, 8);
		s4.capNhatLopMonHoc(c3, 3);
		s4.capNhatLopMonHoc(c4, 6);

		s5.capNhatLopMonHoc(c1, 5);
		s5.capNhatLopMonHoc(c2, 4);
		s5.capNhatLopMonHoc(c3, 6);
		s5.capNhatLopMonHoc(c4, 8);

		s6.capNhatLopMonHoc(c1, 5);
		s6.capNhatLopMonHoc(c2, 8);
	}

	public void printStudentReports(List<SinhVien> students) {
		for (SinhVien student : students) {
			student.printGradeReport();
		}
	}

	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("--------------------------");
	}

	public List<SinhVien> getStudentsOfCourse(MonHoc c) {
		List<SinhVien> result = new ArrayList<SinhVien>();
		for (SinhVien student : sinhVien) {
			for (DangKy register : student.getCourseRegisters()) {
				if (register.getCourse().getName().equals(c.getName()))
					result.add(student);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		MyITCenter myCenter = new MyITCenter();
		//myCenter.printStudentReports(myCenter.sinhVien);
		printList(myCenter.getStudentsOfCourse(myCenter.monHoc.get(1)));
	}
}
