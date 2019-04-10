package lab2;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboboxDemo extends JFrame implements ItemListener {
	JLabel lblDisplay;
	JComboBox cboImages;
	String[] dongVat = { "canhcut.png", "gautruc.png", "pikachu.png", "rua.png", "tacke.png" };
	Icon[] icons = { new ImageIcon(getClass().getResource("hinh/" + dongVat[0])),
			new ImageIcon(getClass().getResource("hinh/" + dongVat[1])),
			new ImageIcon(getClass().getResource("hinh/" + dongVat[2])),
			new ImageIcon(getClass().getResource("hinh/" + dongVat[3])),
			new ImageIcon(getClass().getResource("hinh/" + dongVat[4])) };

	public ComboboxDemo(String title) {
		super(title);
		setLayout(new FlowLayout());
		cboImages = new JComboBox(dongVat);
		add(cboImages);

		lblDisplay = new JLabel();
		add(lblDisplay);
		cboImages.addItemListener(this);

		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ComboboxDemo("Testing JCombox");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED)
			lblDisplay.setIcon(icons[cboImages.getSelectedIndex()]);

	}
}
