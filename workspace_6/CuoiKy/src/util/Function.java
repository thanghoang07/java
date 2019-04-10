package util;

import caro.GameState;
import caro.Player;
import gui.MainView;

public class Function {
	public static final int[] FIVEVALUE = { 121, 242 };
	public static final int[] STRAIGHTFOURVALUE = { 120, 240 };
	public static final int[] FOURVALUE1 = { 606, 483 };
	public static final int[] FOURVALUE2 = { 122, 241 };
	public static final int[] THREEVALUE = { 39, 78 };
	public static final int[] BROKENTHREEVALUE1 = { 111, 222 };
	public static final int[] BROKENTHREEVALUE2 = { 93, 186 };
	public static final int[] TWOVALUE1 = { 4, 8 };
	public static final int[] TWOVALUE2 = { 10, 20 };
	public static final int[] TWOVALUE3 = { 10, 20 };
	public static final int[] weight = { 10000, 3000, 30, 12, 12, 6 };
	public static final int[] POW = { 1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323,
			4782969 };

	public static int numberFive, numberStraightFour, numberFour, numberThree, numberBrokenThree, numberTwo,
			numberSingle;
	public static int numberDia;
	public static int[][] hashRow, hashColum, hashDia;
	public static boolean isHaveThreat = false;

	public static void init() {
		hashRow = new int[MainView.SIZEX][MainView.SIZEY];
		hashColum = new int[MainView.SIZEY][MainView.SIZEX];
		hashDia = new int[2*(MainView.SIZEX + MainView.SIZEY)][MainView.SIZEX + MainView.SIZEY];
		numberFive = 0;
		numberStraightFour = 0;
		numberFour = 0;
		numberThree = 0;
		numberBrokenThree = 0;
		numberTwo = 0;
		numberSingle = 0;
		numberDia = 0;
	}

	public static void hashBoard(int[][] board) {
		/*
		 * Hash horizontal and vertical
		 */
		for (int i = 0; i < board.length; i++) {
			// System.out.println(board.length - 1 + " " + i);
			hashRow[i][0] = board[i][0];
			hashColum[i][0] = board[0][i];
			for (int j = 1; j < board[i].length; j++) {
				hashRow[i][j] = hashRow[i][j - 1] * 3 + board[i][j];
				// System.out.print(board[i][j] + " ");
				hashColum[i][j] = hashColum[i][j - 1] * 3 + board[j][i];
			}
			// System.out.println();
		}

		/*
		 * Hash diagonal
		 */

		for (int i = 0; i < board.length - 1; i++) {
			hashDia[numberDia][0] = board[i][0];
			for (int j = 1; j < board.length - i; j++) {
				hashDia[numberDia][j] = hashDia[numberDia][j - 1] * 3 + board[i + j][j];
				//System.out.print(hashDia[numberDia][j] + " ");
			}
			//System.out.println();
			numberDia++;
		}
		//System.out.println("NumberDia = " + numberDia);
		for (int i = 0; i < board.length - 1; i++) {
			hashDia[numberDia][0] = board[i][board.length - 1];
			for (int j = 1; j < board.length - i; j++)  {
				hashDia[numberDia][j] = hashDia[numberDia][j - 1] * 3 + board[i + j][board.length - 1 - j];
				//System.out.print(hashDia[numberDia][j] + " ");
			}
			numberDia++;
			//System.out.println();
		}
		//System.out.println("NumberDia = " + numberDia);
		for (int j = 1; j < board[0].length - 1; j++) {
			hashDia[numberDia][0] = board[0][j];
			for (int i = 1; i < board[0].length - j; i++) {
				// System.out.println(board[i][i + j] + " ");
				hashDia[numberDia][i] = hashDia[numberDia][i - 1] * 3 + board[i][i + j];
			//	System.out.print(hashDia[numberDia][i] + " ");
			}
			//System.out.println();
			numberDia++;
		}
		//System.out.println("NumberDia = " + numberDia);
		for (int j =1; j < board[0].length - 1; j++) {
			hashDia[numberDia][0] = board[0][board.length - 1 - j];
			for (int i = 1; i < board.length - j; i++) {
				hashDia[numberDia][i] = hashDia[numberDia][i - 1] * 3 + board[i][board.length - 1 - (i + j)];
			//	System.out.print(hashDia[numberDia][i] + " ");
			}
			numberDia++;
			//System.out.println();
		}
	}

	public static void checkThreatFiveThree(int value, int index) {
		if (value == FIVEVALUE[index]) {
			numberFive++;
			setHaveThreat(true);
		}
		if (value == THREEVALUE[index]) {
			numberThree++;
			setHaveThreat(true);
		}
	}

	public static void checkThreatFourBrokenThree(int value, int index) {
		if (value == STRAIGHTFOURVALUE[index]) {
			numberStraightFour++;
			setHaveThreat(true);
		}
		if (value == FOURVALUE1[index] || value == FOURVALUE2[index]) {
			numberFour++;
			setHaveThreat(true);
		}
		if (value == THREEVALUE[index]) {
			setHaveThreat(true);
			numberThree++;
		}
		if (value == BROKENTHREEVALUE1[index] || value == BROKENTHREEVALUE2[index]) {
			setHaveThreat(true);
			numberBrokenThree++;
		}
	}

	public static void checkThreatTwo(int value, int index) {
		if (value == TWOVALUE1[index] || value == TWOVALUE2[index]) {
			numberTwo++;
			setHaveThreat(true);
		}
	}

	public static void computeThreatOnRowOrColum(int[][] board, int index, int[][] hash) {
		for (int i = 0; i < board.length; i++) {
			if (hash[i][board[i].length - 1] == 0)
				continue;
			setHaveThreat(false);
			int value;
			for (int j = 0; j < board[i].length - 4; j++) {
				if (j == 0)
					value = hash[i][j + 4];
				else
					value = hash[i][j + 4] - hash[i][j - 1] * POW[5];
				checkThreatFiveThree(value, index);
				if (isHaveThreat())
					break;
			}
			if (isHaveThreat())
				continue;
			for (int j = 0; j < board[i].length - 5; j++) {
				if (j == 0)
					value = hash[i][j + 5];
				else
					value = hash[i][j + 5] - hash[i][j - 1] * POW[6];
				checkThreatFourBrokenThree(value, index);
				if (isHaveThreat())
					break;
			}
			if (isHaveThreat())
				continue;
			for (int j = 0; j < board[i].length - 1; j++) {
				if (j == 0)
					value = hash[i][j + 1];
				else
					value = hash[i][j + 1] - hash[i][j - 1] * POW[2];
				checkThreatTwo(value, index);
				if (isHaveThreat())
					break;
			}
		}
	}

	public static void computeThreatOnDiagonal(int[][] board, int index, int count, int first, int last) {
		for (int i = first; i < last; i++) {
			count++;
			if (count == numberDia)
				break;
			setHaveThreat(false);
			int value;
			if (hashDia[count][board.length - i - 1] == 0)
				continue;
			for (int j = 0; j < board[i].length - i - 4; j++) {
				if (j == 0)
					value = hashDia[count][j + 4];
				else
					value = hashDia[count][j + 4] - hashDia[count][j - 1] * POW[5];
				checkThreatFiveThree(value, index);
				if (isHaveThreat())
					break;
			}
			if (isHaveThreat())
				continue;
			for (int j = 0; j < board[i].length - i - 5; j++) {
				if (j == 0)
					value = hashDia[count][j + 5];
				else
					value = hashDia[count][j + 5] - hashDia[count][j - 1] * POW[6];
				checkThreatFourBrokenThree(value, index);
				if (isHaveThreat())
					break;
			}
			if (isHaveThreat())
				continue;
			for (int j = 0; j < board[i].length - i - 1; j++) {
				if (j == 0)
					value = hashDia[count][j + 1];
				else
					value = hashDia[count][j + 1] - hashDia[count][j - 1] * POW[2];
				checkThreatTwo(value, index);
				if (isHaveThreat())
					break;
			}
		}
	}

	public static void computeThreatSingle(int[][] board, int index) {
		if (numberFive + numberStraightFour + numberFour + numberThree + numberBrokenThree + numberTwo == 0)
			for (int i = 0; i < board.length; i++)
				for (int j = 0; j < board[i].length; j++)
					if (board[i][j] == index)
						numberSingle++;
	}

	public static boolean isHaveThreat() {
		return isHaveThreat;
	}

	public static void setHaveThreat(boolean isHaveThreat) {
		Function.isHaveThreat = isHaveThreat;
	}

	public static int evaluate(GameState game, Player player) {
		int id = player.getHashValue() - 1;
		int[][] B = game.getBoard();
		//int id = 0;
		init();
		hashBoard(B);
		computeThreatOnRowOrColum(B, id, hashRow);
		computeThreatOnRowOrColum(B, id, hashColum);
		computeThreatOnDiagonal(B, id, -1, 0, MainView.SIZEX - 1);
		computeThreatOnDiagonal(B, id, MainView.SIZEX - 2, 0, MainView.SIZEX - 1);
		computeThreatOnDiagonal(B, id, 2*MainView.SIZEX - 3, 1, MainView.SIZEX - 1);
		computeThreatOnDiagonal(B, id, 3*MainView.SIZEX - 5, 1, MainView.SIZEX - 1);
		//computeThreatSingle(B, id + 1);
		int f = numberFive * weight[0] + numberStraightFour * weight[1] + numberFour * weight[2]
				+ numberThree * weight[3] + numberBrokenThree * weight[4]
				+ numberTwo * weight[5];
                System.out.println(f);
		return f;

//		 System.out.println("NumberDia = " + numberDia);
//		 System.out.println("NumberFiveInRow = " + numberFive);
//		 System.out.println("NumberStraightFour = " + numberStraightFour);
//		 System.out.println("NumberFourInRow = " + numberFour);
//		 System.out.println("NumberThreeInRow = " + numberThree);
//		 System.out.println("NumberBrokenThree = " + numberBrokenThree);
//		 System.out.println("NumberTwoInRow = " + numberTwo);
//		 System.out.println("NumberSingle = " + numberSingle);
//		 return 0;
	}
//	public static void main(String[] agrs) {
//		evaluate(new GameState(Player.BLACK), Player.BLACK);
//	}
}
