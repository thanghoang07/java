package ChuyenHeSo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicGraphicsUtils;

public class SwingChuyeHeSo extends JFrame {
	JTextField txtGiaTri, txtKetQua;
	JRadioButton jrbSang2, jrbSang16;

	public SwingChuyeHeSo() {
		super("Converting Decimals");
		setLayout(new FlowLayout());

		// Jpanel 1
		JPanel p1 = new JPanel();
		JLabel lblGiaTri = new JLabel("Số Chuyển:");
		JTextField txtGiaTri = new JTextField(15);
		p1.add(lblGiaTri);
		p1.add(txtGiaTri);
		add(p1);

		// Jpanel 2
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2, 2));
		JLabel lblChuyen = new JLabel("Chuyển:");
		JLabel lblNull = new JLabel("");
		jrbSang2 = new JRadioButton("10->2");
		jrbSang16 = new JRadioButton("10->16");
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrbSang2);
		btg.add(jrbSang16);
		p2.add(lblChuyen);
		p2.add(jrbSang2);
		p2.add(lblNull);
		p2.add(jrbSang16);
		add(p2);

		jrbSang2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtGiaTri.getText());
				txtKetQua.setText(he2(n));

			}
		});

		jrbSang16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtGiaTri.getText());
				txtKetQua.setText(he16(n));
			}
		});

		// Jpanel 3
		JPanel p3 = new JPanel();
		JLabel lblKetQua = new JLabel("Kết Qủa");
		txtKetQua = new JTextField(15);
		p3.add(lblKetQua);
		p3.add(txtKetQua);
		add(p3);

		setSize(300, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new SwingChuyeHeSo();
	}

	public static String he16(int n) {
		String thapLucPhan = "";
		while (n != 0) {
			int giaTri = n % 16;
			thapLucPhan = toHexChar(giaTri) + thapLucPhan;
			n = n / 16;
		}
		return thapLucPhan;
	}

	public static char toHexChar(int giaTri) {
		if (giaTri >= 0 && giaTri <= 9)
			return (char) (giaTri + '0');
		else
			return (char) (giaTri - 10 + 'A');
	}

	public static String he2(int n) {
		String nhiPhan = "";
		while (n != 0) {
			nhiPhan = (n % 2) + nhiPhan;
			n = n / 2;
		}
		return nhiPhan;
	}

}
