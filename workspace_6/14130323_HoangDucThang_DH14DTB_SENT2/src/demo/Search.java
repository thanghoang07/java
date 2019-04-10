package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Search {
	public State breadthFirstSearch(State initialState) {
		if (initialState.trangThaiDich()) {
			// neu la trang thai dich thi tra ve no
			return initialState;
		}

		Queue<State> frontier = new LinkedList<State>(); // FIFO queue chua trang thai dong
		Set<State> explored = new HashSet<State>(); // chua trang thai mo
		frontier.add(initialState); // them vao queue
		while (true) {
			if (frontier.isEmpty()) {
				return null; // failure
			}
			State state = frontier.poll(); // lay trang thai ra duyet
			// chen vao trang thai mo
			explored.add(state);

			ArrayList<State> successors = state.trangThaiDiChuyen(); // mang chua cac trang thai
			for (State child : successors) { // duyet 
				if (!explored.contains(child) || !frontier.contains(child)) {
					// neu trang thai mo rong ko chua trang thai con va trang thai dong cung vay
					if (child.trangThaiDich()) {
						// so sanh voi trang thai dich
						return child;
					}
					// chen vao trang thai dong
					frontier.add(child);
				}
			}
		}
	}
	
	public State depthFirstSearch(State initialState) {
		if (initialState.trangThaiDich()) {
			// neu la trang thai dich thi tra ve no
			return initialState;
		}
		Stack<State> frontier = new Stack<State>();// LIFO stack chua trang thai dong
		Set<State> explored = new HashSet<State>();// chua trang thai mo
		frontier.push(initialState);// them vao trang thai dong
		while (true) {
			if (frontier.isEmpty()) {
				return null; // failure
			}
			State state = frontier.pop(); // lay trang thai ra duyet
			// chen vao trang thai mo
			explored.add(state);
			ArrayList<State> successors = state.trangThaiDiChuyen();// mang chua cac trang thai
			for (State child : successors) {
				if (!frontier.contains(child)) {
					// neu trang thai mo rong ko chua trang thai con va trang thai dong cung vay
					if (child.trangThaiDich() || !explored.contains(child) ) {
						// so sanh voi trang thai dich
						return child;
					}					
					// chen vao trang thai dong
					frontier.push(child);
				}
			}
		}
	}

	public State depthLimitedSearch(State initialState) {
		int limit = 20; // dat gio han duyet
		return recursiveDLS(initialState, limit);
	}

	private State recursiveDLS(State state, int limit) {
		if (state.trangThaiDich()) {
			// neu la trang thai dich thi tra ve no
			return state;
		} else if (limit == 0) {
			// neu bang gio han thi ko tra ve gi 
			return null;
		} else {
			ArrayList<State> successors = state.trangThaiDiChuyen();// mang chua cac trang thai
			for (State child : successors) {// duyet de quy
				State result = recursiveDLS(child, limit - 1);
				if (null != result) {
					return result;
				}
			}
			return null;
		}
	}

	public State depthFirstSearch2(State initialState) {
		if (initialState.trangThaiDich()) {
			return initialState;
		}
		Stack<State> frontier = new Stack<State>(); // LIFO Stack
		Set<State> explored = new HashSet<State>();
		frontier.push(initialState);
		explored.add(initialState);
		while (true) {
			if (frontier.isEmpty()) {
				return null;
			}
			State state = frontier.pop();
			if (!explored.contains(state)) {
				explored.add(state);
			}			
			//
			if (!explored.contains(state)) {
				explored.add(state);
			}
			ArrayList<State> successors = state.trangThaiDiChuyen();
			for (State child : successors) {
				if (child.trangThaiDich()) {
					return child;
				}
				if (!explored.contains(child) || !frontier.contains(child)) {
					frontier.push(child);
					explored.add(child);
				}
			}
		}
	}

	
	
	public void printStack(Stack<State> state){
		 while (!state.isEmpty()) {
	         State value = state.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	}

	public void printState(State solution) {
		if (null == solution) {
			System.out.print("\nNo solution found.");
		} else {
			System.out.println("\nSolution (cannibalLeft,missionaryLeft,boat,cannibalRight,missionaryRight): ");
			ArrayList<State> path = new ArrayList<State>();
			State state = solution;
			while (null != state) {
				path.add(state);
				state = state.getParentState();
			}
			int depth = path.size() - 1;
			for (int i = depth; i >= 0; i--) {
				state = path.get(i);
				if (state.trangThaiDich()) {
					System.out.printf("State " + (i) + ": %s\n", state.toString());
				} else {
					System.out.printf("State " + (i) + ": %s\n", state.toString());
				}
			}
			System.out.println("\nSố bước: " + depth);
		}
	}

}
