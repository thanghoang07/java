package vacworld;

import java.util.Random;

import vacworld.GoForward;
import vacworld.ShutOff;
import vacworld.SuckDirt;
import vacworld.TurnLeft;
import vacworld.TurnRight;
import vacworld.VacPercept;
import agent.Action;
import agent.Agent;
import agent.Percept;

public class VacAgent extends Agent {
	private boolean seeDirt = false; // phat hien bui
	private boolean seeObstacle = false; // phat hien vat can
	private boolean turnLeft = false; // qua trai
	private boolean turnRight = false; // qua phai
	private boolean goForward = false; // quay lai
	private boolean shutOff = false; // tat may
	private boolean goHome = false; // ve nha
	private Random r = new Random();

	private int dirtCount = 0; // dem so bui
	// gioi han so buoc
	private int moveLimit = 200;
	// gioi han so lan lap
	private int loopLimit = 3; // lam them cai nay
	// tao bien dem so buoc
	private int numMoves = 0;

	@Override
	public void see(Percept p) {
		dirtCount = VacuumState.countDirtyLocs();
		numMoves++;
		VacPercept vp = (VacPercept) p;
		if (vp.seeDirt()) { // gap bui
			this.seeDirt = true; // gan gia tri bang true
			dirtCount--;
			return;
		} else if (vp.seeObstacle()) { // gap vat can
			this.seeObstacle = true;
			ranDomAction();
			return;
		} else if (vp.feelBump()) { // dung vat can
			ranDomAction();
			return;
		} else if (numMoves >= moveLimit) {
			// qua_so_buoc_quy_dinh_hoac_hut_het_bui_thi_dung
			this.shutOff = true;
			return;
		} else if (dirtCount == 0) {
			// nhin thay diem bat dau thi lam gi??
			home();
			return;
		} else {
			this.goForward = true;
			return;
		}
	}

	public void home() {
		this.shutOff = true;
		this.goHome = true;
	}

	public void ranDomAction() {
		int abc = r.nextInt(10);
		if (abc < 5)
			this.turnRight = true;
		else
			this.turnLeft = true;
	}

	@Override
	public Action selectAction() {
		VacuumState vs = new VacuumState();
		if (this.seeDirt) { // gap bui
			this.seeDirt = false;
			return new SuckDirt();
		}
		if (this.seeObstacle) { // gap vat can
			this.seeObstacle = false;
			if (this.turnRight) {
				this.turnRight = false;
				return new TurnRight();
			}
			if (this.turnLeft) {
				this.turnLeft = false;
				return new TurnLeft();
			}
		}
		if (this.goForward) {
			this.goForward = false;
			return new GoForward();
		}
		if (this.goHome) {
			if ((vs.getAgentX() == VacuumState.INIT && vs.getAgentY() == VacuumState.INIT)) {
				this.goHome = false;
				this.shutOff = false;
				return new ShutOff();
			}
		}
		if (this.shutOff) {
			this.shutOff = false;
			return new ShutOff();
		}
		// ngoai cac truong hop tren
		return null;

	}

	@Override
	public String getId() {
		return "Random Agent";
	}
}
