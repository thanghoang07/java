package LT;

import java.util.ArrayList;
import java.util.Collections;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	public void TestConstructor() {
		Student a1 = new Student(10101111, "Nguyen Van A", "DH14DT");
		Student a2 = new Student(10101111, "Nguyen Van A", "DH14DT");
		Student a3 = new Student(10101111, "Nguyen Van A", "DH14DT");
		Student a4 = new Student(10101111, "Nguyen Van A", "DH14DT");
		
		ArrayList<Student> array = new ArrayList<Student>();
		array.add(a1);
		array.add(a2);
		array.add(a3);
		array.add(a4);
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	
	}
}
