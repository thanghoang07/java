package demo2;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		State a = new State(3, 3, 0, 0);

		ArrayList<State> toStart = new ArrayList<State>();

		toStart.add(a);

		DepthFirstSearch dfs = new DepthFirstSearch();

		try {

			dfs.search(toStart);

		} catch (Exception ex) {

			System.out.println(ex.getMessage());

		}

	}
}
