package quanLyDiem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Lecturer l1 = new Lecturer("Thanh Nga", new Date(10, 10, 1981), "Th.S");
		Lecturer l2 = new Lecturer("Cuong", new Date(01, 05, 1986), "Th.S");

		
		List<Course> listCourse = new ArrayList<Course>();
		Course r1 = new Course("LTNC", 4, l1);
		Course r2 = new Course("TKHDT", 3, l2);
		Course r3 = new Course("LTCB", 4, l1);
		Course r4 = new Course("NMHDH", 3, l2);
		Course r5 = new Course("TTHCM", 5, l2);
		listCourse.add(r1);
		listCourse.add(r2);
		listCourse.add(r3);
		listCourse.add(r4);
		listCourse.add(r5);
		

		List<Student> listStudent = new ArrayList<Student>();
		Student s1 = new Student("An", new Date(03, 10, 1996));
		Student s2 = new Student("Ba", new Date(13, 12, 2000));
		listStudent.add(s1);
		listStudent.add(s2); 
		
		//hoc sinh dang ky mon hoc
		s1.register(r1);
		s1.register(r4);
		s1.register(r3);
		
		s2.register(r1);
		s2.register(r5);
		s2.register(r2);
		
		
		//cap nhat diem cho hoc sinh
		s1.updateGrade(r1, 7.3f);
		s1.updateGrade(r4, 8.8f);
		s1.updateGrade(r3, 6.5f);
		
		s2.updateGrade(r1, 7.5f);
		s2.updateGrade(r2, 5.5f);
		s2.updateGrade(r5, 7.4f);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==USE CASE 1== ");
		System.out.print("Nhap ten hoc sinh : ");
		String tenHS = sc.nextLine();
		for (Student s : listStudent) {
			if (s.searchName(tenHS)) {
				s.printGrade();
				break;
			} else {
				System.out.println("Khong co hoc sinh");
			}
		}
		
		System.out.println("==USE CASE 2== ");
		System.out.println("Danh sách các sinh viên");
		for (Student s : listStudent) {
			s.printGrade();
		}
		System.out.println("In ra điểm của một môn cho trước : ");
		System.out.print("Nhap ten mon hoc : ");
		String nameCourse = sc.nextLine();
		for (Student s : listStudent) {
			for (Register r : s.getList()) {
				if(r.getCourse().getName().equals(nameCourse))
					System.out.println("Tên : " + s.getName() + "\nĐiểm : " + r.getGrade());
			}
		}
	}
}
