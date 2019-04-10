package demo;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalLock extends JFrame implements Observer {
	private int hours, minute, second;
	private Observable observable;
	private JLabel label;
	private Clock clock = new Clock();

	public DigitalLock(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
		label = new JLabel();
		add(label);
		this.HienThi();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Clock) {
			Clock clock = (Clock) o;
			this.hours = clock.getHours();
			this.minute = clock.getMinute();
			this.second = clock.getSecond();
			label.setText(format());
			label.setFont(new Font("Segoe UI Light", Font.CENTER_BASELINE, 30));
			this.repaint();
		}
	}

	public void HienThi() {
		JPanel panel = new JPanel();
		//
		panel.add(label);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//
		getContentPane().add(panel);
		add(new DigitalLock(clock));
		setSize(250, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	/* dinh dang la dong ho hien thi ra theo dang 00:00:00 */
	public String format() {
		String time = "";
		time += ((hours < 10) ? "0" : "") + hours + ":";
		time += ((minute < 10) ? "0" : "") + minute + ":";
		time += ((second < 10) ? "0" : "") + second;
		return time;
	}

}
