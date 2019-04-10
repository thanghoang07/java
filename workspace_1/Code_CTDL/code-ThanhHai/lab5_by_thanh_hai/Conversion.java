package lab5_by_thanh_hai;

import java.util.Scanner;

public class Conversion {
	public static void SoNhiPhan(int n){
		ArrayStack<Integer> binaryStack = new ArrayStack<Integer>(80);
		while(n != 0){
			int b = n %2;
			binaryStack.push(b);
			n /=2;
		}
		System.out.print("Ket qua he co so 2: ");
		while(!binaryStack.isEmpty()){
			System.out.print(binaryStack.pop());
		}
	}
	public static void BatPhan(int n){
		ArrayStack<Integer> octalStack = new ArrayStack<Integer>(80);
		while(n != 0){
			int c = n %8;
			octalStack.push(c);
			n /=8;
		}
		System.out.print("\nKet qua he co so 8: ");
		while(!octalStack.isEmpty()){
			System.out.print(octalStack.pop());
		}
	}
	
}
