package khac;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PasswordChecker extends JFrame implements ActionListener {
	public JPanel pan1;
	public JLabel lblq;
	public JTextField tfd1, tfdKetQua;
	public JButton btn;
	public PasswordChecker(String title) {
		super(title);
		setLayout(new FlowLayout());
		setSize(550, 220);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// panel 1
		pan1 = new JPanel();
		lblq = new JLabel("Nhap vao mot mat khau de kiem tra: ");
		tfd1 = new JTextField(15);
		pan1.add(lblq);
		pan1.add(tfd1);
		add(pan1);
		btn = new JButton("Kiem tra");
		add(btn);
		btn.addActionListener(this);
		tfdKetQua = new JTextField(45);
		tfdKetQua.setEditable(false);
		add(tfdKetQua);
	}
	public static void main(String[] args) {
		new PasswordChecker("kiem tra do manh mat khau");
	}

	public static int validatePasswordStrength(String password) {
		int strengthPercentage = 0;
		String[] regexChecks = { ".*[a-z]+.*", // kiểm tra chữ thường
				".*[A-Z]+.*", // kiểm tra chữ hoa
				".*[\\d]+.*", // kiểm tra chữ số
				".*[@#$%]+.*" // kiểm tra ký tự đặc biệt
		};

		if (password.matches(regexChecks[0])) {
			strengthPercentage += 25;
		}
		if (password.matches(regexChecks[1])) {
			strengthPercentage += 25;
		}
		if (password.matches(regexChecks[2])) {
			strengthPercentage += 25;
		}
		if (password.matches(regexChecks[3])) {
			strengthPercentage += 25;
		}

		return strengthPercentage;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String pass = tfd1.getText();
		tfdKetQua.setText("Độ mạnh của mật khẩu password là = " + validatePasswordStrength(pass) + "%");
	}
}
