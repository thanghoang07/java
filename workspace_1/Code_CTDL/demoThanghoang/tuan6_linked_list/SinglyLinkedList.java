package tuan6_linked_list;

import java.util.Scanner;

public class SinglyLinkedList
{
	private static Scanner nhapVao;

	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		
		linkedList dsLienKet = new linkedList();
		System.out.print("Danh Sach Lien Ket Test\n");
		char ch;
		
		do
		{
			System.out.println("\nDanh Sach Lien Ket\n");
			System.out.println("1. Chen Vao Dau: ");
			System.out.println("2. Chen Vao Cuoi: ");
			System.out.println("3. Chen Diem Bat Ky: ");
			System.out.println("4. Xoa Diem Bat Ky: ");
			System.out.println("5. Kiem Tra empty: ");
			System.out.println("6. Lay size: ");

			int choice = nhapVao.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("Nhap so de chen");
				dsLienKet.chenVaoDiemBatDau(nhapVao.nextInt());
				break;
			case 2:
				System.out.println("Nhap so de chen");
				dsLienKet.chenVaoDiemKetThuc(nhapVao.nextInt());
				break;
			case 3:
				System.out.println("Nhap so de chen");
				int num = nhapVao.nextInt();
				System.out.println("Nhap vi tri");
				int viTri = nhapVao.nextInt();
				if (viTri <= 1 || viTri > dsLienKet.getSize())
					System.out.println("vi tri khong hop le\n");
				else
					dsLienKet.chenVaoDiemBatKy(num, viTri);
				break;
			case 4:
				System.out.println("Nhap vi tri");
				int p = nhapVao.nextInt();
				if (p < 1 || p > dsLienKet.getSize())
					System.out.println("vi tri khong hop le\n");
				else
					dsLienKet.xoaDiemBatKy(p);
				break;
			case 5:
				System.out.println("Empty status = " + dsLienKet.isEmpty());
				break;
			case 6:
				System.out.println("Size = " + dsLienKet.getSize() + " \n");
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}		
			dsLienKet.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = nhapVao.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
