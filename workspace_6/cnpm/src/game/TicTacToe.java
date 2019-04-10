package game;

import java.util.Random;
import java.util.Scanner;
// nộp vào 11/5 :v 

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardState b = new BoardState();
		Random rand = new Random();

		b.displayBoard();

		System.out.println("Who's gonna move first? (1)Computer (2)User: ");
		int choice = scan.nextInt();
		if (choice == 1) {
			Node p = new Node(rand.nextInt(3), rand.nextInt(3));
			b.placeAMove(p, 1);
			b.displayBoard();
		}

		while (!b.isGameOver()) {
			System.out.println("Your move: x y");
			Node userMove = new Node(scan.nextInt(), scan.nextInt());

			b.placeAMove(userMove, 2); // 2 for C and 1 is the user
			b.displayBoard();
			if (b.isGameOver())
				break;
//
			//b.alphaBetaMinimax(b.board, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 1);

			b.minimax(b.board, 0, 1);

			for (Node pas : b.rootsChildrenScore)
				System.out.println("Point: " + pas.pos + " Score: " + pas.score);

			b.placeAMove(b.returnBestMove(), 1);
			b.displayBoard();

		}
		if (b.hasXWon()) {
			System.out.println("Unfortunately, you lost!");
		} else if (b.hasOWon()) {
			System.out.println("You win!");
		} else {
			System.out.println("It's a draw!");
		}

	}

}
