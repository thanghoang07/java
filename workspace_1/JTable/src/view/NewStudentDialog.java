package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;

import model.Student;
import model.StudentTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

public class NewStudentDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private JTextField sidTxt;
	private JTextField fnTxt;
	private JTextField lnTxt;
	private JTextField birthdayTxt;
	private JTextField emailTxt;
	private JTextField majorTxt;
	private JTextField classTxt;

	private MainFrame mainFrame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				StudentTableModel model = new StudentTableModel();
				MainFrame mainFrame = new MainFrame(model);
				try {
					NewStudentDialog frame = new NewStudentDialog(mainFrame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewStudentDialog(MainFrame mainFrame) {
		super(mainFrame);
		this.setModal(true);
		this.mainFrame = mainFrame;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(
				new FormLayout(new ColumnSpec[] {
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC, }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"), }));

		JLabel lblSid = new JLabel("SID");
		getContentPane().add(lblSid, "2, 4, right, default");

		sidTxt = new JTextField();
		getContentPane().add(sidTxt, "4, 4, fill, default");
		sidTxt.setColumns(10);

		JLabel lblClass = new JLabel("Class");
		getContentPane().add(lblClass, "2, 6, right, default");

		classTxt = new JTextField();
		getContentPane().add(classTxt, "4, 6, fill, default");
		classTxt.setColumns(10);

		JLabel lblNewLabel = new JLabel("First Name");
		getContentPane().add(lblNewLabel, "2, 8");

		fnTxt = new JTextField();
		getContentPane().add(fnTxt, "4, 8, fill, default");
		fnTxt.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name");
		getContentPane().add(lblLastName, "2, 10, right, default");

		lnTxt = new JTextField();
		getContentPane().add(lnTxt, "4, 10");
		lnTxt.setColumns(10);

		JLabel lblBirthday = new JLabel("Birthday");
		getContentPane().add(lblBirthday, "2, 12, right, default");

		birthdayTxt = new JTextField();
		getContentPane().add(birthdayTxt, "4, 12, fill, default");
		birthdayTxt.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		getContentPane().add(lblEmail, "2, 14, right, default");

		emailTxt = new JTextField();
		getContentPane().add(emailTxt, "4, 14, fill, default");
		emailTxt.setColumns(10);

		JLabel lblMajor = new JLabel("Major");
		getContentPane().add(lblMajor, "2, 16, right, default");

		majorTxt = new JTextField();
		getContentPane().add(majorTxt, "4, 16, fill, default");
		majorTxt.setColumns(10);

		JPanel panel = new JPanel();
		getContentPane().add(panel, "4, 18, fill, fill");

		JButton createBtn = new JButton("Create");
		createBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Student s = new Student();
				s.setSid(sidTxt.getText());
				s.setFirstName(fnTxt.getText());
				s.setLastName(lnTxt.getText());
				s.setEmail(emailTxt.getText());
				s.setMajor(majorTxt.getText());
				s.setClassName(classTxt.getText());
				s.setBirthday(new Date(birthdayTxt.getText()));

				System.out.println("ADD STUDENT:" + s);
				NewStudentDialog.this.mainFrame.model.addStudent(s);
				NewStudentDialog.this.setVisible(false);
				NewStudentDialog.this.mainFrame.table.updateUI();
			}
		});
		panel.add(createBtn);

		JButton resetBtn = new JButton("Reset");
		panel.add(resetBtn);

		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(cancelBtn);

	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

}
