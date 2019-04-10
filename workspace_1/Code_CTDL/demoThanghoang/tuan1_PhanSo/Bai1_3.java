/*
 * nhap vao phan so co dang 1/2, 3/7, 1/1 = 1 
 * va thuc hien cac phep tinh cong, tru , nhan ,chia
 * dung toString
 */
package tuan1_PhanSo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai1_3 extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int tuSo, mauSo;
	
	JTextField txtNumber1, txtNumber2, txtNumber4, txtNumber3,
	txtNumber5,	txtNumber6, txtNumber7, txtNumber8, txtNumber9,
	txtNumber10, txtNumber11;
	
	static int soA;
	static int soB;
	static int soC;
	static int soD;

	private static Scanner nhapVao;
	
	static Bai1_3 x;
	static Bai1_3 y;
	static Bai1_3 z;
	static Bai1_3 t;
	static Bai1_3 g;
	static Bai1_3 m;
	
	public Bai1_3()
	{
		this.tuSo = 0;
		this.mauSo = 0;
		
		setTitle("Phan So");
		setLayout(new FlowLayout());
		
		//panel 1
		JPanel p1 = new JPanel();
		JLabel lblNumber1 = 
				new JLabel("Nhap vao tu so cua phan so thu nhat: ");
		p1.add(lblNumber1);
		txtNumber1 = new JTextField(10);
		p1.add(txtNumber1);
		
		JLabel lblNumber2 = 
				new JLabel("Nhap vao mau so cua phan so thu nhat: ");
		p1.add(lblNumber2);
		txtNumber2 = new JTextField(10);
		p1.add(txtNumber2);
		
		add(p1);
				
		//panel 2		
		JPanel p2 = new JPanel();
		JLabel lblNumber4 =
				new JLabel("Nhap vao tu so cua phan so thu hai: ");
		p2.add(lblNumber4);
		txtNumber4 = new JTextField(10);
		p2.add(txtNumber4);
		
		JLabel lblNumber5 = 
				new JLabel("Nhap vao mau so cua phan so thu hai: ");
		p2.add(lblNumber5);
		txtNumber5 = new JTextField(10);
		p2.add(txtNumber5);
		
		add(p2);
		
		//panel 3
		JPanel p3 = new JPanel();
		JButton btnResult = new JButton("Tính:");
		p3.add(btnResult);   
		add(p3); 
		
		//panel 4
		JPanel p4 = new JPanel();
		JLabel lblNumber7 = 
				new JLabel("Tinh");
		p4.add(lblNumber7);
		
		JLabel lblNumber3 = //in ra phan so 1
				new JLabel("phan so thu nhat la: ");
		p4.add(lblNumber3);
		txtNumber3 = new JTextField(10);
		p4.add(txtNumber3);
		
		JLabel lblNumber6 = //in ra phan so 2
				new JLabel("phan so thu hai la: ");
		p4.add(lblNumber6);
		txtNumber6 = new JTextField(10);
		p4.add(txtNumber6);
		
		JLabel lblNumber8 = 
				new JLabel("Cong Hai Phan So: ");
		p4.add(lblNumber8);
		txtNumber8 = new JTextField(10);
		p4.add(txtNumber8);
		
		JLabel lblNumber9 = 
				new JLabel("Tru Hai Phan So: ");
		p4.add(lblNumber9);
		txtNumber9 = new JTextField(10);
		p4.add(txtNumber9);
		
		JLabel lblNumber10 = 
				new JLabel("Nhan Hai Phan So: ");
		p4.add(lblNumber10);
		txtNumber10 = new JTextField(10);
		p4.add(txtNumber10);
		
		JLabel lblNumber11 = 
				new JLabel("Chia Hai Phan So: ");
		p4.add(lblNumber11);
		txtNumber11 = new JTextField(10);
		p4.add(txtNumber11);
		add(p4);
		
		//action listener
		btnResult.addActionListener(this);
			
		//for frame
		setSize(800, 400);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		}
	public String toString ()//toString 
	//phan nay hoi bi kho hieu!!!!!
    {
    	if (mauSo == 1) //mau so bang 1 in ra phan so la tu so
       		return tuSo + "";
       	else //mau so khac 1 in ra phan so la tu so / mau so
    		return tuSo + "/" + mauSo;
    }
	public Bai1_3(int a, int b)
	{
        tuSo = a; mauSo = b;//gan tu va mau so
        if (b == 0) //mau so bang khong
        	System.out.println("loi rui!!!");
        else if (b < 0) //mau so khac khong
        { 
        	tuSo = - tuSo ; //chuyen tu so am sang so duong 
        	mauSo = - mauSo;
        }
        
        int uocChung = uocChungCuaTuVaMauSo(tuSo, mauSo);
        tuSo = tuSo / uocChung;
        mauSo = mauSo / uocChung;
    }	
	//tinh UCLN de rut gon phan so
	private int uocChungCuaTuVaMauSo(int m, int n) 
	{	   
		if ( n == 0)
			return m;
	    else 
	    	return uocChungCuaTuVaMauSo(n, m % n);
	}
	//tinh
	//cong
	public Bai1_3 congHaiPhanSo(Bai1_3 b)
	{
		Bai1_3 a = this;
		return new Bai1_3((a.tuSo * b.mauSo) 
						+ (a.mauSo * b.tuSo), a.mauSo * b.mauSo); 
	}
	//tru
	public Bai1_3 truHaiPhanSo (Bai1_3 b) 
	{
		Bai1_3 a = this;
		return new Bai1_3((a.tuSo * b.mauSo)
						- (a.mauSo * b.tuSo), a.mauSo * b.mauSo);
	}
	//nhan
	public Bai1_3 nhanHaiPhanSo(Bai1_3 b)
	{
		Bai1_3 a = this;
		return new Bai1_3(a.tuSo * b.tuSo, a.mauSo * b.mauSo);		
	}
	//chia
	public Bai1_3 chiaHaiPhanSo(Bai1_3 b)
	{
		Bai1_3 a = this;
		return new Bai1_3(a.tuSo * b.mauSo, a.mauSo * b.tuSo);		
	}	
	//main
	public static void main(String[] args)
	{
		new Bai1_3();
		
		x = new Bai1_3(soA, soB);
		y = new Bai1_3(soC, soD);
		/*z = x.congHaiPhanSo(y);//cong
		t = x.truHaiPhanSo(y);//tru
		g = x.nhanHaiPhanSo(y);//nhan
		m = x.chiaHaiPhanSo(y);//chia
*/	}
	@Override
	public void actionPerformed(ActionEvent a)
	{
		soA = Integer.parseInt(txtNumber1.getText());
		soB = Integer.parseInt(txtNumber2.getText());
		soC = Integer.parseInt(txtNumber4.getText());
		soB = Integer.parseInt(txtNumber5.getText());
		
		txtNumber3 .setText("" + (x));
		txtNumber6 .setText("" + (y));
		txtNumber8 .setText("" + (x.congHaiPhanSo(y)));
		txtNumber9 .setText("" + (x.truHaiPhanSo(y)));
		txtNumber10.setText("" + (x.nhanHaiPhanSo(y)));
		txtNumber11.setText("" + (x.chiaHaiPhanSo(y)));
	}
	public static Scanner getNhapVao() {
		return nhapVao;
	}
	public static void setNhapVao(Scanner nhapVao) {
		Bai1_3.nhapVao = nhapVao;
	}
	
}
