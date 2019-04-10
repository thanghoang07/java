//in mang
package _Array;

public class Bai1_22_09_15 
{    
	public static void main(String[] args) 
	{  
		//declaration and instantiation
		int a_array[][] = new int[6][2];
		//initialization
		a_array[0][0] = 10;	 a_array[0][1] = 20; 
		a_array[1][0] = 30;	 a_array[1][1] = 40;
		a_array[2][0] = 50;	 a_array[2][1] = 60;
		a_array[3][0] = 70;	 a_array[3][1] = 80;
		a_array[4][0] = 90;	 a_array[4][1] = 100;
		a_array[5][0] = 110; a_array[5][1] = 120;
		//printing array
		
		for(int i_LaCot = 0; i_LaCot < a_array.length; i_LaCot++) 
		{
			for(int j_LaHang = 0; j_LaHang < a_array[i_LaCot].length; j_LaHang++)
			System.out.print("\t" + a_array[i_LaCot][j_LaHang] + " "); 
			System.out.println();
		}
	}
}