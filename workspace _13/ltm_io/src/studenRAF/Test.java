package studenRAF;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws IOException {
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 7; i++) {
			list.add(new Student("a" + i, "Thang", "ABC", 8.0));
		}
		//
		ISinhVien bt4 = new BaiTap4();
		String pathSrc = "D:\\OneDrive\\Documents\\workspace _12\\lmt_io\\src\\studenRAF\\student.txt";
		bt4.saveStudent(pathSrc, list);
		bt4.readStudentRAF(pathSrc);
		System.out.println("=====================");
		bt4.readStudentRAF(pathSrc, 2);
	}
}
