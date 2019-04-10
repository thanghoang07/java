package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import util.ShowMessage;

public class BtnewGame extends JPanel implements ActionListener {
	JPanel pal;
	JButton btnewGame;
	
	public BtnewGame() {
		pal = new JPanel();
		pal.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnewGame = new JButton("New game");
		pal.add(btnewGame);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ShowMessage show = new ShowMessage();
		if	(e.getSource() == btnewGame){
			
			MainAi pnew = new MainAi();
			pnew.setVisible(true);
			
			show.showMessageNewGame();
		}
	}

}
