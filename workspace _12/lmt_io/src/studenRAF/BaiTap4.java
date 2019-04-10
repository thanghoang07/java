package studenRAF;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class BaiTap4 implements ISinhVien {

	@Override
	public void saveStudent(String pathSrc, List<Student> listStudent) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile dos = new RandomAccessFile(new File(pathSrc), "rw");
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

	@Override
	public void readStudentRAF(String pathSrc) throws IOException {
		List<Student> list = new ArrayList<Student>();
		RandomAccessFile raf = new RandomAccessFile(new File(pathSrc), "rw");
		System.out.println(raf.getFilePointer());
		while (raf.getFilePointer() < raf.length()) {
			raf.readChar();
			String id = raf.readUTF();
			raf.readChar();
			String name = raf.readUTF();
			raf.readChar();
			String where = raf.readUTF();
			raf.readChar();
			double gpa = raf.readDouble();
			raf.readChar();
			list.add(new Student(id, name, where, gpa));
		}
		raf.close();
		for (Student student : list) {
			System.out.println(student.toString());
		}

	}

	@Override
	public void getSinhVien(String pathSrc, int number) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readStudentRAF(String pathSrc, int number) throws IOException {
		Student sv = new Student();
		RandomAccessFile raf = new RandomAccessFile(new File(pathSrc), "rw");

		while (raf.getFilePointer() < raf.length()) {		
			System.out.println(raf.getFilePointer());
			raf.readChar();
			String id = raf.readUTF();
			raf.readChar();
			String name = raf.readUTF();
			raf.readChar();
			String where = raf.readUTF();
			raf.readChar();
			double gpa = raf.readDouble();
			raf.readChar();
			sv = new Student(id, name, where, gpa);
			
		}
		raf.close();

		System.out.println(sv.toString());

	}

}
