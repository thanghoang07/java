package atm.simulation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Strategy.DisplayCenter;

public class ATMPanel extends JPanel {
	private JButton btShowLog;

	public static final int DISPLAYABLE_LINES = 12;
	public static final String BLANK_DISPLAY_LINE = "                               ";
	public static final String BLANK_DISPLAY_LINE_SMILE = "               ";

	public ATMPanel(final GUI gui, SimCardReader cardReader, SimOperator operatorPanel, SimDisplay display,
			SimKeyboardDigital keyboardDigital, SimulationPrinter printer) {

		setLayout(new BorderLayout());
		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(Color.BLUE);
		panelTop.setLayout(new FlowLayout());
		ButtonChoose bt = new ButtonChoose();
		bt.setPreferredSize(new Dimension(80, 240));
		panelTop.add(bt, FlowLayout.LEFT);
		SimDisplay panelDisplay = new DisplayCenter();
		panelTop.add(panelDisplay, FlowLayout.CENTER);
		ButtonChoose bt1 = new ButtonChoose();
		bt1.setPreferredSize(new Dimension(80, 250));
		panelTop.add(bt1, FlowLayout.RIGHT);
		add(panelTop, BorderLayout.PAGE_START);

		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.BLACK);
		panelCenter.setPreferredSize(new Dimension(200, 1200));
		panelCenter.add(keyboardDigital);
		panelCenter.add(cardReader, BorderLayout.NORTH);
		add(panelCenter);

		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(new Color(128, 128, 255));
		btShowLog = new JButton("Show Log");
		btShowLog.setPreferredSize(new Dimension(100, 30));
		btShowLog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gui.showCard("LOG");

			}
		});
		panelBottom.add(btShowLog);
		operatorPanel.setPreferredSize(new Dimension(510, 30));
		panelBottom.add(operatorPanel);
		add(panelBottom, BorderLayout.PAGE_END);

	}

}
