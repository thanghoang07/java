package CuoiKy15;

public class Painting extends ArtObject {
	private String paintType, style;

	public Painting(String title, String artist, int year, String paintType,
			String style) {
		super(title, artist, year);
		this.paintType = paintType;
		this.style = style;
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "Painting [title=" + title + ", artist=" + artist + ", year="
				+ year + ", paintType=" + paintType + ", style=" + style + "]";
	}

}
