package tuan7_recursion;

import java.util.Scanner;

public class Baixxxxxx
{
	private static Scanner nhapVao;
	public static void partition(int n) {
        partition(n, n, "");
    }
    public static void partition(int n, int max, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }
  
        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i, prefix + " " + i);
        }
    }


    public static void main(String[] args) 
    { 
    	nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = nhapVao.nextInt();
        
        partition(n);
    }


}
