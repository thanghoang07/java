package observerPattern;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Digital extends JFrame implements Observer {

	private Clock clock = new Clock();
	private JLabel label = new JLabel();

	public Digital() {
		setTitle("Digital Clock");
		this.HienThi();
		clock.addObserver(this);
	}

	public void HienThi() {
		JPanel panel = new JPanel();
		//
		panel.add(label);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//
		label.setFont(new Font("Segoe UI Light", Font.CENTER_BASELINE, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		getContentPane().add(panel);
		//
		setResizable(false);
		setBounds(200, 200, 200, 110);
		setLocationRelativeTo(null);
		setVisible(true);
		label.setText(clock.getTime());
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		label.setText((String) arg1);
		String news = (String) arg1;
		System.out.println(news);
	}
}
