package tuan8_3_stack;

import java.util.Scanner;

public class Bai4 {

	public static double evaluate(String expression) {

		Scanner nhapVao = new Scanner(expression);

		ArrayStack<Double> toanHang = new ArrayStack<Double>(10);

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

	public static void main(String[] args) {
		System.out.println("nhap vao mot day  postfix can tinh: ");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		scanner.close();
		System.out.println("day postfix la: " + inputStr);
		System.out.println("ket qua: " + Bai4.evaluate(inputStr));
	}

}
