package demo;

public class Queen {
	private int posRow;// vi tri dong
	private int posCol;// vi tri cot

	public Queen(int qrow, int qcol) {
		posRow = qrow;
		posCol = qcol;
	}

	// Vi tri cac con Hau bi tan cong
	public boolean canAttack(Queen q) {
		boolean canAttack = false;

		// kiem tra dong va cot
		if (posRow == q.getposRow() || posCol == q.getposCol())
			canAttack = true;
		// kiem tra 2 duong cheo
		else if (Math.abs(posCol - q.getposCol()) == Math.abs(posRow
				- q.getposRow()))
			canAttack = true;

		return canAttack;
	}

	// gioi han di chuyen xuong dong duoi cua con Hau
	public void shiftQueen(int shift, int queens) {
		posRow += shift;
		if (posRow > (queens - 1) && posRow % (queens - 1) != 0) {
			posRow = (posRow % (queens - 1) - 1);
		} else if (posRow > (queens - 1) && posRow % (queens - 1) == 0) {
			posRow = (queens - 1);
		}
	}

	public void setposRow(int qRow) {
		posRow = qRow;
	}

	public int getposRow() {
		return posRow;
	}

	public void setposCol(int qCol) {
		posCol = qCol;
	}

	public int getposCol() {
		return posCol;
	}

	public String toString() {
		return "(" + posRow + ", " + posCol + ")";
	}

}
