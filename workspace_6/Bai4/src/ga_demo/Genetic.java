package ga_demo;

import java.util.*;

public class Genetic {
	int startingPop;
	ArrayList<BoardState> population;

	public Genetic(ArrayList<BoardState> population, int startingPop) {
		this.startingPop = startingPop;
		this.population = population;
	}

	public Genetic(ArrayList<BoardState> population) {
		startingPop = population.size();
		this.population = population;
	}

	// Chon ca the tot nhat
	public BoardState selectBest() {
		ConflictsComparator comp = new ConflictsComparator();
		PriorityQueue<BoardState> open = new PriorityQueue<BoardState>(1, comp);

		for (BoardState x : population) {
			open.offer(x);
		}

		BoardState temp = open.peek();

		return temp;
	}

	// Tao ca the moi
	public void create() {
		Random random = new Random();
		int size = population.size();
		int length = population.get(0).queens.length;

		for (int i = 0; i < size; i += 2) {
			int rP1 = random.nextInt(size / 4);

			int rP2 = random.nextInt(size);

			int[] parent1 = population.get(rP1).queens;
			int[] parent2 = population.get(rP2).queens;

			int[] child1 = Arrays.copyOf(parent1, length);
			int[] child2 = Arrays.copyOf(parent2, length);

			int cross = random.nextInt(length - 1);

			// Kiem tra de bao dam loi giai moi tao ra lay tu cha va me
			while (cross == 0 || cross == length - 1) {
				cross = random.nextInt(length - 1);
			}

			crossover(0, cross, child1, parent2);
			crossover(0, cross, child2, parent1);

			int mutation = random.nextInt(length);

			if ((mutation % 2) == 1) {// le
				int b = random.nextInt(length - 1);
				int c = random.nextInt(length - 1);

				swapMutate(child1, b, c);
				swapMutate(child2, c, b);
			}

			else {
				mutate(child1);
				mutate(child2);
			}

			BoardState temp1 = new BoardState(child1);
			BoardState temp2 = new BoardState(child2);

			population.add(new BoardState(child1));
			population.add(new BoardState(child2));
		}
	}

	// Chon lai ca the moi tu cha va me
	public void crossover(int beg, int end, int[] a, int[] b) {
		for (int i = beg; i < end; i++) {
			a[i] = b[i];
		}
	}

	// Chon 1 dong bat ky va dat con hau vao vi tri bat ky
	// quy dinh xac dinh de xay ra cot bien
	public void mutate(int[] a) {
		Random random = new Random();
		int cross = random.nextInt(a.length);
		int change = random.nextInt(a.length - 1);

		if (cross != a.length) {
			while (change == a[cross]) {
				change = random.nextInt(a.length - 1);
			}

			a[cross] = change;
		}
	}

	public void swapMutate(int[] a, int b, int c) {
		Random random = new Random();
		while (a[b] == c) {
			c = random.nextInt(a.length - 1);
		}

		a[b] = c;
	}

	// Chon nhung ca the co quan the tot dong thoi loai bo nhung ca the xau
	public ArrayList<BoardState> naturalSelection() {
		ConflictsComparator comp = new ConflictsComparator();
		PriorityQueue<BoardState> open = new PriorityQueue<BoardState>(1, comp);

		for (BoardState x : population) {
			open.offer(x);
		}

		int living = startingPop / 2;

		population.clear();

		for (int i = 0; i < living; i++) {
			population.add(open.poll());
		}

		return population;
	}

	public static void main(String[] a) {
		for (int k = 0; k <= 100; k++) {
			int p = 10000;
			RandomBoards population = new RandomBoards(12, p);
			Genetic ga = new Genetic(population.boards);
			ArrayList<BoardState> bsa = population.boards;
			BoardState bstate = population.boards.get(0);
			// BoardState bstate = ga.selectBest();
			for (int i = 0; i < bsa.size(); i++) {
				// System.out.println("pa: " + i);
				// bsa.get(i).printBoard();
				bsa.get(i).pairsHeuristic();
			}
			System.out.println("Size: " + bsa.size());

			while (bstate.pairsHeuristic() != 0) {
				ga.naturalSelection();
				ga.create();
				// if (bstate.pairsHeuristic() == 0) {
				bstate = ga.selectBest();
				// }
			}
			System.out.println("ket Qua lan: " + k);
			// bstate.printBoard();
		}
	}

}