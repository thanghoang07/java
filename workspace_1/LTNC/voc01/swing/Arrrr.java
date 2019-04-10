package swing;

import java.util.Arrays;

public class Arrrr 
{
	public static void main(String[] args)
	{
		int mang_c_1[] = new int[8];
			mang_c_1[0] = 1; mang_c_1[1] = 3;
			mang_c_1[2] = 5; mang_c_1[3] = 7;
			mang_c_1[4] = 9; mang_c_1[5] = 0;
			mang_c_1[6] = 2; mang_c_1[7] = 4;
		Arrays.fill(mang_c_1, 2, 4, 0);
		int i;
		int n;
		for (i = 0, n = mang_c_1.length; i < n; i++)
			System.out.println(mang_c_1[i]);
	}
}
