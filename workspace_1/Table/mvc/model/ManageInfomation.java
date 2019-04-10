package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

public class ManageInfomation extends Observable {
	private java.util.List<Student> std = new ArrayList<>();
	private List<Teacher> teacher = new ArrayList<>();

	public ManageInfomation() {
	demo();
	}

	private void demo() {
		std.add(new Student(14130069, "Trịnh Thu Phương Minh", 213213, "Long An"));
		std.add(new Student(14130070, "Phan Nữ Thoại My", 765723, "Quảng Ngãi"));
		std.add(new Student(14130111, "Huỳnh Tính Thành", 23423, "TP.HCM"));
		std.add(new Student(14130095, "Nguyễn Thị Hoài Phụng", 234, "Đồng Nai"));
		std.add(new Student(14130052, "Hồ Lâm Lai", 4234, "Đắc Lắk"));
		std.add(new Student(14130118, "Trần Văn Thắng", 3213, "Quảng Ngãi"));
		std.add(new Student(14130133, "Nguyễn Thị Thùy Trang", 32132, "Phú Yên"));
		teacher.add(new Teacher(1017, "Nguyễn Thị Phương Trâm", 3213, "Quy Nhơn"));
		teacher.add(new Teacher(907, "Nguyễn Phi Hùng", 3531, "TP.HCM"));
		teacher.add(new Teacher(603, "Phan Vĩnh Thuần", 435, "Bình Định"));
		teacher.sort(null);
		std.sort(null);

	}

	public void measurementsChanged() {
		Collections.sort(std);
		Collections.sort(teacher);
		setChanged();
		notifyObservers();
	}

	public void addTeacher(Teacher people) {
		teacher.add(people);
		measurementsChanged();
	}

	public void addStudent(Student people) {
		std.add(people);
		measurementsChanged();
	}

	public void deleteTeacher(Teacher people) {
		teacher.remove(people);
		measurementsChanged();
	}

	public void deleteStudent(Student people) {
		std.remove(people);
		measurementsChanged();
	}

	public void editTeacher(Teacher peopleEdit, Teacher peopleAdd) {
		std.remove(peopleEdit);
		teacher.add(peopleAdd);
		measurementsChanged();
	}

	public void editStudent(Student peopleEdit, Student peopleAdd) {
		std.remove(peopleEdit);
		std.add(peopleAdd);
		measurementsChanged();

	}

	public void saveFile() {
		System.out.println("Bắt đầu tiến trình lưu thông tin !");
		try {
			String content = "";
			File file = new File("ManageInfomation.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for (Student people : std) {
				content += "Student!";
				content += people.getId();
				content += "!";
				content += people.getName();
				content += "!";
				content += people.getDob();
				content += "!";
				content += people.getPob();
				System.out.println("Lưu thành công " + people.toString());
				content += "\n";
				bw.write(content);
				content = "";
			}
			for (Teacher tea : teacher) {
				content += "Teacher!";
				content += tea.getId();
				content += "!";
				content += tea.getName();
				content += "!";
				content += tea.getDob();
				content += "!";
				content += tea.getPob();
				content += "\n";
				bw.write(content);
				content = "";
			}
			System.out.println("Lưu thông tin hoàn tất");
			bw.close();
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

	public void loadFile() {
		System.out.println("Tiền hành load thông tin !");
		BufferedReader file = null;
		try {
			file = new BufferedReader(new FileReader("ManageInfomation.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line;
		try {
			while ((line = file.readLine()) != null) {
				try {
					String[] acount = line.split("!");
					if (acount[0].equalsIgnoreCase("Student")) {
						std.add(new Student(Integer.parseInt(acount[1]), acount[2], Integer.parseInt(acount[3]),
								acount[4]));
					} else if (acount[0].equalsIgnoreCase("Teacher")) {
						teacher.add(new Teacher(Integer.parseInt(acount[1]), acount[2], Integer.parseInt(acount[3]),
								acount[4]));
					}
				} catch (Exception e) {
					System.out.println("Lỗi ko load dc thông tin");
					System.out.println(line);
				}

			}
			file.close();
			System.out.println(" Load  thông tin  hoàn tất!");
		} catch (

		IOException e) {
			e.printStackTrace();
		}

	}

	public java.util.List<Student> getStd() {
		return std;
	}

	public void setStd(java.util.List<Student> std) {
		this.std = std;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
}
