package CuoiKy15;

public abstract class ArtObject implements Comparable{
	protected String artist, title;
	protected int year;

	public ArtObject(String title, String artist, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "ArtObject [artist=" + artist + ", title=" + title + ", year="
				+ year + "]";
	}
	@Override
	public int compareTo(Object arg0) {
		ArtObject a1 = (ArtObject) arg0;
		return this.title.compareToIgnoreCase(a1.title);
	}
}
