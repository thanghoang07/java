package isLucky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// nhap mot so ngau nhien neu tong nua dau cua so bang tong nua sau thi chung la so may man
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so: ");
		int n = sc.nextInt();
		MainTest ms = new MainTest();
		System.out.println("1 ==> " + ms.isLucky1(n));
		System.out.println("2 ==> " + ms.isLucky2(n));
		System.out.println("3 ==> " + ms.isLucky3(n));
		System.out.println("4 ==> " + ms.isLucky4(n));
		System.out.println("5 ==> " + ms.isLucky5(n));
	}

	//
	public boolean isLucky1(int n) {
		int sum = 0;
		String s = Integer.toString(n);
		int length = s.length() / 2;
		//
		for (int i = 0; i < length; i++) {
			sum = sum + Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i + length));
			System.out.println(
					Character.getNumericValue(s.charAt(i)) + " | " + Character.getNumericValue(s.charAt(i + length)));
		}
		/*
		 * if (sum == 0) { return true; } else { return false; }
		 */
		return sum == 0;
	}

	public boolean isLucky2(int n) {
		String strN = Integer.toString(n);
		int length = strN.length() / 2;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < strN.length(); i++)
			if (i < length) { // chia chuoi lam hai
				sum1 = sum1 + Character.getNumericValue(strN.charAt(i)); // cong cac phan tu trong chuoi ben trai
			} else {
				sum2 = sum2 + Character.getNumericValue(strN.charAt(i)); // cong cac phan tu trong chuoi ben phai
			}
		// if (sum1 == sum2) {
		// System.out.println(sum1 + " | " + sum2);
		// return true;
		// } else
		// return false;
		System.out.println(sum1 + " | " + sum2);
		return sum1 == sum2;
	}

	public boolean isLucky3(int n) { // chuyen ve mang char
		Integer i = n;
		char[] chars = i.toString().toCharArray();

		int leftSum = 0;
		int rightSum = 0;

		for (i = 0; i < chars.length / 2; i++) {
			leftSum += chars[i] - '0';
			rightSum += chars[chars.length - i - 1] - '0';
		}

		System.out.println(leftSum + " | " + rightSum);
		return leftSum == rightSum;
	}

	public boolean isLucky4(int n) {
		String s = Integer.toString(n);
		String s1 = s.substring(0, s.length() / 2);
		String s2 = s.substring(s.length() / 2);
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(Character.getNumericValue(a[i]) + " | " + Character.getNumericValue(b[i]));
			sum += Character.getNumericValue(a[i]);
			sum -= Character.getNumericValue(b[i]);
		}

		return sum == 0;
	}

	public boolean isLucky5(int n) {
		int sum1 = 0;
		int sum2 = 0;
		List<Integer> digits = new ArrayList<Integer>();
		while (n > 0) {
			digits.add(n % 10);
			n = n / 10;
		}
		for (int i = 0; i < digits.size() / 2; i++) {
			sum1 = sum1 + (int) digits.get(i);
			sum2 = sum2 + (int) digits.get(i + digits.size() / 2);
		}

		return sum1 == sum2;
	}
}
