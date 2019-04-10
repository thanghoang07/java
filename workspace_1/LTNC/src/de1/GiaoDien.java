/*
 * package de1; import java.awt.Dimension; import java.awt.FlowLayout; import
 * java.util.ArrayList;
 * 
 * import javax.swing.BoxLayout; import javax.swing.JButton; import
 * javax.swing.JComboBox; import javax.swing.JFrame; import javax.swing.JLabel;
 * import javax.swing.JPanel; import javax.swing.JTextArea; import
 * javax.swing.JTextField;
 * 
 * public class GiaoDien extends JFrame { JLabel tacPham, namSangTac,
 * loaiTranhlbl, tacGialbl, phongCachlbl; JComboBox loaiTranh, phongCach,
 * tacGia; ArrayList<HoiHoa> ds = new ArrayList<HoiHoa>(); public GiaoDien(){ //
 * 
 * 
 * setVisible(true); setDefaultCloseOperation(EXIT_ON_CLOSE); setTitle(
 * "Tac pham hoi hoa"); setSize(520,120); setLocation(200,200);
 * 
 * 
 * // BoxLayout bx = new BoxLayout(super.getContentPane(), BoxLayout.Y_AXIS);
 * setLayout(bx); Dimension dmLabel = new Dimension(150,90); Dimension dmText =
 * new Dimension(90,20); //line 1 JPanel p1 = new JPanel(); p1.setLayout(new
 * FlowLayout()); JLabel lbl = new JLabel("Quan ly tac pham hoi hoa");
 * lbl.setHorizontalTextPosition(JLabel.CENTER); p1.add(lbl); this.add(p1);
 * //line 2 JPanel p2 = new JPanel(); p2.setLayout(new FlowLayout()); tacPham =
 * new JLabel("Ten tac pham: "); tacPham.setPreferredSize(dmLabel);
 * p2.add(tacPham); JTextField txt1 = new JTextField(15);
 * txt1.setPreferredSize(dmText); p2.add(txt1); this.add(p2); //line 3 JPanel p3
 * = new JPanel(); p3.setLayout(new FlowLayout()); namSangTac = new JLabel(
 * "Nam sang tac: "); namSangTac.setPreferredSize(dmLabel); p3.add(namSangTac);
 * JTextField txt2 = new JTextField(15); txt2.setPreferredSize(dmText);
 * p3.add(txt2); this.add(p3); //line 4 JPanel p4 = new JPanel(); String[] lt =
 * {"Son dau", "Mau nuoc", "Truyen than"}; p4.setLayout(new FlowLayout());
 * loaiTranhlbl = new JLabel("Loai tranh: ");
 * loaiTranhlbl.setPreferredSize(dmLabel); p4.add(loaiTranhlbl); loaiTranh = new
 * JComboBox(lt); loaiTranh.setSelectedIndex(0);
 * loaiTranh.setPreferredSize(dmText); p4.add(loaiTranh); this.add(p4); //line 5
 * JPanel p5 = new JPanel(); String[] pc = {"Hien dai", "Co dien"};
 * p5.setLayout(new FlowLayout()); phongCachlbl = new JLabel("Phong cach: ");
 * phongCachlbl.setPreferredSize(dmLabel); p5.add(phongCachlbl); phongCach = new
 * JComboBox(pc); phongCach.setSelectedIndex(0);
 * phongCach.setPreferredSize(dmText); p5.add(phongCach); this.add(p5); //line 6
 * JPanel p6 = new JPanel(); String[] tg = {"Leonardo Da Vinci",
 * "Vincent Vangogh", "Botero"}; p6.setLayout(new FlowLayout()); tacGialbl = new
 * JLabel("Tac gia: "); tacGialbl.setPreferredSize(dmLabel); p6.add(tacGialbl);
 * tacGia = new JComboBox(tg); tacGia.setSelectedIndex(0);
 * tacGia.setPreferredSize(dmText); p6.add(tacGia); this.add(p6); //line 7
 * JPanel p7 = new JPanel(); p7.setLayout(new FlowLayout()); JButton btnThem =
 * new JButton("Them"); p7.add(btnThem); JButton btnSapXep = new JButton(
 * "Sap xep"); p7.add(btnSapXep); this.add(p7); //
 * 
 * JTextArea txt = new JTextArea(); txt.setText("Thong tin vê tac pham"); ds =
 * taoDanhSach(); txt = new JTextArea(); txt.setText(inDanhSach(ds));
 * txt.setRows(3); add(txt); // xu ly su kien } private ArrayList<HoiHoa>
 * taoDanhSach(){ ArrayList<HoiHoa> danhSach = new ArrayList<HoiHoa>();
 * danhSach.add(new HoiHoa("The Annunciation", "Leonardo Da Vinci", 1473,
 * "son dau", "hien dai" )); danhSach.add(new HoiHoa("The Baptism of Christ",
 * "Leonardo Da Vinci", 1476, "son dau", "co dien" )); danhSach.add(new HoiHoa(
 * "Madonna of the Carnation", "Leonardo Da Vinci", 1475, "son dau", "hien dai"
 * )); danhSach.add(new HoiHoa("Text of the original cherry", "Vincent Vangogh",
 * 0, "son dau", "co dien" )); danhSach.add(new HoiHoa(
 * "Botero beat oil painting", "Botero", 0, "son dau", "co dien" )); return
 * danhSach; } private String inDanhSach(ArrayList<HoiHoa> danhSach){ String
 * result = ""; for(int i=0; i<danhSach.size(); i++){ HoiHoa obj =
 * danhSach.get(i); result += obj.tenTacPham + "         " + obj.tacGia +
 * "         " + obj.nam + "         " + obj.getLoaiTranh() + "           " +
 * obj.getPhongCach()+"\n"; } return result; }
 * 
 * public static void main(String[] args){ new GiaoDien(); } }
 */