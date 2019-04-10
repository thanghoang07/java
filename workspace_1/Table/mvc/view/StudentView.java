package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controller.Controller;
import model.ManageInfomation;
import model.People;
import model.Student;

public class StudentView extends JFrame implements Observer {
	private java.util.List<Student> listSv = new ArrayList<>();
	private Dimension d1 = new Dimension(80, 20);
	private Dimension d = new Dimension(150, 20);

	private JPanel contentPane;
	private JTextField txtMssv;
	private JTextField txtName;
	private JTextField txtDob;
	private JTextField txtPob;
	private JPanel data;
	private Student editAndDelete;
	private ManageInfomation model;
	private Controller controller;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @param controller
	 */
	public StudentView(ManageInfomation model, Controller controller) {
		this.model = model;
		this.controller = controller;
		model.addObserver(this);
		listSv = model.getStd();
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 566, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		contentPane.add(createOutPutButton(), BorderLayout.NORTH);
		contentPane.add(createInputPanel(), BorderLayout.CENTER);
		data = new JPanel();
		data.add(creatDataPanel());
		contentPane.add(data, BorderLayout.SOUTH);
		pack();
	}

	private JToolBar createOutPutButton() {
		JToolBar toolBar = new JToolBar();

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addStd();
			}
		});
		toolBar.add(btnAdd);

		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				edit();
			}
		});
		toolBar.add(btnEdit);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delete();
			}

		});
		toolBar.add(btnDelete);
		return toolBar;
	}

	private JPanel createInputPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JPanel p1 = new JPanel();
		panel.add(p1);

		JLabel lblMssv = new JLabel("MSSV :");
		lblMssv.setPreferredSize(d1);
		p1.add(lblMssv);

		txtMssv = new JTextField();
		p1.add(txtMssv);
		txtMssv.setColumns(20);

		JPanel p = new JPanel();
		panel.add(p);

		JLabel lblName = new JLabel("Tên : ");
		lblName.setPreferredSize(d1);
		p.add(lblName);

		txtName = new JTextField();
		txtName.setColumns(20);
		p.add(txtName);

		JPanel p3 = new JPanel();
		panel.add(p3);

		JLabel lblDob = new JLabel("Ngày sinh :");
		lblDob.setPreferredSize(d1);
		p3.add(lblDob);

		txtDob = new JTextField();
		txtDob.setColumns(20);
		p3.add(txtDob);

		JPanel p4 = new JPanel();
		panel.add(p4);

		JLabel lblPob = new JLabel("Nơi sinh : ");
		lblPob.setPreferredSize(d1);
		p4.add(lblPob);

		txtPob = new JTextField();
		txtPob.setColumns(20);
		p4.add(txtPob);
		return panel;
	}

	private JPanel creatDataPanel() {
		JPanel pInfo = new JPanel();
		pInfo.setBorder(new TitledBorder(null, "Th\u00F4ng Tin Sinh Vi\u00EAn", TitledBorder.CENTER, TitledBorder.TOP,
				null, Color.RED));
		pInfo.setLayout(new BoxLayout(pInfo, BoxLayout.Y_AXIS));

		JPanel pInfo1 = new JPanel();
		pInfo.add(pInfo1);

		JLabel lblLblinfomssv = new JLabel("MSSV");
		lblLblinfomssv.setHorizontalAlignment(SwingConstants.CENTER);
		lblLblinfomssv.setPreferredSize(d1);
		pInfo1.add(lblLblinfomssv);

		JLabel lblLblinfoname = new JLabel("Họ tên SV");
		lblLblinfoname.setHorizontalAlignment(SwingConstants.CENTER);
		lblLblinfoname.setPreferredSize(d);
		pInfo1.add(lblLblinfoname);

		JLabel lblInfoDob = new JLabel("Ngày sinh");
		lblInfoDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoDob.setPreferredSize(d1);
		pInfo1.add(lblInfoDob);

		JLabel lblInfoPob = new JLabel("Nơi sinh");
		lblInfoPob.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoPob.setPreferredSize(d);
		pInfo1.add(lblInfoPob);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(pInfo.getWidth(), 150));
		pInfo.add(scrollPane);

		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		addComponent(panel);
		JPanel pn_createBeauty = new JPanel();
		pn_createBeauty.setLayout(new BorderLayout());
		panel.add(pn_createBeauty);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		return pInfo;
	}

	private void edit() {
		if (editAndDelete != null) {
			Student std = createStudent();
			if (!std.equals(editAndDelete)) {
				controller.editStudent(editAndDelete, std);
				System.out.println("Cập nhật thành công");
				System.out.println(std);
			}
			editAndDelete = null;
			setDataPanel();
		}
	}

	private void delete() {
		if (editAndDelete != null) {
			System.out.println("Xóa thành công");
			System.out.println(editAndDelete);
			controller.deleteStudent(editAndDelete);
			editAndDelete = null;
			setDataPanel();
		}
	}

	private Student createStudent() {
		if (!(txtDob.getText().equals("") || txtName.getText().equals("") || txtMssv.getText().equals("")
				|| txtPob.getText().equals(""))) {
			Student std = new Student(Integer.parseInt(txtMssv.getText()), txtName.getText().trim(),
					Integer.parseInt(txtDob.getText()), txtPob.getText());
			clear();
			return std;
		} else {
			return null;
		}
	}

	private void addComponent(JPanel pInfo) {
		editAndDelete = null;
		for (People people : listSv) {
			if (people instanceof Student) {
				JPanel add = new JPanel();
				JLabel mssv, name, dob, pob;
				add.add(mssv = new JLabel(String.valueOf(people.getId())));
				add.add(name = new JLabel(people.getName()));
				add.add(dob = new JLabel(String.valueOf(people.getDob())));
				add.add(pob = new JLabel(people.getPob()));
				setSize(mssv, name, dob, pob);
				pInfo.add(add);
				add.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						txtMssv.setText(String.valueOf(people.getId()));
						txtDob.setText(String.valueOf(people.getDob()));
						txtName.setText(people.getName());
						txtPob.setText(people.getPob());
						editAndDelete = (Student) people;
						repaint();
					}
				});
			}
		}
	}

	private void setDataPanel() {
		data.removeAll();
		data.add(creatDataPanel());
		data.updateUI();
		clear();
		pack();
		repaint();
	}

	private void addStd() {
		try {
			Student std = createStudent();
			if (std != null) {
				if (listSv.contains(std)) {
					JOptionPane.showMessageDialog(null, "Sinh viên đã tồn tại");
					return;
				}
				controller.addStudent(std);
				System.out.println("Thêm  thành công");
				System.out.println(std);
				setDataPanel();
			} else {
				JOptionPane.showMessageDialog(null, "Không được để trống !");
			}

		} catch (Exception e) {
			clear();
			JOptionPane.showMessageDialog(null, "Lỗi nhập dữ liệu!");
		}
	}

	private void clear() {
		txtMssv.setText("");
		txtDob.setText("");
		txtName.setText("");
		txtPob.setText("");
	}

	private void setSize(JLabel mssv, JLabel name, JLabel dob, JLabel pob) {
		mssv.setHorizontalAlignment(SwingConstants.CENTER);
		mssv.setPreferredSize(d1);

		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setPreferredSize(d);

		dob.setHorizontalAlignment(SwingConstants.CENTER);
		dob.setPreferredSize(d1);

		pob.setHorizontalAlignment(SwingConstants.CENTER);
		pob.setPreferredSize(d);
	}

	@Override
	public void update(Observable e, Object e1) {
		if (e instanceof ManageInfomation) {
			ManageInfomation mng = (ManageInfomation) e;
			listSv = mng.getStd();
			setDataPanel();
		}

	}

}
