package Device;

public class DeviceType {
	private int type;
	private String value;

	public DeviceType(int type, String value) {
		super();
		this.type = type;
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "DeviceType [type=" + type + ", value=" + value + "]";
	}

}
