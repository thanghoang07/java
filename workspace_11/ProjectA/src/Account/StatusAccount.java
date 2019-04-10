package Account;

public class StatusAccount {
	private int type;
	private String name;

	public StatusAccount(int type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StatusAccount [type=" + type + ", name=" + name + "]";
	}

}
