package thucHanhJavaBasic3;
import java.util.Scanner;
public class JavaBasic3_0 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			// System.out.println("Nhập vào số nguyên : ");
			// int x = input.nextInt();
			// while(x!=0){
			// System.out.println("Nhập vào số nguyên : ");
			// x = input.nextInt();
			// }

			int number, sum = 0, count = 0, max = Integer.MIN_VALUE;
			do {
				System.out.print("Nhap vao so nguyen : ");
				number = input.nextInt();
				if (max < number)
					max = number;
				sum += number;
				count++;
			} while (number != 0);
			System.out.println("Tong cua cac so vua nhap la:" + sum);
			System.out.println("TB cong cua cac so vua nhap la: " + (double) sum/--count);
			System.out.println("Gia tri lon nhat cua cac so vua nhap la: " + max);
		}
	}


