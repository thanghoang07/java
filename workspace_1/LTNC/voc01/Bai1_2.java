import java.util.Random;
import java.util.Scanner;

public class Bai1_2 
{
/*{
	static int n = 0;
	static int i;
	public static int[] taoMang(int n)
	{
		int[] mang1 = new int[n];
		Random abc = new Random();
		for (int i = 0; i < n; i++)
			mang1[i] = abc.nextInt(10000000);
		return mang1;		
	}
	public static void inMang(int[] mang1)
	{
		for( i = 0; i < n; i++)
			System.out.println("\t" + mang1[i]);
	}
	public static void main(String[] args) 
	{
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		int n = nhapVao.nextInt();
		
		int[] mang1 = new int[n];
		mang1 = taoMang(n);
		inMang(mang1);
		
		System.out.println(tinhTong(mang1, n));
		
	}
	public static int tinhTong(int[] mang1, int n)
	{
		int tong = 0;
		for(i = 0; i < n; i++)
			tong += mang1[i] ;
		return tong;
	} 
}*/

/*import java.util.Random; 

public class Bai1_2 
{ 
    public static void main(String[] args)
    { 
        Random ran = new Random(); 

        int a[] = new int[20]; 
        for (int i = 1; i < a.length; i++)
        { 
            long seed = System.currentTimeMillis(); 
            ran.setSeed(seed); 
            a[i] = ran.nextInt(20); 
            System.out.println("seed = " + seed + " a[" + i + "] = " + a[i]); 
        } 
    } 
} */
public static void main(String[] args)
{
	// TODO code application logic here
	Scanner scan = new Scanner(System.in);
	int[] studentScores = new int[5];
	for (int i = 0; i < studentScores.length; i++)
	{
	System.out.print("Enter studentScores " + i + " : ");
	studentScores[i] = scan.nextInt();
	}
}
}
