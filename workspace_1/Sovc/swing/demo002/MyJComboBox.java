package demo002;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyJComboBox extends JFrame {
	private JComboBox<String> cbbCountry;
	private JLabel lbShow;
	private String[] arrFlag = { "vn", "china", "us", "lao", "en" };
	private String[] arrCountry = { "Việt Nam", "Trung Quốc", "Mỹ", "Lào", "Anh" };

	public MyJComboBox() {
		// add main panel to JFrame
		add(createMainPanel());
		// set Display
		setTitle("JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	// create main panel with BorderLayout
	private JPanel createMainPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		// add a JComboBox to top of main panel
		panel.add(cbbCountry = createComboBox(arrCountry), BorderLayout.PAGE_START);
		// get flag name with country is selected in JComboBox
		String flag = arrFlag[cbbCountry.getSelectedIndex()];
		// add JLabel to show flag
		panel.add(lbShow = createLabel(flag), BorderLayout.CENTER);
		return panel;
	}

	// create a JComboBox with list item in ArrayList
	private JComboBox<String> createComboBox(String[] arrItem) {
		JComboBox<String> cbb = new JComboBox<String>(arrItem);
		return cbb;
	}

	// create JLabel to show flag with
	private JLabel createLabel(String flagName) {
		JLabel lb = new JLabel(getFlag(flagName));
		return lb;
	}

	// get flag with name is flagName
	private ImageIcon getFlag(String flagName) {
		ImageIcon flag = new ImageIcon(getClass().getResource("/nguyenvanquan7826/JComboBox/" + flagName + ".png"));
		return flag;
	}

	public static void main(String[] args) {
		new MyJComboBox();
	}
}
