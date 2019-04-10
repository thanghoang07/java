package vacworld;

import java.util.Random;

import agent.Action;
import agent.Agent;
import agent.Percept;

public class VacAgent extends Agent {
	private boolean dirtDetected = false;
	private boolean turnLeft = false;
	private boolean turnRight = false;
	private boolean goForward = false;
	private boolean shutOff = false;

	// tao bien random
	private Random random = new Random();

	// Change this if the number of dirt is known. Otherwise,
	// the vacuum will continue searching until it hits the move limit
	private int dirtCount = 4;

	// gioi han so buoc
	private int moveLimit = 500;

	// tao bien dem so buoc
	private int numMoves = 0;

	@Override
	public void see(Percept p) {

		numMoves++;

		if (((VacPercept) p).seeDirt()) {
			this.dirtDetected = true;
			dirtCount--;
			return;
		} else if (((VacPercept) p).seeObstacle()) {
			this.selectRandomDirection();
			return;
		} else if (((VacPercept) p).feelBump()) {
			this.selectRandomDirection();
			return;
		} else if (this.dirtCount == 0 || (numMoves >= moveLimit)) {
			this.shutOff = true;
			return;
		} else {
			this.goForward = true;

			return;
		}
	}

	// Select a random direction to turn
	public void selectRandomDirection() {
		int randInt = random.nextInt(100);

		if (randInt < 50) {
			this.turnRight = true;
		} else {
			this.turnLeft = true;
		}

		return;
	}

	@Override
	public Action selectAction() {
		if (this.dirtDetected) {
			System.out.println("Suck Dirt");
			this.dirtDetected = false;
			return new SuckDirt();
		}
		if (this.turnRight) {
			this.turnRight = false;
			return new TurnRight();
		}
		if (this.turnLeft) {
			this.turnLeft = false;
			return new TurnLeft();
		}
		if (this.goForward) {
			this.goForward = false;
			return new GoForward();
		}
		if (this.shutOff) {
			this.shutOff = false;
			return new ShutOff();
		}

		// Else return a null action
		return null;
	}

	// Return the user ID
	@Override
	public String getId() {
		return "Random Agent";
	}

	public String toString() {
		System.out.println("dirtDetected: " + dirtDetected);
		System.out.println("turnLeft: " + turnLeft);
		System.out.println("turnRight: " + turnRight);
		System.out.println("goForward: " + goForward);
		System.out.println("shutOff: " + shutOff);

		return "\n";
	}
}
