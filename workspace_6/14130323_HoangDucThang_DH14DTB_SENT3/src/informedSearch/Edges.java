package informedSearch;


public class Edges {
	public float cost;
	public Node target;

	public Edges(Node target, float cost) {
		super();
		this.cost = cost;
		this.target = target;
	}

}
