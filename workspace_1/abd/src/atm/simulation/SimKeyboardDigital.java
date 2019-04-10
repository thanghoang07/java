package atm.simulation;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SimKeyboardDigital extends JPanel {
	private SimDisplay display;

	private int mode;
	private JButton enterKey, clearKey, cannelKey;
	
	private static final int IDLE_MODE = 0;
	private static final int PIN_MODE = Simulation.PIN_MODE;
	private static final int AMOUNT_MODE = Simulation.AMOUNT_MODE;
	private static final int MENU_MODE = Simulation.MENU_MODE;

	private StringBuffer currentInput;
	private boolean cancelled;
	private int maxValue;

	public SimKeyboardDigital(SimDisplay display) {
		this.display = display;

		setPreferredSize(new Dimension(200, 150));
		setLayout(new GridLayout(5, 3, 10, 10));

		createButton();

		currentInput = new StringBuffer();
		mode = IDLE_MODE;
	}

	public void createButton() {
		JButton[] digitKey = new JButton[10];
		for (int i = 1; i < 10; i++) {
			digitKey[i] = new JButton("" + i);
			add(digitKey[i]);
		}

		add(new Label(""));

		digitKey[0] = new JButton("0");
		add(digitKey[0]);

		add(new Label(""));

		enterKey = new JButton("Enter");
		enterKey.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				enterKeyPressed();

			}
		});
		add(enterKey);
		clearKey = new JButton("Clear");
		clearKey.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clearKeyPressed();
			}
		});
		add(clearKey);
		cannelKey = new JButton("Cannel");
		add(cannelKey);

		// them su kien cho moi nut tren ban phim
		for (int i = 0; i < digitKey.length; i++) {
			digitKey[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					digitKeyPressed(Integer.parseInt(arg0.getActionCommand()));
				}
			});
		}
	}
	
	public synchronized String readInput(int mode, int maxValue) {
		this.mode = mode;
		this.maxValue = maxValue;
		currentInput.setLength(0);
		cancelled = false;
		if (mode == AMOUNT_MODE)
			setEcho("0.00");
		else
			setEcho("");
		requestFocus();

		try {
			wait();
		} catch (InterruptedException e) {
		}
		this.mode = IDLE_MODE;

		if (cancelled)
			return null;
		else
			return currentInput.toString();
	}

	private synchronized void digitKeyPressed(int digit) {
		System.out.println(digit);
		switch (mode) {
		// trang thai khong doc du lieu nguoi dung nhap vao
		case IDLE_MODE:
			break;

		case PIN_MODE: {
			currentInput.append(digit);
			StringBuffer echoString = new StringBuffer();
			if (currentInput.length() <= 6) {
				for (int i = 0; i < currentInput.length(); i++) {
					echoString.append('*');
				}
				setEcho(echoString.toString());
			} else {
				setDisplay(display.getCurrentDisplayLine() + 3, "Mã PIN gồm 6 số. \nVui lòng nhấn CLEAR để nhập lại");
			}
			break;

		}
		case AMOUNT_MODE:
			// setDisplay(display.getCurrentDisplayLine(), "toan");
		}
	}

	private synchronized void enterKeyPressed() {
		switch (mode) {
		case IDLE_MODE:

			break;

		case PIN_MODE:
		case AMOUNT_MODE:

			if (currentInput.length() > 0)
				notify();
			else
				getToolkit().beep();
			break;

		case MENU_MODE:

			getToolkit().beep();
			break;
		}
	}

	private synchronized void clearKeyPressed() {
		switch (mode) {
		case IDLE_MODE:

			break;

		case PIN_MODE:

			currentInput.setLength(0);
			clearLine(display.getCurrentDisplayLine());
			break;

		case AMOUNT_MODE:

			currentInput.setLength(0);
			setEcho("0.00");
			break;

		case MENU_MODE:

			getToolkit().beep();
			break;
		}
	}

	private void setEcho(String echo) {
		display.setEcho(echo);
	}

	private void clearLine(int numberLine) {
		display.clearDisplayLine(numberLine);
	}

	//
	private void setDisplay(int numberLine, String message) {
		display.displayLine(numberLine, message);
	}
}
