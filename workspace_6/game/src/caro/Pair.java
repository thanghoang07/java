package caro;

public class Pair implements Comparable<Pair>{
	private Square square;
	private int value;

	public Pair(Square square, int value) {
		this.square = square;
		this.value = value;
	}

	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(Pair comparePair) {
		// TODO Auto-generated method stub
		return comparePair.getValue() - this.value;
	}

}
