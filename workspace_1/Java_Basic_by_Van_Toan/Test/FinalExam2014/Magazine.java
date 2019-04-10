package FinalExam2014;

public class Magazine extends LibraryItem {
	private int volume;
	private int no;

	public Magazine(int catID, String title, int dueDays, int volume, int no) {
		super(catID, title, dueDays);
		this.volume = volume;
		this.no = no;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Magazine [volume=" + volume + ", no=" + no + "]";
	}

	@Override
	public int fine(int rentDays) {
		return (rentDays - dueDays) * 1000;
	}

}
