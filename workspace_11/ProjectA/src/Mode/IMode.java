package Mode;

public interface IMode {
	public boolean checkMode();

	public boolean checkAction(String IdAccount);

	public boolean checkActionDevice(String IdAccount, String IdDevice);

	public void getModeAccount(String IdAccount);
}
