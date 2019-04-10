package clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Clock extends JFrame implements ActionListener {
	private JTextField tfTime;
	private JButton btStart, btStop;
	private JComboBox<String> cbTime;
	private long beginTime, remineTime;
	private TimeThread thread;
	private long[] timeChoice = { 300000, 600000, 900000, 1200000 };

	public Clock() {
		super("Clock");
		InitGUI();
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		remineTime = 5 * 60 * 1000;
	}

	private void InitGUI() {
		setLayout(new FlowLayout());
		tfTime = new JTextField(14);
		tfTime.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
		tfTime.setFont(tfTime.getFont().deriveFont(24.0f));
		tfTime.setBackground(Color.DARK_GRAY);
		tfTime.setFocusable(false);// xoa con tro
		printTimeToScreen(0);
		add(tfTime);
		//
		btStart = new JButton("Start");
		btStart.addActionListener(this);
		add(btStart);
		//
		btStop = new JButton("Stop");
		btStop.addActionListener(this);
		add(btStop);
		//
		cbTime = new JComboBox<String>();
		cbTime.addItem("5 minutes");
		cbTime.addItem("10 minutes");
		cbTime.addItem("15 minutes");
		cbTime.addItem("20 minutes");
		add(cbTime);
	}

	private class TimeThread extends Thread {
		public void run() {
			beginTime = System.currentTimeMillis();
			while (true) {
				long deltaTime = System.currentTimeMillis() - beginTime;
				printTimeToScreen(deltaTime);
				if (deltaTime > remineTime) {
					JOptionPane.showMessageDialog(rootPane, "Completed the time count!");
					stopThread();
				}
				try {
					sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Clock co = new Clock();
	}

	private void printTimeToScreen(long time) {
		int hours, minutes, seconds;

		hours = (int) (time / (1000 * 60 * 60));
		minutes = (int) (time % (1000 * 60 * 60)) / (60 * 1000);
		seconds = (int) (time % (1000 * 60 * 60) / 1000);

		String text = ((hours > 9) ? hours : ("0" + hours)) + " : " + ((minutes > 9) ? minutes : ("0" + minutes))
				+ " : " + ((seconds > 9) ? seconds : ("0" + seconds));

		tfTime.setText(text);
	}

	private void startThread() {
		if (thread != null) {
			stopThread();
		}
		thread = new TimeThread();
		thread.start();
	}

	private void stopThread() {

		if (thread != null) {
			printTimeToScreen(0);
			thread.stop();
			thread = null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btStart) {
			startThread();
		}
		if (e.getSource() == btStop) {
			stopThread();
		}
		if (e.getSource() == cbTime) {
			int choice = cbTime.getSelectedIndex();
			remineTime = timeChoice[choice];
		}
	}
}
