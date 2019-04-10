package demo;

import java.util.ArrayList;
import java.util.List;

//Di chuyen 3 Nha tu sy va 3 con thu an thit nguoi tu bo song ben trai sang bo song ben phai
/*Luat di chuyen nhu sau:
•	<1 0> moving 1 missionary and 0 cannibal from one side to another
•	<2 0> moving 2 missionary and 0 cannibal from one side to another
•	<1 1> moving 1 missionary and 1 cannibal from one side to another
•	<0 1> moving 0 missionary and 1 cannibal from one side to another
•	<0 2> moving 0 missionary and 2 cannibal from one side to another
 * Khong duoc de thuyen trong khi boi tu bo song trai sang phai hoac nguoc lai
 * Khong de ben bo song trai hoac phai co so con thu an thit lon hon so nguoi Tu Sy
 * */

enum Position {
	RIGHT, LEFT
}// Vi tri cua 2 bo song

public class State {

	private int cannibalLeft; // so con thu an thit bo song ben trai
	private int missionaryLeft;// so Nguoi tu sy bo song ben trai
	private int cannibalRight; // so con thu an thit bo song ben phai
	private int missionaryRight;// so Nguoi tu sy bo song ben phai
	private Position boat; // vi tri dat chiec thuyen

	private State parentState;// trang thai truoc
	ArrayList<State> path = new ArrayList<State>();

	public State(int cannibalLeft, int missionaryLeft, Position boat, int cannibalRight, int missionaryRight) {
		this.cannibalLeft = cannibalLeft;
		this.missionaryLeft = missionaryLeft;
		this.boat = boat;
		this.cannibalRight = cannibalRight;
		this.missionaryRight = missionaryRight;
	}

	// Trang Thai dich
	public boolean trangThaiDich() {
		return cannibalRight == 0 && missionaryRight == 0;
	}

	// kiem tra co dung yeu cau bai toan
	// (so nha Tu Sy va con Thu >=0; so nha tu sy>=con thu
	public boolean kiemTraRangBuoc() {
		if (missionaryLeft >= 0 && missionaryRight >= 0 && cannibalLeft >= 0 && cannibalRight >= 0
				&& (missionaryLeft == 0 || missionaryLeft >= cannibalLeft)
				&& (missionaryRight == 0 || missionaryRight >= cannibalRight)) {
			return true;
		}
		return false;
	}

	// Hanh dong di chuyen (trang thai mo rong)
	public ArrayList<State> trangThaiDiChuyen() {
		ArrayList<State> successors = new ArrayList<State>();
		if (boat == Position.LEFT) {
			// di chuyen 2 tu sy tu trai sang phai.
			chonTrangThaiMoRong(successors,
					new State(cannibalLeft, missionaryLeft - 2, Position.RIGHT, cannibalRight, missionaryRight + 2));
			// di chuyen 2 con thu an thit nguoi tu trai sang phai.
			chonTrangThaiMoRong(successors,
					new State(cannibalLeft - 2, missionaryLeft, Position.RIGHT, cannibalRight + 2, missionaryRight));
			// di chuyen 1 tu sy va 1 con thu an thit nguoi tu trai sang phai.
			chonTrangThaiMoRong(successors, new State(cannibalLeft - 1, missionaryLeft - 1, Position.RIGHT,
					cannibalRight + 1, missionaryRight + 1));
			// di chuyen 1 tu sy tu trai sang phai.
			chonTrangThaiMoRong(successors,
					new State(cannibalLeft, missionaryLeft - 1, Position.RIGHT, cannibalRight, missionaryRight + 1));
			// di chuyen 1 con thu an thit nguoi tu trai sang phai
			chonTrangThaiMoRong(successors,
					new State(cannibalLeft - 1, missionaryLeft, Position.RIGHT, cannibalRight + 1, missionaryRight));
		} else {// boat==Position.RIGHT
			// di chuyen 2 tu sy tu phai sang trai.
			chonTrangThaiMoRong(successors,
					new State(cannibalLeft, missionaryLeft + 2, Position.LEFT, cannibalRight, missionaryRight - 2));
			// di chuyen 2 con thu an thit nguoi tu phai sang trai.
			chonTrangThaiMoRong(successors,
					new State(cannibalLeft + 2, missionaryLeft, Position.LEFT, cannibalRight - 2, missionaryRight));
			// di chuyen 1 tu sy va 1 con thu an thit nguoi tu phai sang trai.
			chonTrangThaiMoRong(successors, new State(cannibalLeft + 1, missionaryLeft + 1, Position.LEFT,
					cannibalRight - 1, missionaryRight - 1));
			// di chuyen 1 tu sy tu phai sang trai.
			chonTrangThaiMoRong(successors,
					new State(cannibalLeft, missionaryLeft + 1, Position.LEFT, cannibalRight, missionaryRight - 1));
			// di chuyen 1 con thu an thit nguoi tu phai sang trai.
			chonTrangThaiMoRong(successors,
					new State(cannibalLeft + 1, missionaryLeft, Position.LEFT, cannibalRight - 1, missionaryRight));
		}
		return successors;
	}

	// Kiem tra yeu cau bai toan và dung thi them vao
	private void chonTrangThaiMoRong(List<State> successors, State newState) {
		if (newState.kiemTraRangBuoc()) {
			newState.setParentState(this);
			successors.add(newState);
		}
	}

	public int getCannibalLeft() {
		return cannibalLeft;
	}

	public void setCannibalLeft(int cannibalLeft) {
		this.cannibalLeft = cannibalLeft;
	}

	public int getMissionaryLeft() {
		return missionaryLeft;
	}

	public void setMissionaryLeft(int missionaryLeft) {
		this.missionaryLeft = missionaryLeft;
	}

	public int getCannibalRight() {
		return cannibalRight;
	}

	public void setCannibalRight(int cannibalRight) {
		this.cannibalRight = cannibalRight;
	}

	public int getMissionaryRight() {
		return missionaryRight;
	}

	public void setMissionaryRight(int missionaryRight) {
		this.missionaryRight = missionaryRight;
	}

	public State getParentState() {
		return parentState;
	}

	public void setParentState(State parentState) {
		this.parentState = parentState;
	}

	public boolean equals(Object obj) {
		State state = (State) obj;
		if (this.missionaryLeft == state.missionaryLeft && this.cannibalLeft == state.cannibalLeft
				&& this.missionaryRight == state.missionaryRight && this.cannibalRight == state.cannibalRight
				&& this.boat == state.boat)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		if (boat == Position.LEFT) {
			return "(" + cannibalLeft + "," + missionaryLeft + ",L," + cannibalRight + "," + missionaryRight + ")";
		} else {
			return "(" + cannibalLeft + "," + missionaryLeft + ",R," + cannibalRight + "," + missionaryRight + ")";
		}
	}

}
