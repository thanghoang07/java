package swing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Bai2 extends JFrame {
	private JPanel panl1, panl2, panl3, panl23;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13;
	private JTextField txt1;

	public Bai2(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		setSize(400, 200);
		setVisible(true);
		createGUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}

	public void createGUI() {
		setLayout(new GridLayout(1, 2));
		//
		panl1 = new JPanel();
		panl1.setLayout(new GridLayout(1, 1));
		btn1 = new JButton("Food to be placed here");
		panl1.add(btn1);
		//
		panl23 = new JPanel();
		panl23.setLayout(new BorderLayout());
		
		//
		panl2 = new JPanel();
		panl2.setLayout(new BorderLayout());
		txt1 = new JTextField(10);
		txt1.setText("Time to be displayed here");
		panl2.add(txt1, BorderLayout.NORTH);
		//
		panl3 = new JPanel();
		panl3.setLayout(new GridLayout(4, 3));
		btn2 = new JButton("1");
		btn3 = new JButton("2");
		btn4 = new JButton("3");
		btn5 = new JButton("4");
		btn6 = new JButton("5");
		btn7 = new JButton("6");
		btn8 = new JButton("7");
		btn9 = new JButton("8");
		btn10 = new JButton("9");
		btn11= new JButton("0");
		btn12 = new JButton("Start");
		btn13 = new JButton("Stop");
		panl3.add(btn2);
		panl3.add(btn3);
		panl3.add(btn4);
		panl3.add(btn5);
		panl3.add(btn6);
		panl3.add(btn7);
		panl3.add(btn8);
		panl3.add(btn9);
		panl3.add(btn10);
		panl3.add(btn11);
		panl3.add(btn12);
		panl3.add(btn13);
		//
		panl23.add(panl2, BorderLayout.NORTH);
		panl23.add(panl3, BorderLayout.CENTER);
		//
		add(panl1);
		add(panl23);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Bai2("The font");
	}
}
