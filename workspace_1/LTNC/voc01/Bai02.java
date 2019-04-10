import java.util.Scanner;

public class Bai02 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("So N can nhap: ");
        n=in.nextInt();
        int i;
        int[]a=new int[n];
        System.out.println("Nhap phan tu mang:");
        for(i=0;i<n;i++)
        {
            System.out.println("So thu "+i+":");
            a[i]=in.nextInt();
        }
        System.out.println("Mang da nhap la:");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n(Sap xep mang)");
        int j,tmp;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }   
            }
        }
        System.out.println("Mang sau khi duoc sap xep:");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}

