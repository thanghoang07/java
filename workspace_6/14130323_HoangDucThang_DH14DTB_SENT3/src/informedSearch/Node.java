package informedSearch;

public class Node {
	public String value;
	public float f, g, h;
	public Edges[] adjacencies;
	public Node parent;

	public Node(String value, float h) {
		super();
		this.value = value;
		this.h = h;
	}

	@Override
	public String toString() {
		return "Node [value = " + value + "]";
	}

}
