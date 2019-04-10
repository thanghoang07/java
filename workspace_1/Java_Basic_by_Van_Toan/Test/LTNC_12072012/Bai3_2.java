package LTNC_12072012;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Bai3_2 extends JFrame {
	private Bai3 subFrame1;
	private Bai3_1 subFrame2;
	public Bai3_2() {
		super("My Application");
		setLayout(new FlowLayout());
		
		JMenuBar jmb = new JMenuBar();
		this.setJMenuBar(jmb);
		
		JMenu jmMenu= new JMenu("Tool");
		JMenu jmHelp = new JMenu("Help");
		jmb.add(jmMenu);
		jmb.add(jmHelp);
		
		JMenuItem jmiSovle, jmiExit, jmiHelp;
		jmMenu.add(jmiSovle = new JMenuItem("Solve Quadrtic Equation", new ImageIcon("hinh/conver.png")));
		jmMenu.add(jmiExit= new JMenuItem("Exit", new ImageIcon("hinh/multi.png")));
		
		jmiSovle.setMnemonic('c');
		jmiSovle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
		jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
		
		jmiSovle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				subFrame1 = new Bai3();
				subFrame1.setVisible(true);
				subFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
		
		jmiExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		JMenuItem jmiAbout;
		jmHelp.add(jmiAbout = new JMenuItem("About"));
		
		jmiAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				subFrame2 = new Bai3_1();
				subFrame2.setVisible(true);
				subFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Bai3_2();
	}
}
