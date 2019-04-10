package lab5_stack_by_thang_hoang;

import java.util.Scanner;

public class PostFix {

	public static double evaluate(String expression) {

		Scanner nhapVao = new Scanner(expression);

		ArrayStack<Double> toanHang = new ArrayStack<Double>(expression.length());

		while (nhapVao.hasNext()) {

			if (nhapVao.hasNextDouble()) {
				toanHang.push(nhapVao.nextDouble());
			} else {
				double operand2 = (double) toanHang.pop();
				double operand1 = (double) toanHang.pop();
				String operator = nhapVao.next();

				switch (operator) {
				case "+":
					toanHang.push(operand1 + operand2);
					break;
				case "-":
					toanHang.push(operand1 - operand2);
					break;
				case "*":
					toanHang.push(operand1 * operand2);
					break;
				case "/":
					toanHang.push(operand1 / operand2);
					break;
				case "^":
					toanHang.push(Math.pow(operand1, operand2));
					break;
				}
			}
		}
		nhapVao.close();
		return (double) toanHang.pop();
	}
}
