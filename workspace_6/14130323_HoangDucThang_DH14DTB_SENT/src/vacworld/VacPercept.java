package vacworld;

import agent.Percept;
import agent.Agent;

//Vacumm nhan thuc de quet bui
public class VacPercept extends Percept{

	private boolean dirt;
	private boolean obstacle;
	private boolean bump;

	
	public VacPercept(VacuumState state, Agent agent) {

		super(state,agent);

		int x, y;
		int viewX, viewY;
		int dir;

		x = state.getAgentX();
		y = state.getAgentY();
		dir = state.getAgentDir();

		// Xac dinh vi tri do
		if (state.hasDirt(x,y))
			dirt = true;
		else
			dirt = false;

		// Xac dinh vat can
		viewX = x + Direction.DELTA_X[dir];
		viewY = y + Direction.DELTA_Y[dir];
		if (state.hasObstacle(viewX, viewY))
			obstacle = true;
		else
			obstacle = false;

		// Xac dinh va cham
		if (state.bumped())
			bump = true;
		else
			bump = false;
	}

	//Nhan thuc duoc do
	public boolean seeDirt() {

		return dirt;
	}

	//Nhan thuc truoc do co vat can
	public boolean seeObstacle() {

		return obstacle;
	}

	//Cham vat can voi hanh dong gan nhat
	public boolean feelBump() {

		return bump;
	}

	public String toString() {

		StringBuffer pstring;

		pstring = new StringBuffer(5);
		if (dirt == true)
			pstring.append("DIRT ");
		if (obstacle == true)
			pstring.append("OBSTACLE ");
		if (bump == true)
			pstring.append("BUMP");
		return pstring.toString();
	}
}
