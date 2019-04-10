/*
 * nhap vao phan so co dang 1/2, 3/7, 1/1 = 1 
 * va thuc hien cac phep tinh cong, tru , nhan ,chia
 * dung toString
 */
package tuan1_PhanSo;

import java.util.Scanner;

public class Bai1_2
{
	int tuSo, mauSo;

	static int soA;
	static int soB;
	static int soC;
	static int soD;

	private static Scanner nhapVao;
	
	/*static final int SOTUPHANSO1  = 5;
	static final int SOMAUPHANSO1 = 4;
	static final int SOTUPHANSO2  = 5;
	static final int SOMAUPHANSO2 = 5;*/
	
	public Bai1_2()
	{
		this.tuSo = 0;
		this.mauSo = 0;
	}
	public String toString ()//toString 
	//phan nay hoi bi kho hieu!!!!!
    {
    	if (mauSo == 1) //mau so bang 1 in ra phan so la tu so
       		return tuSo + "";
       	else //mau so khac 1 in ra phan so la tu so / mau so
    		return tuSo + "/" + mauSo;
    }
	public Bai1_2(int a, int b)
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
	public Bai1_2 congHaiPhanSo(Bai1_2 b)
	{
		Bai1_2 a = this;
		return new Bai1_2((a.tuSo * b.mauSo) 
						+ (a.mauSo * b.tuSo), a.mauSo * b.mauSo); 
	}
	//tru
	public Bai1_2 truHaiPhanSo (Bai1_2 b) 
	{
		Bai1_2 a = this;
		return new Bai1_2((a.tuSo * b.mauSo)
						- (a.mauSo * b.tuSo), a.mauSo * b.mauSo);
	}
	//nhan
	public Bai1_2 nhanHaiPhanSo(Bai1_2 b)
	{
		Bai1_2 a = this;
		return new Bai1_2(a.tuSo * b.tuSo, a.mauSo * b.mauSo);		
	}
	//chia
	public Bai1_2 chiaHaiPhanSo(Bai1_2 b)
	{
		Bai1_2 a = this;
		return new Bai1_2(a.tuSo * b.mauSo, a.mauSo * b.tuSo);		
	}	
	//main
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.println("Phan so: \n");
		
		//phan so thu nhat
		System.out.print("Nhap vao tu so cua phan so thu nhat: ");
		soA = nhapVao.nextInt();
		System.out.print("Nhap vao mau so cua phan so thu nhat: ");
		soB = nhapVao.nextInt();
		//phan so thu hai
		System.out.print("Nhap vao tu so cua phan so thu hai: ");
		soC = nhapVao.nextInt();
		System.out.print("Nhap vao mau so cua phan so thu hai: ");
		soD = nhapVao.nextInt();
		
		Bai1_2 x, y, z, t, g, m;
		
		x = new Bai1_2(soA, soB);
		y = new Bai1_2(soC, soD);
		z = x.congHaiPhanSo(y);//cong
		t = x.truHaiPhanSo(y);//tru
		g = x.nhanHaiPhanSo(y);//nhan
		m = x.chiaHaiPhanSo(y);//chia
		System.out.println("Phan so thu nhat la:\t" + x 
				+ "\n" + "Phan so thu hai la:\t" + y 
				+ "\n" + "Cong hai phan so:\t" + z 
				+ "\n" + "Tru  hai phan so:\t" + t 
				+ "\n" + "Nhan hai phan so:\t" + g 
				+ "\n" + "Chia hai phan so:\t" + m);
	}
}