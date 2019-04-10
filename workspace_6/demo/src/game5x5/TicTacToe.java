package game5x5;

import java.util.Random;

public class TicTacToe {

	public static void main(String[] args) {

		// test phần mini max có cắt tỉa

		BoardState b = new BoardState();
		Random rand = new Random();

		b.displayBoard();

		System.out.println("Chọn người đi trước (1)máy  (2)bạn ");
		int choice = b.scan.nextInt();
		if (choice == 1) {
			Node p = new Node(rand.nextInt(5), rand.nextInt(5));
			b.placeAMove(p, 1);
			b.displayBoard();
		}
		//
		while (!b.isGameOver()) {
			int hang = 0;
			int cot = 0;
			do {
				System.out.println("nhập toa độ x y (dòng cột) ");
				hang = b.scan.nextInt();
				cot = b.scan.nextInt();				
				if (b.board[hang][cot] != 0) {
					System.out.println("Vị trí đó đã được đánh");
				}
			} while (b.board[hang][cot] != 0);

			
			Node userMove = new Node(hang,cot);
			b.placeAMove(userMove, 2);
			b.displayBoard();
			if (b.isGameOver())
				break;

			b.alphaBetaMinimax(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 1);
			// b.minimax(b.board , 0, 1);
			for (Node pas : b.rootsChildrenScore)
				System.out.println("tọa độ: " + pas.pos + "điểm: " + pas.score);

			b.placeAMove(b.returnBestMove(), 1);
			b.displayBoard();
		}
		if (b.hasXWon()) {
			System.out.println("Bạn đã thua!");
		} else if (b.hasOWon()) {
			System.out.println("Bạn đã thắng");
		} else {
			System.out.println("Hòa!");
		}
	}
}
