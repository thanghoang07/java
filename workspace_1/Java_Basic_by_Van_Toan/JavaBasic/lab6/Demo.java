package lab6;

public class Demo {
	public static void main(String[] args) {
		String str = "  truong     van         qui           ";
		while (str.indexOf("  ") != -1)
			str = str.replaceAll("  ", " ");
		System.out.println(str);
	}
}
