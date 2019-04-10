/*
 * The MIT License
 *
 * Copyright 2017 mhrimaz.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package knighttourfx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.function.Function;

/**
 *
 * @author mhrimaz
 */
public class SearchAgent {

	private static Position getMin(ArrayState state, List<Position> allPosition) {
		int min = Integer.MAX_VALUE;
		Position minPosition = null;
		Iterator<Position> iterator = allPosition.iterator();
		while (iterator.hasNext()) {
			Position next = iterator.next();
			int allPossibleMoves = state.allPossibleMoves(next);
			if (min > allPossibleMoves) {
				min = allPossibleMoves;
				minPosition = next;
			}
		}
		return minPosition;
	}

	private Search dfs = (initState, status) -> {

		Stack<ArrayState> stack = new Stack<>();
		stack.add(initState);
		while (!stack.isEmpty()) {
			ArrayState pop = stack.pop();
			status.setVisitedNode(status.getVisitedNode() + 1);
			List<Position> allPossibleMoves = pop.getAllPossiblePositions();
			for (Position nextMove : allPossibleMoves) {
				ArrayState newState = pop.moveTo(nextMove);
				if (newState.isPathExist()) {
					return newState;
				}
				status.setExpandedNode(status.getExpandedNode() + 1);
				stack.push(newState);
			}
		}
		return null;
	};

	private Search bfs = (initState, status) -> {
		Queue<ArrayState> queue = new LinkedList<>();
		queue.add(initState);
		while (!queue.isEmpty()) {
			ArrayState pop = queue.remove();
			status.setVisitedNode(status.getVisitedNode() + 1);
			List<Position> allPossibleMoves = pop.getAllPossiblePositions();
			for (Position nextMove : allPossibleMoves) {
				ArrayState newState = pop.moveTo(nextMove);
				if (newState.isPathExist()) {
					return newState;
				}
				status.setExpandedNode(status.getExpandedNode() + 1);
				queue.add(newState);
			}
		}
		return null;
	};

	private Search ucs = (initState, status) -> {
		Queue<ArrayState> queue = new PriorityQueue<>((ArrayState o1, ArrayState o2) -> {
			return Integer.compare(o1.getMoveNumber(), o2.getMoveNumber());
		});
		queue.add(initState);
		while (!queue.isEmpty()) {
			ArrayState pop = queue.remove();
			status.setVisitedNode(status.getVisitedNode() + 1);
			List<Position> allPossibleMoves = pop.getAllPossiblePositions();
			for (Position nextMove : allPossibleMoves) {
				ArrayState newState = pop.moveTo(nextMove);
				if (newState.isPathExist()) {
					return newState;
				}
				status.setExpandedNode(status.getExpandedNode() + 1);
				queue.add(newState);
			}
		}
		return null;
	};

	// higher return value is better
	private final Function<ArrayState, Double> heuristic = (state) -> {
		double distance = Math.hypot(state.getLastX() - state.getBoardSize() / 2D,
				state.getLastY() - state.getBoardSize() / 2D);
		return distance + (8 - state.allPossibleMoves());
	};
	private Search aStar = (initState, status) -> {
		Queue<ArrayState> queue = new PriorityQueue<>((ArrayState o1, ArrayState o2) -> {
			return -Double.compare(o1.getMoveNumber() + heuristic.apply(o1), o2.getMoveNumber() + heuristic.apply(o2));
		});
		queue.add(initState);
		while (!queue.isEmpty()) {
			ArrayState pop = queue.remove();
			status.setVisitedNode(status.getVisitedNode() + 1);
			List<Position> allPossibleMoves = pop.getAllPossiblePositions();
			for (Position nextMove : allPossibleMoves) {
				ArrayState newState = pop.moveTo(nextMove);
				if (newState.isPathExist()) {
					return newState;
				}
				// prune states with dead end
				if (!newState.hasDeadEnd()) {
					status.setExpandedNode(status.getExpandedNode() + 1);
					queue.add(newState);
				}
			}
		}
		return null;
	};
	private final Search greedy = (initState, status) -> {
		ArrayState curr = initState;
		while (!curr.isPathExist()) {
			List<Position> allPossibleMoves = curr.getAllPossiblePositions();
			if (allPossibleMoves.isEmpty()) {
				return null;
			}
			Position min = getMin(curr, allPossibleMoves);
			curr = curr.moveTo(min);
			status.setExpandedNode(status.getExpandedNode() + 1);
			status.setVisitedNode(status.getVisitedNode() + 1);
			if (curr.isPathExist()) {
				return curr;
			}
		}

		return null;
	};

	private final HashMap<SearchStrategy, Search> map;

	public SearchAgent() {
		map = new HashMap<>();
		map.put(SearchStrategy.BFS, bfs);
		map.put(SearchStrategy.DFS, dfs);
		map.put(SearchStrategy.A_STAR, aStar);
		map.put(SearchStrategy.GREEDY, greedy);
		map.put(SearchStrategy.UCS, ucs);
		// map.put(SearchStrategy.RBFS, rbfs);

	}

	public ArrayState performSearch(ArrayState initState, SearchStrategy strategy, Status status) {
		long start = System.currentTimeMillis();
		ArrayState search = map.get(strategy).search(initState, status);
		long end = System.currentTimeMillis();
		status.setTakenTime(end - start);
		if (search == null) {
			status.setStatus("FAILED");
		} else {
			status.setStatus("SUCCESS");
		}

		return search;
	}
}
