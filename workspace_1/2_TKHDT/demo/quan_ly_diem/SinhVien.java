package quan_ly_diem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SinhVien {
	private String name;
	private Date dateOfBirth;
	private GiangVien assistant;
	private List<DangKy> courseRegisters = new ArrayList<DangKy>();

	public SinhVien(String name, Date dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public GiangVien getAssistant() {
		return assistant;
	}

	public List<DangKy> getCourseRegisters() {
		return courseRegisters;
	}

	public void register(MonHoc c) {
		courseRegisters.add(new DangKy(c));
	}

	public void capNhatLopMonHoc(MonHoc c, float grade) {
		for (DangKy r : courseRegisters) {
			if (r.getCourse().getName().equals(c.getName())) {
				r.setGrade(grade);
				break;
			}
		}
	}

	public float averageOfGrade() {
		float sum = 0;
		for (DangKy r : courseRegisters) {
			sum += r.getGrade();
		}
		return sum / courseRegisters.size();
	}

	public String rank() {
		float average = averageOfGrade();
		if (average >= 9)
			return "XUAT SAC";
		else if (average >= 8)
			return "GIOI";
		else if (average >= 7)
			return "KHA";
		else if (average >= 6)
			return "TRUNG BINH KHA";
		else if (average >= 7)
			return "TRUNG BINH";
		else
			return "ROT";
	}

	public void printGradeReport() {
		System.out.println("Name: " + getName());
		System.out.println("Date of birth: " + getDateOfBirth());
		System.out.println("STT\tMon\tDiem");
		for (int i = 0; i < courseRegisters.size(); i++) {
			System.out.println(
					i + "\t" + courseRegisters.get(i).getCourse().getName() + "\t" + courseRegisters.get(i).getGrade());
		}
		System.out.println("Average of grade: " + averageOfGrade());
		System.out.println("Rank: " + rank());
		System.out.println("----------------------------------------");
	}

	public String toString() {
		return getName() + " " + getDateOfBirth();
	}

}
