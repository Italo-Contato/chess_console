package boardGame;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private int rows;
	private int colunm;
	private Piece[][] pieces;

	public Board(int rows, int colunm) {

		this.rows = rows;
		this.colunm = colunm;
		this.pieces = new Piece[rows][colunm];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColunm() {
		return colunm;
	}

	public void setColunm(int colunm) {
		this.colunm = colunm;
	}

	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getCollumn()];
	}

	public Piece placePiece(Position position) {
		return pieces[position.getRow()][position.getCollumn()];
	}

}
