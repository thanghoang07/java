package CuoiKy15;

public class Sculputure extends ArtObject {
	private String materialFrom;
	private int height;
	private int weight;

	public Sculputure(String artist, String title, int year,
			String materialFrom, int height, int weight) {
		super(artist, title, year);
		this.materialFrom = materialFrom;
		this.height = height;
		this.weight = weight;
	}

	public String getMaterialFrom() {
		return materialFrom;
	}

	public void setMaterialFrom(String materialFrom) {
		this.materialFrom = materialFrom;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Sculputure [materialFrom=" + materialFrom + ", height="
				+ height + ", weight=" + weight + "]";
	}

}
