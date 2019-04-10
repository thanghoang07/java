package tuan4_mang_mot_chieu_mang_hai_chieu;

import java.util.Scanner;

final public class Bai1_1_lab2_ctdl_hkI_2015
{
	private static int hang;
	private static int cot;
	private final int[][] haiChieu;
	private static Scanner nhapVao;
	
	public Bai1_1_lab2_ctdl_hkI_2015(int hang,int cot)
	{
		this.hang = hang;
		this.cot  = cot;
		haiChieu = new int[hang][cot];
	}
	//tao mang hai chieu
	public Bai1_1_lab2_ctdl_hkI_2015(int[][] haiChieu)
	{
		hang = haiChieu.length;
		cot = haiChieu[0].length;
		this.haiChieu = new int[hang][cot];
		for (int i = 0; i < hang; i++)
			for (int j = 0; j < cot; j++)
				this.haiChieu[i][j] = haiChieu[i][j];
	}
	// copy constructor
    private Bai1_1_lab2_ctdl_hkI_2015(Bai1_1_lab2_ctdl_hkI_2015 maTran1)
    {
    	this(maTran1.haiChieu);
	}
    //tao mang hai chieu random
    static Bai1_1_lab2_ctdl_hkI_2015 random(int hang, int cot)
    {
    	Bai1_1_lab2_ctdl_hkI_2015 maTran1 = new Bai1_1_lab2_ctdl_hkI_2015(hang, cot);
    	for (int i = 0; i < hang; i++)
            for (int j = 0; j < cot; j++)
                maTran1.haiChieu[i][j] = (int) Math.random();
        return maTran1;
    }
	public Bai1_1_lab2_ctdl_hkI_2015 congHaiMaTran(Bai1_1_lab2_ctdl_hkI_2015 maTran2)
	{
		Bai1_1_lab2_ctdl_hkI_2015 maTran1 = this;
		if(maTran2.hang != maTran1.hang || 
				maTran2.cot != maTran1.cot);
			Bai1_1_lab2_ctdl_hkI_2015 maTran3 = new Bai1_1_lab2_ctdl_hkI_2015(hang, cot);
		for (int i = 0; i < hang; i++)
		{
			for (int j = 0; j < cot; j++)
				maTran3.haiChieu[i][j] =
				maTran1.haiChieu[i][j] + maTran2.haiChieu[i][j];
		}
		return maTran3;
	}
	//in mang hai chieu
	public void inMaTran() 
    {
        for (int i = 0; i < hang; i++) 
        {
            for (int j = 0; j < cot; j++) 
                System.out.printf("%9.4f ", haiChieu[i][j]);
            System.out.println();
        }
    }
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.println("Ma Tran: \n");
		
		System.out.print("Nhap vao so hang: ");
		hang = nhapVao.nextInt();
		System.out.print("Nhap vao so cot: ");
		cot = nhapVao.nextInt();
	}
}
