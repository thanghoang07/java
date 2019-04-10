package lab5_by_Van_Toan;

import java.util.Scanner;

public class CalPostFix {
	/*
	 * input: chuoi ky tu (postFix)
	 * ouput: 1 so nguyen
	 */
	public static int calculate(String postFix) {
		
		//khoi tao stack de luu tru 
		ArrayStack<Integer> intStack = new ArrayStack<Integer>(postFix.length());
		Scanner input = new Scanner(postFix);
		
		// kiem tra co con token nao trong chuoi khong va dau cach dung de phan cach cac token
		while (input.hasNext()) {
			//kiem tra token do co phai la so nguyen hay khong, neu dung thi cho vao stack
			if (input.hasNextInt()) {
				intStack.push(input.nextInt());
			} else {
				int operand2 = intStack.pop();
				int operand1 = intStack.pop();
				String operator = input.next();

				switch (operator) {
				case "+":
					intStack.push(operand1 + operand2);
					break;
				case "-":
					intStack.push(operand1 - operand2);
					break;
				case "*":
					intStack.push(operand1 * operand2);
					break;
				case "/":
					intStack.push(operand1 / operand2);
					break;
				}
			}

		}
		return intStack.pop();
	}
}
