package atm.simulation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LogPanel extends JPanel {
	private JTextArea jtaLog;
	private JButton jbtClearLog, jbtHideLog;

	public LogPanel(GUI gui) {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(getWidth(), getHeight()));
		jtaLog = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(jtaLog);
		add(scrollPane, BorderLayout.CENTER);

		JPanel jpButton = new JPanel();
		jbtClearLog = new JButton("Clear Log");
		jbtClearLog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jtaLog.setText("");
			}
		});
		jbtHideLog = new JButton("Hide Log");
		jbtHideLog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				gui.showCard("ATM");
			}
		});
		jpButton.add(jbtHideLog);
		jpButton.add(jbtClearLog);

		add(jpButton, BorderLayout.PAGE_END);
	}
}
