package demo2;

import java.util.ArrayList;

public class State {

	private enum Position {
		LEFT, RIGHT
	};

	int missionaryLeft;
	int cannibalLeft;
	int missionaryRight;
	int cannibalRight;
	Position boat = Position.LEFT;

	ArrayList<State> path = new ArrayList<State>();
	StateArray previousStates = new StateArray();

	public State(int mL, int cL, int mR, int cR) {
		missionaryLeft = mL;
		cannibalLeft = cL;
		missionaryRight = mR;
		cannibalRight = cR;
	}

	public State(int mL, int cL, int mR, int cR, Position b, StateArray sA, ArrayList<State> p) {
		missionaryLeft = mL;
		cannibalLeft = cL;
		missionaryRight = mR;
		cannibalRight = cR;
		boat = b;
		previousStates = sA;
		path = p;
	}

	public boolean kiemTraRangBuoc() {
		if (missionaryLeft >= 0 && cannibalLeft >= 0 && missionaryRight >= 0 && cannibalRight >= 0
				&& (missionaryLeft == 0 || missionaryLeft >= cannibalLeft)
				&& (missionaryRight == 0 || missionaryRight >= cannibalRight))
			return true;
		else
			return false;
	}

	public boolean trangThaiDich() {
		if (missionaryLeft == 0 && cannibalLeft == 0)
			return true;
		else
			return false;

	}

	public void chonTrangThaiMoRong(ArrayList<State> list, State state) {
		if (state.kiemTraRangBuoc() && !state.previousStates.contain(state)) {
			list.add(state);
		}
	}

	public ArrayList<State> trangThaiDiChuyen() {
		ArrayList<State> successors = new ArrayList<State>();

		if (boat == Position.LEFT) {
			chonTrangThaiMoRong(successors, new State(missionaryLeft - 1, cannibalLeft - 1, missionaryRight + 1,
					cannibalRight + 1, Position.RIGHT, previousStates, path));
			chonTrangThaiMoRong(successors, new State(missionaryLeft, cannibalLeft - 1, missionaryRight, cannibalRight + 1,
					Position.RIGHT, previousStates, path));
			chonTrangThaiMoRong(successors, new State(missionaryLeft - 1, cannibalLeft, missionaryRight + 1, cannibalRight,
					Position.RIGHT, previousStates, path));
			chonTrangThaiMoRong(successors, new State(missionaryLeft - 2, cannibalLeft, missionaryRight + 2, cannibalRight,
					Position.RIGHT, previousStates, path));
			chonTrangThaiMoRong(successors, new State(missionaryLeft, cannibalLeft - 2, missionaryRight, cannibalRight + 2,
					Position.RIGHT, previousStates, path));

		}

		if (boat == Position.RIGHT) {
			chonTrangThaiMoRong(successors, new State(missionaryLeft + 1, cannibalLeft + 1, missionaryRight - 1,
					cannibalRight - 1, Position.LEFT, previousStates, path));
			chonTrangThaiMoRong(successors, new State(missionaryLeft + 1, cannibalLeft, missionaryRight - 1, cannibalRight,
					Position.LEFT, previousStates, path));
			chonTrangThaiMoRong(successors, new State(missionaryLeft, cannibalLeft + 1, missionaryRight, cannibalRight - 1,
					Position.LEFT, previousStates, path));
			chonTrangThaiMoRong(successors, new State(missionaryLeft + 2, cannibalLeft, missionaryRight - 2, cannibalRight,
					Position.LEFT, previousStates, path));
			chonTrangThaiMoRong(successors, new State(missionaryLeft, cannibalLeft + 2, missionaryRight, cannibalRight - 2,
					Position.LEFT, previousStates, path));

		}

		for (State s : successors) {
			s.previousStates.add(this);
		}

		return successors;
	}

	@Override
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
