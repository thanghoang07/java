package tetris;

import java.awt.Button;
import java.awt.Dimension;

public class TetrisButton extends Button {
	public TetrisButton(String label) {
		super(label);
	}
	public Dimension getPreferredSize() {
		return new Dimension(120, super.getPreferredSize().height);
	}
}
