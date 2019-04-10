package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;

public class StudentView extends View {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panelData;
	private JTextField txtCode, txtName, txtDob, txtPob;
	private JLabel stdCode, stdName, stdDob, stdPob;
	private DefaultTableModel modeltable;
	private JTable table;
	private JScrollPane scrollPane;
	private Dimension dim = new Dimension(80, 20);
	private JButton btnAdd, btnExit, btnDelete, btnEdit;

	public StudentView(String title) {
		super(title);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		//
		createGUI();
		dataTable();
	}

	public void createGUI() {
		createToolBar();
		createPanelInput();
		createPanelOutput();
	}

	public JPanel createPanelOutput() {
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

		return panelData;
	}

	public JPanel createPanelInput() {
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

		return panelInPut;
	}

	public JToolBar createToolBar() {
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);

		btnAdd = new JButton("Add");
		btnAdd.setIcon(new ImageIcon(StudentView.class.getResource("/image/Add List-15.png")));
		toolBar.add(btnAdd);

		btnEdit = new JButton("Edit");
		toolBar.add(btnEdit);

		btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon(StudentView.class.getResource("/image/Delete File-15.png")));
		toolBar.add(btnDelete);

		btnExit = new JButton("Exit");
		btnExit.setIcon(new ImageIcon(StudentView.class.getResource("/image/Exit-15.png")));
		toolBar.add(btnExit);

		return toolBar;
	}

	public void dataTable() {
		modeltable = new DefaultTableModel(new Object[] { "STT", "Code", "Name", "Dob", "Pob" }, 0) {

			private static final long serialVersionUID = 1L;

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
		table.setEnabled(true);
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

	//
	public String getViewCode() {
		return txtCode.getText();
	}

	public String getViewName() {
		return txtName.getText();
	}

	public String getViewDob() {
		return txtDob.getText();
	}

	public String getViewPob() {
		return txtPob.getText();
	}

	public void hienThiRaBang(String code, String name, String dob, String pob) {
		modeltable.addRow(new Object[] { modeltable.getRowCount() + 1, code, name, dob, pob });
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	// them su kien
	public void suKienNutAdd(ActionListener listenForAddButton) {
		btnAdd.addActionListener(listenForAddButton);
	}

	public void suKienNutExit(ActionListener listenForExitButton) {
		btnExit.addActionListener(listenForExitButton);
	}

	public void suKienNutDelete(ActionListener listenForDeleteButton) {
		btnDelete.addActionListener(listenForDeleteButton);
	}

	public void suKienNutEdit(ActionListener listenForEditButton) {
		btnEdit.addActionListener(listenForEditButton);
	}
}