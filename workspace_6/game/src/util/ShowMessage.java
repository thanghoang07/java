package util;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import gui.MainAi;

public class ShowMessage extends JInternalFrame {
	MainAi boardGame;
	
	public ShowMessage(MainAi boardGameTurn) {
		this.boardGame = boardGameTurn;

	}

	// public ShowMessage(BoardGame2Player board2) {
	// this.boardGame2 = board2;
	// }

	public ShowMessage() {

	}
	
	public boolean showMessageNewGame() {
		String[] option = { "New Game", "Cancel" };

		int choice = JOptionPane.showOptionDialog(null, "Are you really want to play?", "New Game",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
		if (choice == JOptionPane.YES_OPTION) {
			return true;
		}
		return false;
	}
		
	public void showMessageQuit() {
		String[] option = { "Quit", "Cancel" };

		int choice = JOptionPane.showOptionDialog(null, "Are you really want to quit?", "Quit Game",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
		if (choice == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public boolean showMessageAIWin() {
		String[] option = { "New Game", "Cancel" };

		int choice = JOptionPane.showOptionDialog(null, "AI win (1)", "New Game",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
		if (choice == JOptionPane.YES_OPTION) {
			return true;
		}
		return false;
	}
	
	public boolean showMessageHumanWin() {
		String[] option = { "New Game", "Cancel" };

		int choice = JOptionPane.showOptionDialog(null, "Human win (2)", "New Game",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
		if (choice == JOptionPane.YES_OPTION) {
			return true;
		}
		return false;
	}
	
}
