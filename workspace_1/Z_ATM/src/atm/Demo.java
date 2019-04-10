package atm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Dimension;

public class Demo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					Demo frame = new Demo();
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
	public Demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnAdd = new JButton("Add");
		toolBar.add(btnAdd);
		
		JButton btnExit = new JButton("Exit");
		toolBar.add(btnExit);
		
		JButton btnDelete = new JButton("Delete");
		toolBar.add(btnDelete);
		
		JPanel panelInPut = new JPanel();
		contentPane.add(panelInPut, BorderLayout.CENTER);
		panelInPut.setLayout(new BoxLayout(panelInPut, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panelInPut.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(20);
		
		JPanel panel_2 = new JPanel();
		panelInPut.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(20);
		
		JPanel panel_3 = new JPanel();
		panelInPut.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_3.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_3.add(textField_2);
		textField_2.setColumns(20);
		
		JPanel panel_4 = new JPanel();
		panelInPut.add(panel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_4.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		panel_4.add(textField_3);
		textField_3.setColumns(20);
		
		Panel panelData = new Panel();
		contentPane.add(panelData, BorderLayout.SOUTH);
		panelData.setLayout(new BoxLayout(panelData, BoxLayout.Y_AXIS));
		
		Panel panel = new Panel();
		panelData.add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setPreferredSize(new Dimension(80, 20));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setPreferredSize(new Dimension(80, 20));
		panel.add(lblNewLabel_5);
		
		JLabel label = new JLabel("New label");
		label.setPreferredSize(new Dimension(80, 20));
		panel.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setPreferredSize(new Dimension(80, 20));
		panel.add(label_1);
		
		Panel panel_5 = new Panel();
		panelData.add(panel_5);
		
		JLabel label_2 = new JLabel("New label");
		panel_5.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		panel_5.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		panel_5.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		panel_5.add(label_5);
	}

}
