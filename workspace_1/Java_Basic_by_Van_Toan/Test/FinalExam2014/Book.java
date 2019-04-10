package FinalExam2014;

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public String toString() {
		return "Book [category=" + category + ", author=" + author
				+ ", publishedYear=" + publishedYear + "]";
	}

	@Override
	public int fine(int rentDays) {
		int tienPhat = 0;
		if (tienPhat <= 50000) {
			tienPhat = (rentDays - dueDays) * 4000;
		}
		return tienPhat;
	}

}
