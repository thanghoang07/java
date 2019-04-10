package Graphics;

import javax.swing.JFrame;

public class TestFigurePanel extends JFrame{
	public TestFigurePanel(){
		super("TestFigurePanel");
		
		
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new TestFigurePanel();
	}
}
