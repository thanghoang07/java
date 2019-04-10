package OnTap;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Lab02_06.Graphics;

public class Applet extends JFrame {
	String[] country = { "America", "Australia", "Japan", "Viet Nam" };
	private ImageIcon[] hinh = { new ImageIcon("hinh/America.png"),
			new ImageIcon("hinh/australia.gif"),
			new ImageIcon("hinh/nhatban.jpg"),
			new ImageIcon("hinh/vietnam.png") };
	private JLabel lblHinh;

	public Applet() {
		super("Applet Viewer");
		setLayout(new BorderLayout());

		JPanel pTieuDe = new JPanel();
		JLabel lblTieuDe = new JLabel("Applet");
		pTieuDe.add(lblTieuDe);
		add(pTieuDe, BorderLayout.NORTH);

		JPanel pHinh = new JPanel();
		lblHinh = new JLabel();
		pHinh.add(lblHinh);
		add(pHinh, BorderLayout.CENTER);

		JPanel pChucNang = new JPanel();
		JButton btnResume = new JButton("Resume");
		JButton btnSuspend = new JButton("Resume");
		JLabel lblSelect = new JLabel("Select");
		JComboBox cbxSelect = new JComboBox(country);
		pChucNang.add(btnResume);
		pChucNang.add(btnSuspend);
		pChucNang.add(lblSelect);
		pChucNang.add(cbxSelect);
		add(pChucNang, BorderLayout.SOUTH);

		cbxSelect.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					lblHinh.setIcon(hinh[cbxSelect.getSelectedIndex()]);

			}
		});

		setSize(320, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Applet();
	}

}
