package lab4_recursion;

import java.awt.Point;
import java.util.Scanner;

public class Bai13 
{
    private final static int DODAIMATRAN = 5;      
    private static int maTran[][];                   
    private static Scanner nhapVao;
    
    private static final Point[] MOVES = new Point[]{new Point(-2, -1),
        new Point(-2, 1), new Point(2, -1), new Point(2, 1), new Point(-1, -2),
        new Point(-1, 2), new Point(1, -2), new Point(1, 2)};
	
    private static boolean dung(int hang, int cot)
    {
        return ((hang >= 0 && hang < DODAIMATRAN)
                && (cot >= 0 && cot < DODAIMATRAN)
                && (maTran[hang][cot] == -1));
    }

    private static void inRa()
    {
        for (int hang = 0; hang < DODAIMATRAN; hang++) 
        {
            for (int cot = 0; cot < DODAIMATRAN; cot++)
                System.out.printf("%d\t", maTran[hang][cot]);
            System.out.println();
        }
    }

    public static void giaiQuyet(int sRow, int sCol)
    {
        maTran = new int[DODAIMATRAN][DODAIMATRAN];
        
        for (int hang = 0; hang < DODAIMATRAN; hang++)
            for (int cot = 0; cot < DODAIMATRAN; cot++)
                maTran[hang][cot] = -1;

        maTran[sRow][sCol] = 1;

        if (giaiQuyet(sRow, sCol, 2))
        {
            inRa();
        } 
        else
        {
            System.out.printf("Ko co huong!%n");
        }
    }
    
    private static boolean giaiQuyet(int hang, int cot, int chuyenQuanMa)
    {
        //Base case
        if (chuyenQuanMa > DODAIMATRAN * DODAIMATRAN)
            return true;

        for (Point p : MOVES)
        {
            int nextHang = hang + (int) p.x;
            int nextCot = cot + (int) p.y;

            if (dung(nextHang, nextCot)) 
            {
                maTran[nextHang][nextCot] = chuyenQuanMa;

                chuyenQuanMa = chuyenQuanMa + 1;

                if (giaiQuyet(nextHang, nextCot, chuyenQuanMa))
                    return true;
                else 
                {
                    maTran[nextHang][nextCot] = -1;
                    chuyenQuanMa = chuyenQuanMa - 1;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        nhapVao = new Scanner(System.in);
        System.out.printf("nhap vao so hang tu 0 - " + (DODAIMATRAN - 1) + ": ");
        int hang = nhapVao.nextInt();
        System.out.printf("nhap vao so cot tu 0 - " + (DODAIMATRAN - 1) + ": ");
        int cot = nhapVao.nextInt();

        giaiQuyet(hang, cot);
    }
    
}

