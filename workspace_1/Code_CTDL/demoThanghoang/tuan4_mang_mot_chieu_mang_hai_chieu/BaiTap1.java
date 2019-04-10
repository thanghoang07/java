package tuan4_mang_mot_chieu_mang_hai_chieu;

/*
 *  
 * VD: Định nghĩa lớp generics MySort.
 * Lớp này có thể sắp xếp 1 mảng <>bất kì (int hoặc String)
 * Sử dụng lớp MySort để sắp xếp 1 mảng số nguyên bất kì nhập từ bàn phím
 * hoặc 1 mảng string
 */ 
import java.util.ArrayList;
import java.util.Scanner;
 
public class BaiTap1 
{ 
    static Scanner nhapVao;
    static int i;
    static int j;
    static final int MAX = 10;
	public static void main(String[] args)
    {
        ArrayList <Integer> intArray = new ArrayList<Integer>();
        ArrayList <String> stringArray = new ArrayList<String>();
        System.out.print("Nhap N phan tu mang integer : ");
        nhapVao = new Scanner(System.in);
		int Mangint = nhapVao.nextInt();
        System.out.print("Nhap N phan tu mang string : ");
        int Mangstring = nhapVao.nextInt();
        System.out.println("Nhap phan tu mang integer");
        for( i = 0; i < Mangint; i ++)
        {
            int tapTinTam = nhapVao.nextInt();
            intArray.add(new Integer(tapTinTam));
        }
        System.out.println("Nhap phan tu mang String");
        for( i = 0; i < Mangstring; i ++)
        {
            String tapTinTam = nhapVao.nextLine();
            stringArray.add(tapTinTam);
        }
        Sort(intArray);
        
        System.out.println();
        System.out.println("\nMang integer da tao: ");
        inMang(intArray);
        
        Sort(stringArray);
        System.out.println();
        System.out.println("\nMang String da tao: ");
        inMang(stringArray);
    }
    public static <T extends Comparable<T>> void Sort (ArrayList <T> mang1)
    {
        for( i = 0; i < mang1.size() - 1; i ++)
            for(j = i+1; j < mang1.size(); j++)
            {
                if(mang1.get(i) .compareTo(mang1.get(j))< 0)
                {
                    T tapTinTam = mang1.get(i);
                    mang1.set(i, mang1.get(j));
                    mang1.set(j, tapTinTam);
                }
            }
     }
    public static <T> void inMang(ArrayList <T> mang1)
    {
        for( i = 0; i < mang1.size(); i ++)
        {
            System.out.print(mang1.get(i) + "\t");
        }
        System.out.println();
    }
}

