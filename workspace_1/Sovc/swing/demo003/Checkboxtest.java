package demo003;

import java.awt.*;

import javax.swing.JFrame;

public class Checkboxtest extends JFrame {
	Label la1 = new Label("CheckBoxes");
	Checkbox Cb1 = new Checkbox("Red", true);
	Checkbox Cb2 = new Checkbox("Green", false);
	Checkbox Cb3 = new Checkbox("Blue", false);
	Label la2 = new Label("Radiobuttons");
	CheckboxGroup CbG = new CheckboxGroup();
	Checkbox Cb4 = new Checkbox("Small", CbG, false);
	Checkbox Cb5 = new Checkbox("Medium", CbG, false);
	Checkbox Cb6 = new Checkbox("Large", CbG, false);

	public Checkboxtest(String title) {
		super(title);
		setLayout(new GridLayout(8, 1));
		add(la1);
		add(Cb1);
		add(Cb2);
		add(Cb3);
		add(la2);
		add(Cb4);
		add(Cb5);
		add(Cb6);
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Checkboxtest test = new Checkboxtest("Checkbox and radiobutton");
		
	}
}
