package van_Toan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public abstract class Gragh {

	public abstract int[][] readFile(String pathName);

	public abstract void addEdges(int src, int dest);

	public abstract void removeEdges(int src, int dest);

	public abstract int degreeGraph();
	
	public abstract int numEdge();
	
	public abstract boolean isConnected();
	
	public abstract int countConnect();

	public abstract void viewGraph(int[][] adjMatrix);

}
