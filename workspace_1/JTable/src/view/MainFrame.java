package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

import model.StudentTableModel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private TablePanel tablePanel;
	public JTable table;
	public StudentTableModel model;
	private NewStudentDialog newStudentDialog;
	
	private JButton addBtn;

	public MainFrame(StudentTableModel model) {
		super("Student Table");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 400);
		
		this.model = model;
		this.table = new JTable(this.model);
		this.tablePanel = new TablePanel(table);
		this.newStudentDialog = new NewStudentDialog(this);
		
		this.setLayout(new BorderLayout());
		this.add(tablePanel, BorderLayout.CENTER);
		
		this.addBtn = new JButton("New Student");
		
		this.add(addBtn, BorderLayout.SOUTH);
		
		this.addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				newStudentDialog.setVisible(true);
			}
		});
	}

}
