package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

import human.CaroFrame;
import human.MainHuman;
import util.ShowMessage;

public class StartProgram extends JFrame implements MouseListener {

	ShowMessage sh = new ShowMessage();
	JButton btnewAi, btnewHm, btquit;
	final int X = 150, Y = 40;
	final int WEIGHT = 720, HEIGHT = 740;
	
	public StartProgram() {
		setTitle("Caro Game");
		setLayout(null);

		btnewAi = new JButton("AI vs Human");
		btnewAi.setBounds(200, 70, X, Y);
		btnewAi.addMouseListener(this);
		add(btnewAi);

		btnewHm = new JButton("Human vs Human");
		btnewHm.setBounds(200, 125, X, Y);
		btnewHm.addMouseListener(this);
		add(btnewHm);

		btquit = new JButton("Quit");
		btquit.setBounds(200, 180, X, Y);
		btquit.addMouseListener(this);
		add(btquit);

		setSize(525, 360);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnewAi) {
			if (sh.showMessageNewGame()) {
				//
				Container content = getContentPane();
				MainAi pnew = new MainAi();
				pnew.setVisible(true);
				pnew.setSize(WEIGHT, HEIGHT);
				pnew.setBounds(0, 0, pnew.getWidth(), pnew.getHeight());
				setSize(WEIGHT, HEIGHT);
				setLocationRelativeTo(null);
				content.add(pnew);
				//
				btnewAi.setVisible(false);
				btnewHm.setVisible(false);
				btquit.setVisible(false);
			}
		}

		if (e.getSource() == btnewHm) {
			if (sh.showMessageNewGame()) {
				//
				//Container content = getContentPane();
				new CaroFrame();
				/*pnew2.setVisible(true);
				pnew2.setSize(pnew2.width, pnew2.height);
				pnew2.setBounds(0, 0, pnew2.width, pnew2.height);
				setSize(pnew2.width, pnew2.height);
				setLocationRelativeTo(null);*/
				//content.add(pnew2);
				//
				btnewAi.setVisible(false);
				btnewHm.setVisible(false);
				btquit.setVisible(false);
			}
		}

		if (e.getSource() == btquit) {
			sh.showMessageQuit();
			System.exit(0);
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == btnewAi) {

			btnewAi.setForeground(Color.ORANGE);
		}
		if (e.getSource() == btnewHm) {

			btnewHm.setForeground(Color.ORANGE);
		}
		if (e.getSource() == btquit) {

			btquit.setForeground(Color.ORANGE);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == btnewAi)
			btnewAi.setForeground(Color.BLACK);
		if (e.getSource() == btnewHm)
			btnewHm.setForeground(Color.BLACK);

		if (e.getSource() == btquit)
			btquit.setForeground(Color.BLACK);
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		new StartProgram();
	}
}
