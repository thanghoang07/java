package demo2_1;

import java.awt.BorderLayout;

import javax.swing.*;

import demo002.ListModelExample;

public class JListdemo extends JPanel {
	public JList ngayList, thangList, namList;
	DefaultListModel model, model1, model2;
	public JListdemo() {
		setLayout(new BorderLayout());
		model = new DefaultListModel();
		ngayList = new JList(model);
		JScrollPane pane = new JScrollPane(ngayList);
		for (int i = 0; i < 31; i++) {
			model.addElement(1 + i);
		}
		//
		model1 = new DefaultListModel();
		thangList = new JList(model1);
		JScrollPane pane1 = new JScrollPane(thangList);
		for (int i = 0; i < 12; i++) {
			model1.addElement(1 + i);
		}
		//
		model2 = new DefaultListModel();
		namList = new JList(model2);
		JScrollPane pane2 = new JScrollPane(namList);
		for (int i = 0;1975< i && i < 2015; i++) {
			model2.addElement(1975 + i);
		}
		//
		add(pane, BorderLayout.WEST);
		add(pane1, BorderLayout.CENTER);
		add(pane2, BorderLayout.EAST);
	}
	public static void main(String s[]) {
		JFrame frame = new JFrame("List Model Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new JListdemo());
		frame.setSize(260, 200);
		frame.setVisible(true);
	}
}
