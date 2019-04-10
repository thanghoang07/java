package LTDT_thu7_456_TrinhVanToan_14130349_Tuan7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public abstract class Gragh {

	public abstract int[][] readFile(String pathName);

	public abstract void viewGraph(int[][] adjMatrix);

	public abstract void addEdge(int src, int dest);

	public abstract void removeEdges(int src, int dest);

	public abstract int degreeGraph();
	
	public abstract int numEdge();
	
	public abstract boolean checkConnected();
	
	public abstract void DFS(int v);
	
	public abstract void nonrecursiveDFS(int v);
	
	public abstract void BFS(int v);
	
	public abstract int countConnect();
	
	//Tuan 3
	public abstract void pathDFS(int v, int v1);
	
	public abstract boolean checkCycleEuler() ;
	
	public abstract boolean checkPathEuler();
	
	public abstract boolean checkBipartite ();
	
	//Tuan 4
	public abstract void cycleEuler(int vex);
	
	public abstract void pathEuler(int vex);
	
	public abstract void multiPathCycleEuler(int vex);

}
