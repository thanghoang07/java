import java.util.Scanner;

public class TestLinkedList
{
	private static Scanner nhapVao;

	public static void main(String[] args)
	{
		LinkedList<Integer> testLList = new LinkedList<Integer>();
		
		System.out.print("1.Danh sach lien ket la: \n");
		// them vao
		testLList.themVaoDau(3);
		testLList.chenVaoDiemBatKy(0, 1);
		testLList.chenVaoDiemBatKy(4, 2);
		testLList.chenVaoDiemBatKy(5, 3);
		testLList.chenVaoDiemBatKy(7, 4);
		testLList.chenVaoDiemBatKy(8, 5);
		testLList.chenVaoDiemBatKy(1, 6);
		testLList.chenVaoDiemBatKy(6, 7);
		testLList.chenVaoDiemBatKy(9, 8);
		testLList.chenVaoCuoi(2);		
		testLList.inRa();
		//lay khich thuoc
		System.out.print("Khich thuoc cua danh sach lien ket: \n" 
				+ testLList.size() + "\n");
		//chen vao vi tri bat ky
		nhapVao = new Scanner(System.in);		
		System.out.println("Nhap so de chen: ");
		int num = nhapVao.nextInt();
		System.out.println("Nhap vi tri chen: ");
		int viTri = nhapVao.nextInt();
		if (viTri <= 1 )
		{
			testLList.themVaoDau(num);
			System.out.print("In ra danh sach lien ket da chen: \n");
			testLList.inRa();
			System.out.print("Khich thuoc cua danh sach lien ket: \n" 
					+ testLList.size() + "\n");
		}
		else if(viTri > testLList.size())
		{
			testLList.chenVaoCuoi(num);
			System.out.print("In ra danh sach lien ket da chen: \n");
			testLList.inRa();
			System.out.print("Khich thuoc cua danh sach lien ket: \n" 
					+ testLList.size() + "\n");
		}
		else
		{
			testLList.chenVaoDiemBatKy(num, viTri);
			System.out.print("In ra danh sach lien ket da chen: \n");
			testLList.inRa();
			System.out.print("Khich thuoc cua danh sach: \n" 
					+ testLList.size() + "\n");
		}		
		//Xoa mot Node
		System.out.println("Nhap vi tri de xoa: ");
		int viTri1 = nhapVao.nextInt();
		testLList.xoaDi(viTri1);
		System.out.print("In ra danh sach lien ket da xoa: \n");
		testLList.inRa();
		System.out.print("Khich thuoc cua danh sach lien ket: \n" 
				+ testLList.size() + "\n");
		//toString
		System.out.println("8.In danh sach lien ket theo toString\n" 
				+ testLList.toString());
	}
}
