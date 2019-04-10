package quanLyDiem;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private Date dateOfBrith;
	private Lecturer assistant;
	private List<Register> list;

	public Student(String name, Date dateOfBrith) {
		this.name = name;
		this.dateOfBrith = dateOfBrith;
		this.assistant = assistant;
		this.list = new ArrayList<Register>();
	}

	/*
	 * Dang ky mon hoc 
	 * Input : course - mon hoc
	 */
	public void register(Course c) {
		list.add(new Register(c));
	}
	
	/*
	 * cap nhap diem cho sinh vien
	 * Input : course - mon hoc can sua diem
	 * 			grade - diem mon hoc
	 */
	public void updateGrade(Course c, float grade) {
		for (Register r : list) {
			if(r.getCourse().getName().equals(c.getName())){
				r.setGrade(grade);
				break;
			}
		}
	}

	/*
	 * Tinh diem trung binh cua hoc sinh
	 * Output : diem trung binh
	 */
	public float averageOfGrade() {
		float sum = 0;
		int sumCredit = 0;
		for (Register r : list) {
			sum += r.getGrade() * r.getCourse().getCreadit();
			sumCredit += r.getCourse().getCreadit();
		}
		return sum / sumCredit;
	}

	/*
	 * Kiem tra co ten hoc sinh co trong danh sach khong
	 * Output : true - có, false - khong ton tai
	 */
	public boolean searchName(String name) {
		if (this.name.toLowerCase().equals(name))
			return true;
		else
			return false;
	}

	/*
	 * Xep loai hoc sinh
	 * Output : ten xep loai
	 */
	public String rank() {
		String rank = "";
		float average = averageOfGrade();
		if (average >= 9)
			return "Xuất sắc";
		else if (average >= 8 && average < 9)
			return "Giỏi";
		else if (average >= 7 && average < 8)
			return "Khá";
		else if (average >= 6 && average < 7)
			return "Trung bình khá";
		else if (average >= 5 && average < 6)
			return "Trung bình";
		else
			return "Không được tốt nghiệp";
	}

	/*
	 * In ra thong tin cac mon hoc va diem cua moi mon hoc cua sinh vien
	 */
	public void printGrade() {
		System.out.println("Name: " + name);
		System.out.println("Ngày sinh: " + dateOfBrith);
		System.out.println("STT\tMôn\t\tĐiểm");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "\t" + list.get(i).getCourse().getName()
					+ "\t\t" + list.get(i).getGrade());

		}
		System.out.println("Điểm TB: " + averageOfGrade());
		System.out.println("Xếp loại: " + rank());
		System.out.println("-------");
	}

	public List<Register> getList() {
		return list;
	}

	public String getName() {
		return name;
	}
	
}
