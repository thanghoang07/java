package informedSearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Search {
	public static void AStar(Node source, Node dest) {
		// tao mang chua cac node da tham
		Set<Node> explored = new HashSet<Node>();
		// tao mang chua cac node chua tham theo thu tu giam dan
		PriorityQueue<Node> fringe = new PriorityQueue<Node>(20, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if (o1.f > o2.f) {
					return 1;
				} else if (o1.f < o2.f) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		//
		source.g = 0;
		// chen dinh bat dau vao mang chua duyet
		fringe.add(source);
		// tao bien tim
		boolean found = false;
		// duyet
		while (!fringe.isEmpty() && !found) {
			// node hien tai co gia tri nho nhat (f)
			Node current = fringe.poll();
			//
			explored.add(current);
			// kiem tra node dich
			if (current.value.equals(dest.value)) {
				found = true;
			} else {
				// check noi node con hien tai
				for (Edges e : current.adjacencies) {
					Node child = e.target;
					float cost = e.cost, gTemp = current.g + cost, fTemp = gTemp + child.h;
					// danh gia node moi neu co gia tri lon hon thi di tiep
					if (explored.contains(child) && (fTemp >= child.f)) {
						continue;
					} else if ((!fringe.contains(child)) || (fTemp < child.f)) {
						child.parent = current;
						child.g = gTemp;
						child.f = fTemp;
						if (fringe.contains(child)) {
							fringe.remove(child);
						}
						fringe.add(child);
						// System.out.println(child.f + " | " +
						// child.toString());
					}
				}
			}
		}
	}

	public static void GreedyBestFirstSearch(Node source, Node dest) {
		// tao mang chua cac node da tham
		Set<Node> explored = new HashSet<Node>();
		// tao mang chua cac node chua tham theo thu tu giam dan
		PriorityQueue<Node> fringe = new PriorityQueue<Node>(20, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if (o1.f > o2.f) {
					return 1;
				} else if (o1.f < o2.f) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		//
		source.g = 0;
		// chen dinh bat dau vao mang chua duyet
		fringe.add(source);
		// tao bien tim
		boolean found = false;
		// duyet
		while (!fringe.isEmpty() && !found) {
			// node hien tai co gia tri nho nhat (f)
			Node current = fringe.poll();
			//
			explored.add(current);
			// kiem tra node dich
			if (current.value.equals(dest.value)) {
				found = true;
			} else {
				// check noi node con hien tai
				for (Edges e : current.adjacencies) {
					Node child = e.target;
					float fTemp = child.h;
					// danh gia node moi neu co gia tri lon hon thi di tiep
					if (explored.contains(child) && (fTemp >= child.f)) {
						continue;
					} else if ((!fringe.contains(child)) || (fTemp < child.h)) {
						child.parent = current;
						child.f = fTemp;
						if (fringe.contains(child)) {
							fringe.remove(child);
						}
						fringe.add(child);
						// System.out.println(child.h + " | " +
						// child.toString());
					}
				}
			}
		}
	}

	public static void printPath(Node target) {
		ArrayList<Node> path = new ArrayList<Node>();
		for (Node node = target; node != null; node = node.parent) {
			path.add(node);
		}
		//
		System.out.println("Path node: ");
		for (int i = path.size() - 1; i >= 0; i--) {
			System.out.println("Node: " + i + " || " + path.get(i).toString() + "\n=====f(n) cost: " + path.get(i).f
					+ " =====h(n) cost: " + path.get(i).h);
		}
		//
		System.out.println("Cost: " + target.f);
	}

}
