package docFileCSV;

import java.io.File;

public class Main {
	private static String[] author;
	private static String[] book;

	public static void main(String[] args) throws Exception {
		ReadCVS obj = new ReadCVS();
		/*File file = obj.docFile();
		author = obj.readAuthorCSV(file);
		obj.printAuthor(author);*/
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
		File file2 = obj.docFile();
		book = obj.readBookCSV(file2);
		obj.printBook(book);
	}
}
