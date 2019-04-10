package FinalExam2014;

public class CD extends LibraryItem {
	private String artist;

	public CD(int catID, String title, int dueDays, String artist) {
		super(catID, title, dueDays);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + "]";
	}

	@Override
	public int fine(int rentDays) {
		int tienPhat = 0;
		if (tienPhat <= 10000) {
			tienPhat = (rentDays - dueDays) * 2000;
		}
		return tienPhat;
	}

}
