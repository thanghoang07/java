package demo;

import java.util.Scanner;

public class DemoPrim {
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[][] tree = new int[5][5];
		int visited[] = new int[5];
		int min = 999;
		int u = 0, v = 0;
		int total = 0;
		//
		for (int i = 0; i < 5; i++) {
			visited[i] = 0;
			for (int j = 0; j < 5; j++) {
				tree[i][j] = sc.nextInt();
				if (tree[i][j] == 0) {
					tree[i][j] = 999;
				}
			}
		}

		visited[0] = 1;
		//
		for (int c = 0; c < 4; c++) {
			min = 999;
			for (int i = 0; i < 5; i++) {
				if (visited[i] == 1) {
					for (int j = 0; j < 5; j++) {
						if (visited[j] != 1) {
							if (min > tree[i][j]) {
								min = tree[i][j];
								u = i;
								v = j;

							}
						}
					}
				}
			}
			visited[v] = 1;
			total += min;
			System.out.println("Edge found: " + u + "->" + v + ": " + min);
		}
		System.out.println("total: " + total);
	}
}
