package vacworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import agent.Action;
import agent.Agent;
import agent.Environment;
import agent.Percept;
import agent.State;

//Chay tren moi truong gia lap tinh, roi rac
public class VacuumWorld extends Environment {

	protected static final int MAX_ACTIONS = 200;

	protected int numMoves = 0;
	protected int numTurns = 0;
	protected int numSucks = 0;
	protected int numBumps = 0;
	protected int totalScore = 0;

	// bien tuong tac
	protected boolean interactive = true;
	protected PrintStream output;

	public VacuumWorld() {
		output = System.out;
		interactive = true;
	}

	public VacuumWorld(boolean interactive) {
		output = System.out;
		this.interactive = interactive;
	}

	public VacuumWorld(PrintStream output, boolean interactive) {

		this.output = output;
		this.interactive = interactive;
	}

	// Them Agent
	public void addAgent(Agent agent) {

		if (agents.isEmpty() == false) {
			output.println("ERROR - tried to add a second agent to a single agent environment");
		} else {
			agents.add(agent);
		}
	}

	// Moi truong gia lap chay hoan chinh khi agent tat
	protected boolean isComplete() {

		if (((VacuumState) state).isRobotOff() || timedOut())
			return true;
		else
			return false;
	}

	protected boolean timedOut() {
		if (!interactive && getNumActions() >= MAX_ACTIONS)
			return true;
		else
			return false;
	}

	// Tao nhan thuc cho Agent
	protected Percept getPercept(Agent a) {

		VacPercept p;

		if (state instanceof VacuumState) {
			p = new VacPercept((VacuumState) state, a);
			output.println("Pecept: " + p.toString());
			return p;
		} else {
			output.println("ERROR - state is not a VacuumState object.");
			return null;
		}
	}

	// Thuc hien hanh dong cua Agent va cap nhat lai trang thai cua moi truong
	protected void updateState(Agent a, Action action) {

		if (action instanceof GoForward || action instanceof ShutOff || action instanceof SuckDirt
				|| action instanceof TurnLeft || action instanceof TurnRight)
			super.updateState(a, action);
		else
			System.err.println("ERROR: Invalid action: " + action.toString());

		// cap nhat diem khi thuc hien tung buoc di
		if (action instanceof GoForward)
			numMoves++;
		else if (action instanceof TurnRight || action instanceof TurnLeft)
			numTurns++;
		else if (action instanceof SuckDirt)
			numSucks++;
		if (((VacuumState) state).bumped())
			numBumps++;

		output.println("Action: " + action.toString());
		output.println();
	}

	/**
	 * Starts the simulation. We override the method in agent.Environment so
	 * that VacuumWorld states can be displayed to a selected output stream.
	 */
	public void start(State initState, int width, int height) {

		Percept p;
		Action action;
		Agent a;

		// khoi tao lai tat ca cac bien de theo doi qua trinh thuc hien
		numBumps = 0;
		numMoves = 0;
		numSucks = 0;
		numTurns = 0;
		totalScore = 0;

		state = initState;
		((VacuumState) state).setHeight(height);// gan chieu dai
		((VacuumState) state).setWidth(width);// gan chieu rong
		((VacuumState) state).createEnvironment(output);
		if (interactive == true)
			waitForUser();
		// Lay con agent dau tien
		a = (Agent) agents.get(0);
		boolean quit = false;
		while (!isComplete() && !quit) {
			p = getPercept(a);
			a.see(p);
			action = a.selectAction();
			updateState(a, action);
			((VacuumState) state).createEnvironment(output);
			if (interactive == true)
				quit = waitForUser();
		}
		totalScore = getPerformanceMeasure();
	}

	// Nguoi dung chay chuong trinh bang cach nhap tu ban phim: Q: thoat
	// Chay buoc tiep theo
	protected boolean waitForUser() {

		System.out.println("Press ENTER to continue. Press Q to quit");

		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		try {
			String key = console.readLine();
			if (key.equals("Q") || key.equals("q"))
				return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int width, height;
		Scanner sc = new Scanner(System.in);
		VacuumWorld world;
		Agent agent = new VacAgent();
		VacuumState initState;
		boolean interactive = true;
		boolean randomState = false;
		int randSeed = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-batch"))// chay hang lot
				interactive = false;
			else if (args[i].equals("-rand")) {// chay rieng le
				i++;
				if (i >= args.length) {
					System.err.println("ERROR: Must specify an integer seed when using '-rand'");
					System.exit(1);
				}
				try {
					randSeed = Integer.parseInt(args[i]);
					randomState = true;
				} catch (NumberFormatException ex) {
					System.err.println("ERROR: Seed passed with '-rand' must be an integer.");
					System.exit(1);
				}
			} else if (agent == null) {
				// Tu dong load class tu package dac biet = dong lenh ben duoi
				String agentName = null;
				try {
					agentName = args[i] + ".VacAgent";
					ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();
					Class myClass = myClassLoader.loadClass(agentName);
					Object o = myClass.newInstance();
					agent = (Agent) o;
				} catch (Exception ex) {
					System.err.println("ERROR: Loading class " + agentName);
					System.exit(1);
				}
				i++;
			} else {
				System.err.println("ERROR: Invalid command line arguments.");
				System.err.println("Usage: java vacworld.VacuumWorld [-batch] [-rand integer] agentpack");
				System.exit(1);
			}
		}

		System.out.println("Nhâp chiều dài: ");
		width = sc.nextInt();
		System.out.println("Nhập chiều rộng: ");
		height = sc.nextInt();
		System.out.printf("Chiều dài %d chiều rộng %d \n", width, height);

		System.out.println("The Vacuum Cleaner World Agent Testbed test 3");
		System.out.println("--------------------------------------");
		System.out.println();
//
		world = new VacuumWorld(interactive);
//
		initState = VacuumState.getInitState();
		//
		world.addAgent(agent);
		world.start(initState, width, height);
		System.out.println();

		if (world.timedOut()) {
			System.out.println("*** Timeout. Test halted! ***");
			System.out.println();
		}

		world.printScore(System.out);
	}

	protected int getNumDirtyLocs() {

		return ((VacuumState) state).getNumDirtyLocs();
	}

	// Kiem tra Agent da tro ve home
	/*
	 * public boolean gotHome() {
	 * 
	 * VacuumState vstate;
	 * 
	 * vstate = (VacuumState)state; if (((VacuumState)state).isRobotOff() &&
	 * vstate.getAgentX() == 1 && vstate.getAgentY() == 1) return true; else
	 * return false; }
	 */

	// So hanh dong Agent da thuc hien
	protected int getNumActions() {

		return numMoves + numTurns + numSucks;
	}

	// public int getTeamPerformanceMeasure() {
	// return getPerformanceMeasure();
	// }

	// Tra ve ket qua thuc hien
	public int getPerformanceMeasure(Agent ag) {
		return getPerformanceMeasure();
	}

	// Hien thuc ham danh gia cac buoc di cua Agent
	protected int getPerformanceMeasure() {

		int score;
		// score = 1000 + getMovesScore() + getTurnsScore() + getSucksScore() +
		// getBumpsScore() + getDirtScore() + getHomeScore();
		score = 1000 + getMovesScore() + getTurnsScore() + getSucksScore() + getBumpsScore() + getDirtScore();
		if (timedOut())
			score = score - 100;
		if (score < 0)
			score = 0;
		return score;
	}

	protected int getMovesScore() {
		return numMoves * -2;
	}

	protected int getTurnsScore() {
		return numTurns * -1;
	}

	protected int getSucksScore() {
		return numSucks * -2;
	}

	protected int getBumpsScore() {
		return numBumps * -10;
	}

	protected int getDirtScore() {
		return getNumDirtyLocs() * -100;
	}

	/*
	 * protected int getHomeScore() { if (gotHome() == false) return -200; else
	 * return 0; }
	 */

	protected void printScore(PrintStream out) {

		out.println("Evaluation:");
		out.println("----------");
		out.println("  Base score: \t1000");
		// out.println(" Home penalty: " + getHomeScore());
		if (getNumActions() >= MAX_ACTIONS)
			out.println("  Loop penalty: -100");
		out.println("  Dirt left: \t" + getDirtScore() + "\t(" + getNumDirtyLocs() + ")");
		out.println("  Bumps: \t" + getBumpsScore() + "\t(" + numBumps + ")");
		out.println("  Moves: \t" + getMovesScore() + "\t(" + numMoves + ")");
		out.println("  Turns: \t" + getTurnsScore() + "\t(" + numTurns + ")");
		out.println("  Sucks: \t" + getSucksScore() + "\t(" + numSucks + ")");
		out.println("  ----------------------------");
		out.println("  TOTAL SCORE: \t" + totalScore);
		out.println();
	}

	@Override
	public int getTeamPerformanceMeasure() {
		// TODO Auto-generated method stub
		return 0;
	}

}
