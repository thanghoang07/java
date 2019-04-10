package lcd;

public class Test {
	public static void main(String[] args) {
		LCD stream = new Authenticate(new Scramble(new Core()));
		String[] str = { new String() };
		stream.write(str);
		System.out.println("main:     " + str[0]);
		stream.read(str);
	}
}
