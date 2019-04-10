package tuan4_mang_mot_chieu_mang_hai_chieu;
import java.util.Scanner;

public class TimSoTrungNhau {

    public static void main(String[] args)
    {
        //Nhập mảng 10 số
        Scanner scan = new Scanner(System.in);
        int[] input = new int[10];
        System.out.println("Please enter 10 integers, hitting return after each one: ");
        for (int i = 0; i < input.length; i++)
        {
            input[i] = scan.nextInt();
        }
        System.out.println("GIẢI THUẬT 1, LOC LAY CAC PHAN TU RIENG BIET ROI IN");
        //l�?c lấy các phần tử khác nhau
        int[] out = new int[10];
        out[0] = input[0];
        int iSoPhanTuRiengBietDaLuu = 1;
        for (int i = 1; i < input.length; i++)
        {
            for (int j = 0; j < iSoPhanTuRiengBietDaLuu; j++)
            {
                if (out[j] == input[i])
                {
                    break;
                }
                if (j + 1 == iSoPhanTuRiengBietDaLuu)
                {
                    out[iSoPhanTuRiengBietDaLuu] = input[i];
                    iSoPhanTuRiengBietDaLuu++;
                }
            }
        }
        //in kết quả
        System.out.println("Cac phan tu rieng biet");
        for (int i = 0; i < iSoPhanTuRiengBietDaLuu; i++)
        {
            System.out.print(out[i] + " ");
        }

        System.out.println("\nGIẢI THUẬT 2, IN C�?C PHẦN TỬ Ở LẦN TÌM THẤY �?ẦU TIÊN");
        System.out.println("Cac phan tu rieng biet");
        System.out.print(input[0] + " ");
        for (int i = 1; i < input.length; i++)
        {
            //ta xét xem phần tử thứ i có phần tử nào ở phía trước trùng hay không
            for (int j = 0; j < i; j++) 
            {
                if (input[i] == input[j])
                {
                    break;
                }
                //nếu trung sẽ bị break bên trên, đến lúc này tứ là không có phần tử nào ở phía trước cùng giá trị.
                if (j + 1 == i)
                {
                    System.out.print(input[i] + " ");
                }
            }
        }
    }
}
