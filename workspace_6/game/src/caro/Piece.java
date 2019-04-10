package caro;

public class Piece {
	private Square square;
	private Player player;
	
	public Piece(Square square, Player player) {
		this.square = square;
		this.player = player;
	}

	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
}
