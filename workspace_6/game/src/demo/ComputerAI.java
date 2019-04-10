package demo;

/*
 * ComputerAI.java
 * 
 * Name: Javier Chavez
 * Email: javierc@unm.edu
 * Sept. 4 2013
 * CS 251 Lab 2
 * 
 */

import cs251.lab2.GomokuModel;
import cs251.lab2.GomokuModel.Square;


public class ComputerAI {
	private int[] moves = new int[2];
	private Square[][] board;
	//private int ld, rd, d, r;
	private Player player;
	
	/**
	 * This class is lacking considering its name. But it searches for an empty square and returns its coord. when found.
	 */
	
	public ComputerAI(Square[][] b, Player p){
		board = b;
		player = p; // not in use right now but it will be useful for future 
		findEmpty();
	}
	public ComputerAI(Square[][] b){
		board = b;
		findEmpty();
	}
	
	public void setBoard(Square [][] b){
		board = b;
		findEmpty();
	}
	
	public int[] getMove(){	
		return moves;
	}

	private void findEmpty(){
		for (int i = 0; i < GomokuModel.NUM_VSQUARES; i++) {
			for (int j = 0; j < GomokuModel.NUM_HSQUARES; j++) {
				if (board[i][j].toChar() == Square.EMPTY.toChar()) {
					moves[0] = i;
					moves[1] = j;
							
				}
				
			}
		}
	}
}
