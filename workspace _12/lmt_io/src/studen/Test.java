package studen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws IOException {
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 7; i++) {
			list.add(new Student("a", "Thang", "ABC", 8.0));
		}
		//
		ISinhVien bt4 = new BaiTap4();
		String pathSrc = "D:\\OneDrive\\Documents\\workspace _12\\lmt_io\\src\\studen\\student.txt";
		bt4.saveStudent(pathSrc, list);
		bt4.readStudent(pathSrc);
	}
}
