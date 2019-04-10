package Account;

public interface IAccount {
	public void registerAccount();

	public Account getAccount(String idAccount);

	public void getAccountType(String idAccount);

	public void getDetailAccount(String idAccount);
}
