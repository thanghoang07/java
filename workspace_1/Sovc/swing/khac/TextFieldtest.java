package khac;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldtest extends Frame {
	TextField tf1 = new TextField(30);

	public TextFieldtest(String title) {
		super(title);
		setLayout(new FlowLayout());
		add(tf1);
	}

	public static void main(String args[]) {
		TextFieldtest f = new TextFieldtest("TextField");
		f.setSize(300, 200);
		f.show();
	}
}
