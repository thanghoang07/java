package OnTap;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EmployeeManagament extends JFrame {
	JTextField jtfID, jtfName;
	JComboBox jcbYear;
	JCheckBox cbxSex;
	DefaultTableModel tableModel;

	private String[] columnNames = { "ID", "Name", "Year of birth", "Sex" };
	private ArrayList<Employee> array = new ArrayList<Employee>();

	public EmployeeManagament() {
		super("EMPLOYEE MANAGEMENT");
		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblTittle = new JLabel("EMPLOYEE MANAGEMENT");
		p1.add(lblTittle);
		add(p1);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2, 4, 10, 10));
		JLabel lblID = new JLabel("Employee ID:");
		jtfID = new JTextField(13);
		JLabel lblName = new JLabel("Employee Name:");
		jtfName = new JTextField(13);
		JLabel lblYear = new JLabel("Year of birth:");
		jcbYear = new JComboBox(nam());
		JLabel lblSex = new JLabel("Sex:");
		cbxSex = new JCheckBox("Fermale");
		p2.add(lblID);
		p2.add(jtfID);
		p2.add(lblName);
		p2.add(jtfName);
		p2.add(lblYear);
		p2.add(jcbYear);
		p2.add(lblSex);
		p2.add(cbxSex);
		add(p2);

		JPanel p3 = new JPanel();
		tableModel = new DefaultTableModel(columnNames, 0);
		JTable table = new JTable(tableModel);
		p3.add(table);
		add(p3);

		JPanel p4 = new JPanel();
		JButton btnAdd = new JButton("Add");
		JButton btnUpdate = new JButton("Update");
		JButton btnDetele = new JButton("Detele");
		p4.add(btnAdd);
		p4.add(btnUpdate);
		p4.add(btnDetele);
		add(p4);

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(jtfID.getText());
				String name = jtfName.getText();
				int year = jcbYear.getSelectedIndex();
				String sex = "";
				if (cbxSex.isSelected())
					sex = "Nữ";
				else
					sex = "Nam";

				array.add(new Employee(id, name, year, sex));

			}
		});

		setSize(650, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EmployeeManagament();
	}

	public static String[] nam() {
		String[] intt = new String[116];
		int nam = 1900;
		for (int i = 0; i < intt.length; i++) {
			intt[i] = String.format("%s", nam);
			nam++;
		}
		return intt;
	}
}
