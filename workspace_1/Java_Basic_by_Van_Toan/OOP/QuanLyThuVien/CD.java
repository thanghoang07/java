package QuanLyThuVien;

public class CD extends LibraryItem {
	private String artist;

	public CD(int catID, String title, int dueDays, String artist) {
		super(catID, title, dueDays);
		this.artist = artist;
	}

}
