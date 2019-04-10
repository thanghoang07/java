package lab1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class JavaCalculator extends JFrame {
	public JavaCalculator(String title) {
		super(title);
		setLayout(new BorderLayout());

		JMenuBar jmb = new JMenuBar();
		this.add(jmb);

		JMenu jmFile = new JMenu("File");
		JMenu jmHelp = new JMenu("Help");
		jmb.add(jmFile);
		jmb.add(jmHelp);
		setJMenuBar(jmb);

		jmFile.setMnemonic('F');
		jmHelp.setMnemonic('H');

		JLabel jlb1 = new JLabel("0");
		jlb1.setHorizontalTextPosition(JLabel.RIGHT);
		jlb1.setBackground(Color.WHITE);
		jlb1.setOpaque(true);
		add(jlb1, BorderLayout.NORTH);

		// panel 1
		JPanel jplBackSpace = new JPanel();
		jplBackSpace.setLayout(new GridLayout(1, 1, 2, 2));
		JButton jbnBackspace = new JButton("Backspace");
		jplBackSpace.add(jbnBackspace);
		JPanel jplControl = new JPanel();
		jplControl.setLayout(new GridLayout(1, 2, 2, 2));
		JButton jbnCE = new JButton(" CE ");
		JButton jbnC = new JButton("C");
		jplControl.add(jbnCE);
		jplControl.add(jbnC);
		add(jplBackSpace, BorderLayout.WEST);
		add(jplControl, BorderLayout.EAST);

		// panel 3
		JPanel jplP3 = new JPanel();
		jplP3.setLayout(new GridLayout(4, 4, 2, 2));
		JButton jtn1 = new JButton("7");
		JButton jtn2 = new JButton("8");
		JButton jtn3 = new JButton("8");
		JButton jtn4 = new JButton("*");
		JButton jtn5 = new JButton("4");
		JButton jtn6 = new JButton("5");
		JButton jtn7 = new JButton("6");
		JButton jtn8 = new JButton("-");
		JButton jtn9 = new JButton("1");
		JButton jtn10 = new JButton("2");
		JButton jtn11 = new JButton("3");
		JButton jtn12 = new JButton("+");
		JButton jtn13 = new JButton("0");
		JButton jtn14 = new JButton(".");
		JButton jtn15 = new JButton("=");
		JButton jtn16 = new JButton("/");
		jplP3.add(jtn1);
		jplP3.add(jtn2);
		jplP3.add(jtn3);
		jplP3.add(jtn4);
		jplP3.add(jtn5);
		jplP3.add(jtn6);
		jplP3.add(jtn7);
		jplP3.add(jtn8);
		jplP3.add(jtn9);
		jplP3.add(jtn10);
		jplP3.add(jtn11);
		jplP3.add(jtn12);
		jplP3.add(jtn13);
		jplP3.add(jtn14);
		jplP3.add(jtn15);
		jplP3.add(jtn16);
		add(jplP3, BorderLayout.SOUTH);
		
		setSize(270, 220);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JavaCalculator("Java Calculator");
	}
}
