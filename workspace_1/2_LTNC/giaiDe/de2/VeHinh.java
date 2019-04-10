package de2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public class VeHinh extends JFrame implements ActionListener, MouseListener, MouseMotionListener {
	private JButton btnLine, btnRec, btnOva;
	private JPanel panlChinh, panlHinh;
	private JTextField txtStatus;
	private String msg;

	public VeHinh() {
		super();
		panlChinh = new JPanel();
		panlChinh.setBorder(new EmptyBorder(5, 5, 5, 5));
		panlChinh.setLayout(new BorderLayout(0, 0));
		setContentPane(panlChinh);

		createGUI();

		setTitle("Ve hinh");
		setSize(400, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void createGUI() {
		createToolBar();

		panlHinh = new PainPanel(PainPanel.NUL);
		this.add(panlHinh, BorderLayout.CENTER);

		createStatus();
		
		addMouseListener(this);
	}

	public JToolBar createToolBar() {
		JToolBar tobar = new JToolBar();
		panlChinh.add(tobar, BorderLayout.NORTH);

		btnLine = new JButton("Duong Thang");
		btnLine.addActionListener(this);
		tobar.add(btnLine);

		btnRec = new JButton("Chu nhat");
		tobar.add(btnRec);

		btnOva = new JButton("Elip");
		tobar.add(btnOva);

		return tobar;
	}

	public void createStatus() {
		JPanel panlCuoi = new JPanel();
		panlChinh.add(panlCuoi, BorderLayout.SOUTH);

		txtStatus = new JTextField(33);
		txtStatus.setEnabled(false);
		panlCuoi.add(txtStatus);
	}

	public static void main(String[] args) {
		new VeHinh();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if (e.getSource().equals(btnRec)) {
			msg = "Chu nhat" + e.getX() + " " + e.getY();
			txtStatus.setText(msg);
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}

class PainPanel extends JPanel {

	public static final int REC = 1;
	public static final int OVA = 2;
	public static final int LIN = 3;
	public static final int NUL = 4;
	private int type = 0;

	public PainPanel(int type) {
		super();
		this.type = type;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		switch (type) {
		case 1:
			g.drawRect(10, 10, 150, 250);
			break;
		case 2:
			g.drawOval(10, 10, 150, 250);
			break;
		case 3:
			g.drawLine(10, 10, 150, 250);
			break;
		case 4:
			break;
		default:
			break;
		}
	}
}