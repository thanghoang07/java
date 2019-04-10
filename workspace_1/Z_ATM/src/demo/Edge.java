package demo;

public class Edge implements Comparable {
	private int u, v, weight;

	public Edge(int u, int v, int weight) {
		this.u = u;
		this.v = v;
		this.weight = weight;
	}

	public int getU() {
		return u;
	}

	public void setU(int u) {
		this.u = u;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Object o) {
		Edge edge = (Edge) o;
		if (this.weight < edge.getWeight()) {
			return -1;
		} else if (this.weight > edge.getWeight()) {
			return 1;

		} else
			return 0;
	}	
}
