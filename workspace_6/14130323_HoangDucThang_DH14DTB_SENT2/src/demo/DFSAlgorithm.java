package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFSAlgorithm {
	public void search(ArrayList<State> array) throws Exception {
		for (State state : array) {
			if (state.trangThaiDich()) {
				for (State pathState : state.path)
					System.out.println(pathState.toString());
				System.out.println(state.toString() + "!");
				throw new Exception("DONE!");
			} else {
				state.path.add(state);
				search(state.trangThaiDiChuyen());
				state.path.remove(state);
			}
		}
	}

	public State exec(State initialState) {
		if (initialState.trangThaiDich()) {
			return initialState;
		}

		Stack<State> frontier = new Stack<State>(); // LIFO stack
		LinkedList<State> explored = new LinkedList<State>();
		frontier.push(initialState);
		while (true) {
			if (frontier.isEmpty()) {
				return null; // failure
			}
			State state = frontier.pop();
			explored.add(state);
			List<State> successors = state.trangThaiDiChuyen();
			for (State child : successors) {
				if (!explored.contains(child) || !frontier.contains(child)) {
					if (child.trangThaiDich()) {
						return child;
					}
					frontier.push(child);
				}
			}
		}
	}

}
