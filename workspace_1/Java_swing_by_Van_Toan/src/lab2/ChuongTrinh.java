package lab2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class ChuongTrinh extends JFrame implements ActionListener {
	JTextField tfd1, tfd2;
	JLabel lblKQ;
	
	public ChuongTrinh(String title) {
		super(title);
		setLayout(new FlowLayout());

		ImageIcon icon1 = new ImageIcon("icon/exit.png");
		ImageIcon icon2 = new ImageIcon("icon/check.png");

		JMenuBar jmb = new JMenuBar();
		this.setJMenuBar(jmb);
		JMenu fileFile = new JMenu("File");
		jmb.add(fileFile);

		JMenuItem jmiTinh, jmiThoat;
		fileFile.add(jmiTinh = new JCheckBoxMenuItem("Tính"));
		fileFile.addSeparator();
		fileFile.add(jmiThoat = new JMenuItem("Thoat", icon1));
		jmiTinh.setMnemonic('T');
		jmiThoat.setMnemonic('a');
		
		jmiTinh.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,
				ActionEvent.CTRL_MASK));

		// panel 1
		JPanel p1 = new JPanel();
		JLabel lblx = new JLabel("Nhập x");
		tfd1 = new JTextField(10);
		p1.add(lblx);
		p1.add(tfd1);
		add(p1);

		// panel 2
		JPanel p2 = new JPanel();
		JLabel lbly = new JLabel("Nhập y");
		tfd2 = new JTextField(10);
		p2.add(lbly);
		p2.add(tfd2);
		add(p2);

		JButton btn = new JButton("Tính", icon2);
		add(btn);
		lblKQ = new JLabel("Kết quả là:");
		add(lblKQ);

		btn.addActionListener(this);
		

		setSize(500, 120);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ChuongTrinh("Chương Trình");

	}

	public static int multi(int x, int y) {
		return x * y;
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		int x = Integer.parseInt(tfd1.getText());
		int y = Integer.parseInt(tfd2.getText());
		lblKQ.setText("Kết quả là:" + multi(x, y));

	}

}
