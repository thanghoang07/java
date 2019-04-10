package lab1;

public class Bai9_3 {
	public static void main(String[] args) {
		 
        double a = 3.2, b = 2, c = 4, S, p;
 
        p = (a+b+c)/2;
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
 
        System.out.println("S = " + S);
 
        System.out.println("So do 3 goc : ");
 
        double A = Math.asin(S/(0.5*b*c)), B = Math.asin(S/(0.5*a*c)), C = Math.asin(S/(0.5*a*b));
 
        System.out.println("So do goc A : " + Math.toDegrees(A));
        System.out.println("So do goc B : " + Math.toDegrees(B));
        System.out.println("So do goc C : " + Math.toDegrees(C));
    }

}
