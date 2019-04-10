package caro;

import java.util.ArrayList;
import java.util.Arrays;

import gui.MainAi;

public class GameState {
	private Player currentPlayer;
	private ArrayList<Piece> move;
	private int[][] board;

	public GameState(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
		move = new ArrayList<Piece>();
		/*
		 * (1, 1) -> (SIZEX, SIZEY)
		 */
		board = new int[MainAi.SIZEBOX][MainAi.SIZEBOX];

	}

	public void addSquare(Square square) {
		int coordX = square.getCoordX();
		int coordY = square.getCoordY();
		board[coordX][coordY] = currentPlayer.getHashValue();
		move.add(new Piece(square, currentPlayer));
		currentPlayer = currentPlayer.getOpponent(); // đổi lượt người chơi 
	}

	public void removeSquare(Square square) {
		int coordX = square.getCoordX();
		int coordY = square.getCoordY();
		board[coordX][coordY] = 0;
		move.remove(move.size() - 1);
		currentPlayer = currentPlayer.getOpponent();
	}

	public boolean isInBoard(int coordX, int coordY) {
		if (coordX < 0 || coordX >= MainAi.SIZEBOX) return false;
		if (coordY < 0 || coordY >= MainAi.SIZEBOX) return false;
		return true;
	}
	
	public ArrayList<Square> getSuccessors() {
		ArrayList<Square> successors = new ArrayList<Square>();
		boolean[][] mark = new boolean [MainAi.SIZEBOX][MainAi.SIZEBOX];
		for (int i = 0; i < MainAi.SIZEBOX; i++)
			Arrays.fill(mark[i], false);
		for (Piece piece : move) {
			int coordX = piece.getSquare().getCoordX();
			int coordY = piece.getSquare().getCoordY();
			for (int i = -2; i <= 2; i++)
				for (int j = -2; j <= 2; j++) {
					int dimX = coordX + i;
					int dimY = coordY + j;
					if (isInBoard(dimX, dimY) && board[dimX][dimY] == 0) 
						mark[dimX][dimY] = true;
				}	
		}
		for (int coordX = 0; coordX < MainAi.SIZEBOX; coordX++)
			for (int coordY = 0; coordY < MainAi.SIZEBOX; coordY++)
				if (mark[coordX][coordY])
					successors.add(new Square(coordX, coordY));
		return successors;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public ArrayList<Piece> getMove() {
		return move;
	}

	public void setMove(ArrayList<Piece> move) {
		this.move = move;
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

}
