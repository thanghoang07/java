package vacworld;

import agent.State;
import java.util.Random;
import java.util.Stack;
import java.io.PrintStream;
import java.util.ArrayList;

/** Represents a state in the vacuum world. */
public class VacuumState extends State {
	// Dat Agent tai vi tri 3,3
	protected static int INIT = 3;
	int countNumMove = 0;
	// protected static int INIT_Y = 3;
	protected static int INIT_DIR = Direction.NORTH;

	// Vi tri sach =0
	public static final int CLEAR = 0;

	// Vi tri do =1
	public static final int DIRT = 1;

	// Vi tri dat vat can =2
	public static final int WALL = 2;

	// Bien co the xay ta do va vat can
	protected static double DIRT_CHANCE = 0.37;
	protected static double WALL_CHANCE = 0.22;

	// Bien cho trang thai cua Agent
	protected int agentX;
	protected int agentY;
	protected int agentDir;
	protected boolean robotOff = false;

	/** True if the agent just bumped into something. */
	protected boolean bump = false;

	// Mang chua vi tri cac doi tuong trong moi truong chan khong
	protected static int[][] map = null;

	protected int numDirtyLocs = 0;
	protected static int numDirty = 0;
	//
	protected Stack<Point> pathPoint = new Stack<Point>();
	//
	protected static int[][] path;
	// chieu cao cua mang (bao gom nhung buc tuong sum quanh)
	protected static int height;

	// chieu rong cua mang (bao gom nhung buc tuong sum quanh)
	protected static int width;

	public VacuumState(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	/** Return the default initial state for the vacuum world. */
	public static VacuumState getInitState(int width, int height) {
		VacuumState state;
		state = new VacuumState(createMap());
		state.width = width;
		state.height = height;
		state.map = new int[width][height];
		for (int i = 0; i < state.map.length; i++) {
			state.map[i] = state.map[i].clone();
		}
		state.numDirtyLocs = state.countDirtyLocs();
		state.agentX = INIT;
		state.agentY = INIT;
		state.agentDir = INIT_DIR;
		return state;
	}

	// lay trang thai ngau nhien (gom do, vat can)
	public static VacuumState getRandomState() {
		Random rgen = new Random();
		return getRandomState(rgen);
	}

	// Tao ngay nhien trang thai vat canm do
	public static VacuumState getRandomState(int randSeed) {
		Random rgen = new Random(randSeed);
		return getRandomState(rgen);
	}

	/**
	 * A helper class for the other getRandomState() methods. Accepts a random
	 * number generator and uses this to generate a random initial state for the
	 * vacuum world. The agent's initial location, dirt locations and other
	 * obstacles are random. This method fills in areas that are impossible to
	 * reach with walls.
	 */
	protected static VacuumState getRandomState(Random rgen) {
		return null;
	}

	public static void fillUnreachableSquares(VacuumState state) {
		// find reachable squares
		ArrayList<Location> reachable = new ArrayList<Location>();// nguong truy
																	// xuat dc
		ArrayList<Location> frontier = new ArrayList<Location>();// duong bien
		Location start = new Location(state.agentX, state.agentY);
		reachable.add(start);
		frontier.add(start);
		while (!frontier.isEmpty()) {
			Location next = frontier.remove(0);
			for (int i = 0; i < 4; i++) {
				Location gen = new Location(next.x + Direction.DELTA_X[i], next.y + Direction.DELTA_Y[i]);
				if (state.map[gen.x][gen.y] != WALL && !reachable.contains(gen)) {
					frontier.add(gen);
					reachable.add(gen);
				}
			}
		}

		// replace unreachable squares with walls
		for (int i = 0; i < state.width; i++) {
			for (int j = 0; j < state.height; j++) {
				Location temp = new Location(i, j);
				if (!reachable.contains(temp))
					state.map[i][j] = WALL;
			}
		}
	}

	protected VacuumState() {
		// do nothing
	}

	// tao VaccumState
	public VacuumState(int[][] map) {
		width = width;
		height = height;
		this.map = map;
		numDirtyLocs = countDirtyLocs();
		agentX = INIT;
		agentY = INIT;
		agentDir = INIT_DIR;
	}

	public int getAgentX() {
		return agentX;
	}

	public int getAgentY() {
		return agentY;
	}

	// Huong cua Agent
	public int getAgentDir() {
		return agentDir;
	}

	// Chuoi tuong trung cho huong di
	public String getAgentDirString() {
		return Direction.toString(agentDir);
	}

	public void setAgentX(int x) {
		agentX = x;
	}

	public void setAgentY(int y) {
		agentY = y;
	}

	/** Change the agent's orientation. */
	public void setAgentDir(int dir) {
		agentDir = dir;
	}

	// Thay doi trang thai kho robot tat
	public void setRobotOff(boolean off) {
		robotOff = off;
	}

	// Phat ra tin hieu khi gap vat can o phia truoc
	public void setBump(boolean bump) {
		this.bump = bump;
	}

	// Loai bo do tu nhung vi tri dat biet
	public void removeDirt(int x, int y) {
		if (map[x][y] == DIRT) {
			map[x][y] = CLEAR;
			numDirtyLocs--;
		}
	}

	// Kiem tra vi tri do
	public boolean hasDirt(int x, int y) {
		if (map[x][y] == DIRT)
			return true;
		else
			return false;
	}

	// kiem tra vi tri vat can
	public boolean hasObstacle(int x, int y) {
		if (map[x][y] == WALL)
			return true;
		else
			return false;
	}

	// gap vat can
	public boolean bumped() {
		return bump;
	}

	/** Return true if the location is within bounds of the state's map. */
	public boolean inBounds(int x, int y) {
		if (x >= 0 && x < width && y >= 0 && y < height)
			return true;
		else
			return false;
	}

	// Kiem tra trang thai tat cua Vaccum
	public boolean isRobotOff() {
		return robotOff;
	}

	// So vi tri do trong moi truong
	public int getNumDirtyLocs() {
		return numDirtyLocs;
	}

	public void display(PrintStream output) {
		for (int j = 0; j < width; j++)
			output.print("  " + j);
		output.println();

		output.print(" ");
		for (int j = 0; j < width; j++)
			output.print("+--");
		output.println("+");
		/*
		 * To print to the screen properly, the loop in the Y direction must be
		 * the outer loop.
		 */
		for (int i = 0; i < height; i++) {
			output.print(i + "|");
			for (int j = 0; j < width; j++) {
				if (i == agentY && j == agentX)
					output.print(getAgentCharacter());
				else if (hasDirt(j, i))
					output.print("*");
				else if (hasObstacle(j, i))
					output.print("X");
				else
					output.print(" ");
				output.print(" |");
			}
			output.println();

			output.print(" +");
			for (int j = 0; j < width - 1; j++)
				output.print("--+");
			output.println("--+");

		}
		output.println("Location: (" + agentX + "," + agentY + ")  " + "Facing: " + getAgentDirString());
		output.println();
	}

	public void display() {
		display(System.out);
	}

	// Dem so o do trong moi truong tranh thai
	public static int countDirtyLocs() {
		int dirtCount = 0;
		for (int dx = 1; dx < width; dx++) {
			for (int dy = 1; dy < height; dy++) {
				if (map[dx][dy] == DIRT)
					dirtCount++;
			}
		}
		return dirtCount;
	}

	private String getAgentCharacter() {
		switch (agentDir) {
		case Direction.NORTH:
			return "A";
		case Direction.EAST:
			return ">";
		case Direction.SOUTH:
			return "V";
		case Direction.WEST:
			return "<";
		}
		return "A";
	}

	// tao moi truong
	public void createEnvironment(PrintStream output) {
		printMatrix(createMap(), output);
	}

	// sao chep matrix
	public static int[][] getMap() {
		return map.clone();
	}

	// tao matrix
	public static int[][] createMap() {
		float roll;
		VacuumState state;
		state = new VacuumState();
		state.agentDir = INIT_DIR;
		state.numDirtyLocs = 0;
		Random random = new Random();
		state.map = new int[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (i == 0 || i == (width - 1))
					state.map[i][j] = WALL;
				else {
					if (j == 0 || j == (height - 1))
						state.map[i][j] = WALL;
					else {
						roll = random.nextFloat();
						if ((i != state.agentX || j != state.agentY) && roll <= WALL_CHANCE) {
							state.map[i][j] = WALL;
						} else if (roll <= DIRT_CHANCE) {
							state.map[i][j] = DIRT;
							state.numDirtyLocs++;
							state.numDirty++;
						} else {
							state.map[i][j] = CLEAR;
						}
					}
				}
			}
		}
		state.numDirtyLocs = state.countDirtyLocs();
		return state.map;
	}

	// in matrix
	public void printMatrix(int[][] map, PrintStream output) {
		VacuumState state;
		state = new VacuumState();
		path = new int[state.width][state.height];
		output.printf("Tong so do: %d\n\n", VacuumState.countDirtyLocs());
		for (int j = 0; j < width; j++)
			output.print("  " + j);
		output.println();

		System.out.print(" ");
		for (int j = 0; j < width; j++)
			output.print("+--");
		output.println("+");

		for (int i = 0; i < height; i++) {
			output.print(i + "|");
			for (int j = 0; j < width; j++) {
				if (i == agentY && j == agentX) {
					output.print(getAgentCharacter());
					pathPoint.push(new Point(agentX, agentY));
				} else if (map[j][i] == 1) {
					output.print("*");
					path[j][i] = 1;
				} else if (map[j][i] == 2) {
					output.print("X");
				} else {
					output.print(" ");
				}
				output.print(" |");
			}
			output.println();
			output.print(" +");
			for (int j = 0; j < width - 1; j++) {
				output.print("--+");
			}
			output.println("--+");
		}
		output.println("Location: (" + agentX + "," + agentY + ")  " + "Facing: " + getAgentDirString());
		output.println();
	}

	public void printPath() {
		if (!pathPoint.isEmpty()) {
			for (int i = 0; i < pathPoint.size(); i++) {
				System.out.println(pathPoint.get(i).toString());
			}
		} else {
			System.out.println("Loi roi :D");
		}
	}

	public void printMatrixPath(int[][] map, PrintStream output) {
		
		for (int j = 0; j < width; j++) {
			output.print("  " + j);
		}
		output.println();

		System.out.print(" ");
		for (int j = 0; j < width; j++) {
			output.print("+--");
		}
		output.println("+");

		for (int i = 0; i < height; i++) {
			output.print(i + "|");
			for (int j = 0; j < width; j++) {
				if (i == INIT && j == INIT) {
					output.print("#");
				} else if (i == agentY && j == agentX) {
					output.print(getAgentCharacter());
					countNumMove++;
					output.print(countNumMove);
				} else if (map[j][i] == 1) {
					output.print("1");
				} else {
					output.print(" ");
				}
				output.print(" |");
			}
			output.println();

			output.print(" +");
			for (int j = 0; j < width - 1; j++) {
				output.print("--+");
			}
			output.println("--+");
		}
		output.printf("So do: %d\n", VacuumState.countDirtyLocs());
		output.println("Location: (" + agentX + "," + agentY + ")  " + "Facing: " + getAgentDirString());
		output.println();

	}

	public static int[][] getMapHome() {
		return path.clone();
	}

}

class Location {
	int x;
	int y;

	Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Location))
			return false;
		Location s = (Location) o;
		if (s.x == x && s.y == y)
			return true;
		else
			return false;
	}
}
