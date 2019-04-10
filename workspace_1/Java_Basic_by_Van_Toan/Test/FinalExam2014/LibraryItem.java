package FinalExam2014;

public abstract class LibraryItem implements Comparable {
	protected int catID;
	protected String title;
	protected int dueDays;

	public LibraryItem(int catID, String title, int dueDays) {
		super();
		this.catID = catID;
		this.title = title;
		this.dueDays = dueDays;
	}

	public int getCatID() {
		return catID;
	}

	public void setCatID(int catID) {
		this.catID = catID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDueDays() {
		return dueDays;
	}

	public void setDueDays(int dueDays) {
		this.dueDays = dueDays;
	}

	@Override
	public String toString() {
		return "LibraryItem [catID=" + catID + ", title=" + title
				+ ", dueDays=" + dueDays + "]";
	}

	public abstract int fine(int rentDays);

	@Override
	public int compareTo(Object arg0) {
		LibraryItem a1 = (LibraryItem) arg0;
		return this.title.compareToIgnoreCase(a1.title);
	}
}
