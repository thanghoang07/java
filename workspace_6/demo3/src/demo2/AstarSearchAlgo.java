package demo2;

import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class AstarSearchAlgo {

	// h scores is the stright-line distance from the current city to Bucharest
	public static void main(String[] args) {

		// initialize the graph base on the Romania map
		Node n1 = new Node("Arad", 366);
		Node n2 = new Node("Zerind", 374);
		Node n3 = new Node("Oradea", 380);
		Node n4 = new Node("Sibiu", 253);
		Node n5 = new Node("Fagaras", 178);
		Node n6 = new Node("Rimnicu Vilcea", 193);
		Node n7 = new Node("Pitesti", 98);
		Node n8 = new Node("Timisoara", 329);
		Node n9 = new Node("Lugoj", 244);
		Node n10 = new Node("Mehadia", 241);
		Node n11 = new Node("Drobeta", 242);
		Node n12 = new Node("Craiova", 160);
		Node n13 = new Node("Bucharest", 0);
		Node n14 = new Node("Giurgiu", 77);

		// initialize the edges

		// Arad
		n1.adjacencies = new Edges[] { new Edges(n2, 75), new Edges(n4, 140), new Edges(n8, 118) };

		// Zerind
		n2.adjacencies = new Edges[] { new Edges(n1, 75), new Edges(n3, 71) };

		// Oradea
		n3.adjacencies = new Edges[] { new Edges(n2, 71), new Edges(n4, 151) };

		// Sibiu
		n4.adjacencies = new Edges[] { new Edges(n1, 140), new Edges(n5, 99), new Edges(n3, 151), new Edges(n6, 80), };

		// Fagaras
		n5.adjacencies = new Edges[] { new Edges(n4, 99),

				// 178
				new Edges(n13, 211) };

		// Rimnicu Vilcea
		n6.adjacencies = new Edges[] { new Edges(n4, 80), new Edges(n7, 97), new Edges(n12, 146) };

		// Pitesti
		n7.adjacencies = new Edges[] { new Edges(n6, 97), new Edges(n13, 101), new Edges(n12, 138) };

		// Timisoara
		n8.adjacencies = new Edges[] { new Edges(n1, 118), new Edges(n9, 111) };

		// Lugoj
		n9.adjacencies = new Edges[] { new Edges(n8, 111), new Edges(n10, 70) };

		// Mehadia
		n10.adjacencies = new Edges[] { new Edges(n9, 70), new Edges(n11, 75) };

		// Drobeta
		n11.adjacencies = new Edges[] { new Edges(n10, 75), new Edges(n12, 120) };

		// Craiova
		n12.adjacencies = new Edges[] { new Edges(n11, 120), new Edges(n6, 146), new Edges(n7, 138) };

		// Bucharest
		n13.adjacencies = new Edges[] { new Edges(n7, 101), new Edges(n14, 90), new Edges(n5, 211) };

		// Giurgiu
		n14.adjacencies = new Edges[] { new Edges(n13, 90) };

		AstarSearch(n1, n13);

		List<Node> path = printPath(n13);

		System.out.println("Path: " + path);

	}

	public static List<Node> printPath(Node target) {
		List<Node> path = new ArrayList<Node>();

		for (Node node = target; node != null; node = node.parent) {
			path.add(node);
		}

		Collections.reverse(path);

		return path;
	}

	public static void AstarSearch(Node source, Node dest) {

		Set<Node> explored = new HashSet<Node>();

		PriorityQueue<Node> fringe = new PriorityQueue<Node>(20, new Comparator<Node>() {
			// override compare method
			public int compare(Node i, Node j) {
				if (i.f > j.f) {
					return 1;
				}
				else if (i.f < j.f) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});

		// cost from start
		source.g = 0;

		fringe.add(source);

		boolean found = false;

		while ((!fringe.isEmpty()) && (!found)) {

			// the node in having the lowest f_score value
			Node current = fringe.poll();

			explored.add(current);

			// goal found
			if (current.value.equals(dest.value)) {
				found = true;
			}

			// check every child of current node
			for (Edges e : current.adjacencies) {
				Node child = e.target;
				double cost = e.cost;
				double temp_g_scores = current.g + cost;
				double temp_f_scores = temp_g_scores + child.h_scores;

				/*
				 * if child node has been evaluated and the newer f_score is
				 * higher, skip
				 */

				if ((explored.contains(child)) && (temp_f_scores >= child.f)) {
					continue;
				}

				/*
				 * else if child node is not in queue or newer f_score is lower
				 */

				else if ((!fringe.contains(child)) || (temp_f_scores < child.f)) {

					child.parent = current;
					child.g = temp_g_scores;
					child.f = temp_f_scores;

					if (fringe.contains(child)) {
						fringe.remove(child);
					}

					fringe.add(child);

				}

			}

		}

	}

}

class Node {

	public final String value;
	public double g;
	public final double h_scores;
	public double f = 0;
	public Edges[] adjacencies;
	public Node parent;

	public Node(String val, double hVal) {
		value = val;
		h_scores = hVal;
	}

	public String toString() {
		return value;
	}

}

class Edges {
	public final double cost;
	public final Node target;

	public Edges(Node targetNode, double costVal) {
		target = targetNode;
		cost = costVal;
	}
}
