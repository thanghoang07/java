package Account;

public class Account implements IAccount {
	private String id, email, pass;
	private DetailAccount detailAccount;
	private AccountType accountType;

	public Account(String id, String email, String pass, DetailAccount detailAccount, AccountType accountType) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
		this.detailAccount = detailAccount;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", pass=" + pass + ", detailAccount=" + detailAccount
				+ ", accountType=" + accountType + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public DetailAccount getDetailAccount() {
		return detailAccount;
	}

	public void setDetailAccount(DetailAccount detailAccount) {
		this.detailAccount = detailAccount;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public Account getAccount(String idAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getAccountType(String idAccount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDetailAccount(String idAccount) {
		// TODO Auto-generated method stub

	}

}
