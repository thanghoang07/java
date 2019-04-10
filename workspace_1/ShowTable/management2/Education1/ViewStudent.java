package Education1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.ControllerInterface;
import model.ModelInterface;
import model.ObserverInformation;
import model.Student;

public class ViewStudent implements ObserverInformation {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private DefaultTableModel defaultModel;
	private ControllerInterface controller;
	private ModelInterface model;
	private JFrame frame;

	/**
	 * Create the frame.
	 */
	public ViewStudent(ControllerInterface controller, ModelInterface model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver(this);

	}

	@Override
	public void update(Student st) {
		defaultModel.addRow(new Object[] { st.getStCode(), st.getStName(), st.getStDob(), st.getStPob() });
	}

	public void createView() {
		frame = new JFrame("View");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		

		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.addAction(Integer.parseInt(textField.getText()), textField_1.getText(),
						textField_2.getText(), textField_3.getText());
			}
		});
		toolBar.add(btnAdd);

		JButton btnEdit = new JButton("Edit");
		toolBar.add(btnEdit);

		JButton btnDelete = new JButton("Delete");
		toolBar.add(btnDelete);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("StCode");
		lblNewLabel.setPreferredSize(new Dimension(50, 14));
		panel_1.add(lblNewLabel);

		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(20);

		JPanel panel_2 = new JPanel();
		panel.add(panel_2);

		JLabel lblStname = new JLabel("StName");
		lblStname.setPreferredSize(new Dimension(50, 14));
		panel_2.add(lblStname);

		textField_1 = new JTextField();
		textField_1.setColumns(20);
		panel_2.add(textField_1);

		JPanel panel_3 = new JPanel();
		panel.add(panel_3);

		JLabel lblStdob = new JLabel("StDob");
		lblStdob.setPreferredSize(new Dimension(50, 14));
		panel_3.add(lblStdob);

		textField_2 = new JTextField();
		textField_2.setColumns(20);
		panel_3.add(textField_2);

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);

		JLabel lblStpob = new JLabel("StPob");
		lblStpob.setPreferredSize(new Dimension(50, 14));
		panel_4.add(lblStpob);

		textField_3 = new JTextField();
		textField_3.setColumns(20);
		panel_4.add(textField_3);

		JPanel panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 100));
		contentPane.add(panel_5, BorderLayout.SOUTH);

		table = new JTable();
		defaultModel = new DefaultTableModel(new String[] { "StCode", "StName", "StDob", "StPob" }, 0);
		table.setModel(defaultModel);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		JScrollPane srcoll = new JScrollPane(table);
		panel_5.add(srcoll);
		
		frame.setContentPane(contentPane);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 477, 385);
	}
}
