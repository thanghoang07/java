package QuanLyThuVien;

public class Magazine extends LibraryItem {
	private int volume;
	private int no;

	public Magazine(int catID, String title, int dueDays, int volume, int no) {
		super(catID, title, dueDays);
		this.volume = volume;
		this.no = no;
	}

}
