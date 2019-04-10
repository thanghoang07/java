package demo_3_collection;

import java.util.*;


public class TestCollection
{
	public static void main(String[] args)
	{
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		Student s4 = new Student(104, "Jimmy", 20);
		
		ArrayList<Student> aL = new ArrayList<Student>();
		aL.add(s1);
		aL.add(s2);
		aL.add(s3);
		aL.add(s4);
		
		Iterator<Student> itr = aL.iterator();
		
		while (itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.getRollno()+"\t"+st.getName()+"\t"+st.getAge());
		}
	}
}
