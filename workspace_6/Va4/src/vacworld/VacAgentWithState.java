package vacworld;


import java.util.Random;
import agent.*;

public class VacAgentWithState extends Agent {
	// If the vacuum comes into contact with a location over the
	// randomThreshold, it will choose a lower threshold direction
	// to avoid covering squares it has already covered a lot
	// (prevent repetition)
	private int threshold = 6;

	// Assuming a max room size of 5x5
	// If this changes, update the size of the grid.
	// This grid is initialized to a 9x9 grid to allow for
	// relative mapping of location, ie a grid can be mapped into
	// each quadrant of the 2d array depending on where the vacuum
	// begins.
	private int gridWidth = 9, gridHeight = 9;

	private int[][] roomGrid = new int[gridWidth][gridHeight];

	// Stores the X and Y coordinates of the vacuum in relative space
	// Initialize the start position of the vacuum to 4, 4
	// the center of the 9x9 grid.
	// This way, any direction the vacuum moves relative to the
	// start location can be marked.
	//
	private int x = 4, y = 4;

	// North : 0
	// East: 1
	// South: 2
	// West: 3
	private int currentDirection = 0;

	// Direction booleans.
	// These are flipped to true depending on the input
	// from the percept passed to the agent.
	// The agent then selects and action and returns these
	// to false.
	private boolean dirtDetected = false;
	private boolean turnLeft = false;
	private boolean turnRight = false;
	private boolean goForward = false;
	private boolean shutOff = false;

	// Used to seed random
	private Random random = new Random();

	// Change this if the number of dirt is known. Otherwise,
	// the vacuum will continue searching until it hits the move limit
	private int dirtCount = 4;

	// Change this to allow more or fewer moves to the vacuum.
	private int moveLimit = 100;

	// Current number of moves performed.
	// numMoves is incremented each time an action is taken.
	// if numMoves reaches the moveLimit, the vacuum will shutdown
	private int numMoves = 0;

	private void printThreshold() {
		System.out.println("THRESHOLD DETECTED");
		System.out.println(" +--+--+--+");
		System.out.println("|  |" + roomGrid[y - 1][x] + "|   |");
		System.out.println(" +--+--+--+");
		System.out.println("|" + roomGrid[y][x - 1] + " |" + roomGrid[y][x] + " |" + roomGrid[y][x + 1] + " |");
		System.out.println(" +--+--+--+");
		System.out.println("|  |" + roomGrid[y + 1][x] + "|   |");
		System.out.println(" +--+--+--+");
	}

	// Set obstacles threshold value to a very high value
	private void markObstacle() {
		switch (this.currentDirection) {
		case 0:
			roomGrid[y - 1][x] = 1000;
			break;
		case 1:
			roomGrid[y][x + 1] = 1000;
			break;
		case 2:
			roomGrid[y + 1][x] = 1000;
			break;
		case 3:
			roomGrid[y][x - 1] = 1000;
			break;
		}
		return;
	}

	private void thresholdDetected() {
		// Display the neighbors of the threshold
		printThreshold();

		// Is north the smallest? (vs. West, East, South) If so, rotate towards
		// it.
		if ((roomGrid[y - 1][x] <= roomGrid[y][x - 1]) && (roomGrid[y - 1][x] <= roomGrid[y][x + 1])
				&& (roomGrid[y - 1][x] <= roomGrid[y + 1][x])) {
			switch (this.currentDirection) {
			case 0:
				this.goForward = true;
				break;
			case 1:
				this.turnLeft = true;
				this.changeDirection(-1);
				break;
			case 2:
				this.turnLeft = true;
				this.changeDirection(-1);
				break;
			case 3:
				this.turnRight = true;
				this.changeDirection(1);
				break;
			}
			return;
		}
		// Is EAST the smallest? (vs. West, North, South) If so, rotate towards
		// it.
		else if ((roomGrid[y][x + 1] <= roomGrid[y][x - 1]) && (roomGrid[y][x + 1] <= roomGrid[y - 1][x])
				&& (roomGrid[y][x + 1] <= roomGrid[y + 1][x])) {
			switch (this.currentDirection) {
			case 0:
				this.turnRight = true;
				this.changeDirection(1);
				break;
			case 1:
				this.goForward = true;
				break;
			case 2:
				this.turnLeft = true;
				this.changeDirection(-1);
				break;
			case 3:
				this.turnLeft = true;
				this.changeDirection(-1);
				break;
			}
			return;
		}
		// Is SOUTH the smallest? (vs. West, East, North) If so, rotate towards
		// it.
		else if ((roomGrid[y + 1][x] <= roomGrid[y][x - 1]) && (roomGrid[y + 1][x] <= roomGrid[y][x + 1])
				&& (roomGrid[y + 1][x] <= roomGrid[y - 1][x])) {
			switch (this.currentDirection) {
			case 0:
				this.turnRight = true;
				this.changeDirection(1);
				break;
			case 1:
				this.turnRight = true;
				this.changeDirection(1);
				break;
			case 2:
				this.goForward = true;
				break;
			case 3:
				this.turnLeft = true;
				this.changeDirection(-1);
				break;
			}
			return;
		}
		// Is WEST the smallest? (vs. North, East, South) If so, rotate towards
		// it.
		else if ((roomGrid[y][x - 1] <= roomGrid[y - 1][x]) && (roomGrid[y][x - 1] <= roomGrid[y][x + 1])
				&& (roomGrid[y][x - 1] <= roomGrid[y + 1][x])) {
			switch (this.currentDirection) {
			case 0:
				this.turnLeft = true;
				this.changeDirection(-1);
				break;
			case 1:
				this.turnLeft = true;
				this.changeDirection(-1);
				break;
			case 2:
				this.turnRight = true;
				this.changeDirection(1);
				break;
			case 3:
				this.goForward = true;
				break;
			}
			return;
		} else {
			System.out.println("THRESHOLD ERROR");
		}

		System.out.println("Direction Selected: " + this.currentDirection);
	}

	@Override
	public void see(Percept p) {
		// Increment numMoves. If over the moveLimit,
		// the vacuum will shutdown.
		numMoves++;

		// Set grid to explored

		// If dirt is detected, vacuum it up.
		// Reduce the count of dirt remaining in the
		// simulation.
		if (((VacPercept) p).seeDirt()) {
			this.dirtDetected = true;
			dirtCount--;

			return;
		}

		// If an obstacle is detected, turn
		// randomly, to avoid infinite loop scenarios
		else if (((VacPercept) p).seeObstacle()) {

			this.markObstacle();

			this.selectRandomDirection();
			return;
		}

		// If a bump is felt decide what to do
		else if (((VacPercept) p).feelBump()) {
			this.selectRandomDirection();

			return;
		}

		// Here we deviate.
		// If the grid location the vacuum is currently on is over a certain
		// threshold
		// peek at the adjacent squares in the constructed internal map
		// roomGrid, and choose the direction with the fewest visits (lowest
		// threshold)
		else if (roomGrid[y][x] >= threshold) {
			this.thresholdDetected();
			return;
		}

		// If all the dirt has been cleaned,
		else if (this.dirtCount == 0 || (numMoves >= moveLimit)) {
			this.shutOff = true;

			return;
		}

		// If there are no other inputs,
		// Go forward
		else {
			this.goForward = true;

			return;
		}
	}

	// Flip current location to searched ('1')
	private void markGrid(int a, int b) {
		this.roomGrid[a][b] += 1;
	}

	// Print a view of the searched locations for
	// debugging purposes
	private void printSearchedGrid() {
		for (int j = 0; j < gridWidth; j++) {
			if (j - 4 < 0) {
				System.out.print(" " + (j - 4));
			} else {
				System.out.print("  " + (j - 4));
			}
		}
		System.out.println();

		System.out.print(" ");
		for (int j = 0; j < gridWidth; j++) {
			System.out.print("+--");
		}
		System.out.println("+");

		for (int i = 0; i < gridHeight; i++) {
			if ((i - 4) < 0) {
				System.out.print((i - 4) + "|");
			} else {
				System.out.print(" " + (i - 4) + "|");
			}

			for (int j = 0; j < gridWidth; j++) {
				if (i == this.y && j == this.x) {
					switch (this.currentDirection) {
					case 0:
						System.out.print("A");
						break;
					case 1:
						System.out.print(">");
						break;
					case 2:
						System.out.print("V");
						break;
					case 3:
						System.out.print("<");
						break;
					}
				} else if (roomGrid[i][j] == 0) {
					System.out.print(" ");
				} else if (roomGrid[i][j] == 1000) {
					System.out.print("X");
				} else if (roomGrid[i][j] >= 1 && roomGrid[i][j] != 1000) {
					// Use this to increase "height" of grid location
					System.out.print(roomGrid[i][j]);
					// System.out.print(" ");
				}
				System.out.print(" |");
			}

			// Print border
			System.out.println();
			System.out.print(" +");
			for (int j = 0; j < gridWidth - 1; j++)
				System.out.print("--+");
			System.out.println("--+");

		}
		System.out.println();
	}

	// Select a random direction to turn
	private void selectRandomDirection() {
		int randInt = random.nextInt(100);

		if (randInt < 50) {
			this.turnRight = true;
			// Calculate the new facing of the vacuum
			// A positive 1 means the vacuum is turning right
			this.changeDirection(1);
		} else {
			this.turnLeft = true;
			// Calculate the new facing of the vacuum
			// A negative 1 means the vacuum is turning left
			this.changeDirection(-1);
		}

		return;
	}

	// Calculate current direction
	// Takes the direction turning as an argument
	// 1 indicates a right turn
	// -1 indicates a left turn
	private void changeDirection(int turnDirection) {
		System.out.print("Turning: ");

		// Right turn
		if (turnDirection == 1) {
			System.out.println("RIGHT");
			// If facing west, turn north
			if (this.currentDirection == 3) {
				this.currentDirection = 0;
			} else {
				this.currentDirection++;
			}
		}
		// Left turn
		else if (turnDirection == -1) {
			System.out.println("LEFT");
			// If facing north, turn west
			if (this.currentDirection == 0) {
				this.currentDirection = 3;
			} else {
				this.currentDirection--;
			}
		} else {
			System.out.println("ERROR: Invalid Turn Direction");
		}
	}

	private void calculateNewLocation(int direction) {
		if (direction == 0) {
			this.y--;
		} else if (direction == 1) {
			this.x++;
		} else if (direction == 2) {
			this.y++;
		} else if (direction == 3) {
			this.x--;
		}

		this.printVector();
	}

	private void printVector() {
		System.out.println("Current Relative Location: " + (this.x - 4) + ", " + (this.y - 4));
		System.out.print("Current Direction: " + this.currentDirection);
		switch (this.currentDirection) {
		case 0:
			System.out.println(" (North)");
			break;
		case 1:
			System.out.println(" (East)");
			break;
		case 2:
			System.out.println(" (South)");
			break;
		case 3:
			System.out.println(" (West)");
			break;
		}
	}

	@Override
	public Action selectAction() {
		this.printVector();
		this.printSearchedGrid();

		if (this.dirtDetected) {
			// Mark the grid to show the currentLocation.
			this.markGrid(this.y, this.x);

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
			// Mark the grid to show the currentLocation.
			this.markGrid(this.y, this.x);

			this.calculateNewLocation(this.currentDirection);

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
		return "u79729892";
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