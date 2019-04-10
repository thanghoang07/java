package quanLyDiem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	//
	public Student student = new Student();
	// khoi tao danh sach cac sinh vien
	public static List<Student> stu = new ArrayList<Student>();
	// khoi tao danh sach cac giang vien
	public static List<Lecturer> lec1 = new ArrayList<Lecturer>();
	// khoi tao danh sach cac mon hoc
	public static List<Course> cor1 = new ArrayList<Course>();
	//
	private static Scanner nhapVao;

	// phuong thuc in danh sach cac sinh vien
	public static void printStuden(List<Student> students) {
		for (Student student : students) {
			student.print();
		}
	}

	// phuong thuc in điểm của một môn
	public static void printOneCourse(String tenMon, List<Student> students) {
		System.out.printf("\tTen mon hoc %s\n", tenMon);
		System.out.println("---------------------------------");
		for (Student student : students) {
			for (Register register : student.getDanhSachMon()) {
				if (register.getCourse().getTen().equals(tenMon)) {
					System.out.printf("\nTen: %s \nDiem: %.2f\n", student.getTen(), register.getDiem());
					System.out.println("=================================");
				}
			}
		}
	}

	// phuong thuc in danh sach ten mon hoc
	public static void inTenMonHoc(List<Course> courses) {
		System.out.println("Danh sach ten mon hoc hien tai");
		System.out.println("---------------------------------");
		for (Course course : courses) {
			System.out.println("* " + course.getTen());
		}
		System.out.println("=================================");
	}

	// phuong thuc in danh sach ten mon hoc
	public static void inTenSinhVien(List<Student> studens) {
		System.out.println("Danh sach ten hoc vien hien tai");
		System.out.println("---------------------------------");
		for (Student student : studens) {
			System.out.println("* Ten: " + student.getTen() + "\nMa so sinh vien: " + student.getMssv());
		}
		System.out.println("=================================");
	}

	// phuong thuc in diem cua mot sinh vien co trong danh sach
	public static void printOne(String mssv) {
		for (Student stus : stu) {
			if (stus.timSinhVien(mssv))
				stus.print();
		}
	}

	public static void main(String[] args) {
		// tao du lieu giang vien
		Lecturer lt1 = new Lecturer("Thien", new Date(10, 12, 2012), "GV");
		Lecturer lt2 = new Lecturer("Hung", new Date(10, 12, 2012), "GV");
		Lecturer lt3 = new Lecturer("Thuan", new Date(10, 12, 2012), "GV");
		Lecturer lt4 = new Lecturer("Tram", new Date(10, 12, 2012), "GV");
		Lecturer lt5 = new Lecturer("Nga", new Date(10, 12, 2012), "GV");
		// them giang vien vao danh sach cac giang vien
		lec1.add(lt1);
		lec1.add(lt2);
		lec1.add(lt3);
		lec1.add(lt4);
		lec1.add(lt5);
		// tao du lieu mon hoc
		Course co1 = new Course("LTNC", lt1, 3);
		Course co2 = new Course("LTCB", lt3, 4);
		Course co3 = new Course("LTDT", lt4, 3);
		Course co4 = new Course("CTDL", lt5, 4);
		Course co5 = new Course("HDHNC", lt2, 5);
		// them mon hoc vao danh sach cac mon hoc
		cor1.add(co1);
		cor1.add(co2);
		cor1.add(co3);
		cor1.add(co4);
		cor1.add(co5);
		// tao du lieu hoc vien
		Student st1 = new Student("001", "Trinh Van Toan", new Date(3, 10, 1996));
		Student st2 = new Student("002", "Hoang Duc Thang", new Date(3, 1, 1995));
		Student st3 = new Student("003", "Vo Quoc Huy", new Date(29, 11, 1995));
		Student st4 = new Student("004", "Nguyen Thanh Trung", new Date(17, 9, 1995));
		Student st5 = new Student("005", "Duong Gia Bao", new Date(13, 4, 1995));
		// đăng ky môn hoc
		st1.dangKy(co1);
		st1.dangKy(co2);
		st1.dangKy(co3);
		st1.dangKy(co4);
		st1.dangKy(co5);

		st2.dangKy(co1);
		st2.dangKy(co2);
		st2.dangKy(co3);
		st2.dangKy(co4);

		st3.dangKy(co5);
		st3.dangKy(co2);
		st3.dangKy(co3);
		st3.dangKy(co4);

		st4.dangKy(co1);
		st4.dangKy(co2);
		st4.dangKy(co5);

		st5.dangKy(co4);
		st5.dangKy(co2);
		st5.dangKy(co3);
		st5.dangKy(co5);
		// them vao danh sach cac sinh vien
		stu.add(st1);
		stu.add(st2);
		stu.add(st3);
		stu.add(st4);
		stu.add(st5);
		// cap nhat lai diem cho tung sinh vien
		st1.capNhatDiem(co1, 10);
		st1.capNhatDiem(co2, 8);
		st1.capNhatDiem(co3, 6);
		st1.capNhatDiem(co4, 5);
		st1.capNhatDiem(co5, 8);

		st2.capNhatDiem(co1, 6);
		st2.capNhatDiem(co2, 8);
		st2.capNhatDiem(co3, 9);
		st2.capNhatDiem(co4, 7);

		st3.capNhatDiem(co5, 6);
		st3.capNhatDiem(co2, 8);
		st3.capNhatDiem(co3, 9);
		st3.capNhatDiem(co4, 7);

		st4.capNhatDiem(co1, 6);
		st4.capNhatDiem(co2, 8);
		st4.capNhatDiem(co5, 10);

		st5.capNhatDiem(co4, 6);
		st5.capNhatDiem(co2, 8);
		st5.capNhatDiem(co3, 9);
		st5.capNhatDiem(co5, 7);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		// in danh sach ten mon
		inTenMonHoc(cor1);
		// Nhap vao tên môn học cho ra danh sách các sinh viên học môn đó
		System.out.print("Nhap vao ten mon hoc: ");
		nhapVao = new Scanner(System.in);
		String string = nhapVao.nextLine();
		printOneCourse(string, stu);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		// in danh sach ten sinh vien
		inTenSinhVien(stu);
		// in ban diem cua mot sinh vien
		System.out.print("Nhap vao ma so sinh vien can tra: ");
		String string1 = nhapVao.nextLine();
		printOne(string1);
		// in ra danh sach cac sinh vien
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("In ra danh sach diem cua tat ca sinh vien: ");
		printStuden(stu);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
	}
}
