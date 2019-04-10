package QuanLyThuVien;

public class Book extends LibraryItem {
	private String category;
	private String author;
	private int publishedYear;

	public Book(int catID, String title, int dueDays, String category,
			String author, int publishedYear) {
		super(catID, title, dueDays);
		this.category = category;
		this.author = author;
		this.publishedYear = publishedYear;
	}


}
