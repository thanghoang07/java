package caro;

public class Square {
	private int coordX;
	private int coordY;
	private boolean isMark;
	
	public Square() {
		isMark = false;
		coordX = 0;
		coordY = 0;
	}

	public Square(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
		isMark = true;
	}
	
	public boolean isMark() {
		return isMark;
	}

	public void setMark(boolean isMark) {
		this.isMark = isMark;
	}

	public int getCoordX() {
		return coordX;
	}

	public int getCoordY() {
		return coordY;
	}
	
	
}
