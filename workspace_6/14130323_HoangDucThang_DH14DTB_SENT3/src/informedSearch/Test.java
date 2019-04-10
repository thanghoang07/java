package informedSearch;

public class Test {
	public static void main(String[] args) {
		Node Arad = new Node("Arad", 366);
		Node Zerind = new Node("Zerind", 374);
		Node Oradea = new Node("Oradea", 380);
		Node Sibiu = new Node("Sibui", 253);
		Node Fagaras = new Node("Fagaras", 176);
		Node RimnicuVilcea = new Node("Rimnicu Vilcea", 193);
		Node Pitesti = new Node("Pitesti", 10);
		Node Timisoara = new Node("Timisoara", 329);
		Node Lugoj = new Node("Lugoj", 244);
		Node Mehadia = new Node("Mehadia", 241);
		Node Drobeta = new Node("Drobeta", 242);
		Node Craiova = new Node("Craiova", 160);
		Node Bucharest = new Node("Bucharest", 0);
		Node Giugiu = new Node("Giugiu", 77);

		// / Edges ban dau

		// Arad
		Arad.adjacencies = new Edges[] { new Edges(Zerind, 75), new Edges(Sibiu, 140), new Edges(Timisoara, 118) };

		// Zerind
		Zerind.adjacencies = new Edges[] { new Edges(Arad, 75), new Edges(Oradea, 71) };

		// Oradea
		Oradea.adjacencies = new Edges[] { new Edges(Zerind, 71), new Edges(Sibiu, 151) };

		// Sibiu
		Sibiu.adjacencies = new Edges[] { new Edges(Arad, 140), new Edges(Fagaras, 99), new Edges(Oradea, 151),
				new Edges(RimnicuVilcea, 80) };

		// Fagaras
		Fagaras.adjacencies = new Edges[] { new Edges(Sibiu, 99), new Edges(Bucharest, 211) };

		// Rimnicu Vilcea
		RimnicuVilcea.adjacencies = new Edges[] { new Edges(Sibiu, 80), new Edges(Pitesti, 97),
				new Edges(Craiova, 148) };

		// Pitesti
		Pitesti.adjacencies = new Edges[] { new Edges(RimnicuVilcea, 97), new Edges(Bucharest, 101),
				new Edges(Craiova, 138) };

		// Timisoara
		Timisoara.adjacencies = new Edges[] { new Edges(Arad, 118), new Edges(Lugoj, 111) };

		// Lugoj
		Lugoj.adjacencies = new Edges[] { new Edges(Timisoara, 111), new Edges(Mehadia, 70) };

		// Mehadia
		Mehadia.adjacencies = new Edges[] { new Edges(Lugoj, 70), new Edges(Drobeta, 75) };

		// Drobeta
		Drobeta.adjacencies = new Edges[] { new Edges(Mehadia, 75), new Edges(Craiova, 120) };

		// Craiova
		Craiova.adjacencies = new Edges[] { new Edges(Drobeta, 120), new Edges(RimnicuVilcea, 148),
				new Edges(Pitesti, 138) };

		// Bucharest
		Bucharest.adjacencies = new Edges[] { new Edges(Pitesti, 101), new Edges(Giugiu, 90), new Edges(Fagaras, 211) };

		// Giurgiu
		Giugiu.adjacencies = new Edges[] { new Edges(Bucharest, 90) };
		System.out.println("\n====== Greedy bfs search ======");
		long ta2 = System.currentTimeMillis();
		Search.GreedyBestFirstSearch(Arad, Bucharest);

		Search.printPath(Bucharest);
		long tb2 = System.currentTimeMillis();
		System.out.println("Duration: " + (tb2 - ta2) + " milliseconds.");
		//
		System.out.println("\n====== A star search ======");
		long ta1 = System.currentTimeMillis();
		Search.AStar(Arad, Bucharest);

		Search.printPath(Bucharest);
		long tb1 = System.currentTimeMillis();
		System.out.println("Duration: " + (tb1 - ta1) + " milliseconds.");
		//

	}
}
