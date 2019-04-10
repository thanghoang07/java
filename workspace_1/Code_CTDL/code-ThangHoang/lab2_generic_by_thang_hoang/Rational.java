package lab2_generic_by_thang_hoang;

import java.util.Scanner;

public class Rational extends Number
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int tuSo, mauSo;

	static int soA;
	static int soB;
	static int soC;
	static int soD;

	private static Scanner nhapVao;
	
	public Rational()
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
	public Rational(int a, int b)
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
	public Rational congHaiPhanSo(Rational b)
	{
		Rational a = this;
		return new Rational((a.tuSo * b.mauSo) 
						+ (a.mauSo * b.tuSo), a.mauSo * b.mauSo); 
	}
	
	//nhan
	public Rational nhanHaiPhanSo(Rational b)
	{
		Rational a = this;
		return new Rational(a.tuSo * b.tuSo, a.mauSo * b.mauSo);		
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
		
		Rational x, y, z, g;
		
		x = new Rational(soA, soB);
		y = new Rational(soC, soD);
		z = x.congHaiPhanSo(y);//cong
		
		g = x.nhanHaiPhanSo(y);//nhan
		
		System.out.println("Phan so thu nhat la:\t" + x 
				+ "\n" + "Phan so thu hai la:\t" + y 
				+ "\n" + "Cong hai phan so:\t" + z 				
				+ "\n" + "Nhan hai phan so:\t" + g);
	}
	@Override
	public double doubleValue()
	{		
		return 0;
	}
	
	@Override
	public float floatValue()
	{		
		return 0;
	}
	@Override
	public int intValue() 
	{		
		return 0;
	}
	@Override
	public long longValue() 
	{		
		return 0;
	}
	

}
