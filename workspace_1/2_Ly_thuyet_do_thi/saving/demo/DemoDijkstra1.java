package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.*;

public class DemoDijkstra1 {

	// Represents a single point on the graph.
	private static class Vertex {
		public String label;
		public Vertex previous;
		public int distance;
		public List<Edge> neighbors;

		public Vertex(String label) {
			this.label = label;
			this.neighbors = new ArrayList<>();
			this.distance = Integer.MAX_VALUE;
			this.previous = null;
		}

		@Override
		public String toString() {
			return label;
		}
	}

	// Represents an edge between two points. The source point is
	// expected to contain the edge list, so it is not required in
	// the edge class.
	private static class Edge {
		public Vertex to;
		public int weight;

		public Edge(Vertex to, int weight) {
			this.to = to;
			this.weight = weight;
		}
	}

	private Map<String, Vertex> vertices;

	public DemoDijkstra1() {
		vertices = new TreeMap<>();
	}

	// Adds a vertex to the map of vertices.
	public void addVertex(String label) throws Exception {
		if (vertices.containsKey(label))
			throw new Exception("Vertex already exists!");
		vertices.put(label, new Vertex(label));
	}

	// Adds an edge between two existing vertices.
	public void addEdge(String v1, String v2, int w) throws Exception {
		if (!(vertices.containsKey(v1) && vertices.containsKey(v2))) {
			throw new Exception("Both vertices must exist.");
		}
		vertices.get(v1).neighbors.add(new Edge(vertices.get(v2), w));
	}

	public void shortestPath(String source, String dest) {

		// Create a priority queue that compares based on the
		// currently known vertex distances.
		Queue<Vertex> unvisited = new PriorityQueue<>(vertices.size(), new Comparator<Vertex>() {
			@Override
			public int compare(Vertex o1, Vertex o2) {
				return Integer.compare(o1.distance, o2.distance);
			}
		});

		// Add all vertices to the queue. Currently they all
		// have a default max distance.
		unvisited.addAll(vertices.values());

		Vertex current = vertices.get(source);
		current.distance = 0;
		Vertex target = vertices.get(dest);
		unvisited.remove(current);

		while (true) {
			for (Edge e : current.neighbors) {
				final int newDistance = current.distance + e.weight;
				final int oldDistance = e.to.distance;
				if (newDistance < oldDistance) {

					e.to.distance = newDistance;
					e.to.previous = current;

					// Re-prioritize node after updating distance.
					unvisited.remove(e.to);
					unvisited.add(e.to);
				}
			}

			if (unvisited.size() == 0 || unvisited.peek().distance == Integer.MAX_VALUE) {
				System.out.println("Reached end.");
				break;
			}

			current = unvisited.poll();
			if (current == target) {
				System.out.println("Found target.");
				break;
			}
		}

		// Starting with the target, work backward to get the path.
		Stack<String> pathStack = new Stack<>();

		current = target;
		while (true) {
			pathStack.push(current.label);
			current = current.previous;
			if (current == null)
				break;
		}

		System.out.println("Displaying shortest path:");
		System.out.println("The path is: " + target.distance);
		System.out.print("The path traversal is: { ");
		while (!pathStack.empty())
			System.out.print(pathStack.pop() + " ");
		System.out.println("}");
	}

	public void populateGraph(BufferedReader r) throws Exception {
		String line;
		List<String[]> edges = new ArrayList<>();
		while ((line = r.readLine()) != null) {
			String[] parts = line.split(":");
			addVertex(parts[0]);
			for (int i = 1; i < parts.length; ++i) {
				edges.add(new String[] { parts[0], parts[i] });
			}
		}

		for (String[] edge : edges) {
			String source = edge[0];
			String[] pair = edge[1].split(",");
			addEdge(source, pair[0], Integer.parseInt(pair[1]));
		}
	}

	public static void main(String[] args) throws Exception {

		// Get the URL of the adjacency list containing our graph
		URL in = DemoDijkstra1.class.getClassLoader().getResource("adjacencyList.txt");
		if (in == null) {
			System.err.println("Could not find file.");
			return;
		}

		DemoDijkstra1 g = new DemoDijkstra1();
		g.populateGraph(new BufferedReader(new FileReader(in.getFile())));

		// Find the shortest path.
		g.shortestPath("1", "5");
	}
}
