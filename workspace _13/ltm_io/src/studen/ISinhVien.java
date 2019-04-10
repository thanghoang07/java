package studen;

import java.io.IOException;
import java.util.List;

public interface ISinhVien {
	public void saveStudent(String pathSrc, List<Student> listStudent) throws IOException;
	
	public void saveStudent2(String pathSrc, List<Student> listStudent) throws IOException;

	public void readStudent(String pathSrc) throws IOException;
	
	public void readStudent2(String pathSrc) throws IOException;

	public List<Student> readListStudent(String pathSrc) throws IOException;
}
