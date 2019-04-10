package vacworld;

public class Point {
	protected int agentX, agentY;

	public Point(int agentX, int agentY) {
		super();
		this.agentX = agentX;
		this.agentY = agentY;
	}

	public int getAgentX() {
		return agentX;
	}

	public void setAgentX(int agentX) {
		this.agentX = agentX;
	}

	public int getAgentY() {
		return agentY;
	}

	public void setAgentY(int agentY) {
		this.agentY = agentY;
	}

	@Override
	public String toString() {
		return "[" + agentX + ", " + agentY + "]";
	}

}
