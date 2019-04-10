package lab5_by_Van_Toan;

public class InfixToPostfix {
	public static String convertToPostfix(String infix) {
		StringBuilder output = new StringBuilder();
		String[] tokens = infix.split(" ");
		ArrayStack<String> stak = new ArrayStack<>(infix.length());

		for (String token : tokens) {
			if (token.equals("(")) {
				stak.push(token);
			} else if (token.equals(")")) {
				while (!(stak.top().equals("(")) && !(stak.isEmpty())) {
					output.append(stak.pop());
				}
				if (stak.top().equals("(")) {
					stak.pop();
				}
			} else if (isOperator(token)) {
				if (stak.isEmpty())
					stak.push(token);
				else {
					if (doUuTien(token) <= doUuTien(stak.top())) {
						output.append(stak.pop());
						stak.push(token);
					} else
						stak.push(token);
				}
			} else
				output.append(token);
		}
		while (!stak.isEmpty()) {
			output.append(stak.pop());
		}
		return output.toString();
	}

	public static boolean isOperator(String token) {
		return (token.equals("+") || 
				token.equals("-") || 
				token.equals("*") || 
				token.equals("/"));
	}

	public static int doUuTien(String token) {
		
		if (token.equals("*") || token.equals("/"))
			return 2;
		else if (token.equals("+") || token.equals("-"))
			return 1;
		else
			return 0;
	}

}
