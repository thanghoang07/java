package file_Chooser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoJFileChooser2 extends JFrame implements ActionListener {

	public static String iconOpen = "iconOpen.png";
	public static String iconSave = "iconSave.png";

	private JTextArea taLog;
	private JButton btnOpen, btnSave;
	private JFileChooser fc = new JFileChooser();

	public DemoJFileChooser2() {
		addContent();
		setDisplay();
	}

	/**
	 * set display for JFrame
	 */
	private void setDisplay() {
		setTitle("Demo JFileChooser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * add content for JFrame, JFrame contain a ButtonPane (contain buttons) and
	 * a JTextArea to show something you work
	 */
	private void addContent() {
		setLayout(new BorderLayout());
		add(createButtonPanel(), BorderLayout.PAGE_START);
		add(new JScrollPane(taLog = createTextArea(15, 30)), BorderLayout.CENTER);
	}

	/**
	 * create a JPanel contain 2 button (open and save) on TOP of JFrame
	 */
	private JPanel createButtonPanel() {
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(btnOpen = createButton("Open file", iconOpen));
		panel.add(btnSave = createButton("Save file", iconSave));
		return panel;
	}

	/**
	 * create JTextArea
	 */
	private JTextArea createTextArea(int row, int col) {
		JTextArea ta = new JTextArea(row, col);
		ta.setWrapStyleWord(true);
		ta.setLineWrap(true);
		return ta;
	}

	/**
	 * create a JButton with text and icon and add Action for it
	 */
	private JButton createButton(String text, String iconLink) {
		//ImageIcon icon = createImageIcon(iconLink);
		//JButton btn = new JButton(text, icon);
		JButton btn = new JButton(text);
		btn.addActionListener(this);
		return btn;
	}

	/**
	 * get a icon via link to icon
	 */
	/*private ImageIcon createImageIcon(String iconLink) {
		ImageIcon icon = new ImageIcon(getClass().getResource(iconLink));
		return icon;
	}*/

	/**
	 * Handle when you open a file
	 */
	private void openFile() {
		int select = fc.showOpenDialog(this);
		if (select == JFileChooser.APPROVE_OPTION) {
			taLog.append("You open " + fc.getSelectedFile().getName());
		} else {
			taLog.append("You cancelled open!");
		}
		taLog.append("\n");
	}

	/**
	 * Handle when you save a file
	 */
	private void saveFile() {
		int select = fc.showSaveDialog(this);
		if (select == JFileChooser.APPROVE_OPTION) {
			taLog.append("You save " + fc.getSelectedFile().getName());
		} else {
			taLog.append("You cancelled save!");
		}
		taLog.append("\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {
			openFile();
			return;
		}
		if (e.getSource() == btnSave) {
			saveFile();
			return;
		}
	}

	public static void main(String[] args) {
		new DemoJFileChooser2();
	}
}
