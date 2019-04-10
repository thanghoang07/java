package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo extends JFrame {
	// Create table column names
	private String[] columnNames = { "STT", "Country", "Capital", "Population in Millions", "Democracy" };
	// Create table data
	private Object[][] data = { 
			{ "1", "USA", "Washington DC", 280, true },
			{ "2", "Canada", "Ottawa", 32, true },
			{ "3", "United Kingdom", "London", 60, true },
			{ "4", "Germany", "Berlin", 83, true },
			{ "5", "France", "Paris", 60, true }, 
			{ "6", "Norway", "Oslo", 4.5, true },
			{ "7", "India", "New Delhi", 1046, true } };
	// Create a table
	private JTable jTable1 = new JTable(data, columnNames);

	public JTableDemo() {
		add(new JScrollPane(jTable1));
		setSize(900, 175);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JTableDemo();
	}
}
