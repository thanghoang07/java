package Lab02_06;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class giaoDien extends JFrame {
	private JLabel lb1, lb2, lb3, lb4, lb5;
	private JTextField tx1, tx2, tx3, tx4;
	private Vector<String> cot;
	private Vector<Vector> dong;
	private JTable tb;
	private JPanel pn1, pn2, pn3;
	private JButton bt1, bt2, bt3;
	private Vector<String> dongi;

	public giaoDien(String title) {
		super(title);
		setLayout(new GridLayout(4, 1));
		lb5 = new JLabel(" quan li Diem ");
		add(lb5);
		pn1 = new JPanel();
		pn1.setLayout(new GridLayout(4, 2));
		lb1 = new JLabel("number");
		lb2 = new JLabel("title");
		lb3 = new JLabel("credits");
		lb4 = new JLabel("grade ");

		tx1 = new JTextField();
		tx2 = new JTextField();
		tx3 = new JTextField();
		tx4 = new JTextField();

		pn1.add(lb1);
		pn1.add(tx1);
		pn1.add(lb2);
		pn1.add(tx2);
		pn1.add(lb3);
		pn1.add(tx3);
		pn1.add(lb4);
		pn1.add(tx4);
		add(pn1);

		pn2 = new JPanel();
		bt1 = new JButton("add");
		bt2 = new JButton("delete");
		bt3 = new JButton("reset");
		pn2.add(bt1);
		pn2.add(bt2);
		pn2.add(bt3);
		add(pn2);
		//
		dong = new Vector<Vector>();

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int num = Integer.parseInt(tx1.getText());
				String st = tx2.getText();
				int sc = Integer.parseInt(tx3.getText());
				double gra = Double.parseDouble(tx4.getText());

				Vector<String> dongi = new Vector<String>();
				dongi.addElement(String.valueOf(num));
				dongi.addElement(st);
				dongi.addElement(String.valueOf(sc));
				dongi.addElement(String.valueOf(gra));
				dong.addElement(dongi);
				// phai truyen du lieu vao trong jtable
				tb.setModel(new DefaultTableModel(dong, cot));
			}
		});

		// ================================================================================
		pn3 = new JPanel();
		cot = new Vector<String>();
		cot.addElement("number");
		cot.addElement("title");
		cot.addElement("credits");
		cot.addElement("grade ");

		tb = new JTable(dong, cot);
		JScrollPane scrollPane = new JScrollPane(tb);
		pn3.add(scrollPane);
		add(pn3);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
	}

	public static void main(String[] args) {
		new giaoDien("til");
	}
}
