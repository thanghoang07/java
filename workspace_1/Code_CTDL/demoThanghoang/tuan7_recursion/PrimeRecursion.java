package tuan7_recursion;

import java.util.Scanner;

public class PrimeRecursion
{
    static int debug;
	private static Scanner nhapVao;
    public static void main(String[] args)
    {
        nhapVao = new Scanner(System.in);
        System.out.println("Enter non 0 if you want debug :");
        debug = nhapVao.nextInt();
        long hangSo = 3;
        long bienSo = 0;
        while(true){
            System.out.println("Enter a Number to test if Prime or Not (1 to exit)");
            hangSo = nhapVao.nextLong();
            if(hangSo < 3){
                if(hangSo == 2){
                    System.out.println("2 is a special prime");
                }
                return;
            }
            if(hangSo % 2 == 0){
                System.out.println(hangSo + " is NOT a prime number, even number.");
            }else{
            	bienSo = (long)Math.pow(hangSo, 0.5);
            	bienSo = (bienSo % 2 == 1) ? bienSo : bienSo + 1;//odd number
                double answer = 0.0;
                answer = testPrime(hangSo, bienSo);
                System.out.println("End answer : " + answer);
                if (answer == 1){
                    System.out.println(+hangSo + " is a prime number. answer : "  + answer);
                }
                else{
                    System.out.println(hangSo + " is NOT a prime number.answer : "  + answer);
                }
            }
            System.out.println();
        }
    }

    static double testPrime(long number, long divide)
    {
        double prime = 0.0;
        prime = (double)number / divide;
        if(debug > 0){
            System.out.println("Debug number " + number + " | divide " + divide + " |prime : "  + prime + " | Math.abs(prime) " + Math.abs(prime));
        }
        if (prime == ((long)prime))//whats the best way to do this?
        {
            //divided evenly
            return divide;
        }
        else{
            return testPrime(number, divide - 2);
        }
    }
}
