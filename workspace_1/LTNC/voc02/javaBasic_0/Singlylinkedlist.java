package javaBasic_0;

import java.util.Scanner;

public class Singlylinkedlist {
	public static void main(String args[ ]) {
		Linked list = new Linked();
		Scanner input = new Scanner(System.in);
		int op = 0;
		while(op != 4) {
			System.out.println("1. chen ||2. xoa ||3. in ra danh sach ||4. thoat");
			System.out.println("nhap de chon: ");
			op = Integer.parseInt(input.nextLine());
			switch(op) {
				case 1:
					System.out.println("Nhap so de chen vao Linked list:");
					list.chenVao(Integer.parseInt(input.nextLine()));
					break;

				case 2:
					list.delete();
					break;

				case 3:
					list.display();
					break;

				case 4:
					System.out.println("Bye!");
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice!");

			}
		}
	}
}
