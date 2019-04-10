package Khac;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		// tao so xo
		int lottery = (int) (Math.random() * 100);
		// yeu cau nguoi dung nhap 1 so du doan
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		// lay so tu so ngau nhien
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		// lay so tu so doan
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		System.out.println("The lottery number is " + lottery);
		// kiem tra so du doan
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
	}
}
