package CuoiKy15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bai3 extends JFrame {
	String[] tacGia = { "Leonardo Da Vinci", "Vincent Vangogh",
			"Adibai Discid", "Botero" };
	String[] loaiTranh = { "Sơn dầu", "sơn mài", "gốm", "đơn sắc", "men",
			"Thuỷ mặc" };
	String[] phongCach = { "Hiện đại", "Cổ điển" };

	JTextField jtfTacPham, jtfNam;
	JComboBox jcbLoaiTranh, jcbPhongCach, jcbTacGia;
	JTextArea jtaThongTin;
	ArrayList<Painting> array = new ArrayList<Painting>();

	public Bai3() {
		setTitle("Art Management");
		BoxLayout b1 = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
		this.setLayout(b1);

		Dimension dimLabel = new Dimension(100, 20);
		Dimension dimTF = new Dimension(120, 20);
		Dimension dimCB = new Dimension(170, 20);
		// row tieu de
		JPanel row0 = new JPanel();
		row0.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblTieuDe = new JLabel("QUẢN LÝ TÁC PHẨM HÔI HỌA");
		row0.add(lblTieuDe);
		add(row0);

		// row 1
		JPanel row1 = new JPanel();
		JLabel lblTacPham = new JLabel("Tên tác phẩm:");
		lblTacPham.setPreferredSize(dimLabel);
		jtfTacPham = new JTextField(15);
		jtfTacPham.setPreferredSize(dimTF);
		row1.add(lblTacPham);
		row1.add(jtfTacPham);
		add(row1);

		// row 2
		JPanel row2 = new JPanel();
		JLabel lblNam = new JLabel("Năm Sáng tác:");
		lblNam.setPreferredSize(dimLabel);
		jtfNam = new JTextField(15);
		jtfNam.setPreferredSize(dimTF);
		row2.add(lblNam);
		row2.add(jtfNam);
		add(row2);

		// row 2
		JPanel row3 = new JPanel();
		JLabel lblLoaiTranh = new JLabel("Loại Tranh:");
		lblLoaiTranh.setPreferredSize(dimLabel);
		jcbLoaiTranh = new JComboBox(loaiTranh);
		jcbLoaiTranh.setPreferredSize(dimCB);
		row3.add(lblLoaiTranh);
		row3.add(jcbLoaiTranh);
		add(row3);

		// row 2
		JPanel row4 = new JPanel();
		JLabel lblPhongCach = new JLabel("Phong cách:");
		lblPhongCach.setPreferredSize(dimLabel);
		jcbPhongCach = new JComboBox(phongCach);
		jcbPhongCach.setPreferredSize(dimCB);
		row4.add(lblPhongCach);
		row4.add(jcbPhongCach);
		add(row4);

		// row 2
		JPanel row5 = new JPanel();
		JLabel lblTacGia = new JLabel("Tác Gỉa:");
		lblTacGia.setPreferredSize(dimLabel);
		jcbTacGia = new JComboBox(tacGia);
		jcbTacGia.setPreferredSize(dimCB);
		row5.add(lblTacGia);
		row5.add(jcbTacGia);
		add(row5);

		// row 6
		JPanel row6 = new JPanel();
		JButton jbtThem = new JButton("Thêm");
		JButton jbtSapXep = new JButton("Sắp Xếp");
		row6.add(jbtThem);
		row6.add(jbtSapXep);
		add(row6);

		jbtThem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String tacPham = jtfTacPham.getText();
					int nam = Integer.parseInt(jtfNam.getText());
					String tranh = (String) jcbLoaiTranh.getSelectedItem();
					String phong = (String) jcbPhongCach.getSelectedItem();
					String tac = (String) jcbTacGia.getSelectedItem();
					array.add(new Painting(tacPham, tac, nam, tranh, phong));
					jtaThongTin.setText(createPaintingList(array));
					jtfTacPham.setText("");
					jtfNam.setText("");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"\"Năm sáng tác\" phải là số nguyên");
				}
			}
		});

		jbtSapXep.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Collections.sort(array);
				jtaThongTin.setText(createPaintingList(array));
			}
		});

		// panel 5
		JPanel p5 = new JPanel();
		p5.setBorder(BorderFactory
				.createTitledBorder("Thông tin về tác phẩm hội hoạ"));
		jtaThongTin = new JTextArea(7, 42);
		jtaThongTin.setText(createPaintingList(viewPaintingList()));
		JScrollPane sp = new JScrollPane(jtaThongTin);
		p5.add(sp);
		add(p5);

		setSize(500, 420);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Bai3();
	}

	private ArrayList<Painting> viewPaintingList() {
		array = new ArrayList<Painting>();
		array.add(new Painting("The Annunciation", "Leonardo Da Vinci", 1473,
				"sơn dầu", "hiện đại"));
		array.add(new Painting("The Baptism of Christ", "Leonardo Da Vinci",
				1476, "Sơn đầu", "cổ điển"));
		array.add(new Painting("Madonna of the Carnation",
				"Leonardo Da Vinci", 1475, "sơn dầu", "hiện đại"));
		array.add(new Painting("Text of the original cherry",
				"Vincent Vangogh", 0, "sơn dầu", "cổ điện"));
		array.add(new Painting("Botero beat oil painting", "Botero", 0,
				"sơn dầu", " cổ điển"));
		return array;
	}

	private String createPaintingList(ArrayList<Painting> array) {
		String in = "";
		for (int i = 0; i < array.size(); i++) {
			Painting obj = array.get(i);
			in += obj.title + "\t\t" + obj.artist + "\t\t" + obj.year + "\t\t"
					+ obj.getPaintType() + "\t\t" + obj.getStyle() + "\n";

		}
		return in;
	}

//	public int compareTo(ArtObject other) {
//		ArtObject a1 = (ArtObject) other;
//		return a1.title.compareToIgnoreCase(other.title);
//	}
}
