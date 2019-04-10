package demo002;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AlignAndAction extends JFrame implements KeyListener {

	private JTextField tf;
	private JLabel lb;

	public AlignAndAction() {
		createJFrame();
		addContent();
		displayJFrame();
	}

	// create JFrame
	private void createJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1, 5, 5));
	}

	// display JFrame
	private void displayJFrame() {
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void addContent() {
		tf = new JTextField(20);
		tf.setHorizontalAlignment(JTextField.RIGHT);// can trai
		tf.addKeyListener(this);
		add(tf);

		lb = new JLabel("Not data");
		add(lb);
	}

	private void updateData() {
		lb.setText(tf.getText());
	}

	public static void main(String[] args) {
		new AlignAndAction();
	}

	@Override
	public void keyPressed(KeyEvent e) {// nhan vao phim
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			updateData();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) { // nha phim ra
	}

	@Override
	public void keyTyped(KeyEvent e) { // nhap 1 phim
	}
}
