package _Array;

public class Bai5_23_09_2015
{
	public static void main(String[] args) 
	{
		int arr[] = {940, 880, 790, 750, 660, 650, 590, 510,440 };
		
		int b_arr[] = arr.clone();//sao chep mang
		for(int i = 0; i < arr.length; i++)
				System.out.print("|" + b_arr[i] + "|");
		
		int c_arr[] = arr.clone();//thay the phan tu trong mang
		c_arr[3] = 500;
		System.out.println("\n");
		for(int i = 0; i < arr.length; i++)
			System.out.print("|" + c_arr[i] + "|");
	}
}
