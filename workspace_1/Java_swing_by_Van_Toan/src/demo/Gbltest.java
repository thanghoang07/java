package demo;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JFrame;

public class Gbltest extends JFrame {
	TextArea ta;
	TextField tf;
	Button b1, b2;
	CheckboxGroup cbg;
	Checkbox cb1, cb2, cb3, cb4;
	GridBagLayout gb;
	GridBagConstraints gbc;

	public Gbltest(String title) {
		super(title);
		gb = new GridBagLayout();
		setLayout(gb);
		gbc = new GridBagConstraints();
		ta = new TextArea("Textarea", 5, 10);
		tf = new TextField("enter your name");
		b1 = new Button("TextArea");
		b2 = new Button("TextField");

		cbg = new CheckboxGroup();
		cb1 = new Checkbox("Bold", cbg, false);
		cb2 = new Checkbox("Italic", cbg, false);
		cb3 = new Checkbox("Plain", cbg, false);
		cb4 = new Checkbox("Bold/Italic", cbg, true);

		gbc.fill = GridBagConstraints.BOTH;
		addComponent(ta, 0, 0, 4, 1);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		addComponent(b1, 0, 1, 1, 100);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		addComponent(b2, 0, 2, 1, 1);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		addComponent(cb1, 2, 1, 1, 1);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		addComponent(cb2, 2, 2, 1, 1);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		addComponent(cb3, 3, 1, 1, 1);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		addComponent(cb4, 3, 2, 1, 1);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		addComponent(tf, 4, 0, 1, 3);
	}

	public void addComponent(Component c, int row, int col, int nrow, int ncol) {
		gbc.gridx = col;
		gbc.gridy = row;

		gbc.gridwidth = ncol;
		gbc.gridheight = ncol;

		gb.setConstraints(c, gbc);
		add(c);
	}

	public static void main(String[] args) {
		Gbltest t = new Gbltest("GridBag Layout");
		t.setSize(300, 200);
		t.show();
	}
}
