package tuan4_mang_mot_chieu_mang_hai_chieu;
import java.util.Random;
import java.util.Scanner;

public class Bai1_lab2_ctdl_hkI_2015
{
	static int n;
	static int m;
	static Scanner nhapVao;
    private final int soHang;             // so hang
    private final int soCot;             // so  cot
    private final int[][] nhanMaTran;   	 // hang voi cot trong ma tran
    static final int MAX = 5;
    static final int MAX1 = 3;

    public Bai1_lab2_ctdl_hkI_2015(int soHang, int soCot) 
    {
        this.soHang = soHang;
        this.soCot = soCot;
        nhanMaTran = new int[soHang][soCot];
    }
    public Bai1_lab2_ctdl_hkI_2015(int[][] nhanMaTran)
    {
        soHang = nhanMaTran.length;
        soCot = nhanMaTran[0].length;
        this.nhanMaTran = new int[soHang][soCot];
        for (int i = 0; i < soHang; i++)
            for (int j = 0; j < soCot; j++)
                    this.nhanMaTran[i][j] = nhanMaTran[i][j];
    }
    public static Bai1_lab2_ctdl_hkI_2015 taoMaTranNgauNhien(int soHang, int soCot)
    {
        Bai1_lab2_ctdl_hkI_2015 maTranA = new Bai1_lab2_ctdl_hkI_2015(soHang, soCot);
        Random abc = new Random();
        for (int i = 0; i < soHang; i++)
            for (int j = 0; j < soCot; j++)
                maTranA.nhanMaTran[i][j] = abc.nextInt(MAX);
        return maTranA;
    }
    //tao ma tran duong cheo
    public static Bai1_lab2_ctdl_hkI_2015 maTranCheo(int soHang)
    {
        Bai1_lab2_ctdl_hkI_2015 maTranI = new Bai1_lab2_ctdl_hkI_2015(soHang, soHang);
        for (int i = 0; i < soHang; i++)
            maTranI.nhanMaTran[i][i] = MAX1;
        return maTranI;
    }
     //tao ma tran C = A + B
    public Bai1_lab2_ctdl_hkI_2015 congHaiMaTran(Bai1_lab2_ctdl_hkI_2015 matranB)
    {
        Bai1_lab2_ctdl_hkI_2015 A = this;
        if (matranB.soHang != A.soHang || matranB.soCot != A.soCot);
        Bai1_lab2_ctdl_hkI_2015 C = new Bai1_lab2_ctdl_hkI_2015(soHang, soCot);
        for (int i = 0; i < soHang; i++)
            for (int j = 0; j < soCot; j++)
                C.nhanMaTran[i][j] = A.nhanMaTran[i][j] + matranB.nhanMaTran[i][j];
        return C;
    }
    //tao ma tran C = A * B
    public Bai1_lab2_ctdl_hkI_2015 tichHaiMaTran(Bai1_lab2_ctdl_hkI_2015 maTranB)
    {
        Bai1_lab2_ctdl_hkI_2015 maTranA = this;
        if (maTranA.soCot != maTranB.soHang);
        Bai1_lab2_ctdl_hkI_2015 maTranC = new Bai1_lab2_ctdl_hkI_2015(maTranA.soHang, maTranB.soCot);
        for (int i = 0; i < maTranC.soHang; i++)
            for (int j = 0; j < maTranC.soCot; j++)
                for (int k = 0; k < maTranA.soCot; k++)
                    maTranC.nhanMaTran[i][j] += 
                    (maTranA.nhanMaTran[i][k] * maTranB.nhanMaTran[k][j]);
        return maTranC;
    }
    // in ma tran
    public void inMaTran() 
    {
        for (int i = 0; i < soHang; i++) 
        {
            for (int j = 0; j < soCot; j++) 
            {
                System.out.printf("%2d ", nhanMaTran[i][j]);
            }
            System.out.println();
        }
    }
    // test client
    public static void main(String[] args)
    {
    	nhapVao = new Scanner(System.in);
    	System.out.print("Nhap vao so hang cua ma tran: ");
		n = nhapVao.nextInt();
		System.out.print("Nhap vao so hang cua ma tran cheo: ");
		m = nhapVao.nextInt();
       
        Bai1_lab2_ctdl_hkI_2015 maTranA = Bai1_lab2_ctdl_hkI_2015.taoMaTranNgauNhien(n, n);
        System.out.print("Ma tran thu nhat la: \n");
        maTranA.inMaTran(); 
        System.out.println();

        Bai1_lab2_ctdl_hkI_2015 maTranB = Bai1_lab2_ctdl_hkI_2015.taoMaTranNgauNhien(n, n);
        System.out.print("Ma tran thu hai la: \n");
        maTranB.inMaTran(); 
        System.out.println();
        
        System.out.print("Cong ma tran la: \n");
        maTranA.congHaiMaTran(maTranB).inMaTran();
        System.out.println();

        System.out.print("Nhan ma tran la: \n");
        maTranB.tichHaiMaTran(maTranA).inMaTran();
        System.out.println();

        Bai1_lab2_ctdl_hkI_2015 C = Bai1_lab2_ctdl_hkI_2015.maTranCheo(m);
        System.out.print("Ma tran duong cheo la: \n");
        C.inMaTran(); 
        System.out.println();       
     }
}

