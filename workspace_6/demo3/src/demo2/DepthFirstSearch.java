package demo2;

import java.util.ArrayList;

public class DepthFirstSearch {
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
}
