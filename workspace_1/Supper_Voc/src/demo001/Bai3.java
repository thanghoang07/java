package demo001;

import java.util.Scanner;

public class Bai3 {
	public static long largestPrimeFactor(long n){
        long temp = n; 
        long result = 0;
        while (temp%2==0) {
                temp /= 2;
        }
        //System.out.println(temp);
        if(temp==1) result = 2;
        
        else {

                for(long i = 1; i<=(temp-1)/2; i++) {
                        long j = 2*i+1;
                        if(temp%j==0) {
                                 temp /= j; i --;
                        }
                        if(temp == 1) result = j;		
                }	
        }
        return result;
    }
	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu day Fibonacci: ");
		long so = nhapVao.nextLong();
		System.out.println("...." + largestPrimeFactor(so));
	}
}
