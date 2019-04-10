package atm.simulation;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonChoose extends JPanel{
	public ButtonChoose(){
		setLayout(new GridLayout(4, 1, 15, 15));
		
		JButton[] btChoose = new JButton[4];
		for (int i = 0; i < btChoose.length; i++) {
			btChoose[i] = new JButton();
			add(btChoose[i]);
		}
	}
	
//	public synchronized int readMenuChoice()
}
