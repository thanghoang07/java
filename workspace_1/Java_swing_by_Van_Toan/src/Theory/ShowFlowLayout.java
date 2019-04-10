package Theory;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ShowFlowLayout extends JFrame {
	public ShowFlowLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 12, 25));
		add(new JLabel("FirstName"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("LastName"));
		add(new JTextField(8));
	}

	public static void main(String[] args) {
		ShowFlowLayout frame = new ShowFlowLayout();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
