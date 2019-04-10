package Theory;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListDemo extends JFrame{
	public ListDemo(String title){
		super(title);
		setLayout(new FlowLayout());
		
		JLabel lblSex = new JLabel("Sex:");
		add(lblSex);
		
		String[] lstData = { "Female", "Male" };
		JList lst = new JList(lstData);
		add(lst);
		
		JButton btOK = new JButton("OK");
		add(btOK);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ListDemo("List Demo");
	}
}
