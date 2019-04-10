package thucHanhJavaBasic4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JavaBasic4_1 extends JFrame{
//	Swing
	public JavaBasic4_1(){
		super();
		setLayout(new BorderLayout(5, 10));
		setLayout(new FlowLayout());
		JLabel lbl = new JLabel("nhap mang");
		add(lbl);
		JTextField txt = new JTextField(20);
		add(txt);
		pack();
		add(new JButton("mang"),BorderLayout.CENTER);
		
	}
//	Scan
	
	public static int[] nhapMang(int n){ 
		Scanner scan = new Scanner(System.in);
		
		int[] arrInts = new int[n];
		
		for (int i=0; i<arrInts.length; i++){
		System.out.print("mang [" +i+ "] =");
		arrInts[i] = scan.nextInt();
		}
			return arrInts;
	}
	public static void printArray(int [] arrInts){
		
		for (int i=0; i<arrInts.length; i++){
			System.out.print(arrInts[i]+"    ");
		}
	}
//	max
	
	public static int maxOfArray ( int[] arrInts ){
		int max = arrInts[0];
		
		for (int i=0; i<arrInts.length; i++){
			if (arrInts[i]> max)
				max = arrInts[i];
		}
			return max;
	}
	
	public static int countOfArray ( int[] arrInts ){
		int count =0, max= maxOfArray(arrInts);
		
		for (int i=0; i<arrInts.length; i++){
		if (arrInts[i] == max)
			count++;
		}
			return count;
	}
//	min
	
	public static int minOfArray ( int[] arrInts ){
		int min = arrInts[0];
		
		for (int i=0; i<arrInts.length; i++){
			if (arrInts[i]< min)
				min = arrInts[i];
		}
			return min;
	}
	public static int countOfArray1 ( int[] arrInts ){
		int count =0, min= minOfArray(arrInts);
		
		for (int i=0; i<arrInts.length; i++){
		if (arrInts[i] == min)
			count++;
		}
			return count;
	}
//	
	public static void main(String[] argInts) {
		JavaBasic4_1 J4 = new JavaBasic4_1();
		
		J4.setSize(300, 300);
		J4.setTitle("DemoCayan");
		J4.setLocationRelativeTo(null);
		J4.setBackground(Color.CYAN);
		J4.setVisible(true);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap do dai mang: ");
		int n = scan.nextInt();

		int[] arrInts = new int [n];
		arrInts = nhapMang(n);
		printArray(arrInts);
		System.out.println(" ");
		System.out.println("gia tri lon nhat cua mang la "
		+maxOfArray(arrInts)
				+ " xuat hien la " +countOfArray(arrInts));
		System.out.println("gia tri nho nhat cua mang la "
				+minOfArray(arrInts)
				+ " xuat hien la " +countOfArray1(arrInts));
		
}
}
