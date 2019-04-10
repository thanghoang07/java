package demo002;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaDemo extends JFrame {

	JTextField jtfInput;
	JTextArea jtAreaOutput;
	String newline = "\n";

	public JTextAreaDemo() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		jtfInput = new JTextField(20);
		jtfInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = jtfInput.getText();
				jtAreaOutput.append(text + newline);
				jtfInput.selectAll();
			}
		});

		jtAreaOutput = new JTextArea(5, 20);
		jtAreaOutput.setCaretPosition(0);
		jtAreaOutput.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(jtAreaOutput, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		GridBagLayout gridBag = new GridBagLayout();
		Container contentPane = getContentPane();
		contentPane.setLayout(gridBag);

		GridBagConstraints gridCons1 = new GridBagConstraints();
		gridCons1.gridwidth = GridBagConstraints.REMAINDER;
		gridCons1.fill = GridBagConstraints.HORIZONTAL;
		contentPane.add(jtfInput, gridCons1);

		GridBagConstraints gridCons2 = new GridBagConstraints();
		gridCons2.weightx = 1.0;
		gridCons2.weighty = 1.0;
		contentPane.add(scrollPane, gridCons2);
	}

	public static void main(String args[]) {
		JTextAreaDemo jTextAreaDemo = new JTextAreaDemo();
		jTextAreaDemo.pack();
		jTextAreaDemo.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		jTextAreaDemo.setVisible(true);
	}

}
