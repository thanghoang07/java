package lab2;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame {
	private JList colorJList;
	private String[] colorNames = { "Black", "Blue", "Cyan", "Dark Gray",
			"Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red",
			"White", "Yellow" };
	private Color[] colors = { Color.BLACK, Color.BLUE, Color.CYAN,
			Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
			Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,
			Color.YELLOW };

	public JListDemo() {
		super("JList Demo");
		setLayout(new FlowLayout());

		colorJList = new JList(colorNames);
		add(colorJList);
		
		//display five rows at once [cho hiển thị 5 hàng]
		colorJList.setVisibleRowCount(5);
		
		//do not allow multiple selections[Không cho phép nhiều lựa chọn]
		colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// add a JScrollPane containing JList to frame [JScrollPane : thanh cuộn]
		add(new JScrollPane(colorJList));
		
		// them sự kiện cho JList
		colorJList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				getContentPane().setBackground(
						colors[colorJList.getSelectedIndex()]);

			}
		});

		setSize(300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JListDemo();
	}
}
