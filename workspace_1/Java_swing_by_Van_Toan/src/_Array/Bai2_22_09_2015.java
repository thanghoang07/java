//copy mang
package _Array;

public class Bai2_22_09_2015
{
	public static void main(String[] args) 
	{
		char[] copyFrom = new char[13];//nhuoc diem de bi nham :v 
		copyFrom [0]  = 'd';	copyFrom [1]  = 'e';
		copyFrom [2]  = 'c';	copyFrom [3]  = 'a';
		copyFrom [4]  = 'f';	copyFrom [5]  = 'f';
		copyFrom [6]  = 'e';	copyFrom [7]  = 'i';
		copyFrom [8]  = 'n';	copyFrom [9]  = 'a';
		copyFrom [10] = 't';	copyFrom [11] = 'e';
		copyFrom [12] = 'd';
		//char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		char copyTo[] = new char[7];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));
	}
}
