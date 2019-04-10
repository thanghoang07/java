package studen;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaiTap4 implements ISinhVien {

	@Override
	public void saveStudent(String pathSrc, List<Student> listStudent) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(pathSrc));
		// dos.writeInt(listStudent.size());
		for (Student st : listStudent) {
			dos.writeChar('\t');
			dos.writeUTF(st.getId());
			dos.writeChar('\t');
			dos.writeUTF(st.getName());
			dos.writeChar('\t');
			dos.writeUTF(st.getWhere());
			dos.writeChar('\t');
			dos.writeDouble(st.getGpa());
			dos.writeChar('\n');
		}
		dos.flush();
		dos.close();
	}

	@Override
	public void saveStudent2(String pathSrc, List<Student> listStudent) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(pathSrc));
		dos.writeInt(listStudent.size());
		for (Student st : listStudent) {
			dos.writeUTF(st.getId());
			dos.writeUTF(st.getName());
			dos.writeUTF(st.getWhere());
			dos.writeDouble(st.getGpa());
		}
		dos.flush();
		dos.close();
	}

	@Override
	public void readStudent(String pathSrc) throws IOException {
		List<Student> list = new ArrayList<Student>();
		DataInputStream dis = new DataInputStream(new FileInputStream(pathSrc));
		while (dis.available() > 0) {
			dis.readChar();
			String id = dis.readUTF();
			dis.readChar();
			String name = dis.readUTF();
			dis.readChar();
			String where = dis.readUTF();
			dis.readChar();
			double gpa = dis.readDouble();
			dis.readChar();
			list.add(new Student(id, name, where, gpa));
		}
		dis.close();
		for (Student student : list) {
			System.out.println(student.toString());
		}

	}

	@Override
	public void readStudent2(String pathSrc) throws IOException {
		List<Student> list = new ArrayList<Student>();
		DataInputStream dis = new DataInputStream(new FileInputStream(pathSrc));
		int count = dis.readInt();
		while (dis.available() > 0) {
			list.add(new Student(dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readDouble()));
		}
		dis.close();
		for (Student student : list) {
			System.out.println(student.toString());
		}

	}

	@Override
	public List<Student> readListStudent(String pathSrc) throws IOException {
		List<Student> list = new ArrayList<Student>();
		DataInputStream dis = new DataInputStream(new FileInputStream(pathSrc));
		int count = dis.readInt();
		for (int i = 0; i < count; i++) {
			list.add(new Student(dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readDouble()));
		}
		return list;
	}

}
