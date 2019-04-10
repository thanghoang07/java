package mvcDemo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.TitledBorder;

public class StudentView extends JFrame{
	private JPanel pData;

	public JTextField txtStdCode, txtStdName, txtStdDob, txtStdPob;

	private Dimension dim80 = new Dimension(80, 20);
	private Dimension dim120 = new Dimension(120, 20);
	private Dimension dim150 = new Dimension(150, 20);

	public JButton btnAdd, btnEdit, btnDelete;

	public StudentView() {
		//1. Add toolbar to the North
		add(createButtons(), BorderLayout.NORTH);
		//2. Add input's panel to the Center
		add(createInputDataPanel(), BorderLayout.CENTER);
		//3. Add data view's panel to the South
		pData = createDataViewPanel();
		add(pData, BorderLayout.SOUTH);
		
		//for frame
		setTitle("Student Management");
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void clear() {
		txtStdCode.setText("");
		txtStdName.setText("");
		txtStdDob.setText("");
		txtStdPob.setText("");
	}

	public JToolBar createButtons() {
		JToolBar toolBar = new JToolBar();
		btnAdd = new JButton("Add");

		btnAdd.setIcon(new ImageIcon(StudentView.class.getResource("/images/button_new.gif")));
		toolBar.add(btnAdd);

		btnEdit = new JButton("Edit");
		btnEdit.setIcon(new ImageIcon(StudentView.class.getResource("/images/button_edit.gif")));
		toolBar.add(btnEdit);

		btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon(StudentView.class.getResource("/images/button_delete.gif")));
		toolBar.add(btnDelete);
		return toolBar;
	}

	public JPanel createInputDataPanel() {
		JPanel pInput = new JPanel();

		pInput.setLayout(new BoxLayout(pInput, BoxLayout.Y_AXIS));

		JPanel p1 = new JPanel();
		pInput.add(p1);

		JLabel lblStdCode = new JLabel("StdCode");
		lblStdCode.setPreferredSize(dim80);
		p1.add(lblStdCode);

		txtStdCode = new JTextField();
		txtStdCode.setPreferredSize(dim150);
		p1.add(txtStdCode);
		txtStdCode.setColumns(20);

		JPanel p2 = new JPanel();
		pInput.add(p2);

		JLabel lblName = new JLabel("StdName");
		lblName.setPreferredSize(dim80);
		p2.add(lblName);

		txtStdName = new JTextField();
		txtStdName.setColumns(20);
		p2.add(txtStdName);

		JPanel p3 = new JPanel();
		pInput.add(p3);

		JLabel lblStdDob = new JLabel("StdDob");
		lblStdDob.setPreferredSize(dim80);
		p3.add(lblStdDob);

		txtStdDob = new JTextField();
		txtStdDob.setColumns(20);
		p3.add(txtStdDob);

		JPanel p4 = new JPanel();
		pInput.add(p4);

		JLabel lblStdPob = new JLabel("StdPob");
		lblStdPob.setPreferredSize(dim80);
		p4.add(lblStdPob);

		txtStdPob = new JTextField();
		txtStdPob.setColumns(20);
		p4.add(txtStdPob);
		return pInput;
	}

	public JPanel createDataViewPanel() {
		JPanel pData = new JPanel();
		pData.setBorder(
				new TitledBorder(null, "Student Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		pData.setLayout(new BoxLayout(pData, BoxLayout.Y_AXIS));

		JPanel pD1 = new JPanel();
		pData.add(pD1);

		JLabel lblCodeTit = new JLabel("StdCode");
		lblCodeTit.setPreferredSize(dim80);
		pD1.add(lblCodeTit);

		JLabel lblNameTit = new JLabel("StdName");
		lblNameTit.setPreferredSize(dim150);
		pD1.add(lblNameTit);

		JLabel lblTitDob = new JLabel("StdDob");
		lblTitDob.setPreferredSize(dim80);
		pD1.add(lblTitDob);

		JLabel lblPobTit = new JLabel("StdPob");
		lblPobTit.setPreferredSize(dim150);
		pD1.add(lblPobTit);

		JPanel pD2 = new JPanel();
		pData.add(pD2);

		JLabel lblR1 = new JLabel("10001010");
		lblR1.setPreferredSize(dim80);
		pD2.add(lblR1);

		JLabel lblNameR1 = new JLabel("Tran Thi Thanh Nga");
		lblNameR1.setPreferredSize(dim150);
		pD2.add(lblNameR1);

		JLabel lblDobR1 = new JLabel("1/5/1982");
		lblDobR1.setPreferredSize(dim80);
		pD2.add(lblDobR1);

		JLabel lblPobR1 = new JLabel("Thai Binh");
		lblPobR1.setPreferredSize(dim150);
		pD2.add(lblPobR1);
		return pData;
	}

	public void updateDataView(StudentModel model) {

		JPanel pNew = new JPanel();
		JLabel lblCode = new JLabel(model.getId());
		lblCode.setPreferredSize(dim80);
		pNew.add(lblCode);

		JLabel lblName = new JLabel(model.getName());
		lblName.setPreferredSize(dim150);
		pNew.add(lblName);

		JLabel lblDob = new JLabel(model.getDob());
		lblDob.setPreferredSize(dim80);
		pNew.add(lblDob);

		JLabel lblPob = new JLabel(model.getPob());
		lblPob.setPreferredSize(dim150);
		pNew.add(lblPob);
		
		pData.add(pNew);
		pData.revalidate();
		pack();
	}

}
