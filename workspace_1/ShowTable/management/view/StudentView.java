package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.Controller;
import models.People;
import models.Students;
import models.Subject;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class StudentView extends JFrame implements Observer {
	private JPanel contentPane, panelData;
	private JTextField txtCode, txtName, txtDob, txtPob;
	private JLabel stdCode, stdName, stdDob, stdPob;
	private DefaultTableModel modeltable;
	private JTable table;
	private JScrollPane scrollPane;
	private Dimension dim = new Dimension(80, 20);

	private Subject model;
	private Controller control;

	public StudentView(Subject model) {
		this.model = model;
		model.registerObserver((Observer)this);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 478, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		createGUI();
		dataTable();
		setVisible(true);
	}

	public void createGUI() {

		createToolBar();

		createPanelInput();

		createPanelOutput();

	}

	private void createPanelOutput() {
		panelData = new JPanel();
		panelData.setMaximumSize(new Dimension(450, 250));
		contentPane.add(panelData, BorderLayout.SOUTH);

		//
		scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setSize(new Dimension(450, 250));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setMaximumSize(new Dimension(450, 250));
		panelData.add(scrollPane);
		//
		table = new JTable();
		table.setName("tableData");
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, },
				new String[] { "STT", "StdCode", "StdName", "StDob", "StdPob" }));
		scrollPane.setViewportView(table);

	}

	private void createPanelInput() {
		JPanel panelInPut = new JPanel();
		contentPane.add(panelInPut, BorderLayout.CENTER);
		panelInPut.setLayout(new BoxLayout(panelInPut, BoxLayout.Y_AXIS));

		JPanel panel_1 = new JPanel();
		panelInPut.add(panel_1);

		stdCode = new JLabel("StdCode");
		stdCode.setPreferredSize(dim);
		panel_1.add(stdCode);

		txtCode = new JTextField();
		panel_1.add(txtCode);
		txtCode.setColumns(20);

		JPanel panel_2 = new JPanel();
		panelInPut.add(panel_2);

		stdName = new JLabel("StdName");
		stdName.setPreferredSize(dim);
		panel_2.add(stdName);

		txtName = new JTextField();
		panel_2.add(txtName);
		txtName.setColumns(20);

		JPanel panel_3 = new JPanel();
		panelInPut.add(panel_3);

		stdDob = new JLabel("StdDob");
		stdDob.setPreferredSize(dim);
		panel_3.add(stdDob);

		txtDob = new JTextField();
		panel_3.add(txtDob);
		txtDob.setColumns(20);

		JPanel panel_4 = new JPanel();
		panelInPut.add(panel_4);

		stdPob = new JLabel("StdPob");
		stdPob.setPreferredSize(dim);
		panel_4.add(stdPob);

		txtPob = new JTextField();
		panel_4.add(txtPob);
		txtPob.setColumns(20);
	}

	public void createToolBar() {
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				reset();
			}
		});
		toolBar.add(btnAdd);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		toolBar.add(btnExit);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
				// xoa phan tu trong bang nua

			}
		});
		toolBar.add(btnDelete);
	}

	public void reset() {
		txtCode.setText("");
		txtName.setText("");
		txtDob.setText("");
		txtPob.setText("");
	}

	private void dataTable() {
		modeltable = new DefaultTableModel(new Object[] { "STT", "StdCode", "StdName", "StDob", "StdPob" }, 0) {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				switch (columnIndex) {
				default:
					return Object.class;
				}
			}
		};
		table.setModel(modeltable);
		table.getTableHeader().setReorderingAllowed(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setEnabled(false);
	}

	public void addStudenTable(String code, String name, String dob, String pob) {
		if (code.equals("") && name.equals("") && dob.equals("") && pob.equals("") || code.equals("") || name.equals("")
				|| dob.equals("") || pob.equals("")) {
			JOptionPane.showMessageDialog(null, "Cac truong dang rong", "Error", JOptionPane.WARNING_MESSAGE);
		} else {
			modeltable.addRow(new Object[] { modeltable.getRowCount() + 1, code, name, dob, pob });
			//
		}
	}

	@Override
	public Dimension getSize() {
		Dimension dim = new Dimension(100, 100);
		return dim;
	}

	public DefaultTableModel getModel() {
		return modeltable;
	}

	public void setModel(DefaultTableModel model) {
		this.modeltable = model;
	}

	@Override
	public void capNhatThongTin(Students people) {
		// TODO Auto-generated method stub
		addStudenTable(people.getCode(), people.getName(), people.getDob(), people.getPob());
	}
}