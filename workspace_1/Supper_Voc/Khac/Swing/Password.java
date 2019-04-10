package Swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class Password extends JFrame implements ActionListener {
	static JTextField txtAcc;
	static JPasswordField tfPassword;

	public Password(String title) {
		super(title);
		setTitle("Password");
		setLayout(new FlowLayout());
		// p1
		JPanel pacc = new JPanel();
		JLabel lblAccount = new JLabel("Account:");
		pacc.add(lblAccount);
		txtAcc = new JTextField(10);
		pacc.add(txtAcc);
		add(pacc);
		// p2
		JPanel ppass = new JPanel();
		JLabel lblPassword = new JLabel("Password:");
		ppass.add(lblPassword);
		tfPassword = new JPasswordField(12);
		tfPassword.setEchoChar(' ');
		ppass.add(tfPassword);

		JButton btn = new JButton("Enter");
		ppass.add(btn);
		add(ppass);
		pack();
		// for frame
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Password wen = new Password("pa");
		String account = String.valueOf(txtAcc.getText());
		String password = String.valueOf(tfPassword.getText());
		wen.mapHa(account, password);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Password nnn = new Password("pb");
		String account = String.valueOf(txtAcc.getText());
		String password = String.valueOf(tfPassword.getText());
		nnn.mapHa(account, password);
	}

	public void mapHa(String account, String password) {
		account = String.valueOf(txtAcc.getText());
		password = String.valueOf(tfPassword.getText());
		HashMap<String, String> map = new HashMap<>();
		map.put(account, password);
		for (String j : map.keySet()) {
			System.out.println("Acc: " + j + " - Pass: " + map.get(j));
		}
	}
}
