package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;

	public static final String[] COLUMNS = new String[] {"SID", "First Name", "Last Name", "Class", "Birthday", "Email", "Major"};

	private List<Student> list = new ArrayList<>();
	
	@Override
	public String getColumnName(int column) {
		return COLUMNS[column];
	}
	
	@Override
	public int getColumnCount() {
		return COLUMNS.length;
	}

	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		Student s = list.get(row);
		if (s != null) {
			switch (col) {
			case 0:
				return s.getSid();
			case 1: 
				return s.getFirstName();
			case 2:
				return s.getLastName();
			case 3:
				return s.getClassName();
			case 4:
				return s.getBirthday();
			case 5:
				return s.getEmail();
			case 6:
				return s.getMajor();
			default:
				return null;
			} 
		} else {
			return null;
		}
	}
	
	public void addStudent(Student s) {
		this.list.add(s);
	}

}
