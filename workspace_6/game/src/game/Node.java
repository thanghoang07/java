package game;

public class Node {
	int x, y;
	int score;
	Node pos;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Node(int score, Node point) {
		this.score = score;
		this.pos = point;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getScore() {
		return score;
	}

	public Node getPos() {
		return pos;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}

}
