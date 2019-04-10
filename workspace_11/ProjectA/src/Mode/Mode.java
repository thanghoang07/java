package Mode;

import Account.Account;
import Controls.Datetime;
import Garden.Garden;

/*chế độ của khu vườn*/
public class Mode implements IMode {
	private String id;
	private ModeType type;
	private Account account;
	private Garden garden;
	private StatusMode status;
	private Datetime startTime, endTime;

	public Mode(String id, ModeType type, Account account, Garden garden, StatusMode status, Datetime startTime,
			Datetime endTime) {
		super();
		this.id = id;
		this.type = type;
		this.account = account;
		this.garden = garden;
		this.status = status;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Mode [id=" + id + ", type=" + type + ", account=" + account + ", garden=" + garden + ", status="
				+ status + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ModeType getType() {
		return type;
	}

	public void setType(ModeType type) {
		this.type = type;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Garden getGarden() {
		return garden;
	}

	public void setGarden(Garden garden) {
		this.garden = garden;
	}

	public StatusMode getStatus() {
		return status;
	}

	public void setStatus(StatusMode status) {
		this.status = status;
	}

	public Datetime getStartTime() {
		return startTime;
	}

	public void setStartTime(Datetime startTime) {
		this.startTime = startTime;
	}

	public Datetime getEndTime() {
		return endTime;
	}

	public void setEndTime(Datetime endTime) {
		this.endTime = endTime;
	}

	@Override
	public boolean checkMode() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkAction(String IdAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkActionDevice(String IdAccount, String IdDevice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getModeAccount(String IdAccount) {
		// TODO Auto-generated method stub

	}

}
