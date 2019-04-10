/*package thucHanhJavaBasic4;

public class Student_t {
	private int id;
	private String lop;
	private String name;

	public Student_t(int id, String lop, String name) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student[ id=" + id + ", name" + name + ",lop" + lop + "]";
	}
	

	public static Comparable<Student_t> sortname=new Comparable<Student_t>()
	{
	
		@Override
		public int compare(Student_t arg0, Student_t argi)
		{
			// TODO Auto-generated method stub
			return arg0.getId() - argi.getName();
		}
	}
}*/