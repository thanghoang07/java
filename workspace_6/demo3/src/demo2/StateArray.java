package demo2;

import java.util.ArrayList;

public class StateArray {
	private ArrayList<State> stateArray = new ArrayList<State>();

	public void add(State obj) {

		stateArray.add(obj);

	}

	public boolean contain(State obj) {

		for (State s : stateArray) {

			if (s.equals(obj))
				return true;

		}

		return false;

	}

}
