package opensource;

import dataobjects.ActionStatus;
import dataobjects.Direction;
import game.Board;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import ai.AIsolver;

public class ConsoleGame {

	private static Scanner sc;

	/**
	 * Main function of the game.
	 * 
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("2048 Game in JAVA!");
		System.out.println("======================");
		while (true) {
			printMenu();
			int choice;
			try {
				sc = new Scanner(System.in);
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					playGame();
					break;
				case 2:
					calculateAccuracy();
					break;
				case 3:
					help();
					break;
				case 4:
					return;
				default:
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Hãy chọn");
			}
		}
	}

	/**
	 * Prints Help menu
	 */
	public static void help() {
		System.out.println("Thật chứ, bạn cần trợ giúp để chơi trò này?!?!?");
	}

	/**
	 * Prints main menu
	 */
	public static void printMenu() {
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=");
		System.out.println("Chọn:");
		System.out.println("1. Chơi");
		System.out.println("2. Thống kê AI");
		System.out.println("3. Trợ giúp");
		System.out.println("4. Thoát");
		System.out.println("=|=|=|=|=|=|=|=|=|=|=|=");
		System.out.println("Nhập số 1-4 và nhấp Enter:");
	}

	/**
	 * Estimates the accuracy of the AI solver by running multiple games.
	 * 
	 * @throws CloneNotSupportedException
	 */

	public static void calculateAccuracy() throws CloneNotSupportedException {
		int wins = 0, losts = 0;
		int total = 15;
		System.out.println("Số lần thắng - thua trong " + total + " lần: ");

		for (int i = 0; i < total; ++i) {
			int hintDepth = 7;
			Board theGame = new Board();
			Direction hint = AIsolver.findBestMove(theGame, hintDepth);
			ActionStatus result = ActionStatus.CONTINUE;
			while (result == ActionStatus.CONTINUE || result == ActionStatus.INVALID_MOVE) {
				result = theGame.action(hint);

				if (result == ActionStatus.CONTINUE || result == ActionStatus.INVALID_MOVE) {
					hint = AIsolver.findBestMove(theGame, hintDepth);
				}
			}

			if (result == ActionStatus.WIN) {
				++wins;
				System.out.println("Lần " + (i + 1) + " - thắng");
			} else {
				++losts;
				System.out.println("Lần " + (i + 1) + " - thua");
			}
		}
		System.out.println("-------------------------");
		System.out.println("Thắng " + wins + " / " + total + " .");
		System.out.println("-------------------------");
		System.out.println("Thua " + losts + " / " + total + " .");
	}

	/**
	 * Method which allows playing the game.
	 * 
	 * @throws CloneNotSupportedException
	 */
	public static void playGame() throws CloneNotSupportedException {
		System.out.println("Chơi 2048!.");
		System.out.println(
				"Nhấn 8 để Lên, 6 qua Phải, 2 đi Xuống và 4 qua Trái. Nhập a để chơi tự động và q để thoát. Nhấp Enter sau khi nhập.");

		int hintDepth = 7;
		Board theGame = new Board();
		Direction hint = AIsolver.findBestMove(theGame, hintDepth);
		printBoard(theGame.getBoardArray(), theGame.getScore(), hint);

		try {
			InputStreamReader unbuffered = new InputStreamReader(System.in, "UTF8");
			char inputChar;

			ActionStatus result = ActionStatus.CONTINUE;
			while (result == ActionStatus.CONTINUE || result == ActionStatus.INVALID_MOVE) {
				inputChar = (char) unbuffered.read();
				inputChar = 'a';
				if (inputChar == '\n' || inputChar == '\r') {
					continue;
				} else if (inputChar == '8') {
					result = theGame.action(Direction.UP);
				} else if (inputChar == '6') {
					result = theGame.action(Direction.RIGHT);
				} else if (inputChar == '2') {
					result = theGame.action(Direction.DOWN);
				} else if (inputChar == '4') {
					result = theGame.action(Direction.LEFT);
				} else if (inputChar == 'a') {
					result = theGame.action(hint);
				} else if (inputChar == 'q') {
					System.out.println("Trò chơi kết thúc.");
					break;
				} else {
					System.out.println(
							"Nhấn 8 để Lên, 6 qua Phải, 2 đi Xuống và 4 qua Trái. Nhập a để chơi tự động và q để thoát. Nhấp Enter sau khi nhập.");
					continue;
				}

				if (result == ActionStatus.CONTINUE || result == ActionStatus.INVALID_MOVE) {
					hint = AIsolver.findBestMove(theGame, hintDepth);
				} else {
					hint = null;
				}
				printBoard(theGame.getBoardArray(), theGame.getScore(), hint);

				if (result != ActionStatus.CONTINUE) {
					System.out.println(result.getDescription());
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	/**
	 * Prints the Board
	 * 
	 * @param boardArray
	 * @param score
	 * @param hint
	 */
	public static void printBoard(int[][] boardArray, int score, Direction hint) {
		System.out.println("\n-------------------------");
		System.out.println("Điểm:\t" + String.valueOf(score));
		System.out.println();
		System.out.println("Gợi ý:\t" + hint);
		System.out.println();

		for (int i = 0; i < boardArray.length; ++i) {
			for (int j = 0; j < boardArray[i].length; ++j) {
				System.out.print(boardArray[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}
}
