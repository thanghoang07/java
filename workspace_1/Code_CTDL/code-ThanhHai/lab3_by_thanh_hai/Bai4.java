package lab3_by_thanh_hai;

public class Bai4 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Nguyen Chi Pheo", 111);
		SinhVien sv2 = new SinhVien("Le Thi No", 222);
		SinhVien sv3 = new SinhVien("Tran Ba Kien", 333);
		SinhVien sv4 = new SinhVien("Ta Hao Phu", 444);
		StudentList<SinhVien> studentList = new StudentList<SinhVien>();
		studentList.add(sv1, 1);
		studentList.add(sv2, 2);
		studentList.add(sv3, 3);
		studentList.add(sv4, 4);
		System.out.println(studentList.toString());

		studentList.search("No");

		studentList.remove("Le Thi No");

		System.out.println(studentList.toString());
		
	}
}
