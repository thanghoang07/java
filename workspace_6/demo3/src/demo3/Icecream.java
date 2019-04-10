package demo3;

public class Icecream {
	public String id, ten, mui;

	public Icecream(String id, String ten, String mui) {
		super();
		this.id = id;
		this.ten = ten;
		this.mui = mui;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMui() {
		return mui;
	}

	public void setMui(String mui) {
		this.mui = mui;
	}

	@Override
	public String toString() {
		return "Icecream [id=" + id + ", ten=" + ten + ", mui=" + mui + "]";
	}

}
