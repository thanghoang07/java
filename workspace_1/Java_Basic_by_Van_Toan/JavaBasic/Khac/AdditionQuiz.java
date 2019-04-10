package Khac;
import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number2 = (int) (System.currentTimeMillis() * 7 % 10);
		int number1 = (int) (System.currentTimeMillis() % 10);
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		
		int answer = input.nextInt();
		System.out.println(number1 + " + " + number2 + " = " +   answer + " is " + (number1 + number2 == answer));
	}
}
