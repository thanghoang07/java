package demo;

public class RunSearch {
	// new mot state moi
	static State states = new State(0, 0, Position.RIGHT, 3, 3);

	public static void main(String[] args) {
		Search search = new Search();
		System.out.println("Test Breadth First Search");
		long ta1 = System.currentTimeMillis();

		State state1 = search.breadthFirstSearch(states);
		search.printState(state1);

		long tb1 = System.currentTimeMillis();
		System.out.println("Duration: " + (tb1 - ta1) + " milliseconds.");

		System.out.println("=============================");
		System.out.println("Test Depth Limited Search");
		long ta2 = System.currentTimeMillis();

		State state2 = search.depthLimitedSearch(states);
		search.printState(state2);

		long tb2 = System.currentTimeMillis();
		System.out.println("Duration: " + (tb2 - ta2) + " milliseconds.");

		System.out.println("=============================");
		System.out.println("Test Depth First Search 1");
		long ta3 = System.currentTimeMillis();

		State state3 = search.depthFirstSearch(states);
		search.printState(state3);

		long tb3 = System.currentTimeMillis();
		System.out.println("Duration: " + (tb3 - ta3) + " milliseconds.");

//		System.out.println("=============================");
//		System.out.println("Test Depth First Search 2");
//		long ta4 = System.currentTimeMillis();
//
//		State state4 = search.depthFirstSearch2(states);
//		search.printState(state4);
//		
//		long tb4 = System.currentTimeMillis();
//		System.out.println("Duration: " + (tb4 - ta4) + " milliseconds.");
	}

}
