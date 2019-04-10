package Device;

public class DetailDevice {
	private String idDevice, image, description;
	private float price;
	private String linkWeb;

	public DetailDevice(String idDevice, String image, String description, float price, String linkWeb) {
		super();
		this.idDevice = idDevice;
		this.image = image;
		this.description = description;
		this.price = price;
		this.linkWeb = linkWeb;
	}

	public String getIdDevice() {
		return idDevice;
	}

	public void setIdDevice(String idDevice) {
		this.idDevice = idDevice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLinkWeb() {
		return linkWeb;
	}

	public void setLinkWeb(String linkWeb) {
		this.linkWeb = linkWeb;
	}

	@Override
	public String toString() {
		return "DetailDevice [idDevice=" + idDevice + ", image=" + image + ", description=" + description + ", price="
				+ price + ", linkWeb=" + linkWeb + "]";
	}

}
